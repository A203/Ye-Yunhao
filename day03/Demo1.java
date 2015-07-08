
public class Demo1 {
	Demo1(){
		System.out.println(4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
		new A();
		new Demo1();		

	}

}
class A{
	static{
		System.out.println(1);
	}			
			
	{
		System.out.println(2);
	}
	A(){
		System.out.println(3);
	}
	
}
