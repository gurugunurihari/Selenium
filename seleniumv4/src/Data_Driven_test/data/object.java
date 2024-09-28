package Data_Driven_test.data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class object {
	@DataProvider(name="credential")
	public Object[][] testdata() throws EncryptedDocumentException, IOException{
		FileInputStream fs=new FileInputStream("C:\\\\Users\\\\syed saddam hussain\\\\OneDrive\\\\Desktop\\\\final mock\\\\seleniumv4\\\\ExcelData\\\\ss1.xlsx");
		Workbook w=WorkbookFactory.create(fs);
		Sheet s=w.getSheet("sheet2");
		int rowsize=s.getPhysicalNumberOfRows();
		int cellsize=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d=new Object[rowsize-1][cellsize];
		for (int i = 0; i < rowsize-1; i++) {
			for (int j = 0; j < cellsize; j++) {
				d[i][j]=s.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return d;
		
	}
	@Test(dataProvider = "credential")
	public void test(String tra,String sub) {
		Reporter.log(tra,true);
		System.out.println("saddam");
		Reporter.log(sub,true);
	}
}
