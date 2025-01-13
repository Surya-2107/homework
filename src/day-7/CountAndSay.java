public class CountAndSay {
    public String countAndSay(int n) {
        String current="1";
        for (int i=1; i<n; i++){
            String next = "";
            int j=0;
            while (j<current.length()){
                int currcharCount =1;
                while (j<current.length()-1 && (current.charAt(j) == current.charAt(j+1))){
                    currcharCount = currcharCount+1;
                    j= j+1;
                }
                next = next + Integer.toString(currcharCount)+current.charAt(j);
                j=j+1;
            }
            current=next;
        }
        return current;
    }
    public static void main(String[] args) {
        int n = 5;
        CountAndSay output = new CountAndSay();
        String result=output.countAndSay(n);
        System.out.println(result);
    }
}
