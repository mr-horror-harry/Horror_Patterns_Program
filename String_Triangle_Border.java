// Enter a string with string length as multiples of 3 to see the magic

import java.util.*;
import java.lang.String;

class StringTrianglePattern{    

public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        int ods = s.length()/3;
        int h=0, t=s.length()-1;
        
        int i=ods-1;
        
        System.out.println("-".repeat(ods)+s.charAt(h++));
        ods--;
        
        int ids=1;
        while(i>0){
            
            System.out.println("-".repeat(ods)+s.charAt(t--)+"-".repeat(ids)+s.charAt(h++));
            
            ids+=2;
            ods--;
            i--;
        }
        
        StringBuilder sb = new StringBuilder("");
        
        while(h<=t){
            sb.append(s.charAt(h++)+"-");
        }
        
        System.out.println(sb.reverse().substring(1));

	}
}
