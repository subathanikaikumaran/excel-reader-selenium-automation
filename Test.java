import MyExcelReader;// import your MyExcelReader class
/**
 * @author suba
 *
 */
public class Test
{
	public static void main(String[] args) {
                MyExcelReader _ecxel= new MyExcelReader("D:\\excel-reader-selenium-automation\\testdata\\mydatas.xlsx");
                String username = _ecxel.getData(0, 1, 0); // (sheetNumber, row, column)
                String password = _ecxel.getData(0, 1, 1);
                System.out.println("Username : "+username); // Output==> Username : test@admin.com
                System.out.println("password : "+password); // Output==> password : test1234
	}
}