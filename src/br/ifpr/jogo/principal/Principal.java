package br.ifpr.jogo.principal;

import javax.swing.JFrame;

public class Principal extends JFrame {
    public Principal(){

        Fase menu = new Fase();
        super.add(menu);
        super.setTitle("GALAXY DINASTY");    
        super.setSize(900, 900);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);

    }
    
    public static void main(String[] args){
        new Principal();
    }

}




