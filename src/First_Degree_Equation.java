import java.util.Scanner;

public class First_Degree_Equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'ax + b = 0', please enter constants:");
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số  a :");
        float a =sc.nextFloat();
        System.out.println("Nhập số  b :");
        float b =sc.nextFloat();

        if(a !=0){
            float x =-b/a;
            System.out.println("nghiệm của  pt là x ="+x);

        }else{
            if(a == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô  nghiệm ");
            }

        }
    }
}
