/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoidiagram;

/**
 *
 * @author pikes7641
 */
public class Line {
    
    double slope;
    double yInt;

    
    public Line(double s, double y) {
        
        this.slope = s;
        this.yInt = y;
        
    }
    
    public Line findPerpendicularLine(Point2D a) {
        
        double m = -(1/this.slope);
        double b = a.y-(m*a.x);
        
        return new Line(m, b);
        
    }
    
    public AccuratePoint findIntersection(Line other) {
        
        double x = (other.yInt-this.yInt)/(this.slope-other.slope);
        double y = (this.slope*x)+this.yInt;
        
        return new AccuratePoint(x, y);
        
    }
    
}
