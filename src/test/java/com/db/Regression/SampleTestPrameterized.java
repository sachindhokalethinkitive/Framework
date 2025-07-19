package com.db.Regression;

import java.io.File;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;

public class SampleTestPrameterized extends TestBase {

	@DataProvider(name = "SponsorData")
	public String[][] getDataFromExcel() throws Exception {
		String str[][] = appLibrary.readExcel("Resources" + File.separator + "CreateSupportRole.xls", 1);
		return str;
		
	}

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("addSponsorTest");
	}

	@Test(dataProvider = "SponsorData")
	public void addSponsorTest(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l, String m, String n, String o, String p, String q,
			String r, String s, String t, String u, String v, String exe, String er) throws Exception {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
//		appLibrary.getDriverInstance();
//		appLibrary.launchApp();

	}

}