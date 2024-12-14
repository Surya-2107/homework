package Leet1;

public class RemoveElement {
    public int removeElement (int[] input, int value) {
        int index=0;
        for (int i=0; i<input.length; i++){
            if(input[i] != value){
                input[index] = input[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int input[] = {2,5,6,5,4,3,2,4,5};
        RemoveElement output = new RemoveElement();
        int result = output.removeElement(input,5);
        System.out.println(result);
    }
}
