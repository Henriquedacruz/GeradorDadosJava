/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geradordados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique
 */
public class GeradorDados {

    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param args the command line arguments
     */
    public String salvar(){
            
            try {
                FileWriter fw = new FileWriter("nomessobrenomes.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(this.nome);
                pw.flush();
                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(GeradorDados.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return ("adicionado com sucesso");
        }
    
    
}
