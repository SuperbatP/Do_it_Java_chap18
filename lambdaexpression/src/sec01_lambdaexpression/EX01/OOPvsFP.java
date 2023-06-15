package sec01_lambdaexpression.EX01;
interface A{void abc();}
class B implements A{
	@Override
	public void abc() {
	System.out.println("메서드 내용1");}
}
public class OOPvsFP {
public static void main(String[] args) {
	//객체 지향 프로그래밍 문법	
	A a1 = new B();
	a1.abc();
	//객체 지향 프로그래밍 문법-이너클래스 사용
	A a2 = new A() {@Override
	public void abc() {
		System.out.println("메서드 내용2");
	}};
	a2.abc();
	//함수적 프로그래밍 문법(람다식)
	A a3=()->{System.out.println("메서드 내용3");};
	a3.abc();
	
	
}
}
