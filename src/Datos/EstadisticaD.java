/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Fecha;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mauro
 */
public class EstadisticaD {
    
    private final Estructura es = new Estructura();
    private Statement st;

    public EstadisticaD() {
        
    }
    
    public void insertarVisita(String ip, String url, String browser, String so) throws SQLException, ClassNotFoundException{
        this.st = es.generarSt();
        String insert = "INSERT INTO historialvisitas(ip, url, browser, so, fecha) "
            + " VALUES ('" + ip + "', '" + url + "', '" + browser + "', '" + so + "', '" + new Fecha().getSQLDate() + "');";
        st.execute(insert);
        st.getConnection().close();
    }
}
