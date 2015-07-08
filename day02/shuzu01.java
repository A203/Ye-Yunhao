
public class shuzu01 {
	public static void main(String[] args) {
		// Ã°ÅÝÅÅÐò
	 int temp=0;
	 int c[]={8,5,7,4};
	 for(int i=c.length-1;i>0;i--){
		 for(int j=0;j<i;j++){
			 if(c[i]<c[j]){
				 temp=c[i];
				 c[i]=c[j];
				 c[j]=temp;
			 }
		 }
	 }
	 for(int i=0;i<c.length;i++){
		 System.out.println(c[i]);
	 }

	}

}
