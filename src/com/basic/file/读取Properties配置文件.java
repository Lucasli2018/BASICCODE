package com.basic.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.junit.Test;

public class 读取Properties配置文件 {

	@Test
	public void demo01() throws Exception{
		File file=new File("D:\\github\\Javase-middle\\JKSHOP\\BASICCODE\\src\\com\\basic\\file\\test.properties");
		InputStream inputStream=new FileInputStream(file);
		//加载配置文件
		Properties properties=new Properties();
		properties.load(inputStream);
		//根据key读取配置
		String className=properties.getProperty("className");
		System.out.println("读取配置文件["+file.getAbsolutePath()+"]信息："+className);
	}
}
