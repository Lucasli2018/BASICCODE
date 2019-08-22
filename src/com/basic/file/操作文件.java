package com.basic.file;

import java.io.File;

public class 操作文件 {

	/**操作文件属性
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("e:\\abc","test.txt");
		fileInfo(f);
	}

	private static void fileInfo(File f) {
		System.out.println("文件名："+f.getName());
		System.out.println("路径："+f.getPath());
		System.out.println("父路径："+f.getParent());
		System.out.println("绝对路径："+f.getAbsolutePath());
		if (f.exists()) {
			System.out.println("文件存在");
			System.out.println("是目录？"+f.isDirectory());
			System.out.println("可读？"+f.canWrite());
			System.out.println("可写？"+f.canRead());
			System.out.println("文件的长度："+f.length());
			System.out.println("文件最后被修改的日期："+f.lastModified());
			if (f.delete()) {
				System.out.println(f.exists()?"文件删除失败":"文件删除成功");
			}
		}else{
			System.out.println("文件不存在");
		}
	}
}
