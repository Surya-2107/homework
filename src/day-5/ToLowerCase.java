public class ToLowerCase {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        String s= "Hello";
        ToLowerCase output = new ToLowerCase();
        String result = output.toLowerCase(s);
        System.out.println(result);
    }
}
