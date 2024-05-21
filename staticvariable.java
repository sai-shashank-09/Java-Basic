class Mobile
{
    //instatnce variables  
    String brand;
    int price;
    String network;
    static String name;

    public void show()
        {
            System.out.println(brand + ":" + name);
        }
    public static void show1()
    {
        System.out.println("in static method");
    }
}
public class staticvariable 
{
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 60000;
        obj1.name = "Smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 35000;
        obj2.name = "Smart phone";

        obj1.name = "phone";

        obj1.show();
        obj2.show();

        Mobile.show1();
    }
}
