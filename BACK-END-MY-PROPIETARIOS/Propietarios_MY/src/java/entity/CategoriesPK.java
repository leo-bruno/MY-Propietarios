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
public class CategoriesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CATEGORYNO")
    private int categoryno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUBCATEGORYNO")
    private int subcategoryno;

    public CategoriesPK() {
    }

    public CategoriesPK(int categoryno, int subcategoryno) {
        this.categoryno = categoryno;
        this.subcategoryno = subcategoryno;
    }

    public int getCategoryno() {
        return categoryno;
    }

    public void setCategoryno(int categoryno) {
        this.categoryno = categoryno;
    }

    public int getSubcategoryno() {
        return subcategoryno;
    }

    public void setSubcategoryno(int subcategoryno) {
        this.subcategoryno = subcategoryno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) categoryno;
        hash += (int) subcategoryno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriesPK)) {
            return false;
        }
        CategoriesPK other = (CategoriesPK) object;
        if (this.categoryno != other.categoryno) {
            return false;
        }
        if (this.subcategoryno != other.subcategoryno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CategoriesPK[ categoryno=" + categoryno + ", subcategoryno=" + subcategoryno + " ]";
    }
    
}
