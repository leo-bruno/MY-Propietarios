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

/**
 *
 * @author Leo
 */
@Embeddable
public class AgenciesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "AGENCYNO")
    private int agencyno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BRANCHNO")
    private int branchno;

    public AgenciesPK() {
    }

    public AgenciesPK(int agencyno, int branchno) {
        this.agencyno = agencyno;
        this.branchno = branchno;
    }

    public int getAgencyno() {
        return agencyno;
    }

    public void setAgencyno(int agencyno) {
        this.agencyno = agencyno;
    }

    public int getBranchno() {
        return branchno;
    }

    public void setBranchno(int branchno) {
        this.branchno = branchno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) agencyno;
        hash += (int) branchno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenciesPK)) {
            return false;
        }
        AgenciesPK other = (AgenciesPK) object;
        if (this.agencyno != other.agencyno) {
            return false;
        }
        if (this.branchno != other.branchno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AgenciesPK[ agencyno=" + agencyno + ", branchno=" + branchno + " ]";
    }
    
}
