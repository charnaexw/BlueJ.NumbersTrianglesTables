 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {        
        String starBox= "";
        String star = "*";
        for(int i= 1; i <= numberOfStars; i++){            
         starBox = starBox + star;
        }    
        return starBox;    
        }
           
    public static String getTriangle(int numberOfRows) {
        String rowNum="";        
        for(int i=1; i <= numberOfRows; i++){                          
            rowNum += getRow(i);
            rowNum+= "\n";
        }
        return rowNum;
    }
    
    public static String getSmallTriangle() {
        
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
