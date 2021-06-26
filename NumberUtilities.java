


public class NumberUtilities {

    public static String getRange(int stop) {
        String outcome ="";
        for(int i = 0; i <= stop; i++) {
            outcome = outcome + i;
        }       
        return null;
    }
    

    public static String getRange(int start, int stop) {
        String outcome ="";
        for(int i = start; i <= stop; i++) {
            outcome = outcome + i;
        
    } return null;
    }

    public static String getRange(int start, int stop, int step) {
        String outcome= "";
        for(int i = start; i <= stop; i=step) {
            outcome = outcome + i;
        }   return null;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNum = "";
        for(int i = start; i <= stop; i++){
        if( i%2 == 0)  
         evenNum= evenNum+ i;
        } return evenNum;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNum = "";
        for(int i = start; i <= stop; i++){
            if(i%2!=0)
            oddNum= oddNum + i;
        }
        return oddNum;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String expoNum= "";
        for(int i = start; i <= stop; i++){
        expoNum=expoNum + (int)Math.pow(i, exponent);
        }
        
        return expoNum;
    }
}
