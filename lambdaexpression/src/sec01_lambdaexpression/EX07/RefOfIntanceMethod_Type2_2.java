package sec01_lambdaexpression.EX07;

interface A{int abc(String str);}

public class RefOfIntanceMethod_Type2_2 {
public static void main(String[] args) {
	//익명이너클래스
	A a1=new A() {@Override
	public int abc(String str) {
		return str.length();}};
	//람다식
	A a2=(String str)-> {return str.length();};
	//인스턴스 메서드 참조
	A a3=String::length;
	System.out.println(a1.abc("안녕"));
	System.out.println(a2.abc("안녕"));
	System.out.println(a3.abc("안녕"));
	
}
}
