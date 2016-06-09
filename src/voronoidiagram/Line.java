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
    //Finds the line perpendicular to this line given a point which lies 
    //on the perpendicular line
    public Line findPerpendicularLine(AccuratePoint a) {
        
        double m = -(1/this.slope); //finds the slope
        double b = a.y-(m*a.x);     //finds the y intercept
        
        return new Line(m, b);
        
    }
    //Finds the intersection of this line and another line
    public AccuratePoint findIntersection(Line other) {
        
        double x = (other.yInt-this.yInt)/(this.slope-other.slope);
        double y = (this.slope*x)+this.yInt;
        
        return new AccuratePoint(x, y);
        
    }
    
}
