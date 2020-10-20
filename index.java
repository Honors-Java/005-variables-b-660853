int x=50;
int y=50;
int r=50;
int q=50;
int z=50;
void setup() {
	size(500, 500);
}

void draw() {

background(255);
  stroke(0);

  fill(150);
  rect(x,y,r+150,r+150);

  fill(255);
  ellipse(z+100,q+100,r,r);
  q=q+1;
  z=z+1

  


// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)
}