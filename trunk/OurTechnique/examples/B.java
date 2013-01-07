package pack;

public class B extends A {
	static int v;
	
	public void m2(){
		if (true){
			m1();
			System.out.println(v);
		}
	}
	
//	public void m1(){
//		
//	}
	
}
