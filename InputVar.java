import java.util.*;
public class InputVar {
    
    public static void main(String[] args) {
        System.out.println("Calculadora de idade. ");
         System.out.println("Digite seu ano de nascimento e presione Enter para confirmar:");
         Scanner scnAno = new Scanner(System.in);
         int anoNascimento = scnAno.nextInt();
        System.out.println("Você tem " + (2024 - anoNascimento));
         scnAno.close();
    }
}
