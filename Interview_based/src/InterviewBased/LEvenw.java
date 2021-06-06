package InterviewBased;

public class LEvenw {
     String str;
	public LEvenw(String str) {
      this.str=str;
	}
	
	public String Compute() {
		int len=str.length();
		int Start_index=-1;
		int Maxword_length=0;
		int Cur_length=0;
		int i=0;
		
	while(i<len) {
		 if(str.charAt(i)==' ') {
		 if(Cur_length%2==0) {
		 if(Maxword_length<Cur_length)
			 {Maxword_length=Cur_length;
			 Start_index=i-Cur_length;
			 }
		 }
		 Cur_length=0;
		 }
		 else
			 {Cur_length++;
			 }
		 System.out.println(i);
		;
		
	}
	if(Cur_length%2==0) 			 
	{
		if(Maxword_length<Cur_length) 
			 {Maxword_length=Cur_length;
			 Start_index=i-Cur_length;
			 }
	 }
	if(Start_index==-1)
		{return "-1";}
	
return str.substring(Start_index,Start_index+Maxword_length);
System.out.println(str);
	
	}

	public static void main(String[] args) {
		String A="The man is here";
				System.out.println("Largest even string is: ");
				LEvenw obj =new LEvenw(A);
				obj.Compute();
		
	}

}
