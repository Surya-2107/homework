import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>(n);
        int current = 1;
        for (int i=1; i<=n; i++){
            list.add(current);
            if (current*10 <=n) {
                current = current*10;
            }else if (current%10 !=9 && current+1 <=n) {
                current++;
            }else {
                while ((current/10)%10 == 9) {
                    current = current/10;
                }
                current = current/10 +1;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int n =13;
        LexicographicalNumbers output = new LexicographicalNumbers();
        List<Integer> result = output.lexicalOrder(n);
        System.out.println(result);
    }
}
