// Objetivo: criar uma lógica que usa If e Else para diferenciar números impar ou par
class ImparOuPar {
    public static void main(String[] args) {
        int Num = 7;
        int divisor = 2;
        int resto = Num % divisor;
        if (resto == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }
    }
}
// Ele usa o resto de divisão por 2 para determinar se é impar ou par, se for 0 é par se não for será impar