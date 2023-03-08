package estruturaDecisao;

public class exemplo {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 <= numero2) {
            System.out.println("Número 1 é menor ou igual que número 2");
            if (numero1 == numero2) {
                System.out.println("Número 1 é igual ao número 2");
            } else {
                System.out.println("Múmero 1 é definitivamento menor que o número 2");
            }
            
            //} else if (numero1 == numero2) {
        //    System.out.println("Número 1 é Igual ao número 2");
        } else {
            System.out.println("Número 1 maior que número 2");
        }
        
        System.out.println("Próxima etapa");
        
        String fruta = "Uva";
        switch (fruta) {
            case "Melancia":
                System.out.println("A fruta é uma Melancia");
                break;
            case "Banana":
                System.out.println("A fruta é uma Banana");
                break;
            case "Maçã":
                System.out.println("A fruta é uma Maçã");
                break;
            case "Uva":
                System.out.println("A fruta é uma Uva");
                break;
            default:
                System.out.println("A fruta é um(a)" + fruta);
            
        }
        
    }
}
