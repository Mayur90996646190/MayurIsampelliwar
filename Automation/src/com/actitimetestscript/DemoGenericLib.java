package com.actitimetestscript;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class DemoGenericLib {
	public static void main(String[] args) throws IOException {
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		f.setExcelData("CreateCustomer", 1, 1,"Sbi_003");
		String cn =f.getExcelData("CreateCustomer", 1, 1);
		System.out.println(cn);
	}
}
