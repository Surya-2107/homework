public class UniqueCharacter {
    public int firstUniqChar(String s) {
        for (int i=0; i<s.length(); i++){
        char a = s.charAt(i);
        if(i==s.lastIndexOf(a) && i==s.indexOf(a)){
            return i ;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "aabb";
        UniqueString output = new UniqueString();
        int result = output.firstUniqChar(s);
        System.out.println(result);
    }
}
