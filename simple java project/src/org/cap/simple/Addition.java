package org.cap.simple;

public class Addition {
int a=10;
int b=13;
int c=a+b;
int d=b-a;

public void add()
{
	System.out.println(c);
}
public void sub()
{
	System.out.println(d);
}
public static void main(String[] args)
{
	Addition ad=new Addition();
	ad.add();
	Addition ad1=new Addition();
	ad1.sub();
	
	//hello......
	
}
}
