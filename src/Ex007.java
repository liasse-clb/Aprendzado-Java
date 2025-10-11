//Cria uma função que imprima 5 números aleatórios entre 0 e 1 e amostrar valor médio,minimo e maximo
class Aleatorio {
    public static void main(String[] args) {
        int Contagem = 5;
        double Num1 = Math.random();
        double Num2 = Math.random();
        double Num3 = Math.random();
        double Num4 = Math.random();
        double Num5 = Math.random();

        // imprimindo os valores
        System.out.println(Num1);
        System.out.println(Num2);
        System.out.println(Num3);
        System.out.println(Num4);
        System.out.println(Num5);

        //Usando estatisticas
        double minimo = Math.min(Num1, Math.min(Num2, Math.min(Num3, Math.min(Num4, Num5))));
        double maximo = Math.max(Num1, Math.max(Num2, Math.max(Num3, Math.max(Num4, Num5))));
        double Valormedio = (Num1 + Num2 + Num3 + Num4 + Num5) / Contagem;
        /*
        * O que aconteceu nas linhas acima?
        * Existem varios "Math.argumento" aninhados pois ele só suporta 2 parametro por vez, então pra ter
        * vários parametros nós aninhamos varios Math.
        * Com o Math.min pegamos sempre o menor número possivel e como o .max o maior
        * */

        //Exibindo os resultados
        System.out.println("Minímo = " + minimo);
        System.out.println("Maximo = " + maximo);
        System.out.println("Médio = " + Valormedio);
    }
}
