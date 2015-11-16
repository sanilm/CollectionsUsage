package com.igate.collections;

public class ObjectComparison {
	
	private int num1;
	private int num2;

	

	public ObjectComparison( int num1,int num2) {
		super();
		this.num1=num1;
		this.num2=num2;
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		System.out.println(num1 );
		System.out.println(num2);
	}
	
	

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num1;
		result = prime * result + num2;
		return result;
	}
*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectComparison other = (ObjectComparison) obj;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		return true;
	}

	public static void main(String[] args) {
	
	ObjectComparison oc=new ObjectComparison(10, 20);
	ObjectComparison od=new ObjectComparison(10, 20);
	System.out.println(od.equals(oc));
	
	oc.display();

	
		
	}

	
}
