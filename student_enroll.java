package skilltest3.hii;
class student_enroll{
    String name="student1";
    String Course="cs";
    int ph=2735161;

    
    void display(){
        System.out.println("Student details are: ");
        System.out.println("Student name: "+name);
        System.out.println("Student course: "+Course);
        System.out.println("Student ph.no: "+ph);
        System.out.println("Student register id is: "+"183cs23033");
    }
    public static void main(String[] args){
        student_enroll se=new student_enroll();
       
        se.display();
    }
}