package poo_projeto;

import java.util.ArrayList;

public class Poo_Projeto {

    public static void main(String[] args) {
        
        // Array de videos
        ArrayList<Video> videos = new ArrayList<Video>(3);
        
        // Telespectadores
        Gafanhoto gf = new Gafanhoto("Rafa", "M", 22, "RVC");
        Gafanhoto gf2 = new Gafanhoto("lipe", "M", 22, "Lipex");
        
        // Adicionando vídeos
        videos.add(new Video("Primeiro vídeo"));    
        videos.add(new Video("Segundo vídeo"));
        videos.add(new Video("Terceiro vídeo"));
        
        // Visualizações         
        Visualizacao visu1 = new Visualizacao(gf, videos.get(0));
        Visualizacao visu2 = new Visualizacao(gf2, videos.get(0));
        Visualizacao visu3 = new Visualizacao(gf2, videos.get(1));
        Visualizacao visu4 = new Visualizacao(gf2, videos.get(2));
        Visualizacao visu5 = new Visualizacao(gf, videos.get(0));
        Visualizacao visu6 = new Visualizacao(gf, videos.get(1));
        Visualizacao visu7 = new Visualizacao(gf, videos.get(2));
        
        // Reproduzindo
        videos.get(0).play();
        videos.get(1).play();
        
        // Likes
        videos.get(0).like();
        videos.get(1).like();
        videos.get(1).like();
        videos.get(1).like();
        
        // Avaliações
        visu1.avaliar(4);
        visu2.avaliar();
        visu3.avaliar(6.6f);
        visu4.avaliar(8.1f);
        visu5.avaliar(8);
        visu6.avaliar(7);
        visu7.avaliar(9);
   
        System.out.println(visu4.toString());
        System.out.println(visu6.toString());        
    }    
}
