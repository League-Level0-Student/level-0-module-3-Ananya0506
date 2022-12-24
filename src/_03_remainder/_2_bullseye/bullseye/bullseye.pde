
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=100; i<95; i--){
   
    
  //Use an if statement and remainder to alternate the color of your rings.
  if(i%2==1){
    fill(#FF0000);
        ellipse(250,250,i,i);
  }else{ 
    fill(#001BFF); 
        ellipse(250,250,i,i);


  }
  }
}
