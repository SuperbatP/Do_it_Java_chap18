package sec01_lambdaexpression.EX06;
interface A{void abc(B b,int k);}//매개변수2
class B{void bcd(int k){System.out.println(k);}}//매개변수1


public class RefOfIntanceMethod_Type2_1 {
public static void main(String[] args) {
	//인스턴스 메서드 참조2
	//익명이너클래스 
	A a1 = new A() {@Override
	public void abc(B b, int k) {
		b.bcd(k);
	}};
	//람다식
	A a2=(B b, int k)-> {b.bcd(k);};
	//인스턴스 메서드 참조
	A a3=B::bcd;
	
}
}
