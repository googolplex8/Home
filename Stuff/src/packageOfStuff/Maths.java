package packageOfStuff;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Maths().Factorial(0);
		// new Maths().Permutation(10, 7);
		// new Maths().isIndependent(.2, .5, .1);
		new Maths().quad(1, 5, -6);
		Math.

	}

	public boolean isIndependent(double a, double b, double aAndb) {
		boolean answer;
		if (a * b == aAndb) {
			answer = true;
		} else {
			answer = false;
		}
		System.out.println(answer);
		return answer;
	}

	public double Factorial(double number) {
		double answer = 1;
		for (double i = number; i > 1; i--) {
			answer = answer * i;
		}
		System.out.println(answer);
		return answer;
	}

	public double Permutation(double n, double r) {
		double numerator = 0;
		double denominator = 0;
		numerator = Factorial(n);
		// System.out.println(numerator);
		denominator = Factorial(n - r);
		// System.out.println(denominator);
		double answer = numerator / denominator;
		System.out.println(answer);
		return answer;
	}

	public double quadPos(double a, double b, double c) {
		double answer;
		answer = (((-b) + Math.sqrt((b*b) - (4*a*c))) / 2*a);
		//System.out.println(answer);
		return answer;
	}

	public double quadNeg(double a, double b, double c) {
		double answer;
		answer = (((-b) - Math.sqrt((b*b) - (4*a*c))) / 2 * a);
		//System.out.println(answer);
		return answer;
	}

	public void quad(double a, double b, double c) {
		double answer1 = quadPos(a, b, c);
		double answer2 = quadNeg(a, b, c);
		System.out.println(answer1 + " " + answer2);
	}

}
