package assign1;
import java.util.Scanner;

class myexcep extends Exception {
    public myexcep(String s) {
        super(s);
    }
}

class myexcepclass {
    public <Template> void UserMethod(Template a) {
        try {
            if (a instanceof String)
            { throw new myexcep("String found");
            }
            double number = Double.parseDouble(String.valueOf(a));
            number = number*(0.6667);
            System.out.println(number);
            }
            catch (myexcep e)
            {
            System.out.println(e.getMessage());
            }
    }
}

public class ques8{
    public static void main(String[] args) {
        myexcepclass obj = new myexcepclass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        obj.UserMethod(Integer.parseInt(sc.nextLine()));
        System.out.println("String:");
        obj.UserMethod(Integer.parseInt(sc.nextLine()));
    }
}
