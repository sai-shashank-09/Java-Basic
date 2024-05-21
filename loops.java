public class loops
{
    public static void main(String a[])
    {
    //while loop and nested while loop:-
    //   int i=1;
    //    while(i<=5)
    //    {
    //     System.out.println("Hi" + i);
    //     int j=1;
    //     while(j<=3)
    //     {
    //         System.out.println("Hello"+j);
    //         j++;
    //     }
    //     i++;
    //    }
    //do while loop:-
    // do
    // {
    //     System.out.println("Hello"+i);
    //     i++;
    // }while(i<=5);
    //for loop and nested for loop:-
    for(int i=1; i<=5; i++)
    {
        System.out.println("Day"+i);
        for(int j=1; j<=9;j++)
        {
            System.out.println(" "+ (j+8) + "-" + (j+9));
        }
    }
    }
}