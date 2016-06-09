/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoidiagram;

import java.util.ArrayList;
import java.util.Random;
import java.awt.*;
/**
 *
 * @author pikes7641
 */
public class VoronoiCell {
    
    ArrayList<Point2D> points = new ArrayList<Point2D>();
    Color colour;
    
    public VoronoiCell(ArrayList a) {
        
        points = a;
        
    }
    
    //sets the colour given RGB values
    public void setColour(int a, int b, int c) {
        
        colour = new Color(a,b,c);
        
    }
    
    //sets the colour to random RGB values
    public void randomColour() {
        
        Random r = new Random();
        
        int a = r.nextInt(255);
        int b = r.nextInt(255);
        int c = r.nextInt(255);
        
        colour = new Color(a, b, c);
        
    }
    
}
