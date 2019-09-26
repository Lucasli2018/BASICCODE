package com.jason.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件工具类
 * 
 * @author Administrator
 * 
 */
public class FileUtil {
	// 复制文件
	/**
	 * 复制文件
	 * @param srcPath 源文件路径
	 * @param destPath 目的文件路径
	 * @throws FileNotFoundException 文件未找到
	 * @throws IOException	复制文件失败
	 */
	public static void copy(String srcPath, String destPath)
			throws FileNotFoundException, IOException {
		// 建立联系
		copyFile(new File(srcPath), new File(destPath));// 因为只是用一次，所以可以使用匿名对象
	}

	// 复制文件
	/**
	 * 复制文件
	 * @param src 源文件对象
	 * @param dest 目的文件对象
	 * @throws FileNotFoundException 文件未找到
	 * @throws IOException 复制文件失败
	 */
	public static void copyFile(File src, File dest)
			throws FileNotFoundException, IOException {
		// 选择适合的流
		InputStream fis = new BufferedInputStream(new FileInputStream(src));//使用处理流Buffered缓冲流，提高性能
		OutputStream fos = new BufferedOutputStream(new FileOutputStream(dest));
		// 操作
		byte[] flush = new byte[1024];
		int len = 0;
		while (-1 != (len = fis.read(flush))) {
			fos.write(flush, 0, len);
		}
		fos.flush();
		// 关闭资源
		if (null != fos) {
			fos.close();
		}
		if (null != fis) {
			fis.close();
		}
	}
}
