public class Student {
	int id;
	String name;
	String add;
	void introduce(){
		System.out.println("我的名字是"+name);
	
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student t=new Student();
		t.id=2012214312;
		t.name="叶运浩";
		t.add="ab";
		System.out.println(t.id);
		t.introduce();

	}

}
