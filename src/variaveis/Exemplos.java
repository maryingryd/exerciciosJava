package variaveis;

import java.math.BigDecimal;
import java.time.*;


public class Exemplos {

    public static void main(String[] args) {
        
        //Groupo dos Inteiros
        
        short ipequeno = 5;
        System.out.println(ipequeno);
        int imedio = 3000000;
        System.out.println(imedio);
        long igrande = 300000000;
        System.out.println(igrande);
        
        // Grupo dos reais
        float rpequeno = (float) 5.5555559;
        System.out.println(rpequeno);
        double rmedio = 5.5555555558;
        System.out.println(rmedio); 
        BigDecimal rgrande = new BigDecimal ("500000.0000859564646466");
        System.out.println(rgrande);
        
        // Lógico
        boolean logico = true;
        logico = false;
        System.out.println(logico);
        
        // Grupos de Textos
        char letra = 'h';
        System.out.println(letra);
        String frase = "Hello World";
        System.out.println(frase);
        
        // Grupos de Datas
        
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        LocalDate data = LocalDate.now();
        System.out.println(data);
        ZonedDateTime dataHoraZoneada = ZonedDateTime.now();
        System.out.println(dataHoraZoneada);
        OffsetDateTime dataHoraZoneada2 = OffsetDateTime.now();
        System.out.println(dataHoraZoneada2);
        

    }

}
