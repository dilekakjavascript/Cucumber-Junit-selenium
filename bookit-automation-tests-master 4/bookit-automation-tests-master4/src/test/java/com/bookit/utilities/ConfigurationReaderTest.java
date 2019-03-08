package com.bookit.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;


public class ConfigurationReaderTest {
	
	@Test
	public void test() {
		String exp = "aSDAd";
		String actiual = ConfigurationReader.getProperty("browser");
		Assert.assertEquals(exp, actiual);
	
	}
}
