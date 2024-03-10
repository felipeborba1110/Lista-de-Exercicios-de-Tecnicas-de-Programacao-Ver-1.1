import java.util.Scanner;

//For fun
public class ID {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Search a person:");
        String name = input.next();
        if (name.equals("Sara")){
            System.out.print("""
                    Informations:
                    Age: 42
                    Blood type: B
                    Gender: Female
                    """);
        }
        else {
            if (name.equals("Angela")){
                System.out.print("""
                        Informations:
                        Age: 53
                        Blood type: A
                        Gender: Female
                        """);
            }
            else {
                if (name.equals("Roberto")) {
                    System.out.print("""
                        Informations:
                        Age: 72
                        Blood type: O
                        Gender: Male
                        """);
                }
                else {
                    System.out.println("Not found");
                }
            }
        }

    }
}
