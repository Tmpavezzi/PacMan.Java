public  abstract  class Playergeneric extends GameObject {
    

    protected static final int Cima =0;
    protected static final int DIREITA =90;
    protected static final int BAIXO =180;
    protected static final int ESQUERDA =270;
   private int direction;


   
   
   public Playergeneric(){}
   
   
    public Playergeneric(int x, int y, int direction) {
    super(x, y);
    this.direction = direction;
}

public boolean canMove(){
    int newx=getX();
    int newy=getY();

   if(direction==Cima) newy-=10;
   if(direction==DIREITA) newx+=10;
   if(direction==BAIXO) newy+=10;
   if(direction==ESQUERDA) newx-=10;
   
   if(newx<0||newx>getSCREENSIZE()) return false;
   if(newy<0||newy>getSCREENSIZE()) return false;


   return true;
  
}

public void Move(){
    if(canMove()){
        if(direction==Cima) setY(getY()-10);
        if(direction==DIREITA) setX(getX()+10);
        if(direction==BAIXO) setY(getY()+10);
        if(direction==ESQUERDA) setX(getX()-10);
    }
}

public int getDirection() {
return direction;
}


public void setDirection(int direction) {
this.direction = direction;
}




    
}
