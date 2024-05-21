class calculator
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
public class classnobject2
{
    public static void main(String a[])
    {
        calculator obj = new calculator();
        int r1 = obj.add(5,10);
        int r2 = obj.add(r1, 15);
        System.out.println(r2);
    }
}
