/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.geekseat.witchsaga.model;

/**
 *
 * @author Galih Tias
 */
public class StoryModel {
    
    public void welcome(){
        System.out.println("WELCOME BRAVE PROGRAMMER");
    }
    
    public String aod(int i){
        return"Age of death Villager_"+i;
    }
    
    public String yod(int i){
        return"Year of death Villager_"+i;
    }
    
    public void failMessage(){
        System.out.println("-1");
    }
    
    public void averageMessage(Double vilagerTime){
        System.out.println("AVERAGE : "+ vilagerTime/2);
    }
    
    public void successMessage(){
        System.out.println("CONGRAT THE WITCH HAS LEAVE THE VILLAGE");
    }
}
