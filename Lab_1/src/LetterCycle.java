//This is the method class
public class LetterCycle {

    

    public static String translate(String input) {
        //creates a string builder
        StringBuilder sb = new StringBuilder();
        //creates a convert object from the convert class
        convert convert = new convert();

        //nested loops to determine if the string contains letters, changes them to uppercase
        //and sends them to the convert class.
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(convert.letterToNum(Character.toUpperCase(ch)));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
    
    
    
   
   
   
   
   
   
   
    
