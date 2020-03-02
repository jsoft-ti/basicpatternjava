/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uninove.cupons.controllers;

import br.com.uninove.cupons.dao.DaoUsuario;
import br.com.uninove.cupons.entities.Entitie;
import br.com.uninove.cupons.entities.Usuario;
import java.util.List;

/**
 *
 * @author jsoft-ti
 */
public class UsuarioController {
    public boolean cadastrarUsuario(Usuario usu){
        DaoUsuario dUsu = new DaoUsuario();
        return dUsu.add(usu);
    }
    
    public boolean excluirUsuario(int id){
        DaoUsuario dUsu = new DaoUsuario();
        return dUsu.delete(id);
    }
    
    public List<Usuario> buscarTodosUsuarios(){
        DaoUsuario dUsu = new DaoUsuario();
        List<Entitie> lstUsuario = dUsu.findAll();
        //Isso a globo não mostra
        return (List<Usuario>)(List<?>)lstUsuario;
    }
}
