package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args){
        //illegal construct

        SingleObject object = SingleObject.getInstace();
        object.showMessage();
    }
}
