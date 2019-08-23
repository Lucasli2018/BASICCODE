package com.basic.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 50632
 *
 */
public class 复制文件 {

	/**复制文件
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		File f=new File("e:/abc","新建文本文档.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			createFile(f);
			return;
		}
		byte[] b=new byte[(int) f.length()];
		fis.read(b);
		System.out.println("复制文件...");
		File fi=f.createTempFile("copy", ".txt", new File("e:/abc"));
		FileOutputStream fos = new FileOutputStream(fi);
		
		fos.write(b);
		System.out.println("生成临时文件....");
		fos.close();
		fis.close();
		
	}
	
	
	/**创建文件
	 * @param f e:\abc\新建文本文档.txt
	 * @throws IOException
	 */
	private static void createFile(File f) throws IOException{
		if (!f.exists()) {
			File d=f.getParentFile();
			if (!d.exists()) {
				d.mkdirs();
			}
			System.out.println("开始创建文件...");
			if (f.createNewFile()) {
				System.out.println("文件创建成功");
				System.out.println("请重新运行程序！");
			}
		}else{
			System.out.println("文件已经存在！");
		}
		
		
	}

}
