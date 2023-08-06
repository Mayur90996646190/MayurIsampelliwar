package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingDataToExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/HandExcel1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("CreateCustomer").getRow(0).getCell(0).setCellValue("UUUSERname");
		FileOutputStream fos = new FileOutputStream("./data/HandExcel1.xlsx");
		wb.write(fos);
		String data =wb.getSheet("CreateCustomer").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		wb.close();
	}
}
