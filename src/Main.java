public class Main {
    public static void main(String[] args) {

        //Initializarea unui obiect de tip Circle
        Circle  cerc=new Circle(2.0);

        //Apelarea metodei CalculateArea()
        double aria=cerc.CalculateArea();

        //Afisarea rezultatului
        System.out.println("Aria cercului este-"+aria);
    }
}