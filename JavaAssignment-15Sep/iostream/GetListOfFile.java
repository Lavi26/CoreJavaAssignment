package com.iostream;


import java.io.File;

public class GetListOfFile {
	public static void main(String args[]) {
		File file=new File("D:/Io/");
		String[] fileList=file.list();
		for(String name:fileList) {
			System.out.println(name);
		}
	}

}