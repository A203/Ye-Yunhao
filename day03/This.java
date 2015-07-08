
public class This {
	public static void main(String[] args) {
		Person p=new Person("yeyunhhao",21,"haikou");
		p.introduce();
	}

}
class Person{
	String name;
	int age;
	String address;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name,int age,String address){
		this(name,age);
		this.address=address;
	}
	void hello(){
		System.out.println("hello..");
	}
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
		this.hello();
	}
}
