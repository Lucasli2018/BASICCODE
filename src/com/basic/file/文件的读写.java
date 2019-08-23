package com.basic.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 50632
 *
 */
/**
 * @author 50632
 *
 */
/**
 * @author 50632
 *
 */
public class 文件的读写 {

	/**使用FileReader和FileWriter进行文件的读写
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File f=new File("e:/test","a.txt");			//创建虚拟路径
		checkFile(f);								//校验文件，如果没有文件就创建
		
		System.out.println("请输入留言...（ctrl+z结束）");
		writeFile(f);
		
		System.out.println();
		System.out.println("已经将内容写入到【"+f.getPath()+"】");
		
		
		String tips="读取文件【"+f.getPath()+"】的内容如下：";
		printTitle(tips);
		
		readFile(f);
	}


	/**输出内容，并在其下方条件一个分割线（——）
	 * @param tips
	 */
	private static void printTitle(String tips) {
		System.out.println(tips);
		for (int i = 0; i < tips.length(); i++) {
			System.out.print("——");
		}
		System.out.println();
	}


	/**将键盘输入的内容输出到文件
	 * @param f
	 * @throws IOException
	 */
	private static void writeFile(File f) throws IOException {
		FileWriter fw=new FileWriter(f);			//创建文件输出流（写）
		InputStreamReader in=new InputStreamReader(System.in);	//从键盘输入
		int n;
		while ((n=in.read())!=-1) {					//循环，每一次读取一个输入字符
			fw.write(n);							//循环，将字符输出到文件输入流
		}
		in.close();
		fw.close();
	}


	/**读取文件的内容到屏幕
	 * @param f
	 * @throws IOException
	 */
	private static void readFile(File f) throws IOException {
		FileReader fr=new FileReader(f);			//创建文件输入流（读取）
		char ch[]=new char[(int) f.length()];		//创建字符数组
		fr.read(ch);								//从文件输入流中把数据读取到内存中的char数据
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);				//循环，输出从文件输入流读取到的字符
		}
	}
	
	
	/**文件校验，判断文件是否存在，不存在则创建文件
	 * @param f
	 * @throws IOException
	 */
	private static void checkFile(File f) throws IOException{
		System.out.println("开始进行文件校验...");
		if (!f.exists()) {
			System.out.println("文件【"+f.getPath()+"】不存在，开始创建文件");
			File d=f.getParentFile();
			if (!d.exists()) {
				d.mkdirs();
			}
			if (f.createNewFile()) {
				System.out.println("创建文件成功！");
			}
		}
		System.out.println("文件校验完成...");
	}

}
