void main() {
    Scanner sc = new Scanner(System.in);
    int senha;

    do {
        IO.println("digite a senha: ");
        senha = sc.nextInt();
    } while (senha != 1234);
    IO.println("Numero correto");
}