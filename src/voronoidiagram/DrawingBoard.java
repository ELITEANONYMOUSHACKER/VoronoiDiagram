/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoidiagram;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Sean
 */
public class DrawingBoard extends JFrame{
    
    boolean drawP;
    boolean drawE;
    boolean drawV;
    
    ArrayList<Point2D> pointArray = new ArrayList<Point2D>();
    ArrayList<Edge> edgeArray = new ArrayList<Edge>();
    ArrayList<VoronoiCell> cellArray = new ArrayList<VoronoiCell>();
    
    public DrawingBoard(boolean a, boolean b, boolean c, ArrayList<Point2D> d, ArrayList<Edge> e, ArrayList<VoronoiCell> f) {
        
        drawP = a;
        drawE = b;
        drawV = c;
        
        pointArray = d;
        edgeArray = e;
        cellArray = f;
        
    }
    
    public void Paint(Graphics g) {
        
        //redraws background
        g.setColor(Color.white);
        g.drawRect(0, 0, 800, 800);
        
        //draws points
        if (drawP == true) {
            
            g.setColor(Color.black);
            
            for (int i=0; i<pointArray.size(); i++) {
                
                Point2D a = new Point2D(pointArray.get(i).x, pointArray.get(i).y);
                g.drawOval(a.x-2, a.y-2, 4, 4);
            }
            
        }
        
        // draws edges
        if (drawE == true) {
            
            g.setColor(Color.black);
            
            for (int i=0; i<edgeArray.size(); i++) {
                
                Edge k = new Edge(edgeArray.get(i).a, edgeArray.get(i).b);
                g.drawLine(k.a.x, k.a.y, k.b.x, k.b.y);
            }
            
        }
        
        //draws voronoi diagram
        if (drawV == true) {
            
            
            for (int i=0; i<cellArray.size(); i++) {
                
                
                VoronoiCell c = cellArray.get(i);
                g.setColor(c.colour);

            }
            
        }
    }
    
    public void initializeWindow(){
        
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
