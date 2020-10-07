package Const;

public class Employee
{
    int emp_id ;
    String emp_name;
    double salary ;
    double bonus ;
    boolean resident ;


   public Employee ()
   {
       emp_id = 12345 ;
       emp_name = "Ghalia" ;
       salary = 100.000 ;
       bonus = 20.000 ;
       resident = true ;
   }



   public Employee (int idnum , String idname )
   {
       emp_id = idnum ;
       emp_name = idname ;
   }


   public Employee (int idnum , String idname, boolean resd)
   {
       this ( idnum , idname ) ;
       resident = resd ;
   }
   public Employee (int idnum , String idname , double S , double B , boolean resd)
   {
       this (idnum,idname,resd);
       salary = S ;
       bonus = B ;

   }
   public void set_salary (double s )
   {
       salary = s ;


   }

   public void set_salary (double s , double b )
   {
       this.set_salary(s);
       bonus = b ;

   }



    public void print_emp_data ()
    {
        System.out.println("ID= " + emp_id);
        System.out.println("Name:  " + emp_name);
        System.out.println("Salary=  " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Resident : " + resident);
    }


    public static void main (String []args ){
        Employee data = new Employee(100 , "lolo" , 100000 , 20000 , false );
        data.print_emp_data();
        System.out.println("Before set salary");
        Employee s1 = new Employee();
        s1.set_salary(500);
    }



}



