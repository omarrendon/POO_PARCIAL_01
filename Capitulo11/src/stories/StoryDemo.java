/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stories;

/**
 *
 * @author omarcr
 */
public class StoryDemo {
    public static void demo(){
        Story[] stories=new Story[6];
        stories[0]=new Novel();
        stories[1]=new ShortStory();
        stories[2]=new ShortStory();
        stories[3]=new Novella();
        stories[4]=new Novel();
        stories[5]=new Novella();
        stories[0].setTitulo("El pozo y el pendulo");
        stories[0].setAutor("Edgar Allan Poe");
        stories[0].setNumPaginas(80);
        stories[1].setTitulo("El oso perezoso");
        stories[1].setAutor("Juan Perez");
        stories[1].setNumPaginas(40);
        stories[2].setTitulo("La libelula");
        stories[2].setAutor("Christopher King");
        stories[2].setNumPaginas(10);
        stories[3].setTitulo("El libro de arena");
        stories[3].setAutor("Jorge Luis Borges");
        stories[3].setNumPaginas(124);
        stories[4].setTitulo("La sombra del viento");
        stories[4].setAutor("Carlos Ruiz Zafon");
        stories[4].setNumPaginas(256);
        stories[5].setTitulo("Los culpables");
        stories[5].setAutor("Juan Villoro");
        stories[5].setNumPaginas(84);
        for(int i=0;i<6;i++){
            System.out.println(stories[i]);
        }
    }
}
