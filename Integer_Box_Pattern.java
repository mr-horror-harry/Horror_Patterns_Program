import java.util.*;
public class IntegerBox {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        System.out.print("+" + "-".repeat(s.length()) + "+\n" +
                        "|" + s + "|\n" + 
                        "+" + "-".repeat(s.length()) + "+");
        );

	}
}