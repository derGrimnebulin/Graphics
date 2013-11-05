import java.awt.Graphics;

public class Shape implements Mover{
	 public int x;
   public int y;
   public int xDirection;
   public int yDirection;
   public Sprite sprite;
   
  /** Starts moving the object in the direction (xIncrement, yIncrement). */
  public void setMovementVector(int xIncrement, int yIncrement) {
      xDirection = xIncrement;
      yDirection = yIncrement;
  }
  
  public void draw(Graphics surface) {
    // Draw the sprite
    sprite.draw(surface, x, y);

    // Move the object each time we draw it
    x += xDirection;
    y += yDirection;
  }
}
