public class PerfectSquares {
    public int numSquares(int n) {
        int[] data=new int[n+1];
        for (int i=0; i<=n; i++){
            data[i]=i;
            for (int j=1; j*j<=i;j++){
                data[i]=Math.min(data[i-j*j]+1,data[i]);
            }
        }
        return data[n];
    }
    public static void main(String[] args) {
        int n = 21;
        PerfectSquares output = new PerfectSquares();
        int result = output.numSquares(n);
        System.out.println(result);
    }
}
