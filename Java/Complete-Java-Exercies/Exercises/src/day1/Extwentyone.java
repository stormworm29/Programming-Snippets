package day1;

public class Extwentyone {
	public static void main(String[] args) {
		int month = 2;
		int year = 2019;
		switch(month) {
		case 1: System.out.println("Number of Days is : 31");
				break;
		case 2: if(checkYear(year))
					System.out.println("Number of Days is : 29");
				else
					System.out.println("Number of Days is : 28");
				break;
		case 3: System.out.println("Number of Days is : 31");
				break;
		case 4: System.out.println("Number of Days is : 30");
				break;
		case 5: System.out.println("Number of Days is : 31");
				break;
		case 6: System.out.println("Number of Days is : 30");
				break;
		case 7: System.out.println("Number of Days is : 31");
				break;
		case 8: System.out.println("Number of Days is : 31");
				break;
		case 9: System.out.println("Number of Days is : 30");
				break;
		case 10: System.out.println("Number of Days is : 31");
				break;
		case 11: System.out.println("Number of Days is : 30");
				break;
		case 12: System.out.println("Number of Days is : 31");
				break;
		}
	}
	public static boolean checkYear(int year) 
	{
	    if (year % 400 == 0) 
	        return true; 
	    if (year % 100 == 0) 
	        return false; 
	    if (year % 4 == 0) 
	        return true; 
	    return false; 
	} 
	
}
