package com.br.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Mensagem {
    
    public static void alerta(Component frame, String mensagem){
        JOptionPane.showMessageDialog(frame, mensagem,"Alerta",JOptionPane.WARNING_MESSAGE);
    }
    
    public static void informacao(Component frame, String mensagem){
        JOptionPane.showMessageDialog(frame, mensagem,"Informação",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void erro(Component frame, String mensagem){
        JOptionPane.showMessageDialog(frame, mensagem,"Erro",JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean confirmar(Component frame, String mensagem){
        Object[] opcoes = {"Sim","Não"};
        int opcao = JOptionPane.showOptionDialog(frame, mensagem,"Confirmar",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
          return true;
        }
        
                         
    }
    

    
