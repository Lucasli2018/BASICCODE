package com.basic.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制文件 {

	/**复制文件
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		File f=new File("e:/abc","新建文本文档1.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		byte[] b=new byte[(int) f.length()];
		fis.read(b);
		File fi=f.createTempFile("copy", ".txt", new File("e:/abc"));
		FileOutputStream fos = new FileOutputStream(fi);
		
		fos.write(b);
		fos.close();
		fis.close();
		System.out.println("复制文件");
	}

}
