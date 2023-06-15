package sec01_lambdaexpression.EX04;

interface A{void abc(int k);}

public class RefOfIntanceMethod_Type1_2 {
public static void main(String[] args) {
	//인스턴스 메서드 참조 1-익명이너클래스
	A a1 = new A() {@Override
	public void abc(int k) {
		System.out.println(k);
	}};
	//인스턴스 메서드 참조 1-람다식
	A a2=(int k)->{System.out.println(k);};
	A a3 =System.out::println;
	
	
}
}
