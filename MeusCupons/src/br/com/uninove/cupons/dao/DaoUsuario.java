/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uninove.cupons.dao;

import br.com.uninove.cupons.entities.Entitie;
import br.com.uninove.cupons.entities.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jsoft-ti
 */
public class DaoUsuario extends Dao implements DaoFunctions{

    @Override
    public boolean add(Entitie entitie) {
        Usuario usu = (Usuario) entitie;
        String comando = "insert into usuarios (nome,cpf) values (?,?)";
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            this.stmt.setString(1,usu.getNome());
            this.stmt.setString(2,usu.getCpf());
            this.stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao inserir Usuário"+ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
      String comando = "delete from usuarios where id =?";
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            this.stmt.setInt(3,id);
            this.stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao inserir Usuário"+ex.getMessage());
            return false;
        }
        return true;  
       
    }

    @Override
    public boolean update(Entitie entitie) {
        Usuario usu = (Usuario) entitie;
        String comando = "update usuarios set nome = ? , cpf = ? where id =?";
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            this.stmt.setString(1,usu.getNome());
            this.stmt.setString(2,usu.getCpf());
            this.stmt.setInt(3,usu.getId());
            this.stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao inserir Usuário"+ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Entitie find(int id) {
         String comando = "Select * from usuarios";
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            ResultSet rs = this.stmt.executeQuery();
            if(rs.next()){
                 Usuario usu  = new Usuario();
                 usu.setId(rs.getInt("id"));
                 usu.setNome(rs.getString("nome"));
                 usu.setCpf(rs.getString("cpf"));
                 return usu;
            }
        }catch(SQLException ex){
            return null;
        }
        return null;
    }

    @Override
    public List<Entitie> findAll() {
        String comando = "Select * from usuarios";
        List<Entitie> lstUsuarios = new ArrayList<>();
    
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            ResultSet rs = this.stmt.executeQuery();
            while(rs.next()){
                 Usuario usu  = new Usuario();
                 usu.setId(rs.getInt("id"));
                 usu.setNome(rs.getString("nome"));
                 usu.setCpf(rs.getString("cpf"));
                 lstUsuarios.add(usu);
            }
        }catch(SQLException ex){
            return null;
        }
        return lstUsuarios;
    }
    
}
