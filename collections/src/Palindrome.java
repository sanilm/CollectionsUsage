
public class Palindrome {
	
	private String s1;
	

	

	public String reverse(String s1)
	{
		
		if(s1.length()==1)
			
		return s1;
		else
		{
			 String s2= s1.charAt(s1.length()-1)+reverse(s1.substring(0,s1.length()-1));
		
		return s2;
		}
	}
	
	
	public boolean ispal(String s1)
	{
		if(s1.length()==0 || s1.length()==1)
		return true;
		if(s1.charAt(0)==s1.charAt(s1.length()-1))
			return ispal(s1.substring(1, s1.length()-1));
		else
			
		return false;
	}
	
	public int palino(int num)
	{	
		
		int temp=num;
		int rev=0;
		System.out.println("in pali");
		while(temp> 0){
			System.out.println("in pali");
			
			int rem=temp%10;
		 temp=temp/10;
		  rev=rev*10+rem;
		 
		
		}
		
		return num;
	}
	
	public void revnum(int num)
	
	{
		if(num<10)
		{
			System.out.println(num);
			
		}
		else 
		{
		System.out.print(num%10);
		revnum(num/10);
		
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="asa";
		Palindrome p1=new Palindrome();
		
		System.out.println(p1.reverse(s1));
		System.out.println(p1.ispal(s1));
		System.out.println(p1.palino(152));
		p1.revnum(122);
		
		
		
		
	}

}
