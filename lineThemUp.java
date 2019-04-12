import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String num_IN;
        
        try {
            while((num_IN = br.readLine()) != null) {
                int numNames = Integer.parseInt(num_IN);
                String line;
                String[] names;
                names = new String[numNames];
                boolean isDec = false;
                boolean isNeither = false;
                boolean isInc = false;
                
                for(int i = 0; i < numNames; i++) {
                    line = br.readLine();
                    names[i] = line;
                    
                    if(i > 0) {
                        String name1 = names[i-1];
                        String name2 = names[i];
                        
                        if(name1.compareTo(name2) < 0) {
                            isInc = true;
                        }
                        
                        if(name1.compareTo(name2) > 0) {
                            isDec = true;
                        }
                        
                    }
                }
                
                if(isInc && isDec) {
                    System.out.println("NEITHER");
                }
                else if (isInc) {
                    System.out.println("INCREASING");
                }
                else {
                    System.out.println("DECREASING");
                }
            }
            
            
            
        } catch(Exception e) {
            
        } finally { }
    }
}
