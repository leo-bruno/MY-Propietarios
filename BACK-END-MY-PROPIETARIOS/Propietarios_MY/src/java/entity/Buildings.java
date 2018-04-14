/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "BUILDINGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buildings.findAll", query = "SELECT b FROM Buildings b")
    , @NamedQuery(name = "Buildings.findByBuildingno", query = "SELECT b FROM Buildings b WHERE b.buildingno = :buildingno")
    , @NamedQuery(name = "Buildings.findByName", query = "SELECT b FROM Buildings b WHERE b.name = :name")
    , @NamedQuery(name = "Buildings.findByAddress1", query = "SELECT b FROM Buildings b WHERE b.address1 = :address1")
    , @NamedQuery(name = "Buildings.findByAddress2", query = "SELECT b FROM Buildings b WHERE b.address2 = :address2")
    , @NamedQuery(name = "Buildings.findByAddress3", query = "SELECT b FROM Buildings b WHERE b.address3 = :address3")
    , @NamedQuery(name = "Buildings.findByAddress4", query = "SELECT b FROM Buildings b WHERE b.address4 = :address4")
    , @NamedQuery(name = "Buildings.findByAddress5", query = "SELECT b FROM Buildings b WHERE b.address5 = :address5")
    , @NamedQuery(name = "Buildings.findByZipcode", query = "SELECT b FROM Buildings b WHERE b.zipcode = :zipcode")
    , @NamedQuery(name = "Buildings.findByPhoneno1", query = "SELECT b FROM Buildings b WHERE b.phoneno1 = :phoneno1")
    , @NamedQuery(name = "Buildings.findByPhoneno2", query = "SELECT b FROM Buildings b WHERE b.phoneno2 = :phoneno2")
    , @NamedQuery(name = "Buildings.findByFaxno1", query = "SELECT b FROM Buildings b WHERE b.faxno1 = :faxno1")
    , @NamedQuery(name = "Buildings.findByFaxno2", query = "SELECT b FROM Buildings b WHERE b.faxno2 = :faxno2")
    , @NamedQuery(name = "Buildings.findByEmail1", query = "SELECT b FROM Buildings b WHERE b.email1 = :email1")
    , @NamedQuery(name = "Buildings.findByEmail2", query = "SELECT b FROM Buildings b WHERE b.email2 = :email2")
    , @NamedQuery(name = "Buildings.findByWebpage", query = "SELECT b FROM Buildings b WHERE b.webpage = :webpage")
    , @NamedQuery(name = "Buildings.findByComment1", query = "SELECT b FROM Buildings b WHERE b.comment1 = :comment1")
    , @NamedQuery(name = "Buildings.findByComment2", query = "SELECT b FROM Buildings b WHERE b.comment2 = :comment2")
    , @NamedQuery(name = "Buildings.findByComment3", query = "SELECT b FROM Buildings b WHERE b.comment3 = :comment3")
    , @NamedQuery(name = "Buildings.findByCategory", query = "SELECT b FROM Buildings b WHERE b.category = :category")
    , @NamedQuery(name = "Buildings.findByDirectory", query = "SELECT b FROM Buildings b WHERE b.directory = :directory")
    , @NamedQuery(name = "Buildings.findByCreatetimestamp", query = "SELECT b FROM Buildings b WHERE b.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "Buildings.findByModifytimestamp", query = "SELECT b FROM Buildings b WHERE b.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "Buildings.findByCreateuser", query = "SELECT b FROM Buildings b WHERE b.createuser = :createuser")
    , @NamedQuery(name = "Buildings.findByCreateposition", query = "SELECT b FROM Buildings b WHERE b.createposition = :createposition")
    , @NamedQuery(name = "Buildings.findByModifyuser", query = "SELECT b FROM Buildings b WHERE b.modifyuser = :modifyuser")
    , @NamedQuery(name = "Buildings.findByModifyposition", query = "SELECT b FROM Buildings b WHERE b.modifyposition = :modifyposition")
    , @NamedQuery(name = "Buildings.findByPoliceidentifier", query = "SELECT b FROM Buildings b WHERE b.policeidentifier = :policeidentifier")
    , @NamedQuery(name = "Buildings.findByPolicesequencenum", query = "SELECT b FROM Buildings b WHERE b.policesequencenum = :policesequencenum")
    , @NamedQuery(name = "Buildings.findByPoliceuser", query = "SELECT b FROM Buildings b WHERE b.policeuser = :policeuser")
    , @NamedQuery(name = "Buildings.findByPolicepassword", query = "SELECT b FROM Buildings b WHERE b.policepassword = :policepassword")
    , @NamedQuery(name = "Buildings.findByDayclose", query = "SELECT b FROM Buildings b WHERE b.dayclose = :dayclose")
    , @NamedQuery(name = "Buildings.findByDateyieldcheck", query = "SELECT b FROM Buildings b WHERE b.dateyieldcheck = :dateyieldcheck")
    , @NamedQuery(name = "Buildings.findByControlyield", query = "SELECT b FROM Buildings b WHERE b.controlyield = :controlyield")
    , @NamedQuery(name = "Buildings.findByPoliceweb", query = "SELECT b FROM Buildings b WHERE b.policeweb = :policeweb")
    , @NamedQuery(name = "Buildings.findByExpCiId", query = "SELECT b FROM Buildings b WHERE b.expCiId = :expCiId")
    , @NamedQuery(name = "Buildings.findByCreditDateFrom", query = "SELECT b FROM Buildings b WHERE b.creditDateFrom = :creditDateFrom")
    , @NamedQuery(name = "Buildings.findByDatecleaningcheck", query = "SELECT b FROM Buildings b WHERE b.datecleaningcheck = :datecleaningcheck")
    , @NamedQuery(name = "Buildings.findByDonotclean", query = "SELECT b FROM Buildings b WHERE b.donotclean = :donotclean")
    , @NamedQuery(name = "Buildings.findByPoliceidentifier2", query = "SELECT b FROM Buildings b WHERE b.policeidentifier2 = :policeidentifier2")
    , @NamedQuery(name = "Buildings.findByPoliceDataType", query = "SELECT b FROM Buildings b WHERE b.policeDataType = :policeDataType")
    , @NamedQuery(name = "Buildings.findByAccountingVatSequence", query = "SELECT b FROM Buildings b WHERE b.accountingVatSequence = :accountingVatSequence")})
public class Buildings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BUILDINGNO")
    private Integer buildingno;
    @Size(max = 40)
    @Column(name = "NAME")
    private String name;
    @Size(max = 40)
    @Column(name = "ADDRESS1")
    private String address1;
    @Size(max = 40)
    @Column(name = "ADDRESS2")
    private String address2;
    @Size(max = 40)
    @Column(name = "ADDRESS3")
    private String address3;
    @Size(max = 40)
    @Column(name = "ADDRESS4")
    private String address4;
    @Size(max = 40)
    @Column(name = "ADDRESS5")
    private String address5;
    @Size(max = 10)
    @Column(name = "ZIPCODE")
    private String zipcode;
    @Size(max = 20)
    @Column(name = "PHONENO1")
    private String phoneno1;
    @Size(max = 20)
    @Column(name = "PHONENO2")
    private String phoneno2;
    @Size(max = 20)
    @Column(name = "FAXNO1")
    private String faxno1;
    @Size(max = 20)
    @Column(name = "FAXNO2")
    private String faxno2;
    @Size(max = 40)
    @Column(name = "EMAIL1")
    private String email1;
    @Size(max = 40)
    @Column(name = "EMAIL2")
    private String email2;
    @Size(max = 80)
    @Column(name = "WEBPAGE")
    private String webpage;
    @Size(max = 40)
    @Column(name = "COMMENT1")
    private String comment1;
    @Size(max = 40)
    @Column(name = "COMMENT2")
    private String comment2;
    @Size(max = 40)
    @Column(name = "COMMENT3")
    private String comment3;
    @Size(max = 6)
    @Column(name = "CATEGORY")
    private String category;
    @Size(max = 80)
    @Column(name = "DIRECTORY")
    private String directory;
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
    @Size(max = 15)
    @Column(name = "POLICEIDENTIFIER")
    private String policeidentifier;
    @Column(name = "POLICESEQUENCENUM")
    private Short policesequencenum;
    @Size(max = 20)
    @Column(name = "POLICEUSER")
    private String policeuser;
    @Size(max = 20)
    @Column(name = "POLICEPASSWORD")
    private String policepassword;
    @Column(name = "DAYCLOSE")
    @Temporal(TemporalType.DATE)
    private Date dayclose;
    @Column(name = "DATEYIELDCHECK")
    @Temporal(TemporalType.DATE)
    private Date dateyieldcheck;
    @Column(name = "CONTROLYIELD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date controlyield;
    @Size(max = 255)
    @Column(name = "POLICEWEB")
    private String policeweb;
    @Size(max = 20)
    @Column(name = "EXP_CI_ID")
    private String expCiId;
    @Column(name = "CREDIT_DATE_FROM")
    @Temporal(TemporalType.DATE)
    private Date creditDateFrom;
    @Column(name = "DATECLEANINGCHECK")
    @Temporal(TemporalType.DATE)
    private Date datecleaningcheck;
    @Column(name = "DONOTCLEAN")
    private Short donotclean;
    @Size(max = 15)
    @Column(name = "POLICEIDENTIFIER2")
    private String policeidentifier2;
    @Column(name = "POLICE_DATA_TYPE")
    private Integer policeDataType;
    @Column(name = "ACCOUNTING_VAT_SEQUENCE")
    private Integer accountingVatSequence;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buildingno")
    private Collection<Bookings> bookingsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buildings")
    private Collection<Objects> objectsCollection;

    public Buildings() {
    }

    public Buildings(Integer buildingno) {
        this.buildingno = buildingno;
    }

    public Integer getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(Integer buildingno) {
        this.buildingno = buildingno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getAddress5() {
        return address5;
    }

    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneno1() {
        return phoneno1;
    }

    public void setPhoneno1(String phoneno1) {
        this.phoneno1 = phoneno1;
    }

    public String getPhoneno2() {
        return phoneno2;
    }

    public void setPhoneno2(String phoneno2) {
        this.phoneno2 = phoneno2;
    }

    public String getFaxno1() {
        return faxno1;
    }

    public void setFaxno1(String faxno1) {
        this.faxno1 = faxno1;
    }

    public String getFaxno2() {
        return faxno2;
    }

    public void setFaxno2(String faxno2) {
        this.faxno2 = faxno2;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
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

    public String getPoliceidentifier() {
        return policeidentifier;
    }

    public void setPoliceidentifier(String policeidentifier) {
        this.policeidentifier = policeidentifier;
    }

    public Short getPolicesequencenum() {
        return policesequencenum;
    }

    public void setPolicesequencenum(Short policesequencenum) {
        this.policesequencenum = policesequencenum;
    }

    public String getPoliceuser() {
        return policeuser;
    }

    public void setPoliceuser(String policeuser) {
        this.policeuser = policeuser;
    }

    public String getPolicepassword() {
        return policepassword;
    }

    public void setPolicepassword(String policepassword) {
        this.policepassword = policepassword;
    }

    public Date getDayclose() {
        return dayclose;
    }

    public void setDayclose(Date dayclose) {
        this.dayclose = dayclose;
    }

    public Date getDateyieldcheck() {
        return dateyieldcheck;
    }

    public void setDateyieldcheck(Date dateyieldcheck) {
        this.dateyieldcheck = dateyieldcheck;
    }

    public Date getControlyield() {
        return controlyield;
    }

    public void setControlyield(Date controlyield) {
        this.controlyield = controlyield;
    }

    public String getPoliceweb() {
        return policeweb;
    }

    public void setPoliceweb(String policeweb) {
        this.policeweb = policeweb;
    }

    public String getExpCiId() {
        return expCiId;
    }

    public void setExpCiId(String expCiId) {
        this.expCiId = expCiId;
    }

    public Date getCreditDateFrom() {
        return creditDateFrom;
    }

    public void setCreditDateFrom(Date creditDateFrom) {
        this.creditDateFrom = creditDateFrom;
    }

    public Date getDatecleaningcheck() {
        return datecleaningcheck;
    }

    public void setDatecleaningcheck(Date datecleaningcheck) {
        this.datecleaningcheck = datecleaningcheck;
    }

    public Short getDonotclean() {
        return donotclean;
    }

    public void setDonotclean(Short donotclean) {
        this.donotclean = donotclean;
    }

    public String getPoliceidentifier2() {
        return policeidentifier2;
    }

    public void setPoliceidentifier2(String policeidentifier2) {
        this.policeidentifier2 = policeidentifier2;
    }

    public Integer getPoliceDataType() {
        return policeDataType;
    }

    public void setPoliceDataType(Integer policeDataType) {
        this.policeDataType = policeDataType;
    }

    public Integer getAccountingVatSequence() {
        return accountingVatSequence;
    }

    public void setAccountingVatSequence(Integer accountingVatSequence) {
        this.accountingVatSequence = accountingVatSequence;
    }

    @XmlTransient
    public Collection<Bookings> getBookingsCollection() {
        return bookingsCollection;
    }

    public void setBookingsCollection(Collection<Bookings> bookingsCollection) {
        this.bookingsCollection = bookingsCollection;
    }

    @XmlTransient
    public Collection<Objects> getObjectsCollection() {
        return objectsCollection;
    }

    public void setObjectsCollection(Collection<Objects> objectsCollection) {
        this.objectsCollection = objectsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buildingno != null ? buildingno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buildings)) {
            return false;
        }
        Buildings other = (Buildings) object;
        if ((this.buildingno == null && other.buildingno != null) || (this.buildingno != null && !this.buildingno.equals(other.buildingno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Buildings[ buildingno=" + buildingno + " ]";
    }
    
}
