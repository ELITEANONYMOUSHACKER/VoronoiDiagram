/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoidiagram;

import java.awt.*;

public class Point2D {
    
    int x;
    int y;
    
    public Point2D(int a, int b) {
        this.x = a;
        this.y = b;
    }
    
    public Edge makeEdge(Point2D other) {
        Edge a = new Edge(this, other);
        return a;
    }
    
}
