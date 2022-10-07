public class Cachorro {
    private int energia;
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
        
    }
    //método 1
    public void latir(){
        System.out.println(this.energia);
        if(this.getEnergia() >= 2){
            this.setEnergia(getEnergia()-2);
            System.out.println("Seu cachorro perdeu 2 pontos de energia por latir :(");
        }
        else{
            this.setEnergia(this.getEnergia()+5);
        }
    }
    //método 2 
    public void andar(){
        System.out.println(this.energia);
        if(this.getEnergia() >= 1){
            this.setEnergia(getEnergia()-1);
            System.out.println("Seu cachorro perdeu 1 ponto de energia por andar :(");
        }
        else{
            this.setEnergia(this.getEnergia()+5);
        }
    }
    //método 3 
    public void pular(){
        System.out.println(this.energia);
        if(this.getEnergia() >= 3){
            this.setEnergia(getEnergia()-3);
            System.out.println("Seu cachorro perdeu 3 pontos de energia por pular :(");
        }
        else{
            this.setEnergia(this.getEnergia()+5);
        }
    }
    //método 4 
    public void ficar(){
        System.out.println(this.energia);
        if(this.getEnergia() >= 1){
            this.setEnergia(getEnergia()+1);
            System.out.println("Seu cachorro ganhou ponto de energia por ficar :)");
        }
        else{
            this.setEnergia(this.getEnergia()+5);
        }
    }
    //método 5 
    public void sentar(){
        System.out.println(this.energia);
        if(this.getEnergia() >= 2){
            this.setEnergia(getEnergia()+2);
            System.out.println("Seu cachorro ganhou 2 pontos de energia por sentar :)");
        }
        else{
            this.setEnergia(this.getEnergia()+5);
        }
    }
    //método 6
    public void receber_recompensa(){
        if(this.getEnergia() <= 0){
            this.setEnergia(getEnergia()+5);
        }
        
    }

}
