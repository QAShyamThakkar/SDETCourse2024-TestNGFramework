package com.automation.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFSlideShowFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ExcelReader {

    public static void excelReaderMethod(String path, String sheetName) throws Exception {

//        Workbook - Sheets - Row - Cell  //poi-ooxml - dependency
        XSSFWorkbook workbook = new XSSFWorkbook(new File(path));
        XSSFSheet sheet1 = workbook.getSheet(sheetName);

        for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
            XSSFRow row = sheet1.getRow(i);

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j).toString() + " ");
            }
            System.out.println();
        }


//        XSSFRow row1 = sheet1.getRow(1);
//        XSSFCell cell = row1.getCell(1);
//        System.out.println(cell.toString());
//
//        XSSFRow row2 = sheet1.getRow(2);
//        XSSFCell cell2 = row2.getCell(0);
//        System.out.println(cell2.toString());
//
//        XSSFRow row3 = sheet1.getRow(1);
//        XSSFCell cell10 = row3.getCell(6);
//        System.out.println(cell10.toString());


    }

}
