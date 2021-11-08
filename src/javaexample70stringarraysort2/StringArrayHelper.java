
package javaexample70stringarraysort2;


public class StringArrayHelper {
    
    public static void Sorting(String[] array) {
        if (array==null || array.length==0) {
            return;
        }
        for (int index = array.length-1; index > 0; index--) {
            
            int tempMaxIndex=MaxIndex(array, index);
            Swap(array, tempMaxIndex, index);
            
        }
    }
    
    private static int MaxIndex(String[] array, int end)
    {
        int max=0;
        
        int result;
        for (int i = 1; i <= end; i++) {
            result= array[max].compareTo(array[i]);
            if(result<0)
            max=i;
        }
        return max;
    }
    
    private static void Swap(String[] array, int first, int second)
    {
        String temp;
        temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
    
}
