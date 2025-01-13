public class CountAndSay {
    public String countAndSay(int n) {
        String current="1";
        for (int i=1; i<n; i++){
            String next = "";
            i=0;
            while (i<current.length()){
                int currcharCount =1;
                while (i<current.length()-1 && (current.charAt(i) == current.charAt(i+1))){
                    currcharCount = currcharCount+1;
                    i= i+1;
                }
                next = next + Integer.toString(currcharCount)+current.charAt(i);
                i=i+1;
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
