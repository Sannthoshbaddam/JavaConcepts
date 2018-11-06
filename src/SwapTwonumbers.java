

public class SwapTwonumbers {

	public static void main(String[] args) {
	int x=12;
	int y=7;
	
	//with third variable
	
	/*int t;
	t=x;
	x=y;
	y=t;
	
	System.out.println(x);
	System.out.println(y);
	*/
	//2)without 3rd varibale
	
	/*x=x+y;
	y=x-y;
	x=x-y;
	System.out.println(x);
	System.out.println(y);*/
	
	//3)without 3rd operator
	/*x=x*y;
	y=x/y;
	x=x/y;*/
	//4)using xor ^
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.println(x);
	System.out.println(y);
	
	

	}

}
