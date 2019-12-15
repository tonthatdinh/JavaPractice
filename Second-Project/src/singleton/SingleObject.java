package singleton;

public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instace = new SingleObject();

    //make the constructor private so that this class cannot be instantited
    private SingleObject(){

    }

    //Get the only object available
    public static SingleObject getInstace(){
        return instace;
    }

    public void showMessage(){
        System.out.println("Hello world");
    }
}


