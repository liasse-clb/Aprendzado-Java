import static java.lang.Double.parseDouble;

//Converta valores e faça operações matemáticas
class Converter {
    public static void main(String[] args) {
        //Converter String para número inteiro
        int Num = Integer.parseInt("123");
        System.out.println(Num);

        //Converte String em número decimal
        double Num2 = Double.parseDouble("1.987");
        System.out.println(Num2);

        //Converte String em Long
        String Valor = "1900211";
        long ValorLong = Long.parseLong(Valor);
        System.out.println(ValorLong);

        //Concatenação de números com valores String
        System.out.println(2 + " Dias");
        System.out.println(3 + 5 + " Dias");
        System.out.println(9 - 4 + " Dias");
        System.out.println("Dias " + (10 + 29));
        System.out.println((30.54 - 10.20 + " Minutos"));

        //Verdadeiro e falso
        int a = 309;
        int b = 200;
        int c = 0;
        int d = 90;
        int e = 0;
        System.out.println(c == e);
        System.out.println(a > b);
        System.out.println(d != 90);
        System.out.println(30 > d);
        System.out.println(b == a);
        System.out.println(d > a);
    }
}
