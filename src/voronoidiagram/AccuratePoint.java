/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoidiagram;

/**
 *
 * @author pikes7641
 */

//Class is similar to Point2D only the points are used with doubles which makes
//calculations more accurate
public class AccuratePoint {
    
    double x;
    double y;
    
    public AccuratePoint(double a, double b) {
        this.x = a;
        this.y = b;
    }
    
    //Returns the accurate point converted to a Point2D object and is 
    //rounded to integers and can now be printed on the screen    
    public Point2D convertTo2D() {
        

        int i = (int)this.x;
        int j = (int)this.y;
        
        return new Point2D(i, j);
        
    }
}
