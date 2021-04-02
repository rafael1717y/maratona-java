package javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
       public static void main(String[] args) {

            //Criação do padrão -> sequencia de uma ou mais letras minúsculas dentro da string...  a a z - uma ou mais
            Pattern p = Pattern.compile("([a-z])");

            //Matcher faz a busca na string
            Matcher m = p.matcher("a1bc2def3");

            StringBuffer sb = new StringBuffer();

            //Fazendo substituição com base no que foi encontrado em uma string.
            while (m.find()) { //enquanto existir algum padrão especificado mostra a posição e o padrão.
                int pos = m.start();
                String group = m.group();
                group = "?";

                m.appendReplacement(sb, group); //usar o group para substituir.
                System.out.println(pos + " => " + group);
            }
            //
            m.appendTail(sb);
            System.out.println(sb);

        }


    }


