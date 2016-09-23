package c1;

public class Algs4_1 {
	
	public static void main(String[] args)
	{
		System.out.println(gcd(6 , 16));
	}
	
	public static int gcd(int p, int q){
		if (q == 0) return p;
		int r = p % q;
		return gcd (q,r);
	}
}