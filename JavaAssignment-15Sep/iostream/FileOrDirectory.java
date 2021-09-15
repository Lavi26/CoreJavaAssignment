package com.iostream;


import java.io.File;

public class FileOrDirectory {
	public static void main(String args[]) {
		File dir=new File("D:/");
		if(dir.isDirectory()) {
			System.out.println(dir.getAbsolutePath()+" is directory");
		}
		else {
			System.out.println(dir.getAbsolutePath()+" is not directory");
		}
		if(dir.isFile()) {
			System.out.println(dir.getAbsolutePath()+" is file");
		}
		else {
			System.out.println(dir.getAbsolutePath()+" is not file");
		}
	}

}