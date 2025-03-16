public class WordIsValidAfterSubstitutions {
    public boolean isValid(String s) {
        while(s.contains("abc")){
            s=s.replace("abc",""); 
        }
		if(s.isEmpty()){
			return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "aabcbc";
        WordIsValidAfterSubstitutions output = new WordIsValidAfterSubstitutions();
        boolean result = output.isValid(s);
        System.out.println(result);
    }
}
