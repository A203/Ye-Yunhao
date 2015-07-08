package homework;

public class Army {
	Weapon[] w;
	int count=0;
	public Army(int num){
		w=new Weapon[num];
	}
	public void addWeapon(Weapon wa){
		if(count<w.length)
			w[count++]=wa;
		else
			System.out.println("武器数量到达上限");
	}
	public void attackALL(){
		for(int i=0;i<count;i++){
			w[i].attack();
		}
	
	}
	public void moveALL(){
		for(int i=0;i<count;++i)
			w[i].move();
	}

}
