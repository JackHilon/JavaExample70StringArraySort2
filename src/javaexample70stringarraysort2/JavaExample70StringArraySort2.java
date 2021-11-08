
package javaexample70stringarraysort2;


public class JavaExample70StringArraySort2 {

    
    public static void main(String[] args) {
        
        String[] vec=new String[] {"E", "K", "B", "R", "A", "W", "H"};
        
        PrintArray(vec);
        
        StringArrayHelper.Sorting(vec);
        
        PrintArray(vec);
        
        System.out.println();
        
        String[] vec1=new String[] {"X", "S", "L", "I", "F", "C", "B"};
        
        PrintArray(vec1);
        
        StringArrayHelper.Sorting(vec1);
        
        PrintArray(vec1);
        
        System.out.println();
        
        int[] vec2=new int[] {5, 8,3,6,2,9,1,7,0};
        
        PrintArray(vec2);
        
        IntegerArrayHelper.Sorting(vec2);
        
        PrintArray(vec2);
    }
    
    private static void PrintArray(Object[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    private static void PrintArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
