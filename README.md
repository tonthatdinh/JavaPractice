# practice-java


## Quick Sort

```java
package com.company;

public class Main {
    public static void sort(int[] a){
        // Modifies: a
        // Effects: Sorts a[0], ..., a[a.length - 1] into ascending order.
        if (a == null) return;
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int low, int high) {
        //Requires: a is not null and 0 <= low & high < a.length
        //Modifes: a
        //Effects: Sort a[low], a[low + 1], ..., a[high] into ascending order.
        if (low >= high) return;
        int mid = partition(a, low, high);
        quickSort(a, low, mid);
        quickSort(a, mid + 1, high);
    }

    private static int partition(int[] a, int i, int j) {
        //Requires: a is not null and 0 <= i < j < a.length
        //Modifies: a
        //Effects: Reorder the elements in a into two contiguos groups,
        //a[i], ..., a[res] and a[res + 1], ..., a[j], such that each
        // element in the second group is at least as large as each
        // element in the first group. Return res.
        int x = a[i];
        while (true){
            while (a[j] > x) j --;
            while (a[i] < x) i ++;
            if (i < j){ //ned to swap
                int temp = a[i]; a[i] = a[j]; a[j] = temp;
                j --; i ++;
            } else
                return j;}
        }

        
    public static void main(String[] args) {
	// write your code here
        int intArray[] = new int[8];
        for(int i = 0; i < intArray.length; i ++)
            intArray[i] = (2 * i) % 8;

        for(int i = 0; i < intArray.length; i ++)
            System.out.print(intArray[i] + " ");

        System.out.println(" ");
        sort(intArray);
        for(int i = 0; i < intArray.length; i ++)
            System.out.print(intArray[i] + " ");

    }
}

```java

References: 
[1] Program Development in Java, Barbara Liskov and John Guttag.
