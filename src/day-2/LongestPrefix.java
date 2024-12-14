package Leet1;

public class LongestPrefix {
    public String longestCommonPrefix (String[] input){
        String prefix = input[0];
        for (int i=1; i<input.length; i++){
            while (input[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()){
                    return "No common prefix";
                }
            }
        }
        return prefix;
        }
    public static void main(String[] args) {
        String input[]= {"dog", "racecar", "car"};
        LongestPrefix output = new LongestPrefix();
        String result = output.longestCommonPrefix(input);
        System.out.println(result);
    }
    }

