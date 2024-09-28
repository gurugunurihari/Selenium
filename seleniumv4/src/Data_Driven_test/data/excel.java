package Data_Driven_test.data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excel {
		@Test
		public void test() throws EncryptedDocumentException, IOException {
			FileInputStream fs=new FileInputStream("C:\\Users\\syed saddam hussain\\OneDrive\\Desktop\\final mock\\seleniumv4\\ExcelData\\ss1.xlsx");
			Workbook w=WorkbookFactory.create(fs);
			Sheet s=w.getSheet("sheet1");
			int rowsize=s.getPhysicalNumberOfRows();
			int colsize=s.getRow(0).getPhysicalNumberOfCells();
			String data=null;
			for (int i = 0; i <rowsize; i++) {
				for (int j = 0; j <colsize; j++) {
					data=s.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data);
				}
				System.out.println();
			}
		}
}
