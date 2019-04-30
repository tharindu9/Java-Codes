public class ReverseInt {
	
	public static void main(String[] args) {
		System.out.println(new ReverseInt().reverseInteger(127893));
	}
	
	int reverse=0;
	int time;
	public  int reverseInteger(int x){//123
		int rem = x%10;
		reverse=rem + reverse*10;
		if(x>10){
			reverseInteger(x/10);
		}
		return reverse;	
	}

}