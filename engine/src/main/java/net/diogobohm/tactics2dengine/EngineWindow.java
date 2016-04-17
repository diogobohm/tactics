/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import net.diogobohm.tactics2dengine.swing.RendererLabel;

/**
 *
 * @author diogo
 */
public class EngineWindow extends JFrame {
    
    public EngineWindow() {
        super("Engine Window");
    }
    
    public void setRenderer(GraphicsRenderer renderer) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new RendererLabel(renderer), BorderLayout.CENTER);
        setSize(renderer.getScreenWidth(), renderer.getScreenHeight()+10);
    }
}
