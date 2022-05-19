package freetrialproject;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreader {
	public static ArrayList getdata(String filepath) {
		ArrayList data=new ArrayList();
		try {
			FileInputStream fis=new FileInputStream(filepath);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheetAt(1);
			Iterator<Row>rowitr=sheet.rowIterator();
			while(rowitr.hasNext()) {
				Row row=rowitr.next();
				Iterator<Cell>cellitr=row.cellIterator();
				while(cellitr.hasNext()) {
					Cell cell=cellitr.next();
					data.add(cell.getStringCellValue());
				}
			}
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
