

public class RemoveJunk {

	public static void main(String[] args) {
	//Regular expression we have to use for remove junk :[^a-zA-Z0-9]
		String s="LatinString !*(&*!&#) 01235907)";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}
		

	}


