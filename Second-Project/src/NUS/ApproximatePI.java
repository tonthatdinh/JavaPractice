package NUS;

import java.util.Scanner;

/**
 * @author dinh
 * This implement is based on https://www.comp.nus.edu.sg/~cs1020/lect/15s2/
 */
public class ApproximatePI {
    public static void main(String[] args){

        int nTerms, sign = 1, denom = 1;
        double pi = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        nTerms = scanner.nextInt();

        for(int i = 0; i < nTerms; i ++){
            pi += 4.0/denom * sign;
            sign *= -1;
            denom += 2;
        }
        System.out.printf("PI = %6.f\n", pi);
    }
}
