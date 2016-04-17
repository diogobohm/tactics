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
public class Scene {
    
    private final Scenario scenario;
    private final Camera camera;
    private final Character character;
 
    public Scene(Scenario scenario, Camera camera, Character character) {
        this.scenario = scenario;
        this.camera = camera;
        this.character = character;
    }

    /**
     * @return the scenario
     */
    public Scenario getScenario() {
        return scenario;
    }

    /**
     * @return the camera
     */
    public Camera getCamera() {
        return camera;
    }

    /**
     * @return the character
     */
    public Character getCharacter() {
        return character;
    }
    
}
