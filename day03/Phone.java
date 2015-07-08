public class Phone{
	String name;
	String brand;
	int price;
	void call(){
		System.out.println("打电话。。。");
	}
	void send(){
		System.out.println("发短信。。。");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new Phone();
		p.name="zl2";
		p.brand="SONY";
		p.price=999;
		System.out.println(p.brand);
		System.out.println(p.name);
		p.send();
		
	}

}
