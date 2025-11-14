import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTasks {
public static void main(String[] args) throws Exception {
	File f= new File("/Users/vino/Desktop/Testing/sample1/sample2/sample3/practice.xlsx");
	FileInputStream fis= new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet s= w.getSheet("Sheet1");
	Row r= s.getRow(2);
	Cell c=r.getCell(0);
	System.out.println(c);
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
		Row r1=s.getRow(i);
		for(int j=0;j<r1.getPhysicalNumberOfCells();j++) {
		Cell c1=r1.getCell(j);
		CellType cellType =c1.getCellType();
		if(cellType == CellType.STRING) {
		String value=c1.getStringCellValue();
		System.out.println(value);
		}
		else if(DateUtil.isCellDateFormatted(c1)) {
			Date dd=c1.getDateCellValue();
			SimpleDateFormat sdf= new SimpleDateFormat("dd.MM.yyyy");
			String value=sdf.format(dd);
			System.out.println(value);
		}
		else {
			double d=c1.getNumericCellValue();
			long l=(long)d;
			String value=String.valueOf(l);
			System.out.println(value);
			
		}
		}
	}
	
}

	

}
