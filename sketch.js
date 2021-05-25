var colors = ['#66cccc99',
             '#cc66cc99',
             '#cccc6699',
             '#6666cc99',
             '#66cc6699',
             '#cc666699',
             '#99999999'];

function setup() {
  createCanvas(innerWidth, innerWidth);
  strokeWeight(0);
  frameRate(1);
  noFill();
}

function draw() {
  clear();
  background('#dddddd');
  var margin = 0;
  var width = innerWidth - 2*margin;
  var height = innerWidth - 2*margin;
  var space = 0;
  var numSquares = 2;
  var radius = width/(2*numSquares);
  
  translate(margin,margin);
  for(var y = radius; y < height; y = y + 2*radius){
    for(var x = radius; x < width; x = x + 2*radius){
      let c = color(colors[int(random(0,colors.length))]);
      let s = color('#00000000');
      stroke(s);

      fill(c);
      circle(x, y, 2*radius);  
    }  
  }
  noLoop();
}