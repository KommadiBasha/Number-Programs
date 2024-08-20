package TernaryOperator;

public class ThreeInputs
{
	public static void main(String[] args) {
		int a=23;
		int b=5432;
		int c=7654;
		int result=(a>b && a>c)?(a):((b>c && b>a)?(b):(c));
		System.out.println(result);
	}
}
