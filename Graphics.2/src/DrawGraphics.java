import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movers = new ArrayList<Mover>();
    
    /** Initializes this class for drawing. 
     * @throws IOException */
    public DrawGraphics() throws IOException {
        Rectangle box0 = new Rectangle(15, 20, Color.RED);
        movers.add(new Bouncer(100, 170, box0));
        movers.get(0).setMovementVector(3, 1);
        Oval circ1 = new Oval(15, 20, Color.BLUE);
        movers.add(new Bouncer(170,100, circ1));
        movers.get(1).setMovementVector(1,3);
        movers.add(new StraightMover(50, 200, box0));
        movers.get(2).setMovementVector(1,0);
        movers.add(new StraightMover(200,50,circ1));
        movers.get(3).setMovementVector(0, 1);
        Nick cage = new Nick();
        movers.add(new Bouncer(0,0, cage));
        movers.get(4).setMovementVector(1,1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
    	for ( Mover m : movers){
    		m.draw(surface);
      }
    }
}
