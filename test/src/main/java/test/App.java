package test;

public class App 
{
    public static void main( String[] args )
    {
        ArrayOperation obj = new ArrayOperation();
        
        int sumObj = obj.SumArrays();
        System.out.println("Sum value is "+sumObj);
        
        int maxObj = obj.maxArrays();
        System.out.println("Max value is "+maxObj);

        
    }
}