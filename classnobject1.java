class computer
{
    public void playmusic()
    {
        System.out.println("Music playing....");
    }
    public String getmeapen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Noting";
    }
}
public class classnobject1 
{
    public static void main(String a[])
    {
        computer obj = new computer();
        obj.playmusic();
        String result= obj.getmeapen(2);
        System.out.println(result);
    }
}
