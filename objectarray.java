class Student
{
    int rollno;
    String name;
    int marks;
}


public class objectarray
 {
    public static void main(String a[])
    {
        //1st program
        Student s1 =new Student();
        s1.rollno=1;
        s1.name="navin";
        s1.marks=88;

        Student s2 = new Student();
        s2.rollno=2;
        s2.name="praveen";
        s2.marks=80;

        Student s3 = new Student();
        s3.rollno=3;
        s3.name="suresh";
        s3.marks=90;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        //normal formal loop
        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name+" "+students[i].rollno+" "+students[i].marks);
        // }

        //enhanced for_loop or foreach loop
        for(Student stud:students)
        {
            System.out.println(stud.name + ":"  + stud.rollno);

        }

        //2nd program
        // int nums[] = new int[6];
        // nums[0]=4;
        // nums[1]=8;
        // nums[2]=3;
        // nums[3]=9;

        //normal formal loop
        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.println(nums[i]);
        // }
        // System.out.println();

        //enhanced for_loop or foreach loop
        // for(int n:nums)
        // {
        //     System.out.println(n);
        // }
    }
}