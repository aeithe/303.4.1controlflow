//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 7;
        x = 15;
        if(x < 10){
            System.out.println("less than 10");
        }


        x = 7;
        if(x < 10){
            System.out.println("less than 10");
        }else {
            System.out.println("greater than 10");
        }


        x = 50;
        if(x < 10){
            System.out.println("less than 10");
        }else if (x > 10 && x < 20){
            System.out.println("between 10 and 20");
        }
        else {
            System.out.println("greater than or equal to 20");
        }

        x = 5;
        if(x > 10 && x < 20){
            System.out.println("in range");
        }else{
            System.out.println("out of range");
        }

    }
}