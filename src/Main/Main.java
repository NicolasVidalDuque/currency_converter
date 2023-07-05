package Main;
import CustomException.CustomException;
import Dialog_box.OptionBox;
public class Main {
    public static void main(String[] args){
        try {
            String d = OptionBox.display(1);
            System.out.println(d);
            String b = OptionBox.display(2);
            System.out.println(b);
        } catch (CustomException e){
            throw e;
        }
    }
}
