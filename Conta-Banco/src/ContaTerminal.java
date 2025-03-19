import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        

        int  numeroC;
        double saldo;
        String agencia, nomeCliente;
        
        System.out.println("Olá porfavor, informe numero da sua conta: ");
        numeroC = sc.nextInt();
        System.out.println("Informe sua agencia:");
        sc.nextLine();
        agencia = sc.nextLine();
        System.out.println("Informe seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Informe seu Saldo: ");
        saldo = sc.nextDouble();

System.out.printf("Olá "+nomeCliente+",obrigado por criar uma conta em nosso banco, sua Agência é: "+ agencia + " Conta: "+numeroC + " e seu Saldo : "  + String.format("%.2f", saldo) + " ,já esta disponivel  para saque" );
    
sc.close();
    }
}

