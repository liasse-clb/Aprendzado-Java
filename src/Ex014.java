class LaçoDeRepetição {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 10) {
            System.out.println("Esta frase se repete 10 vezes");
            contador = contador + 1;
        }
    }
}

// Enquanto contador que recebe o valor 1 for menor que 10 ele repetirá a frase 10 vezes
/* na ultima linha ele incrementa 1 toda vez que o laço é executado, fazendo com que a frase seja exibida
apenas 10 vezes */

class PowersOfTwo {
    public static void main(String[] args) {

        int n = 5;

        int i = 0;
        int powerOfTwo = 1;

        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;
            i = i + 1;
        }

    }
}
//recebe um argumento de linha de comando inteiro n e imprime todas as potências de 2 menores ou iguais a n 
