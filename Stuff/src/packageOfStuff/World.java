package packageOfStuff;

public class World {

	public static void main(String[] args) {
		System.out.println("Welcome to the world");
		new World().Arries();
		new World().ArrayCopyDemo();
	}

	public void Arries() {
		int[] anArray = new int[10];
		anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("The array is " + anArray.length +  "long");
      
	}
	public void ArrayCopyDemo() {

	        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
				    'i', 'n', 'a', 't', 'e', 'd' };
	        char[] copyTo = new char[7];

	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	        System.out.println(copyTo);
	        System.out.println(new String(copyTo));
	    }
	}
