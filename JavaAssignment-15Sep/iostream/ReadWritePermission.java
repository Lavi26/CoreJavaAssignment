package com.iostream;

import java.io.File;

public class ReadWritePermission {
	public static void main(String args[]){
		File mydir=new File("D:/IO/xyz.txt");
		if(mydir.canWrite()) {
			System.out.println(mydir.getAbsolutePath()+"can write");
		}
		else {
			System.out.println(mydir.getAbsolutePath()+"can not write");
		}
		if(mydir.canRead()) {
			System.out.println(mydir.getAbsolutePath()+"can read");
			
		}
		else {
			System.out.println(mydir.getAbsolutePath()+"can not read");
		}
	}
}