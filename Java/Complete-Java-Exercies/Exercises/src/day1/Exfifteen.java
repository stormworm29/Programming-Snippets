package day1;

public class Exfifteen {
	public static void main(String[] args) {
		int number = 173;
		if(isPrime(number)) {
			System.out.println("The number is a prime number");
		}
		else if (isArmstrong(number)) {
			System.out.println("The number is a Amstrong number");
		}
	}
	public static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    }
    public static int power(int x, long y) 
    { 
        if( y == 0) 
            return 1; 
        if (y%2 == 0) 
            return Exfifteen.power(x, y/2)*Exfifteen.power(x, y/2); 
        return x*Exfifteen.power(x, y/2)*Exfifteen.power(x, y/2); 
    } 
    public static int order(int x) 
    { 
        int n = 0; 
        while (x != 0) 
        { 
            n++; 
            x = x/10; 
        } 
        return n; 
    } 
 
    public static boolean isArmstrong (int x) 
    { 
        int n = Exfifteen.order(x); 
        int temp=x, sum=0; 
        while (temp!=0) 
        { 
            int r = temp%10; 
            sum = sum + Exfifteen.power(r,n); 
            temp = temp/10; 
        } 
        return (sum == x); 
    }
}
