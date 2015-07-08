
public class Demo2 {
public enum day{monday,tuseday,wednseday,thursday,friday,saturday,sunday}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day day1=day.wednseday;
		int intDay=0;
		switch(day1){
		case monday:intDay=1;break;
		case tuseday:intDay=2;break;
		case wednseday:intDay=3;break;
		case thursday:intDay=4;break;
		case friday:intDay=5;break;
		case saturday:intDay=6;break;
		case sunday:intDay=7;break;
		}
		System.out.println(intDay);
		}

	}

