package cocktail;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.Clip;

public class SoundPlayer {
    private Clip clip;
    private boolean isMuted = false; 
    private float originalVolume; 

    public SoundPlayer() {
        originalVolume = 0f;
    }

    public void loadSound(String filePath) {
        try {
            URL url = getClass().getResource(filePath);
            if (url == null) {
                System.err.println("File not found: " + filePath);
                return;
            }
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error loading sound: " + e);
        }
    }

    public void playSound() {
        if (clip != null) {
            clip.start();
        } else {
            System.err.println("Sound Clip is not loaded properly.");
        }
    }

    public void stopSound() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

public void toggleMute() {
    if (clip != null) {
        if (isMuted) {
        
            clip.start();
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(originalVolume);
            isMuted = false;
        } else {
            originalVolume = ((FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN)).getValue();
            clip.stop(); 
            isMuted = true;
        }
    } else {
        System.err.println("Sound clip not initialized.");
    }
}

    public boolean isMuted() {
        return isMuted;
    }
}