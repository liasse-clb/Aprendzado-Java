class CaraOuCoroa {
    public static void main(String[] args) {
        if(Math.random() <0.5) {
            System.out.println("Cara");
        }  else {
            System.out.println("Coroa");
        }
    }
}

// Math.random escolhe uma valor decimal aleatório entre 0 e 1.
// Se for maior que 0.5 dará coroa, se for menor dá cara
