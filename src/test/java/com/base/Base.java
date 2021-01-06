package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
	public Properties prop;
	public Base() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"D:\\Selenium\\RestClient\\src\\test\\resources\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
