//x value rect
int a= (int) random(2,240);
//y value rect
int b= (int) random(1,255);
//length and width rect
int c= (int) random(50,150);
//size of ellipse
int z=12.5;
//colors for ellipse
int r= (int) random(1,255);
int g= (int) random(1,255);
int b= (int) random(1,255);
void setup() {
	size(500, 500);
  background(255);
  }

void draw() {
//rect
  stroke(0);
  fill(r,g,b);
  rect(a,b,c,c);

//ellipses
  int r= (int) random(1,255);
  int g= (int) random(1,255);
  int b= (int) random(1,255);
  fill(r,g,b);
  ellipse(mouseX+random(-40,40),mouseY-random(-40,40),z,z);

  



}

  void mousePressed() {
    fill(r,g,b);
    rect(a,b,c,c);
  }