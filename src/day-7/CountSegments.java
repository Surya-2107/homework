public class CountSegments {
    public int countSegments(String s) {
        int count = 0;
        boolean segment = false;
        for (int i=0; i<s.length(); i++) {
            if(Character.isWhitespace(s.charAt(i))){
                segment = false;
            }else if (!segment){
                count++;
                segment = true;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s= "Hello, my name is John";
        CountSegments output = new CountSegments();
        int result = output.countSegments(s);
        System.out.println(result);
    }
}
