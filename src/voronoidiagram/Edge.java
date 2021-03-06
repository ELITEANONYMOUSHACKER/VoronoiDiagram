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
    
    //The edge contains two points
    public Edge(Point2D firstPoint, Point2D secondPoint) {
        
        this.a = firstPoint;
        this.b = secondPoint;
        
    }
    
    //Gives the corresponding line which extends from the edge
    public Line findLine() {
        
        double m = (this.b.y-this.a.y)/(this.b.x-this.a.x);
        double s = this.a.y-(m*this.a.x);
        
        return new Line(m, s);
        
    }
    
    //finds the midpoint of two points on an edge
    public AccuratePoint findMidpoint() {
        
        double xCoord = (double)(this.a.x+this.b.x)/2;
        double yCoord = (double)(this.a.y+this.b.y)/2;
        
        return new AccuratePoint(xCoord, yCoord);
        
    }
    
    //Returns the radius of the circumcircle given two edges.
    public double findCircumcicleRadius(Edge other) {
        
        Line i = this.findLine().findPerpendicularLine(this.findMidpoint());
        Line j = other.findLine().findPerpendicularLine(other.findMidpoint());
        
        AccuratePoint k = i.findIntersection(j);
        
        double distance = this.a.findDistance(k);
        
        return distance;
        
    }
    //Returns the point at the centre of the circumcircle 
    public Point2D findCircumcicleCentre(Edge other) {
        
        Line i = this.findLine().findPerpendicularLine(this.findMidpoint());
        Line j = other.findLine().findPerpendicularLine(other.findMidpoint());
        
        AccuratePoint k = i.findIntersection(j);
        
        Point2D p = k.convertTo2D();
        
        return p;
        
    } 
    
    //Checks whether the edges intersect
    // returns true if there is an intersection
    public boolean checkIntersection(Edge other) {
        
        Line a = this.findLine();
        Line b = other.findLine();
        
        AccuratePoint k = a.findIntersection(b);
        
        if (this.checkIfPointIsOnEdge(k) && other.checkIfPointIsOnEdge(k)) {
            
            return true;
            
        }
        
        else {
            return false;
        }
        
    }
    
    public boolean checkIfPointIsOnEdge(AccuratePoint a) {
        
        //checks if a point lies on an edge
        //returns true if it does lie on the edge
        if (((this.a.x <= a.x) && (this.b.x >= a.x)) || ((this.a.x >= a.x) && (this.b.x <= a.x))) {
            if (((this.a.y <= a.y) && (this.b.y >= a.y)) || ((this.a.y >= a.y) && (this.b.y <= a.y))) {
                
                return true;
                
            }
            else {
                return false;
            }
        }
        
        else {
            return false;
        }
        
    }
    
}
