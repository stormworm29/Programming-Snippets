package test;

import java.util.Scanner;
public class IBSNChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Boolean check = false;
		check =  IBSNChecker.checker(str);
		if(check) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
	}

	public static Boolean checker(String str) {

		int sum = 0;
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='-')
			{
				str = str.substring(0,i) + str.substring(i+1);
			}
			len = str.length();
		}
		len = str.length();
		if(len != 10)
		{
			return false;
		}
		char lastchar = str.charAt(len-1);
	    if (lastchar != 'X')
	    {
	    	if((lastchar < '0') || (lastchar > '9'))
	    	{
	    		return false;
	    	}
	    }
	    for (int i = 0; i < len-1; i++)
        {
            int num = str.charAt(i)-'0';
            if (num < 0 || num > 9)
            {
                return false;
            }
            sum +=  (10 - i) * num;
        }
	    if(lastchar == 'X')
	    {
	    		sum += 10;
	    }
	    else{
	    		sum += (lastchar - '0');
	    		}
	    if(sum%11 == 0)
	    	return true;
	    else
	    	return false;
	    
		}
	}

