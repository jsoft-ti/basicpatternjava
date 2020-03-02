/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuscupons;

import br.com.uninove.cupons.controllers.UsuarioController;
import br.com.uninove.cupons.entities.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jsoft-ti
 */
public class MeusCupons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usu = new Usuario();
        UsuarioController usuController = new UsuarioController();
        usu.setNome(JOptionPane.showInputDialog("Insira o nome do usuário"));
        usu.setCpf(JOptionPane.showInputDialog("Insira o cpf do usuário"));
        if(usuController.cadastrarUsuario(usu)){
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar usuário");
        }
        
        List<Usuario> lstUsuarios = usuController.buscarTodosUsuarios();
        StringBuilder strUsuarios = new StringBuilder();
        lstUsuarios.forEach((_usu) ->{
            strUsuarios.append(_usu.getNome()).append("\n");
        });
        JOptionPane.showMessageDialog(null, strUsuarios.toString());
    }
    
}
