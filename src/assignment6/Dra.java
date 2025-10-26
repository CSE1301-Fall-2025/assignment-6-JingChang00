package assignment6;
import java.util.*;

public class Dra {
        public static String dragon(int n) {
		
			// FIXME Recursively compute dragon curves
			if(n == 0)
			{ 
				return "F-H";
			}

        String prev = dragon(n - 1);
        String step1 = prev.replace("F", "A");
        String step2 = step1.replace("H", "B");
        step2 = step2.replace("A", "F-H");
        return step2.replace("B", "F+H");

        }


public static void main(String[] args) {
     System.out.println(dragon(3));
}
       
}
