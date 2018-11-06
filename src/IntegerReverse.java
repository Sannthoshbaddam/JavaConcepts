

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//using algo
		
		long num=12300;
		long rev=0;
		while(num !=0) {
			rev=rev*10+num % 10;
			num=num/10;
		}
		System.out.println(rev);
			
		}

	}


