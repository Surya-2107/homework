public class RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder str = new StringBuilder(a);
        int count = 1;
        while (str.length() < b.length()) {
            str.append(a);
            count++;
        }
        if(str.indexOf(b) != -1) {
            return count;
        }
        str.append(a);
        count++;
        if (str.indexOf(b) != -1) {
            return count;
        }
        return -1;
    }
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        RepeatedStringMatch output =new RepeatedStringMatch();
        int result = output.repeatedStringMatch(a,b);
        System.out.println(result);
    }
}
