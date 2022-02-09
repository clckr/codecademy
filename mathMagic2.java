public class Magic {
	public static void main(String[] args) {
    // og number, can be any number
    int myNumber = 8;

    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;

    System.out.println(magicNumber);
    
	}
}
