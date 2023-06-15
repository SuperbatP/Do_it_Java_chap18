package sec01_lambdaexpression.EX02;
interface A {//입력X 리턴X
	void method1();
}
interface B {//입력O 리턴X
	void method2(int a);
}
interface C {//입력X 리턴O
	int method3();
}
interface D {//입력O 리턴O
	double method4(int a, double b);
}

public class FunctionToLambdaExpression {
public static void main(String[] args) {
	//인터페이스의 함수 구현-람다식
	//입력X 리턴X
	//익명이너클래스 방식
	A a1 = new A() {@Override
	public void method1() {System.out.println("입력X 리턴X");}};
	//람다식 표현
	A a2 = ()-> {System.out.println("입력X 리턴X");};
	A a3 = ()->System.out.println("입력X 리턴X");//한줄 명령일때만 가능한 중괄호 삭제
	
	//입력O 리턴X
	//익명이너클래스 방식
	B b1 = new B() {@Override
	public void method2(int a) {System.out.println("입력O 리턴X");}};
	//람다식 표현
	B b2 = (int a)->{System.out.println("입력O 리턴X");};
	B b3 = (int a)->System.out.println("입력O 리턴X");//한줄 명령일때만 가능한 중괄호 삭제
	B b4 = (a)->System.out.println("입력O 리턴X");//매개변수의 타입 생략가능
	B b5 = a->System.out.println("입력O 리턴X");//입력 매개변수가 하나면 소괄호 생략가능
	
	//입력X 리턴O
	//익명이너클래스 방식
	C c1 = new C() {@Override
	public int method3() {return 4;}};
	//람다식 표현
	C c2 = ()->{return 4;};
	C c3 = ()->4;//한줄 명령일때만 가능한 중괄호 삭제 return도 같이 생략

	//입력O 리턴O
	//익명이너클래스 방식
	D d1 = new D() {@Override
	public double method4(int a, double b) {
		return a+b;}};
	//람다식 표현
	D d2 = (int a, double b)->{return a+b;};
	D d3 = (a, b)->{return a+b;};//매개변수의 타입 생략가능, 입력매개변수가 두개라 소괄호 생략 불가능
	D d4 = (a, b)->a+b;//한줄 명령일때만 가능한 중괄호 삭제+ return도 같이 생략

	
}
}
