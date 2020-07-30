/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

public class youtubeFollower {
    
    int idyoutuberFollower;
    ArrayList<Integer> youtuberSeguidos;

    public youtubeFollower(int idyoutuberFollower, ArrayList<Integer> youtuberSeguidos) {
        this.idyoutuberFollower = idyoutuberFollower;
        this.youtuberSeguidos = youtuberSeguidos;
    }

    public youtubeFollower() {
    }
    
    

    public int getIdyoutuberFollower() {
        return idyoutuberFollower;
    }

    public ArrayList<Integer> getYoutuberSeguidos() {
        return youtuberSeguidos;
    }

    public void setIdyoutuberFollower(int idyoutuberFollower) {
        this.idyoutuberFollower = idyoutuberFollower;
    }

    public void setYoutuberSeguidos(ArrayList<Integer> youtuberSeguidos) {
        this.youtuberSeguidos = youtuberSeguidos;
    }
 
}
