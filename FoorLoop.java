import java.util.Scanner;


public class FoorLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//starPattern();
		forLoopTable();
	}
	
	public static void starPattern(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scanner.nextInt();
		for(int i =1;i<=n;i++){
			for(int s=(n-i)/*s==2*/;s>=1;s--){
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();	
		}
		for(int i =n;i>=1;i--){
			for(int s=(n-i);s>=1;s--){
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();	
		}
	}
	
	public static void forLoopTable(){
		for(int i = 1;i<=12;i++){
			if(i==1){
				for(int j=1;j<=11;j++){
					System.out.print(" -- ");
					
				}
				System.out.println();
			}
			
			else if(i==2){
				for(int k=0;k<=9;k++){
					if(k==0){
						System.out.print("|    | ");
						
					}
					else if(k==9){
						System.out.print(" "+k +" |" );
					}
					
					else{
						System.out.print(" "+k +"  " );
					}
				}
				System.out.println();
				
			}
			else if(i==3){
				for(int j=1;j<=11;j++){
					System.out.print(" -- ");
				}
				System.out.println();
			}
			else {
				
				for(int n=1;n<=11;n++){
					if(n==1){
						System.out.print("|  "+(i-3) + " |");
					}
					else if(n==11){
						System.out.print("|");
					}
					else{
						if((i-3)*(n-1)>=10){
							System.out.print(" " + (i-3)*(n-1) +" ");
						}
						else{
							System.out.print("  " + (i-3)*(n-1) +" ");
						}
					
					}
				}
					System.out.println();
			}
		}
		
		for(int j=1;j<=11;j++){
			System.out.print(" -- ");
			
		}
		
		
	}

}
