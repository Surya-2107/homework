package Leet1;

public class MergeString {
    public static void main(String[] args) {
String name1 = "abcd";
String name2 = "pq";
int i=0;
int j=0;
while (i<name1.length()|| j<name2.length()){
    if(i<name1.length()){
    System.out.print(name1.charAt(i));
    i++;
}
    if(j<name2.length()){
    System.out.print(name2.charAt(j));
    j++;
}
}   
}
}

