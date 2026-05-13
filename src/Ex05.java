void main() {
    Scanner sc =new Scanner(System.in);
    IO.println("digite um numero");
    int numero = sc.nextInt();
    int contador = 0;
    int resultado = 0;
    do {
        IO.println(numero+"."+contador+"="+resultado);
        contador++;
        resultado = numero * contador;
    }while (contador <= 10);
}