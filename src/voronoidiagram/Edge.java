/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoidiagram;

/**
 *
 * @author pikes7641
 */
public class Edge {
    
    Point2D a;
    Point2D b;
    
    public Edge(Point2D firstPoint, Point2D secondPoint) {
        
        this.a = firstPoint;
        this.b = secondPoint;
        
    }
    
    public Line findLine() {
        
        double m = (this.b.y-this.a.y)/(this.b.x-this.a.x);
        double s = this.a.y-(m*this.a.x);
        
        return new Line(m, s);
        
    }
    
    public double findCircumcicleRadius(Edge other) {
        
        Line i = this.findLine().findPerpendicularLine(this.a);
        Line j = other.findLine().findPerpendicularLine(other.a);
        
        AccuratePoint k = i.findIntersection(j);
        
        double distance = this.a.findDistance(k);
        
        return distance;
        
    }
    
    public Point2D findCircumcicleCentre(Edge other) {
        
        Line i = this.findLine().findPerpendicularLine(this.a);
        Line j = other.findLine().findPerpendicularLine(other.a);
        
        AccuratePoint k = i.findIntersection(j);
        
        Point2D p = k.convertTo2D();
        
        return p;
        
    }    
    
}
