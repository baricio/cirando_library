package com.example;

import java.util.ArrayList;
import java.util.Random;
import com.example.Author;

public class CitationProvider {

    private ArrayList al = new ArrayList();

    CitationProvider(){
        al.add(new Author("Estou sempre alegre. Essa é a melhor maneira de resolver os problemas da vida.","Charles Chaplin"));
        al.add(new Author("Nunca devemos envergonharmo-nos das nossas próprias lágrimas.","Charles Dickens"));
        al.add(new Author("Algo só é impossível até que alguém duvide e resolva provar ao contrário.","Albert Einstein"));
        al.add(new Author("O tempo dura bastante para aqueles que sabem aproveitá-lo.","Leonardo Da Vinci"));
        al.add(new Author("O amor é um ato de fé. Quem tiver pouca fé também terá pouco amor.","Erich Fromm"));
        al.add(new Author("Se você encontrar um caminho sem obstáculos, ele provavelmente não leva a lugar nenhum.","Frank Clark"));
    }

    public String getCitation(){
        Author author = (Author) al.get(this.randomCitation());
        return author.getCitation();
    }

    public void addCitation(String citation, String author){
        al.add(new Author(citation,author));
    }

    private int randomCitation(){
        int total = al.size();
        Random rand = new Random();
        int randomNum = rand.nextInt(total);
        return randomNum;
    }

}
