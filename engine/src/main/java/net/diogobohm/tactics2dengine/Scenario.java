/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine;

/**
 *
 * @author diogo
 */
class Scenario {
    
    private final int[][] heightMap;
    
    public Scenario(int[][] heightMap) {
        this.heightMap = heightMap;
    }
    
    public int[][] getHeightMap() {
        return heightMap;
    }
}
