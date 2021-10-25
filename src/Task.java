public class Task {
    public static void main(String[] args) {
        int count = 0;
        String str = "1232451111";
        for(int i = 0; i < str.length(); i ++){
            if(str.length() == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
