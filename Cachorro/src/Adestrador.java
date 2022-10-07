public class Adestrador {
    private int energia;
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
        
    }
    public void iniciar_treinamento(){
        int[] ordens = {1, 2, 3, 4, 5};

        for(int valor = 0; valor < ordens.length; valor++){
            switch(ordens[valor]){
                case 1:
                System.out.println(this.energia);
                if(this.getEnergia() >= 2){
                    this.setEnergia(getEnergia()-2);
                    System.out.println("Seu cachorro perdeu 2 pontos de energia por latir :(");
                }
                else{
                    this.setEnergia(this.getEnergia()+5);
                }
                    break;
                case 2:
                System.out.println(this.energia);
                if(this.getEnergia() >= 1){
                    this.setEnergia(getEnergia()-1);
                    System.out.println("Seu cachorro perdeu 1 ponto de energia por andar :(");
                }
                else{
                    this.setEnergia(this.getEnergia()+5);
                }
                    break;
                case 3:
                System.out.println(this.energia);
                if(this.getEnergia() >= 3){
                    this.setEnergia(getEnergia()-3);
                    System.out.println("Seu cachorro perdeu 3 pontos de energia por pular :(");
                }
                else{
                    this.setEnergia(this.getEnergia()+5);
                }
            
                    break;
                case 4:
                System.out.println(this.energia);
                if(this.getEnergia() >= 1){
                    this.setEnergia(getEnergia()+1);
                    System.out.println("Seu cachorro ganhou ponto de energia por ficar :)");
                }
                else{
                    this.setEnergia(this.getEnergia()+5);
                }
                    break;
                case 5:
                System.out.println(this.energia);
                if(this.getEnergia() >= 2){
                    this.setEnergia(getEnergia()+2);
                    System.out.println("Seu cachorro ganhou 2 pontos de energia por sentar :)");
                }
                else{
                    this.setEnergia(this.getEnergia()+5);
                } 
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