package estruturaDecisao;

public class exemplo {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 <= numero2) {
            System.out.println("N�mero 1 � menor ou igual que n�mero 2");
            if (numero1 == numero2) {
                System.out.println("N�mero 1 � igual ao n�mero 2");
            } else {
                System.out.println("M�mero 1 � definitivamento menor que o n�mero 2");
            }
            
            //} else if (numero1 == numero2) {
        //    System.out.println("N�mero 1 � Igual ao n�mero 2");
        } else {
            System.out.println("N�mero 1 maior que n�mero 2");
        }
        
        System.out.println("Pr�xima etapa");
        
        String fruta = "Uva";
        switch (fruta) {
            case "Melancia":
                System.out.println("A fruta � uma Melancia");
                break;
            case "Banana":
                System.out.println("A fruta � uma Banana");
                break;
            case "Ma��":
                System.out.println("A fruta � uma Ma��");
                break;
            case "Uva":
                System.out.println("A fruta � uma Uva");
                break;
            default:
                System.out.println("A fruta � um(a)" + fruta);
            
        }
        
    }
}
