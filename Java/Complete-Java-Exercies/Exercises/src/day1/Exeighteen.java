package day1;

public class Exeighteen {
	public static int digit(int number, int digitval) {
		int digit, counter=0, temp;
		int num2 = number;
		counter = length(number);
        while(num2 > 0)
        {
            digit = num2 % 10;
            if(counter == digitval)
            	return digit;
            num2 = num2 / 10;
            counter--;
        }
        return -1;
	}
	public static int length(int number) {
		int counter = 0;
		while(number > 0)
        {
            number = number / 10;
            counter++;
        }
		return counter;
	}
	public static void main(String[] args) {
		int number = 125;
		int len = length(number);
		for(int i=1;i<len+1;i++) {
			switch(Exeighteen.digit(number, i)) {
			case 0 : System.out.print("zero" + " ");
					break;
			case 1: System.out.print("one" + " ");
					break;
			case 2: System.out.print("two" + " ");
			break;
			case 3: System.out.print("three" + " ");
			break;
			case 4: System.out.print("four" + " ");
			break;
			case 5: System.out.print("five" + " ");
			break;
			case 6: System.out.print("six" + " ");
			break;
			case 7: System.out.print("seven" + " ");
			break;
			case 8: System.out.print("eight" + " ");
			break;
			case 9: System.out.print("nine" + " ");
			break;
			default: System.out.print("Invalid Number");
			}
		}
	}
}
