import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        String string1 = "vamos ver uma dia que um novo dia chega quando um ve";
//        String string2 = "um";
//
//        int contador = 0;
//        int index = string1.indexOf(string2);
//        System.out.println(index);
//
//        while (index != -1) {
//            contador++;
//            index = string1.indexOf(string2, index + 1);
//        }
//        System.out.println("aparece" + contador + "vezes");

        String nome = "wallace";


        String invertida = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
            invertida += nome.charAt(i);
        }
        System.out.println(invertida);


    String nome1 = "Paulo José de Almeida Prado";

    String[] div = nome1.strip().split(" ");
        System.out.print(Arrays.toString(div));
    String abrev = "";


        for (int i = 0; i < div.length; i++){
        if (div[i].equals("de")){
            abrev += " " + div[i] + " ";
        }
        else{
            String[] rec = div[i].split("");
            System.out.println(Arrays.toString(rec));
            abrev += rec[0] + ".";
        }
    }

        System.out.println(abrev);
}




}