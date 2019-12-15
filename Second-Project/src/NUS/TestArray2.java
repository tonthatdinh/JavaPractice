package NUS;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

/**
 * @author dinh
 */
public class TestArray2 {
    public static void main(String[] args){
        //Construct and initialise array
        double[] arr = {1, 2, 3};

        //using the length attribute
        System.out.println("Length = " + arr.length);

        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Alternative way
        for (double element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
