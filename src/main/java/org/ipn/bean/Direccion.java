
package org.ipn.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Direccion {

    public String getCalle() {
        return calle;
    }

    public String getCP() {
        return CP;
    }
    @Autowired
    public void setCalle(@Value("Insurgentes Norte")String calle) {
        this.calle = calle;
    }
    @Autowired
    public void setCP(@Value("555")String CP) {
        this.CP = CP;
    }
    
    
    private String calle;
    private String CP;

    public Direccion(String calle, String CP) {
        this.calle = calle;
        this.CP = CP;
    }
    
    public Direccion(){}

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", CP=" + CP + '}';
    }
    
}
