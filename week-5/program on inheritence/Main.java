/* Design three classes STUDENT, EXAM, RESULT. The STUDENT class has members such as rollno, name. Create a class EXAM by inheriting the STUDENT class. The EXAM class adds data members representing the marks scored in six subjects. Derive the RESULT from the EXAM class and has its own members such as total marks. Write a Java program to model this relationship. */

class STUDENT
{
    String name, rollno;
}

class EXAM extends STUDENT
{
    int[] marks;
}

class RESULT extends EXAM
{
    int total_marks;
    public void calcmarks()
    {
        total_marks = 0;
        for(int i=0; i<marks.length; i++)
        {
            total_marks += marks[i];
        }
    }
}

class Main 
{
    public static void main(String[] args) {
        RESULT res = new RESULT();
        res.name = "RAJEEV";
        res.marks = new int[6];
        res.rollno = "22R25A6701";
        res.marks[0] = 90;
        res.marks[1] = 90;
        res.marks[2] = 90;
        res.marks[3] = 90;
        res.marks[4] = 90;
        res.marks[5] = 90;

        res.calcmarks();

        System.out.println( "Total marks of " + res.name + " is " + res.total_marks );

    }
}
