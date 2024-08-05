import java.util.Scanner;
public class bankAccount {
    public static void main(String[] args) throws Exception {
        profile perfil = new profile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgency = sc.next();
        perfil.agencia=numeroAgency;
        System.out.println("Usuário: ");
        int user = sc.nextInt();
        perfil.usuario=user;
        System.out.println("Saldo Disponível: ");
        double money= sc.nextDouble();
        perfil.saldo=money;
        System.out.println("Nome do Cliente: ");
        String name = sc.next();
        perfil.clientName=name;
        sc.close();
        System.out.println("Olá "+ perfil.clientName +", obrigado por criar uma conta em nosso banco, sua Agência é "+perfil.agencia+" e seu saldo "+perfil.saldo+" já está disponível para saque.");
    }
}
