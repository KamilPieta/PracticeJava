/**
 * Created by k on 05.07.2016.
 */
public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

       // OuterClass.InnerClass innerClass= outerClass.new InnerClass();  -ERROR the Constructor is private
        OuterClass.InnerClass innerClass= outerClass.newInnerInstatnce();

        System.out.println(innerClass.getOuterValue()); //Inner & OuterClasses have access to eachother private variables
        System.out.println(innerClass.getInnerValue());
        System.out.println(innerClass.getLocalValue());
    }
}
