package com.files.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePrc1 {

	public static void main(String[] args) throws IOException {
		InputStream fir=new FileInputStream("C:\\Users\\CHAKRADHAR_KINTADA\\Desktop\\file_demo1.txt");
		int size=fir.available();
		System.out.println("size "+size);
		OutputStream for1=new FileOutputStream("C:\\Users\\CHAKRADHAR_KINTADA\\Desktop\\file_demo1.txt");
		String s="Feb 29, 2022 17:29:00 PM";
		byte[] b=s.getBytes();
		for1.write(b);
		while(fir.available()!=0) {
			System.out.print((char)fir.read());
		}
	}

}
