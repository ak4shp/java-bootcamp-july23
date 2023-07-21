public class HelloJava
{
    
    public static void main(String[] args)
    {
        System.out.println("Hello.main() Day 1 with Java !!");
        System.out.println(newData(11, 23));
        // Here 'x:' is called inlay hint. It is the parameter name for that function. 
        // but cannot be used explicitely as named parameter

    }

    public static boolean newData(int data1, int data2){
        return data1 > data2;

    }
}