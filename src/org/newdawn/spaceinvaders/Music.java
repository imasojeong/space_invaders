package org.newdawn.spaceinvaders;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Music extends Game {
    public static void mainAudioOn(){
//h
        try {
            // 오디오 상대 경로로 저장하기
            File file = new File("C:/Users/AISELab/Downloads/Game.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
//            clip.loop(3);
            clip.start();
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }
    public static void shotAudio(){
        try {
            // 오디오 상대 경로 저장하기
            File file = new File("C:/Users/AISELab/Downloads/shot.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
//            clip.loop(Clip.LOOP_CONTINUOUSLY);
//            clip.loop(1);
            clip.start();
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }
}