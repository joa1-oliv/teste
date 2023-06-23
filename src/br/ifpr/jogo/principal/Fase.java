package br.ifpr.jogo.principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;


public class Fase extends JPanel{
    private Image fundo;
    

    public Fase() {
        ImageIcon carregando = new ImageIcon("recursos\\FUNDO.png");
        fundo = carregando.getImage();
    }

    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        g.dispose();
    }
}
                          