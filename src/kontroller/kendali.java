/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroller;
import view.reg;
import java.sql.SQLException;
/**
 *
 * @author azure
 */
public interface kendali {
    public void simpan (reg regis) throws SQLException;
    public void reset (reg regis) throws SQLException;
}
