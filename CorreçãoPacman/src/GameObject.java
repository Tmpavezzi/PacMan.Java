import javax.management.RuntimeErrorException;

public class GameObject {
    private int x;
    private int y;
    private int SCREENSIZE;


    public GameObject(){

    }


        public GameObject(int x, int y) {
            if(x<0||y<0)
            throw new RuntimeException("paramento invalidos");
        this.x = x;
        this.y = y;
    }


       

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSCREENSIZE() {
        return SCREENSIZE;
    }

    public void setScreenSize(int sCREENSIZE) {
        if(sCREENSIZE<0)
            throw new RuntimeException("paramento invalidos");
        SCREENSIZE = sCREENSIZE;
    }


    
}
