package javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        //Criação do padrão -> sequencia de uma ou mais letras minúsculas dentro da string...  a a z - uma ou mais
        Pattern p = Pattern.compile("([a-z])+");

        //Matcher faz a busca na string
        Matcher m = p.matcher("a1bc2def3");

        while (m.find()) { //enquanto existir algum padrão especificado mostra a posição e o padrão.
            int pos = m.start();
            String group = m.group();

            System.out.println(pos + " => " + group);
        }

    }



}
