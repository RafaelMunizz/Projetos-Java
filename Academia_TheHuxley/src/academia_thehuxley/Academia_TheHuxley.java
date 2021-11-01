package academia_thehuxley;

import java.util.ArrayList;
import java.util.Scanner;

public class Academia_TheHuxley {

    public static void main(String[] args) {
        
        // Entrada
        Scanner sn = new Scanner(System.in);
        
        //ArrayLists:
        ArrayList<String> nomes = new ArrayList<String>(100);
        ArrayList<Integer> senhas = new ArrayList<Integer>(100);
        ArrayList<String> situacoes = new ArrayList<String>(100);
        
        while(true) {
            
            String nome = sn.nextLine();
            if(nome.equals("SAIR")) break;
            
            // Guardando dados:
            nomes.add(nome);
            senhas.add(sn.nextInt());
            
            // Consumir espaço em branco do nextInt()    
            sn.nextLine(); 
            
            situacoes.add(sn.nextLine());
        }
        
        while(true){
            
            int senhaAux = sn.nextInt();
            
            if (senhaAux == -1) break;
            
            if (!senhas.contains(senhaAux)){
                System.out.print("Seja bem-vindo(a)! Procure a recepção!");

            } else {
                
                int indice = senhas.indexOf(senhaAux);
                
                if (situacoes.get(indice).equals("P")){
                    System.out.printf("%s, seja bem-vindo(a)!", nomes.get(indice));
                } else {
                    System.out.printf("Não está esquecendo de algo, %s? Procure a recepção!", nomes.get(indice));
                }    
            }   
        }
    }
}
