import java.util.Scanner;


public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// TODO Auto-generated method stub
		int day=scanner.nextInt();
		String monthString="";
		switch(day){
		case 1:monthString="monday";break;
		case 2:monthString="tuseday";break;
		case 3:monthString="wednseday";break;
		case 4:monthString="thursday";break;
		case 5:monthString="friday";break;
		case 6:monthString="saturday";break;
		case 7:monthString="sunday";break;
		default:monthString="error day";
		}
		System.out.println(monthString);

	}

}
