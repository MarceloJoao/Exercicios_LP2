public class Circle {

Circle(float radius) {
 this.radius = radius;

}
//atributo raio
float radius;

public double area (){
 return(Math.PI * (radius * radius));
}

public double circumference(){
    return(2 * Math.PI *radius);
}

}
