import java.util.Random;

public class Ghost extends Playergeneric {


public Ghost(int x, int y, int direction) {
        super(x, y, direction);
    }

@Override
public void Move() {
    Integer[] direcoes ={Cima,DIREITA,ESQUERDA,BAIXO};
    var sorteioDirecao=Math.random();
    if(sorteioDirecao<.15){
        Random random =new Random();
        var sorteio = random.nextInt(4);
        setDirection(direcoes[sorteio]);
            }
    super.Move();
}


 
    
}
