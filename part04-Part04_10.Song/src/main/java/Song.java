/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class Song {
    private int length;
    private String name;
    
    public Song(String title, int seconds){
        length=seconds;
        name=title;
    }
    public String name(){
        return name;
    }
    public int length(){
        return length;
    }
   
    
    
    
    
}
