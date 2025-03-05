import java.util.HashMap;

public class NumberofMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
         HashMap<String,Integer> map = new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        int ans = 0;
        char c[] = s.toCharArray();
        
        for(String str:map.keySet()){
            
            char temp[] = str.toCharArray();
            int i = 0;
            int j = 0;
            
            while(i<c.length && j<temp.length){
                if(c[i]==temp[j]){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            
            if(j==temp.length){
                ans=ans+map.get(str);
            }
            
        }
        
      return ans;  
    }
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        NumberofMatchingSubsequences output = new NumberofMatchingSubsequences();
        int result = output.numMatchingSubseq(s, words);
        System.out.println(result);

        
    }
}
