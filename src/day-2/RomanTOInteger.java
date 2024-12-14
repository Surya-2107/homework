package Leet1;
import java.util.HashMap;

public class RomanTOInteger {
    public int roman(String input){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result=0;
        for (int i=0; i<input.length();i++){
            int temp=map.get(input.charAt(i));

            if(i<input.length()-1 && temp < map.get(input.charAt(i+1))) {
                result= result - temp;
            }else {
                result= result+temp;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String input = "MCMXCIV";
        RomanTOInteger answer = new RomanTOInteger();
        int output=answer.roman(input);
        System.out.println(output);
    }
}
