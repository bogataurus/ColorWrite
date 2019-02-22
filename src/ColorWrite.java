import java.util.Scanner;

public class ColorWrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What color do you want?");
        String color = input.next().toUpperCase();
        if (color.equals("B")){
            System.out.print("You have chosen Blue");
        } else if (color.equals("G")) {
            System.out.print("You have chosen Green" );
        } else if (color.equals("R")){
            System.out.print("You have chosen Red");
        } else {
            System.out.println("Unknown color: "+ color);
        }
    }
}
