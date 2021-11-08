
package javaexample70stringarraysort2;


public class IntegerArrayHelper {
    
    public static void Sorting(int[] array)
    {
        int max;
        for (int index = array.length-1; index > 0; index--) {
            max=MaxIndexCalculation(array, index);
            Swap(array, max, index);
        }
    }
    
    private static int MaxIndexCalculation(int[] array, int end)
    {
        int max =0;
        for (int i = 1; i <= end; i++) {
            if(array[max]<array[i])
                max=i;
        }
        return max;
    }
    
    private static void Swap(int[] array, int first, int second)
    {
        int temp;
        temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
    
}
