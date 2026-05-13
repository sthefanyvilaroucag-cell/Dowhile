void main() {
    Scanner sc = new Scanner(System.in);
    int escolha = 0;
    int numeroum = 1;
    int numerodois = 2;
    int numerotres = 3;
     do { IO.println("escolha um numero");

         escolha = sc.nextInt();
        if (escolha == numeroum){
            IO.println("olá");
        } else if (escolha == numerodois) {
            IO.println("aaaaaa eu cai na merda");
        }else {
            IO.println("saiu");}


     }while (escolha != 3);
}