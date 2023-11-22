
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Strings_datas {

     public static void main(String[] args) throws Exception {


      //  String nome = "Arthur";
     //       System.out.println(nome.toUpperCase());  // letras MAIUSCULAS
    //        System.out.println(nome.toLowerCase());  // letra Minisculas
       //     System.out.println(nome.length());


   //         String nomeOutro = "arthur";

      //      System.out.println(nome.equalsIgnoreCase(nomeOutro));   //  COMPARAR VARIAVEL MAISCULO OU MINISCULO equals / equalsIgnoreCase


        // Olá, {nome}. hoje é {dd/mm/aaaa}, BOM DIA
        //FAZER import java.time.localdate;

        String nome = "Arthur";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
     //   System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String  diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
    String saudacao;
    LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12)  {

            saudacao = "Bom dia";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18)  {

            saudacao = "Boa tarde";

        }else if (agora.getHour() >= 18 && agora.getHour() < 24)  {

            saudacao = "Boa noite";  
        }else {
            saudacao = "olá.";

        }System.out.printf("Olá, %s. hoje é %s, %s.%n", nome, diaSemana,saudacao.toUpperCase()); {
           // <----------- utilizou printf para apresentar texto

        }



     }
    
}
