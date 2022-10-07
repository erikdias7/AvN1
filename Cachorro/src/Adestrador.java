public class Adestrador extends Cachorro {
 
    public void iniciar_treinamento(){
        int[] ordens = {1, 2, 3, 4, 5};

        for(int valor = 0; valor < ordens.length; valor++){
            switch(ordens[valor]){
                case 1:
                    latir();
                    break;
                case 2:
                    andar();
                    break;
                case 3:
                    pular();
                    break;
                case 4:
                    ficar();
                    break;
                case 5:
                    sentar();
                    break;    
    
            } 
        } 
    }
}

// 1 = latir
// 2 = andar
// 3 = pular
// 4 = ficar
// 5 = sentar