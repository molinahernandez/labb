/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author LN710Q
 */
public interface Metodos<Generic> {
    
    boolean create(Generic g);
    boolean delete(Object key);
    boolean update(Generic c);
    
    public Generic read(Object key);
    public ArrayList<Generic> readAll();
    
}
