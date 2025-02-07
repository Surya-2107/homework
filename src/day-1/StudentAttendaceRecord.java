public class StudentAttendaceRecord {
    public boolean checkRecord(String s) {
        int late = 0;
        int absent = 0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='A'){
                absent++;
                if(absent>=2){
                    return false;
                }
            }
            if(c=='L'){
                late++;
                if(late==3){
                    return false;
                }
            }else {
                late=0;
            }
        }
        return absent<2 && late<3;
    }
    public static void main(String[] args) {
        String s = "PPALLP";
        StudentAttendaceRecord output = new StudentAttendaceRecord();
        boolean result = output.checkRecord(s);
        System.out.println(result);
    }
}
