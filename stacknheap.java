class calculator
{
    int num=5;
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
public class stacknheap 
{
    public static void main(String a[])
    {
        int data=10;
        calculator obj = new calculator();
        calculator obj1 = new calculator();
        int r1 =obj.add(3,6);

        obj.num=3;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
    
}