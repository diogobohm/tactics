/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine.swing;

import net.diogobohm.tactics2dengine.Main;
import net.diogobohm.tactics2dengine.graphics.Image;
import net.diogobohm.tactics2dengine.graphics.ImageResourceFactory;

/**
 *
 * @author diogo
 */
public class SwingImageResourceFactory implements ImageResourceFactory {

    @Override
    public Image getImage(String filename) {
        return new SwingImage(Main.class.getResource(filename));
    }
}
