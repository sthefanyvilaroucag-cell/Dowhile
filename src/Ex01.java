void main() {
    Scanner sc = new Scanner(System.in);
    int senha;

    do {
        IO.println("Digite a senha: ");
        senha = sc.nextInt();
        if (senha != 1234){
            IO.println("senha errado, tente novamente");
        }
    } while (senha != 1234);
      IO.println("senha correta, celular debloqueado");

}