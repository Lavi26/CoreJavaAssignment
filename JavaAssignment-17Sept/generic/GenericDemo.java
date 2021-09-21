package com.generic;

//We use <> to specify parameter type
class Test<T>{
	//An object of type T is declared
	T obj;//String, int , float, byte
	Test(T obj){
		this.obj=obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

//Driver class to test
public class GenericDemo {

	public static void main(String arag[]) {
		//Instance of Integer type
		Test<Integer> iObj=new Test<Integer>(15);//this int is yours
		System.out.println(iObj.getObject());
		
		//Instance of string type
		Test<String> sObj=new Test<String>("GeeksForGeeks");//String
		System.out.println(sObj.getObject());
		
		//Instance of Integer type
		Test<Float> iObj22=new Test<Float>(15.85f);//this int is yours
		System.out.println(iObj22.getObject());
	}
	
}