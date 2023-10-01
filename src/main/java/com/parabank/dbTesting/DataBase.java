package com.parabank.dbTesting;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DataBase {

    public static void main(String[] args) throws SQLException, IOException {
        DbManager.setMsqlDbConnection();

        // Get data from the table
        List<Map<String, Object>> tableData = getTableData("SELECT * FROM classicmodels.customers");
        System.out.println("************************** Data validation from Table: *************************\n");
        printData(tableData);
        System.out.println();
    }

    // Retrieve data from the table
    public static List<Map<String, Object>> getTableData(String query) throws SQLException {
        List<Map<String, Object>> data = new ArrayList<>();
        ResultSet resultSet = DbManager.executeQuery(query);

        ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            Map<String, Object> row = new HashMap<>();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                Object value = resultSet.getObject(i);
                row.put(columnName, value);
            }
            data.add(row);
        }

        return data;
    }

    // Print data in a formatted way with spaces between column names and values
    public static void printData(List<Map<String, Object>> data) {
        if (data.isEmpty()) {
            System.out.println("No data found in the table.");
            return;
        }

        // Calculate the maximum column name length
        int maxColumnNameLength = 0;
        Map<String, Object> firstRow = data.get(0);
        for (String columnName : firstRow.keySet()) {
            int length = columnName.length();
            if (length > maxColumnNameLength) {
                maxColumnNameLength = length;
            }
        }

        // Print header
        for (String columnName : firstRow.keySet()) {
            System.out.print(padRight(columnName, maxColumnNameLength + 2) + "   |   ");
        }
        System.out.println();

        // Print separator line
        for (int i = 0; i < (maxColumnNameLength + 6) * firstRow.size(); i++) {
            System.out.print("-");
        }
        System.out.println();

        // Print rows
        for (Map<String, Object> row : data) {
            for (String columnName : firstRow.keySet()) {
                System.out.print(padRight(String.valueOf(row.get(columnName)), maxColumnNameLength + 2) + "   |   ");
            }
            System.out.println();
        }
    }

    // Helper method to pad a string with spaces on the right
    private static String padRight(String s, int length) {
        return String.format("%-" + length + "s", s);
    }
}
