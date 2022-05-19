package freetrialproject;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class logintestpage {
@Test
	public void testloginpage() {
	ArrayList data=excelreader.getdata("C://excel project//excelreader.xlsx");
	keywords key=new keywords();
	for (int i = 0; i <data.size(); i++) {
		if(data.get(i).equals("open")) {
	      key.open();
	}
		if(data.get(i).equals("url")) {
			String httpurl=data.get(i+1).toString();
			key.url(httpurl);
		}
 if(data.get(i).equals("inputbyname")) {
	 String testdata=data.get(i+1).toString();
	 String objectname=data.get(i+2).toString();
	 key.inputbyname(testdata,objectname);
 }
}
}
}
