import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("输入想要计算幂的数和幂的次数");
		float num = scan.nextFloat();
		int N = scan.nextInt();
		scan.close();
		double x = myPow(num, N);
		System.out.printf("快速幂计算后的值为%lf\n", x);
	}
    public static double myPow(double x, int N) {
        long n = (long) N;
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        double ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans *= x;
            }
            x *= x;
            n >>= 1;
        }
        return ans;
    }
}
