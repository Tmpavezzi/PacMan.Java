public class Player extends Playergeneric{
 
    
    private int life;
    private boolean invencible;


    public Player(){}
  
    

    public Player(int x, int y, int direction) {
        super(x, y, direction);
    }
 
    public boolean colide(GameObject object){
        return(this.getX()==object.getX() &&
        this.getY()==object.getY());
    }
    
    public void damage(){
        life--;
    }


    public int getLife() {
        return life;
    }



    public void setLife(int life) {
        this.life = life;
    }



    public boolean isInvencible() {
        return invencible;
    }



    public void setInvencible(boolean invencible) {
        this.invencible = invencible;
    }


}
