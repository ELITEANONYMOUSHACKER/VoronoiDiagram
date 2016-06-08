/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoidiagram;

/**
 *
 * @author pikes7641
 */
public class AccuratePoint {
    
    double x;
    double y;
    
    public AccuratePoint(double a, double b) {
        this.x = a;
        this.y = b;
    }
    
    public Point2D convertTo2D() {
        
        int i = (int)this.x;
        int j = (int)this.y;
        
        return new Point2D(i, j);
        
    }
}
