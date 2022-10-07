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
        this.setEnergia(getEnergia()-2);
    }
    //método 2 
    public void andar(){
        this.setEnergia(getEnergia()-1);
    }
    //método 3 
    public void pular(){
        this.setEnergia(getEnergia()-3);
    }
    //método 4 
    public void ficar(){
        this.setEnergia(getEnergia()+1);
    }
    //método 5 
    public void sentar(){
        this.setEnergia(getEnergia()+2);
    }
    //método 6
    public void receber_recompensa(){
        if(this.getEnergia() <= 0){
            this.setEnergia(getEnergia()+5);
        }
        
    }

}
