
import java.util.Scanner;
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		 if(score<0||score>100)
	        {
	        	System.out.println("error");
	        	return;
	        }
		 if(score>=90)
		{
			System.out.println("等级为A");
		}
		if(score>=80&&score<90)
		{
			System.out.println("等级为B");
		}
        if(score>=70&&score<80)
        {
        	System.out.println("等级为C");
        }
        if(score>=60&&score<70)
        {
        	System.out.println("等级为D");
        }
        if(score<60)
		{
			System.out.println("等级为E");
		}
       

	}
}
	
