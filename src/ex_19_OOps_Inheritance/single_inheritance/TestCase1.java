package ex_19_OOps_Inheritance.single_inheritance;

public class TestCase1 extends CommonToAll{
    void runningTC1(){
        startBrowser();
        System.out.println("TC1 is running");
        closeBrowser();

    }

    void readexcelE1(){
        readExcelFile();
        System.out.println("Excel file 1 is reading");
    }
}
