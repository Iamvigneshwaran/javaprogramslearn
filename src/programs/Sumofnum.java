package programs;


	import java.util.Scanner;
	public class Sumofnum {


		Scanner sc=new Scanner(System.in);

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

//			Scanner sc=new Scanner(System.in);
			
			Sumofnum sn=new Sumofnum();
			int n;
	        System.out.println("Enter the number if u stop the loop enter the negative number");
			
			
			int su=sn.sumofnum();
			System.out.println("sum="+su);
		}

		
		
		public int sumofnum(){
			
			int n,sum=0;
			
			
			while(true){
				n=sc.nextInt();
				if(n<0){
				 break;
				}
				sum=sum+n;
			}
			return sum;
		}
		

	}

