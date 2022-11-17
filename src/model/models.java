/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import view.reg;
import kontroller.kendali;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;
/**
 *
 * @author azure
 */
public class models implements kendali {

    @Override
    public void simpan(reg regis) throws SQLException {
        try {
            Connection con = koneksi.getcon();
            String INSERT = "INSERT INTO user VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(INSERT);
            pst.setString(1, regis.txtFname.getText());
            pst.setString(2, regis.txtLname.getText());
            pst.setString(3, regis.txtEmail.getText());
            pst.setString(4, regis.txtPass.getText());
            pst.setString(5, regis.txtPhone.getText());
            pst.setString(6, regis.txtCpass.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            pst.close();
        }   catch (Exception e) {
                System.out.println(e);
        }
    }

    @Override
    public void reset(reg regis) throws SQLException {
        regis.txtFname.setText("");
        regis.txtLname.setText("");
        regis.txtEmail.setText("");
        regis.txtPass.setText("");
        regis.txtPhone.setText("");
        regis.txtCpass.setText("");
    }
    
}
