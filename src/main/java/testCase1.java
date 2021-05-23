import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Pankaj Kumar
 * @since 5/22/2021
 */


public class testCase1 {
    WebDriver driver;
    XSSFWorkbook Workbook;
    XSSFSheet sheet1;


    @Test
    public void beforeTest1() throws IOException {
        FileInputStream fis = new FileInputStream("Book1.xlsx");

        Workbook = new XSSFWorkbook(fis);
        sheet1 = Workbook.getSheetAt(0);
        System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue());
    }


    @Test
    @Parameters({"uname"})
    public void beforeTest2(String name) {
        System.out.println(name);

    }
}
