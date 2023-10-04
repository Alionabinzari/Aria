public class Circle {

    //Atributul pentru raza cercului
    public double radius;

    //Constructorul pentru a seta valoarea razei
    public Circle(double radius)
    {this.radius=radius;
    }

    //Metoda pentru a calcula aria cercului
     public double CalculateArea()
    {
        float pi;
         pi=3.14F;

        //  double Aria;
        return pi * radius*radius;
    }
}
