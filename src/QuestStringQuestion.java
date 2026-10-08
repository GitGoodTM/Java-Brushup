public class QuestStringQuestion {
    /*
     * On a given String, find the first non-repeating character
     */
    public static void main(String[] args) {
        String string = "aaabbbcdeecaffg";
        for (char a : string.toCharArray()) {
            int count = 0;
            for(char b : string.toCharArray()){
                if(a==b){
                    count++;
                }
            }
            if (count==1){
                System.out.println("Char "+a+" is the first non repeating character at "+ (string.indexOf(a)+1)+" position");
                break;
            }
        }
    }
}
