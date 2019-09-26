package com.jason.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class First {

	/**
	 * 流：流动，流向，从源头>>目的地
	 * 以程序为中心
	 * 程序-------->>>>文件|数组|网络|数据库
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("file io ...");

	}
	
	@Test
	//读取文件
	public void demo01(){
		//1、建立联系
		File src=new File("e:/test/a.txt");
		//2、选择适合的流
		FileInputStream fis=null;//提升作用域
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//异常信息需要：简单，明确
			System.out.println("文件未找到");
		}
		//3、读取文件
		byte[] car =new byte[50];
		int len=0;//实际读取的长度
		System.out.println("读取文件："+src.getAbsolutePath());
		System.out.println("==========================================");
		try {
			while (-1!=(len=fis.read(car))) {
				String info=new String(car,0,len,StandardCharsets.UTF_8);//设置编码
				System.out.println(info);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			if(null!=fis){
				//4、释放资源
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("资源释放失败");
				}
			}
		}
	}

	@Test
	//文件写入
	public void demo02(){
		//建立联系
		File dest=new File("e:/test/b.txt");
		
		//选择适合的流
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(dest,true);//默认为fale覆盖，true为追加，
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		}
		
		//操作
		String info="jason is a very handsome man ...\r\n";
		byte[] car =info.getBytes();//字符串转字节数组
		try {
			fos.write(car,0,car.length);
			fos.flush();//强制刷新缓冲数据
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("写入文件失败");
		}finally{
			if(null!=fos){
				//关闭资源
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("关闭资源失败");
				}
			}
			System.out.println("文件写出成功，路径："+dest.getAbsolutePath());
		}
	}
	
	@Test
	//复制图片
	public void demo03(){
		//建立联系
		File src=new File("e:/desk/desk.jpg");
		File dest=new File("e:/test/desk.jpg");
		//选择适合的流
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(dest);
			//操作
			byte[] car=new byte[1024];
			int len=0;
				while (-1!=(len=fis.read(car))) {
					fos.write(car);
				}
				fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			//关闭资源
			if(null!=fos){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("输出流释放失败");
				}
			}
			if(null!=fis){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("输入流释放失败");
				}
			}
			System.out.println("文件复制：从【"+src.getAbsolutePath()+"】复制到【"+dest.getAbsolutePath()+"】");
		}
		
	}
	@Test
	//封装
	public void demo04(){
		String srcPath="e:/desk/desk.jpg";
		String destPath="e:/test/desk.jpg";
		try {
			copy(srcPath, destPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件复制失败|关闭资源失败");
		}
	}
	//复制文件
	public static void copy(String srcPath,String destPath) throws FileNotFoundException,IOException{
		//建立联系
		//File src=new File(srcPath);
		//File dest=new File(destPath);
		copyFile(new File(srcPath), new File(destPath));//因为只是用一次，所以可以使用匿名对象
	}
	//复制文件
	public static void copyFile(File src,File dest) throws FileNotFoundException,IOException{
		//建立联系
		//选择适合的流
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(dest);
		//操作
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=fis.read(flush))) {
			fos.write(flush,0,len);
		}
		fos.flush();
		//关闭资源
		if(null!=fos){
			fos.close();
		}
		if(null!=fis){
			fis.close();
		}
		System.out.println("文件复制：从【"+src.getAbsolutePath()+"】复制到【"+dest.getAbsolutePath()+"】");
	}
}
