public class StringCompression {
    public int compress(char[] chars) {
    StringBuilder str = new StringBuilder();
        int i=0;
        while (i<chars.length) {
            char currentChar=chars[i];
            int count = 0;
            while (i<chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            str.append(currentChar);
            if(count>1) {
                str.append(count);
            }
        }
        for (int j=0; j<str.length(); j++) {
            chars[j] = str.charAt(j);
        }
        return str.length();
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        StringCompression output = new StringCompression();
        int result = output.compress(chars);
        System.out.println(result);
    }
}
