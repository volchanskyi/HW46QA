
import java.util.*;
import java.math.*;
public class AverageScore {
       static Scanner input = new Scanner(System.in);
       public static void main(String[] args) {
          System.out.println("Please enter a grade:");                             // v2
              double i;
              double sum = 0;
              int count = 0;
              while (input.hasNextDouble()) {
                     System.out.println("Please enter a grade:");
                    i = input.nextDouble();
                    sum = sum + i;
                 sum = sum + (int)i;                                                 // v4
                 sum = sum + Math.abs((int)i);                                       // v5
                    count++;
                                            }
                 System.out.println("Average score is: " + sum / count);                  
              System.out.println("Average score is: " + Math.round(sum / count));   // v3
              // BigDecimal score_banker = new BigDecimal(sum / count);                // v6
              // score_banker = score_banker.setScale(0, RoundingMode.HALF_EVEN);      // v6
              // System.out.println("Average score is (Banker): " + score_banker);     // v6
      }
}
