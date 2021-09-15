package com.iostream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadInByteArray {
	public static void main(String args[]) throws IOException {
		byte array[]=new byte[1000];
		InputStream inp=new FileInputStream("D:/abc.txt");
		inp.read(array);
		String Data=new String(array);
		System.out.println(Data);
		inp.close();
	}
}