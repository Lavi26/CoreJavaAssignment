package com.iostream;


import java.io.File;

public class FileByPathname {
	public static void main(String args[]) {
		File Mydir=new File("D:/IO/xyz.txt");
		if(Mydir.exists()) {
			System.out.println("file exist");
		}
		else {
			System.out.println("file not exist");
		}
	}

}