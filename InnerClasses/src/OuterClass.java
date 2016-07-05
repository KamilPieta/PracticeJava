/**
 * Created by k on 05.07.2016.
 */
public class OuterClass {

    private String value="outerClass variable";

     class InnerClass{
        private InnerClass(){}  //create private constructor to prevent creating InnerClasses from the operator new InnerClass.

        String value ="Inner value";

         String getOuterValue(){
        return OuterClass.this.value;
    }
        public String getInnerValue() {
            return this.value;
        }
        public String getLocalValue() {
            String value = "local variable";
            return value;
        }
    }

    public InnerClass newInnerInstatnce(){
        return new InnerClass();
    }
}
