

package circle;

import circle.utils.Point;


public class Circle
{
    // az adattagok privátak (csak az osztály adattagjai férnek hozzá, a külvilág nem)
    private Point center;
    private double radius;

    // konstruktor:
    // visszatérési típus nélküli eljárás, amely lefut az objektum létrehozása után, elvégezheti az adattagok inicializálását
    // new Circle(x, y, radius) alak használható
    public Circle(double x, double y, double init_radius)
    {
        // a szükséges inicializálásokat a konstruktor végzi
        center = new Point(x, y);
        radius = init_radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public void enlarge(double f)
    {
        radius = f * radius;
    }

    public String toString()
    {
        // a center-ben az x privát, itt nem használható, a getX() viszont publikus
        return "(" + center.getX() + "," + center.getY() + "), r = " + radius;
    }
}

