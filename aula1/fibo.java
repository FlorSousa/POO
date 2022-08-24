import java.util.Scanner;

public class fibo {
    private static int n1 = 0;
    private static int n2 = 0;
    private static int cont = 0;
    private static void fibFor(int max){
        System.out.println("\nSaída usando for:");
        for (int i = 0; i < max ; i++) {
            System.out.print((n1+n2)+" ");
            int soma = n1+n2;
            n2 = i >= 2 ? n1 : n2;
            n1 = i >= 2 ? soma: 1;

        }
        System.out.println("\nValor final de n1:"+n1);
        System.out.println("Valor final de n2:"+n2);
    }

    private static void fibWhile(int max){
        int k = 0;
        n1 = 0;
        n2 = 0;
        System.out.println("\nSaída usando while:");
        while(k<max){
            System.out.print((n1+n2)+" ");
            int soma = n1+n2;
            n2 = k >= 2 ? n1 : n2;
            n1 = k >= 2 ? soma: 1;
            k++;
        }
        System.out.println("\nValor final de n1:"+n1);
        System.out.println("Valor final de n2:"+n2);

    }

    private static void fibDoWhile(int max){
        int k = 0;
        n1 = 0;
        n2 = 0;
        System.out.println("\nSaída usando do-while:");
        do{
            System.out.print((n1+n2)+" ");
            int soma = n1+n2;
            n2 = k >= 2 ? n1 : n2;
            n1 = k >= 2 ? soma: 1;
            k++;
        }while(k<max);
        System.out.println("\nValor final de n1:"+n1);
        System.out.println("Valor final de n2:"+n2);
    }

    private static void fibRecursao(int max){
        n1 = cont == 0 ? cont : n1;
        n2 = cont == 0 ? cont : n2;
        if(cont<max){
            System.out.print((n1+n2)+" ");
            int soma = n1+n2;
            n2 = cont >= 2 ? n1 : n2;
            n1 = cont >= 2 ? soma: 1;
            cont++;
            fibRecursao(max);
        }
        else{
            System.out.println("\nValor final de n1:"+n1);
            System.out.println("Valor final de n2:"+n2);
        }
    }

    public static void main(String[] args) {
        String messageFinal = "\nFinalizado com erro";
        try (Scanner sc = new Scanner(System.in)) {
            int maxSequence = Integer.parseInt(sc.next());
            boolean isValid = maxSequence > 0 ? true : false;
            if(isValid){
                messageFinal = "\nFinalizado com Sucesso";
                fibFor(maxSequence);
                fibWhile(maxSequence);
                fibDoWhile(maxSequence);
                System.out.println("\nSaída usando recursão");
                fibRecursao(maxSequence);
            }
            System.out.println(messageFinal);
        } catch (NumberFormatException e) {
            System.out.println(messageFinal);        
        }
    }
}