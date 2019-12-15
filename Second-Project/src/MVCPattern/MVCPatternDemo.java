package MVCPattern;

public class MVCPatternDemo {
    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Henry");
        student.setRollNo("14");
        return student;
    }

    public static void main(String[] args){
        //fetch student record based on his roll no from the database
        Student model = retrieveStudentFromDatabase();

        //Create a view: to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");
        controller.updateView();
    }

}
