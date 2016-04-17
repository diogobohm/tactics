/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.diogobohm.tactics2dengine.graphics.Renderer;
import net.diogobohm.tactics2dengine.graphics.RendererCallable;

/**
 *
 * @author diogo
 */
public class RendererLabel extends JLabel implements RendererCallable {
    
    private final Renderer renderer;
    
    public RendererLabel(Renderer renderer) {
        this.renderer = renderer;
        setSize(renderer.getScreenWidth(), renderer.getScreenHeight());
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        // Flush screen
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        renderer.render(new SwingGraphicsToolkit((Graphics2D) g));
        
        // Middle crosshairs
        g.setColor(Color.red);
        g.drawRect(getWidth() / 2 - 3, getHeight() / 2 - 3, 6, 6);
    }

    @Override
    public void renderFrame() {
        repaint();
    }
}
