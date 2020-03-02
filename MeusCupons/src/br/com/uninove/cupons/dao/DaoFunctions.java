/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uninove.cupons.dao;

import br.com.uninove.cupons.entities.Entitie;
import java.util.List;

/**
 *
 * @author jsoft-ti
 */
public interface DaoFunctions {
    public boolean add(Entitie entitie);
    public boolean delete(int id);
    public boolean update(Entitie entitie);
    public Entitie find(int id);
    public List<Entitie> findAll();
}
