public class conditionsifelse
{
    public static void main(String args[])
    {
       /*int x = 10; 
       if(x>10)    //any conditions can be used
        System.out.println("Hello");
       else
       {
        System.out.println("Bye");
        System.out.println("see you");
       }*/
       /*  int x=8;    // greatest number among 3 numbers
        int y=7;
        int z=6;
        if (x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else 
            System.out.println(z);*/
        int num=11;  //even or odd number
        // if (num%2==0)
        //     System.out.println("it is an even number");
        // else
        //     System.out.println("it is an odd number");

        //?:  ternary operators:- condition ? if : else
        int result = 0;
        result = num%2==0 ? 10:20;
        System.out.println(result);
    }
}