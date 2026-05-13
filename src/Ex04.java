void main() {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int soma = 0;

    do {
        IO.println("Digite o numero");
        numero = sc.nextInt();

        if (numero!= 0){
            soma = numero+soma;
            IO.println(soma);
        }
    } while (numero!= 0);

}