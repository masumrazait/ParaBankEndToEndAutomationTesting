package com.parabank.testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSqlComparator {

    public static void main(String[] args) {
        String excelFilePath = "./TestDataForDbDataValidation/datas.xlsx";

        // Read Excel data
        Map<String, List<String>> excelData = readExcelData(excelFilePath);

        // Connect to the MySQL database
        String jdbcUrl = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "Root@123";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Retrieve SQL table columns
            List<String> sqlColumns = retrieveSQLTableColumns(connection, "sakila", "address");

            // Compare Excel columns with SQL columns
            for (String excelColumn : excelData.keySet()) {
                if (!sqlColumns.contains(excelColumn)) {
                    System.out.println("Column " + excelColumn + " is missing in the SQL table.");
                }
            }

            // Compare SQL columns with Excel columns
            for (String sqlColumn : sqlColumns) {
                if (!excelData.containsKey(sqlColumn)) {
                    System.out.println("Column " + sqlColumn + " is missing in the Excel sheet.");
                }
            }

            // Compare and print differences
            for (String col : excelData.keySet()) {
                if (!col.equals("last_update")) { // Skip comparison for "last_update" column
                    List<String> excelColumn = excelData.get(col);

                    if (sqlColumns.contains(col)) {
                        List<String> sqlColumn = retrieveSQLDataForColumn(connection, col);

                        // Compare data and print differences
                        for (int i = 0; i < excelColumn.size(); i++) {
                            if (!excelColumn.get(i).equals(sqlColumn.get(i))) {
                                System.out.println("Difference in column " + col + " at row " + (i + 1));
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, List<String>> readExcelData(String filePath) {
        Map<String, List<String>> excelData = new HashMap<String, List<String>>();
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet (index 0)
            Row headerRow = sheet.getRow(0);

            int numColumns = headerRow.getLastCellNum();

            for (int i = 0; i < numColumns; i++) {
                Cell cell = headerRow.getCell(i);
                excelData.put(cell.getStringCellValue(), new ArrayList<String>());
            }

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    for (int j = 0; j < numColumns; j++) {
                        Cell cell = row.getCell(j);
                        if (cell != null) {
                            excelData.get(headerRow.getCell(j).getStringCellValue()).add(cell.getStringCellValue());
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return excelData;
    }

    private static List<String> retrieveSQLDataForColumn(Connection connection, String columnName) {
        List<String> sqlColumnData = new ArrayList<String>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT " + columnName + " FROM sakila.address")) {

            while (resultSet.next()) {
                sqlColumnData.add(resultSet.getString(columnName));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sqlColumnData;
    }

    private static List<String> retrieveSQLTableColumns(Connection connection, String schemaName, String tableName) {
        List<String> sqlColumns = new ArrayList<String>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = '" + schemaName + "' AND TABLE_NAME = '" + tableName + "'")) {

            while (resultSet.next()) {
                sqlColumns.add(resultSet.getString("COLUMN_NAME"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sqlColumns;
    }
}
