import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(300, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
 
//quad 1
    for (int lineX = height/20; lineX <= height/2; lineX += height/20) { 
      line(lineX, 0, lineX, height/2);
      line(0, lineX, height/2, lineX);
    }

//quad 2
    for(int circleX = height/2 + height/12; circleX <= (height/2) + ((height/12) * 5); circleX += height/12){
      stroke(0);
      fill(255, 0, 255);
      for(int x = 1; x < 6; x++){
      ellipse(circleX, (height/12) * x, height/20, height/20);
      }
    }

//quad 3
  int black = 0;
  for(int gradient = 0; gradient <= height/2; gradient++){
    stroke(black);
    line(gradient, height, gradient, (height/2));

    black = black + 2;
    }
    
//quad 4
  stroke(0);
  translate(height/1.3f, width/1.3f);
  
  for(int petals = 0; petals <= 8; petals+=1){
    rotate(radians(45));
    fill(255, 176, 216);
    ellipse(0, 0, height/24, width/4);
    fill(145, 64, 105);
    ellipse(0, 0, height/10, width/10);

  }
  }
  }

  

