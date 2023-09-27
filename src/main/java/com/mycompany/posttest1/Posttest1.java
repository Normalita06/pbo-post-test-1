/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Posttest1 {

    public static void main(String[] args) {
        ArrayList<music> song = new ArrayList<>();
        
        song.add(new music ("Badai tlah berlalu", "BCL"));
        song.add(new music ("7 Rings", "Ariana Grande"));
        song.add(new music ("Ego", "Lyodra"));
        song.add(new music ("Menari", "Rizky Febian"));
        song.add(new music ("Tega", "Tiara Andini"));
        
        for (music msc : song) {
            System.out.println("lagu " + msc.judul + " dinyanyikan oleh " + msc.penyanyi);
        }
    }
}