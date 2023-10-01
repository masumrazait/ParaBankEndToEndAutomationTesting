package com.parabank.dbTesting;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataValidationTableToView {

	public static void main(String[] args) throws SQLException, IOException {
		DbManager.setMsqlDbConnection();

		// Get data from the table
		List<Map<String, Object>> tableData = getTableData("SELECT * FROM mypersonaldb.population_data limit 2");
		System.out.println("************************** Data validation from Table: *************************"+"\n");
		printData(tableData);
		System.out.println("\n");

		// Get data from the view
		List<Map<String, Object>> viewData = getTableData("select * from mypersonaldata.population_data_v limit 2");
		System.out.println("************************** Data validation from View: ******************************"+"\n");
		printData(viewData);
		System.out.println("\n");

		boolean isDataEqual = tableData.equals(viewData);

		if (isDataEqual) {
			System.out.println("\n" + "\033[32m" + "***** Pass ***** The data from Table and View is the same."
					+ "\033[0m" + "\n");
			saveDataToCSV(tableData, true);
		} else {
			System.out.println("\033[31m" + "***** Fail ***** The data from Table and View is different." + "\033[0m");
			saveDataToCSV(tableData, false);
		}
	}

	private static List<Map<String, Object>> getTableData(String query) throws SQLException {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		ResultSet resultSet = DbManager.executeQuery(query);

		ResultSetMetaData metaData = resultSet.getMetaData();
		int columnCount = metaData.getColumnCount();

		while (resultSet.next()) {
			Map<String, Object> row = new HashMap<String, Object>();
			for (int i = 1; i <= columnCount; i++) {
				String columnName = metaData.getColumnName(i);
				Object value = resultSet.getObject(i);
				row.put(columnName, value);
			}
			data.add(row);
		}

		return data;
	}

	private static void printData(List<Map<String, Object>> data) {
		for (Map<String, Object> row : data) {
			for (Map.Entry<String, Object> entry : row.entrySet()) {
				String columnName = entry.getKey();
				Object value = entry.getValue();
				System.out.print(columnName + "[" + value + "], ");
			}
			System.out.println();
		}
	}

	private static void saveDataToCSV(List<Map<String, Object>> data, boolean isDataEqual) throws IOException {
		String filePath = "D:\\My_Project\\Testing_Project\\ParaBankEndToEndAutomationTesting\\DataValidationReport\\data.csv";
		FileWriter csvWriter = new FileWriter(filePath);

		// Write column headers
		if (!data.isEmpty()) {
			Map<String, Object> firstRow = data.get(0);
			for (String columnName : firstRow.keySet()) {
				csvWriter.append(columnName);
				csvWriter.append(",");
			}
			csvWriter.append("Status"); // Add Status column header
			csvWriter.append("\n");
		}

		// Write data rows
		for (Map<String, Object> row : data) {
			for (Object value : row.values()) {
				if (value != null) {
					csvWriter.append(value.toString());
				}
				csvWriter.append(",");
			}
			// Write Status value as Pass (green) or Fail (red)
			csvWriter.append(isDataEqual ? "Passed" : "Failed");
			csvWriter.append("\n");
		}

		csvWriter.flush();
		csvWriter.close();
		System.out.println("Data saved to CSV file: " + filePath);
	}
}