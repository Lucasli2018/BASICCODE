package com.jason.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import org.junit.Test;

public class CharStream {
	
	@Test
	//读取文本文件
	public void demo01(){
		File src=new File("e:/test/a.txt");
		Reader reader=null;
		try {
			reader=new FileReader(src);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		}
		char[] car=new char[50];
		int len=0;
		try {
			while(-1!=(len=reader.read(car))){
				String info=new String(car,0,len);
				System.out.println(info);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("释放资源失败");
				}
			}
		}
	}
	
	@Test
	//写入文本文件
	public void demo02(){
		//建立联系
		File dest=new File("e:/test/c.txt");
		//选择适合的流
		FileWriter writer=null;
		
		try {
			writer = new FileWriter(dest,true);//追加模式
			//操作
			String info="锄禾日当午，\r\n汗滴禾下土\r\n......\r\n";
			writer.write(info);
			writer.flush();//强制刷新缓冲
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件写入失败");
		}finally{
			//关闭资源
			if(null!=writer){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("释放资源失败");
				}
			}
		}
	}
	
	@Test
	//封装 文本文件拷贝
	public void demo03(){
		
		String srcPath="e:/test/a.txt";
		String destPath="e:/test/d.txt";
		try {
			copy(srcPath, destPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("复制文件失败|关闭资源失败");
		}
	}
	
	//文本文件拷贝
	public void copy(String srcPath,String destPath) throws FileNotFoundException, IOException{
		//建立联系
		copyFile(new File(srcPath), new File(destPath));
	}
	//文本文件拷贝
	public static void copyFile(File src,File dest) throws FileNotFoundException,IOException{
		//选择适合的流
		FileReader reader=new FileReader(src);
		FileWriter writer=new FileWriter(dest);
		char[] cbuf=new char[50];
		int len=0;
		//操作
		while(-1!=(len=reader.read(cbuf))){
			String info=new String(cbuf,0,len);
			writer.write(info);
		}
		writer.flush();
		//关闭资源
		if(null!=writer){
			writer.close();
		}
		if(null!=reader){
			reader.close();
		}
	}
}
