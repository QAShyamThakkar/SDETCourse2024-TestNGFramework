package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.utils.ExcelReader;
import org.testng.annotations.Test;

public class LogOutTest {

    @Test
    public void verifyLogOutSuccessful() throws Exception {

        ExcelReader.excelReaderMethod("src/test/resources/Data/Data2.xlsx", "Sheet1");

    }
}
