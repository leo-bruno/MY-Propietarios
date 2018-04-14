/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "CATEGORIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categories.findAll", query = "SELECT c FROM Categories c")
    , @NamedQuery(name = "Categories.findByCategoryno", query = "SELECT c FROM Categories c WHERE c.categoriesPK.categoryno = :categoryno")
    , @NamedQuery(name = "Categories.findBySubcategoryno", query = "SELECT c FROM Categories c WHERE c.categoriesPK.subcategoryno = :subcategoryno")
    , @NamedQuery(name = "Categories.findByName", query = "SELECT c FROM Categories c WHERE c.name = :name")
    , @NamedQuery(name = "Categories.findByCodename", query = "SELECT c FROM Categories c WHERE c.codename = :codename")
    , @NamedQuery(name = "Categories.findByDivisiontype", query = "SELECT c FROM Categories c WHERE c.divisiontype = :divisiontype")
    , @NamedQuery(name = "Categories.findByInterval", query = "SELECT c FROM Categories c WHERE c.interval = :interval")
    , @NamedQuery(name = "Categories.findByPaxno", query = "SELECT c FROM Categories c WHERE c.paxno = :paxno")
    , @NamedQuery(name = "Categories.findByAvailabilitygrp", query = "SELECT c FROM Categories c WHERE c.availabilitygrp = :availabilitygrp")
    , @NamedQuery(name = "Categories.findByColor", query = "SELECT c FROM Categories c WHERE c.color = :color")
    , @NamedQuery(name = "Categories.findByNumobjects", query = "SELECT c FROM Categories c WHERE c.numobjects = :numobjects")
    , @NamedQuery(name = "Categories.findByDebititem", query = "SELECT c FROM Categories c WHERE c.debititem = :debititem")
    , @NamedQuery(name = "Categories.findByObjectreservation", query = "SELECT c FROM Categories c WHERE c.objectreservation = :objectreservation")
    , @NamedQuery(name = "Categories.findByExcludeFromAvail", query = "SELECT c FROM Categories c WHERE c.excludeFromAvail = :excludeFromAvail")
    , @NamedQuery(name = "Categories.findByCreatetimestamp", query = "SELECT c FROM Categories c WHERE c.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "Categories.findByModifytimestamp", query = "SELECT c FROM Categories c WHERE c.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "Categories.findByCreateuser", query = "SELECT c FROM Categories c WHERE c.createuser = :createuser")
    , @NamedQuery(name = "Categories.findByCreateposition", query = "SELECT c FROM Categories c WHERE c.createposition = :createposition")
    , @NamedQuery(name = "Categories.findByModifyuser", query = "SELECT c FROM Categories c WHERE c.modifyuser = :modifyuser")
    , @NamedQuery(name = "Categories.findByModifyposition", query = "SELECT c FROM Categories c WHERE c.modifyposition = :modifyposition")
    , @NamedQuery(name = "Categories.findByDonotclean", query = "SELECT c FROM Categories c WHERE c.donotclean = :donotclean")
    , @NamedQuery(name = "Categories.findByChildrenno", query = "SELECT c FROM Categories c WHERE c.childrenno = :childrenno")
    , @NamedQuery(name = "Categories.findByNotincludeavail", query = "SELECT c FROM Categories c WHERE c.notincludeavail = :notincludeavail")
    , @NamedQuery(name = "Categories.findByIncludeCleaning", query = "SELECT c FROM Categories c WHERE c.includeCleaning = :includeCleaning")
    , @NamedQuery(name = "Categories.findByExcludeOnlineUpdates", query = "SELECT c FROM Categories c WHERE c.excludeOnlineUpdates = :excludeOnlineUpdates")
    , @NamedQuery(name = "Categories.findByExcludeManagerReports", query = "SELECT c FROM Categories c WHERE c.excludeManagerReports = :excludeManagerReports")})
public class Categories implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoriesPK categoriesPK;
    @Size(max = 40)
    @Column(name = "NAME")
    private String name;
    @Size(max = 6)
    @Column(name = "CODENAME")
    private String codename;
    @Column(name = "DIVISIONTYPE")
    private Short divisiontype;
    @Column(name = "INTERVAL")
    private Short interval;
    @Column(name = "PAXNO")
    private Integer paxno;
    @Column(name = "AVAILABILITYGRP")
    private Integer availabilitygrp;
    @Size(max = 20)
    @Column(name = "COLOR")
    private String color;
    @Column(name = "NUMOBJECTS")
    private Short numobjects;
    @Column(name = "DEBITITEM")
    private Integer debititem;
    @Column(name = "OBJECTRESERVATION")
    private Short objectreservation;
    @Column(name = "EXCLUDE_FROM_AVAIL")
    private Short excludeFromAvail;
    @Column(name = "CREATETIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtimestamp;
    @Column(name = "MODIFYTIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifytimestamp;
    @Column(name = "CREATEUSER")
    private Integer createuser;
    @Column(name = "CREATEPOSITION")
    private Integer createposition;
    @Column(name = "MODIFYUSER")
    private Integer modifyuser;
    @Column(name = "MODIFYPOSITION")
    private Integer modifyposition;
    @Column(name = "DONOTCLEAN")
    private Short donotclean;
    @Column(name = "CHILDRENNO")
    private Integer childrenno;
    @Column(name = "NOTINCLUDEAVAIL")
    private Short notincludeavail;
    @Column(name = "INCLUDE_CLEANING")
    private Short includeCleaning;
    @Column(name = "EXCLUDE_ONLINE_UPDATES")
    private Short excludeOnlineUpdates;
    @Column(name = "EXCLUDE_MANAGER_REPORTS")
    private Short excludeManagerReports;
    @OneToMany(mappedBy = "categories")
    private Collection<BookingsObjects> bookingsObjectsCollection;

    public Categories() {
    }

    public Categories(CategoriesPK categoriesPK) {
        this.categoriesPK = categoriesPK;
    }

    public Categories(int categoryno, int subcategoryno) {
        this.categoriesPK = new CategoriesPK(categoryno, subcategoryno);
    }

    public CategoriesPK getCategoriesPK() {
        return categoriesPK;
    }

    public void setCategoriesPK(CategoriesPK categoriesPK) {
        this.categoriesPK = categoriesPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public Short getDivisiontype() {
        return divisiontype;
    }

    public void setDivisiontype(Short divisiontype) {
        this.divisiontype = divisiontype;
    }

    public Short getInterval() {
        return interval;
    }

    public void setInterval(Short interval) {
        this.interval = interval;
    }

    public Integer getPaxno() {
        return paxno;
    }

    public void setPaxno(Integer paxno) {
        this.paxno = paxno;
    }

    public Integer getAvailabilitygrp() {
        return availabilitygrp;
    }

    public void setAvailabilitygrp(Integer availabilitygrp) {
        this.availabilitygrp = availabilitygrp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Short getNumobjects() {
        return numobjects;
    }

    public void setNumobjects(Short numobjects) {
        this.numobjects = numobjects;
    }

    public Integer getDebititem() {
        return debititem;
    }

    public void setDebititem(Integer debititem) {
        this.debititem = debititem;
    }

    public Short getObjectreservation() {
        return objectreservation;
    }

    public void setObjectreservation(Short objectreservation) {
        this.objectreservation = objectreservation;
    }

    public Short getExcludeFromAvail() {
        return excludeFromAvail;
    }

    public void setExcludeFromAvail(Short excludeFromAvail) {
        this.excludeFromAvail = excludeFromAvail;
    }

    public Date getCreatetimestamp() {
        return createtimestamp;
    }

    public void setCreatetimestamp(Date createtimestamp) {
        this.createtimestamp = createtimestamp;
    }

    public Date getModifytimestamp() {
        return modifytimestamp;
    }

    public void setModifytimestamp(Date modifytimestamp) {
        this.modifytimestamp = modifytimestamp;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    public Integer getCreateposition() {
        return createposition;
    }

    public void setCreateposition(Integer createposition) {
        this.createposition = createposition;
    }

    public Integer getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(Integer modifyuser) {
        this.modifyuser = modifyuser;
    }

    public Integer getModifyposition() {
        return modifyposition;
    }

    public void setModifyposition(Integer modifyposition) {
        this.modifyposition = modifyposition;
    }

    public Short getDonotclean() {
        return donotclean;
    }

    public void setDonotclean(Short donotclean) {
        this.donotclean = donotclean;
    }

    public Integer getChildrenno() {
        return childrenno;
    }

    public void setChildrenno(Integer childrenno) {
        this.childrenno = childrenno;
    }

    public Short getNotincludeavail() {
        return notincludeavail;
    }

    public void setNotincludeavail(Short notincludeavail) {
        this.notincludeavail = notincludeavail;
    }

    public Short getIncludeCleaning() {
        return includeCleaning;
    }

    public void setIncludeCleaning(Short includeCleaning) {
        this.includeCleaning = includeCleaning;
    }

    public Short getExcludeOnlineUpdates() {
        return excludeOnlineUpdates;
    }

    public void setExcludeOnlineUpdates(Short excludeOnlineUpdates) {
        this.excludeOnlineUpdates = excludeOnlineUpdates;
    }

    public Short getExcludeManagerReports() {
        return excludeManagerReports;
    }

    public void setExcludeManagerReports(Short excludeManagerReports) {
        this.excludeManagerReports = excludeManagerReports;
    }

    @XmlTransient
    public Collection<BookingsObjects> getBookingsObjectsCollection() {
        return bookingsObjectsCollection;
    }

    public void setBookingsObjectsCollection(Collection<BookingsObjects> bookingsObjectsCollection) {
        this.bookingsObjectsCollection = bookingsObjectsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriesPK != null ? categoriesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categories)) {
            return false;
        }
        Categories other = (Categories) object;
        if ((this.categoriesPK == null && other.categoriesPK != null) || (this.categoriesPK != null && !this.categoriesPK.equals(other.categoriesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Categories[ categoriesPK=" + categoriesPK + " ]";
    }
    
}
