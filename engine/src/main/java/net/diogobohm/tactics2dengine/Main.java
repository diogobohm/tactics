/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine;

import javax.swing.JFrame;
import net.diogobohm.tactics2dengine.graphics.ImageResourceFactory;
import net.diogobohm.tactics2dengine.swing.SwingImageResourceFactory;

/**
 * Main entry point.
 * @author diogo
 */
public class Main {
    
    
    public static void main(String [] args) {
        Scene scene = new TestScene();
        
        EngineWindow window = new EngineWindow();
        ImageResourceFactory factory = new SwingImageResourceFactory();
        GraphicsRenderer renderer = new GraphicsRenderer(factory, scene);
        window.setRenderer(renderer);
        window.setVisible(true);
    }
}
