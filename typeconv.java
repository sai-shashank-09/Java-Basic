public class typeconv
{
    public static void main(String args[])
    {
        byte b = 127;
        int a = b;
        byte k = (byte) a;

        float f = 5.6f;
        int t = (int)f;
       // System.out.println(t);
       
       byte x = 10;
       byte y = 30;
       int result = x*y;
       System.out.println(result);
    }
}