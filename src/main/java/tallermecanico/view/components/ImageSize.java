/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico.view.components;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author bosv
 */
public class ImageSize extends JFrame{
    private ImageIcon image;
    private Icon icon;
    
    public ImageSize() {
    }
    
    public void setSize(JLabel lbl, String path) {
        this.image = new ImageIcon(path);
        this.icon = new ImageIcon(
                this.image.getImage().getScaledInstance(
                        lbl.getWidth(), 
                        lbl.getHeight(), 
                        Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icon);
        this.repaint();
    }
}
