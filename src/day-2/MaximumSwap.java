public class MaximumSwap {
    public int maximumSwap(int num) {
    String s=Integer.toString(num);
        char[] array = s.toCharArray();
        int max = num;
        int n = array.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (array[i]<array[j]){
                    char temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                    max = Math.max(max,Integer.parseInt(new String(array)));
                    temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int num = 2736;
        MaximumSwap output = new MaximumSwap();
        int result = output.maximumSwap(num);
        System.out.println(result);
    }
}
