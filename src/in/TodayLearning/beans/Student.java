package in.TodayLearning.beans;
public class Student 
{
	 private String name;
     private int rollNo;
     private Address address;
     
	
	public void setName(String name) {
		System.out.println("Setter method name");
		this.name = name;
	}
	
	public void setRollNo(int rollNo) {
		System.out.println("Setter method rollNo");
		this.rollNo = rollNo;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setter method Address");
		this.address = address;
	}
     
     public void display()
     {
    	 System.out.println("Name :"+name);
    	 System.out.println("RollNo :"+rollNo);
    	 System.out.println("Address :"+address);
     }
     
}
