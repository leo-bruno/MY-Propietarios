/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "OBJECTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Objects.findAll", query = "SELECT o FROM Objects o")
    , @NamedQuery(name = "Objects.findByBuildingno", query = "SELECT o FROM Objects o WHERE o.objectsPK.buildingno = :buildingno")
    , @NamedQuery(name = "Objects.findByObjectno", query = "SELECT o FROM Objects o WHERE o.objectsPK.objectno = :objectno")
    , @NamedQuery(name = "Objects.findByName", query = "SELECT o FROM Objects o WHERE o.name = :name")
    , @NamedQuery(name = "Objects.findByCategoryno", query = "SELECT o FROM Objects o WHERE o.categoryno = :categoryno")
    , @NamedQuery(name = "Objects.findBySubcategoryno", query = "SELECT o FROM Objects o WHERE o.subcategoryno = :subcategoryno")
    , @NamedQuery(name = "Objects.findByComment1", query = "SELECT o FROM Objects o WHERE o.comment1 = :comment1")
    , @NamedQuery(name = "Objects.findByComment2", query = "SELECT o FROM Objects o WHERE o.comment2 = :comment2")
    , @NamedQuery(name = "Objects.findByComment3", query = "SELECT o FROM Objects o WHERE o.comment3 = :comment3")
    , @NamedQuery(name = "Objects.findByFloorLevel", query = "SELECT o FROM Objects o WHERE o.floorLevel = :floorLevel")
    , @NamedQuery(name = "Objects.findByClean", query = "SELECT o FROM Objects o WHERE o.clean = :clean")
    , @NamedQuery(name = "Objects.findByMinibar", query = "SELECT o FROM Objects o WHERE o.minibar = :minibar")
    , @NamedQuery(name = "Objects.findByExtrabed", query = "SELECT o FROM Objects o WHERE o.extrabed = :extrabed")
    , @NamedQuery(name = "Objects.findByDamaged", query = "SELECT o FROM Objects o WHERE o.damaged = :damaged")
    , @NamedQuery(name = "Objects.findByNumobjects", query = "SELECT o FROM Objects o WHERE o.numobjects = :numobjects")
    , @NamedQuery(name = "Objects.findByAmount", query = "SELECT o FROM Objects o WHERE o.amount = :amount")
    , @NamedQuery(name = "Objects.findByDebititem", query = "SELECT o FROM Objects o WHERE o.debititem = :debititem")
    , @NamedQuery(name = "Objects.findByCreatetimestamp", query = "SELECT o FROM Objects o WHERE o.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "Objects.findByModifytimestamp", query = "SELECT o FROM Objects o WHERE o.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "Objects.findByCreateuser", query = "SELECT o FROM Objects o WHERE o.createuser = :createuser")
    , @NamedQuery(name = "Objects.findByCreateposition", query = "SELECT o FROM Objects o WHERE o.createposition = :createposition")
    , @NamedQuery(name = "Objects.findByModifyuser", query = "SELECT o FROM Objects o WHERE o.modifyuser = :modifyuser")
    , @NamedQuery(name = "Objects.findByModifyposition", query = "SELECT o FROM Objects o WHERE o.modifyposition = :modifyposition")
    , @NamedQuery(name = "Objects.findByMotherObjectno", query = "SELECT o FROM Objects o WHERE o.motherObjectno = :motherObjectno")
    , @NamedQuery(name = "Objects.findByTpvRoomId", query = "SELECT o FROM Objects o WHERE o.tpvRoomId = :tpvRoomId")})
public class Objects implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ObjectsPK objectsPK;
    @Size(max = 40)
    @Column(name = "NAME")
    private String name;
    @Column(name = "CATEGORYNO")
    private Integer categoryno;
    @Column(name = "SUBCATEGORYNO")
    private Integer subcategoryno;
    @Size(max = 40)
    @Column(name = "COMMENT1")
    private String comment1;
    @Size(max = 40)
    @Column(name = "COMMENT2")
    private String comment2;
    @Size(max = 40)
    @Column(name = "COMMENT3")
    private String comment3;
    @Column(name = "FLOOR_LEVEL")
    private Integer floorLevel;
    @Column(name = "CLEAN")
    private Short clean;
    @Column(name = "MINIBAR")
    private Short minibar;
    @Column(name = "EXTRABED")
    private Short extrabed;
    @Column(name = "DAMAGED")
    private Short damaged;
    @Column(name = "NUMOBJECTS")
    private Integer numobjects;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "DEBITITEM")
    private Integer debititem;
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
    @Size(max = 6)
    @Column(name = "MOTHER_OBJECTNO")
    private String motherObjectno;
    @Size(max = 10)
    @Column(name = "TPV_ROOM_ID")
    private String tpvRoomId;
    @JoinColumn(name = "BUILDINGNO", referencedColumnName = "BUILDINGNO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Buildings buildings;

    public Objects() {
    }

    public Objects(ObjectsPK objectsPK) {
        this.objectsPK = objectsPK;
    }

    public Objects(int buildingno, String objectno) {
        this.objectsPK = new ObjectsPK(buildingno, objectno);
    }

    public ObjectsPK getObjectsPK() {
        return objectsPK;
    }

    public void setObjectsPK(ObjectsPK objectsPK) {
        this.objectsPK = objectsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryno() {
        return categoryno;
    }

    public void setCategoryno(Integer categoryno) {
        this.categoryno = categoryno;
    }

    public Integer getSubcategoryno() {
        return subcategoryno;
    }

    public void setSubcategoryno(Integer subcategoryno) {
        this.subcategoryno = subcategoryno;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    public Integer getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(Integer floorLevel) {
        this.floorLevel = floorLevel;
    }

    public Short getClean() {
        return clean;
    }

    public void setClean(Short clean) {
        this.clean = clean;
    }

    public Short getMinibar() {
        return minibar;
    }

    public void setMinibar(Short minibar) {
        this.minibar = minibar;
    }

    public Short getExtrabed() {
        return extrabed;
    }

    public void setExtrabed(Short extrabed) {
        this.extrabed = extrabed;
    }

    public Short getDamaged() {
        return damaged;
    }

    public void setDamaged(Short damaged) {
        this.damaged = damaged;
    }

    public Integer getNumobjects() {
        return numobjects;
    }

    public void setNumobjects(Integer numobjects) {
        this.numobjects = numobjects;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getDebititem() {
        return debititem;
    }

    public void setDebititem(Integer debititem) {
        this.debititem = debititem;
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

    public String getMotherObjectno() {
        return motherObjectno;
    }

    public void setMotherObjectno(String motherObjectno) {
        this.motherObjectno = motherObjectno;
    }

    public String getTpvRoomId() {
        return tpvRoomId;
    }

    public void setTpvRoomId(String tpvRoomId) {
        this.tpvRoomId = tpvRoomId;
    }

    public Buildings getBuildings() {
        return buildings;
    }

    public void setBuildings(Buildings buildings) {
        this.buildings = buildings;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objectsPK != null ? objectsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Objects)) {
            return false;
        }
        Objects other = (Objects) object;
        if ((this.objectsPK == null && other.objectsPK != null) || (this.objectsPK != null && !this.objectsPK.equals(other.objectsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Objects[ objectsPK=" + objectsPK + " ]";
    }
    
}
