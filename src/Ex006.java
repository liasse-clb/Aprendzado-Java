//Objetivo: Ler 3 valores inteiros da linha de comando e imprimir em ordem crescente.
//Usar o Math. para encontrar o min e max
class ThreeSort {
    public static void main(String[] args) {
        int Num1 = Integer.parseInt(args[0]);
        int Num2 = Integer.parseInt(args[1]);
        int Num3 = Integer.parseInt(args[2]);

        int min = Math.min(Num1, Math.min(Num2, Num3));
        int max = Math.max(Num1, Math.max(Num2, Num3));
        int median = Num1 + Num2 + Num3 - min - max;

        System.out.println(min);
        System.out.println(median);
        System.out.println(max);
    }
}