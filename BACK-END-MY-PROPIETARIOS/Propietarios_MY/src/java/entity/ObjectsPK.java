/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Leo
 */
@Embeddable
public class ObjectsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "BUILDINGNO")
    private int buildingno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "OBJECTNO")
    private String objectno;

    public ObjectsPK() {
    }

    public ObjectsPK(int buildingno, String objectno) {
        this.buildingno = buildingno;
        this.objectno = objectno;
    }

    public int getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(int buildingno) {
        this.buildingno = buildingno;
    }

    public String getObjectno() {
        return objectno;
    }

    public void setObjectno(String objectno) {
        this.objectno = objectno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) buildingno;
        hash += (objectno != null ? objectno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjectsPK)) {
            return false;
        }
        ObjectsPK other = (ObjectsPK) object;
        if (this.buildingno != other.buildingno) {
            return false;
        }
        if ((this.objectno == null && other.objectno != null) || (this.objectno != null && !this.objectno.equals(other.objectno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ObjectsPK[ buildingno=" + buildingno + ", objectno=" + objectno + " ]";
    }
    
}
