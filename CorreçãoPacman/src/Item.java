public class Item  extends GameObject {
    
    private boolean vinsible;

     public Item(int x, int y){
        super(x,y);
     }

    public boolean isVinsible() {
        return vinsible;
    }

    public void setVinsible(boolean vinsible) {
        this.vinsible = vinsible;
    }

    
     
}
