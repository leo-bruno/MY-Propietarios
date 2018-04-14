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
@Table(name = "AGENCIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencies.findAll", query = "SELECT a FROM Agencies a")
    , @NamedQuery(name = "Agencies.findByAgencyno", query = "SELECT a FROM Agencies a WHERE a.agenciesPK.agencyno = :agencyno")
    , @NamedQuery(name = "Agencies.findByBranchno", query = "SELECT a FROM Agencies a WHERE a.agenciesPK.branchno = :branchno")
    , @NamedQuery(name = "Agencies.findByName", query = "SELECT a FROM Agencies a WHERE a.name = :name")
    , @NamedQuery(name = "Agencies.findByAddress1", query = "SELECT a FROM Agencies a WHERE a.address1 = :address1")
    , @NamedQuery(name = "Agencies.findByAddress2", query = "SELECT a FROM Agencies a WHERE a.address2 = :address2")
    , @NamedQuery(name = "Agencies.findByAddress3", query = "SELECT a FROM Agencies a WHERE a.address3 = :address3")
    , @NamedQuery(name = "Agencies.findByAddress4", query = "SELECT a FROM Agencies a WHERE a.address4 = :address4")
    , @NamedQuery(name = "Agencies.findByAddress5", query = "SELECT a FROM Agencies a WHERE a.address5 = :address5")
    , @NamedQuery(name = "Agencies.findByZipcode", query = "SELECT a FROM Agencies a WHERE a.zipcode = :zipcode")
    , @NamedQuery(name = "Agencies.findByPhoneno1", query = "SELECT a FROM Agencies a WHERE a.phoneno1 = :phoneno1")
    , @NamedQuery(name = "Agencies.findByPhoneno2", query = "SELECT a FROM Agencies a WHERE a.phoneno2 = :phoneno2")
    , @NamedQuery(name = "Agencies.findByFaxno1", query = "SELECT a FROM Agencies a WHERE a.faxno1 = :faxno1")
    , @NamedQuery(name = "Agencies.findByFaxno2", query = "SELECT a FROM Agencies a WHERE a.faxno2 = :faxno2")
    , @NamedQuery(name = "Agencies.findByEmail1", query = "SELECT a FROM Agencies a WHERE a.email1 = :email1")
    , @NamedQuery(name = "Agencies.findByEmail2", query = "SELECT a FROM Agencies a WHERE a.email2 = :email2")
    , @NamedQuery(name = "Agencies.findByWebpage", query = "SELECT a FROM Agencies a WHERE a.webpage = :webpage")
    , @NamedQuery(name = "Agencies.findByTaxcode", query = "SELECT a FROM Agencies a WHERE a.taxcode = :taxcode")
    , @NamedQuery(name = "Agencies.findByContactperson1", query = "SELECT a FROM Agencies a WHERE a.contactperson1 = :contactperson1")
    , @NamedQuery(name = "Agencies.findByContactperson2", query = "SELECT a FROM Agencies a WHERE a.contactperson2 = :contactperson2")
    , @NamedQuery(name = "Agencies.findByComment1", query = "SELECT a FROM Agencies a WHERE a.comment1 = :comment1")
    , @NamedQuery(name = "Agencies.findByComment2", query = "SELECT a FROM Agencies a WHERE a.comment2 = :comment2")
    , @NamedQuery(name = "Agencies.findByComment3", query = "SELECT a FROM Agencies a WHERE a.comment3 = :comment3")
    , @NamedQuery(name = "Agencies.findByDiscount1", query = "SELECT a FROM Agencies a WHERE a.discount1 = :discount1")
    , @NamedQuery(name = "Agencies.findByDiscount2", query = "SELECT a FROM Agencies a WHERE a.discount2 = :discount2")
    , @NamedQuery(name = "Agencies.findByDiscount3", query = "SELECT a FROM Agencies a WHERE a.discount3 = :discount3")
    , @NamedQuery(name = "Agencies.findByCommType", query = "SELECT a FROM Agencies a WHERE a.commType = :commType")
    , @NamedQuery(name = "Agencies.findByCommission1", query = "SELECT a FROM Agencies a WHERE a.commission1 = :commission1")
    , @NamedQuery(name = "Agencies.findByCommission2", query = "SELECT a FROM Agencies a WHERE a.commission2 = :commission2")
    , @NamedQuery(name = "Agencies.findByCommission3", query = "SELECT a FROM Agencies a WHERE a.commission3 = :commission3")
    , @NamedQuery(name = "Agencies.findByCommFixedtype1", query = "SELECT a FROM Agencies a WHERE a.commFixedtype1 = :commFixedtype1")
    , @NamedQuery(name = "Agencies.findByCommFixedtype2", query = "SELECT a FROM Agencies a WHERE a.commFixedtype2 = :commFixedtype2")
    , @NamedQuery(name = "Agencies.findByCommFixedamount", query = "SELECT a FROM Agencies a WHERE a.commFixedamount = :commFixedamount")
    , @NamedQuery(name = "Agencies.findByFullcredit", query = "SELECT a FROM Agencies a WHERE a.fullcredit = :fullcredit")
    , @NamedQuery(name = "Agencies.findByAntifullcredit", query = "SELECT a FROM Agencies a WHERE a.antifullcredit = :antifullcredit")
    , @NamedQuery(name = "Agencies.findByLayoutbill", query = "SELECT a FROM Agencies a WHERE a.layoutbill = :layoutbill")
    , @NamedQuery(name = "Agencies.findByMaximumbalance", query = "SELECT a FROM Agencies a WHERE a.maximumbalance = :maximumbalance")
    , @NamedQuery(name = "Agencies.findByCreatetimestamp", query = "SELECT a FROM Agencies a WHERE a.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "Agencies.findByModifytimestamp", query = "SELECT a FROM Agencies a WHERE a.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "Agencies.findByCreateuser", query = "SELECT a FROM Agencies a WHERE a.createuser = :createuser")
    , @NamedQuery(name = "Agencies.findByCreateposition", query = "SELECT a FROM Agencies a WHERE a.createposition = :createposition")
    , @NamedQuery(name = "Agencies.findByModifyuser", query = "SELECT a FROM Agencies a WHERE a.modifyuser = :modifyuser")
    , @NamedQuery(name = "Agencies.findByModifyposition", query = "SELECT a FROM Agencies a WHERE a.modifyposition = :modifyposition")
    , @NamedQuery(name = "Agencies.findByCriteria1", query = "SELECT a FROM Agencies a WHERE a.criteria1 = :criteria1")
    , @NamedQuery(name = "Agencies.findByCriteria2", query = "SELECT a FROM Agencies a WHERE a.criteria2 = :criteria2")
    , @NamedQuery(name = "Agencies.findByTaxname", query = "SELECT a FROM Agencies a WHERE a.taxname = :taxname")
    , @NamedQuery(name = "Agencies.findByChannelWeb", query = "SELECT a FROM Agencies a WHERE a.channelWeb = :channelWeb")
    , @NamedQuery(name = "Agencies.findByChannelUser", query = "SELECT a FROM Agencies a WHERE a.channelUser = :channelUser")
    , @NamedQuery(name = "Agencies.findByChannelPassword", query = "SELECT a FROM Agencies a WHERE a.channelPassword = :channelPassword")
    , @NamedQuery(name = "Agencies.findByCodeEbilling", query = "SELECT a FROM Agencies a WHERE a.codeEbilling = :codeEbilling")
    , @NamedQuery(name = "Agencies.findByChannelNetrates", query = "SELECT a FROM Agencies a WHERE a.channelNetrates = :channelNetrates")})
public class Agencies implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgenciesPK agenciesPK;
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
    @Size(max = 6)
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
    @Size(max = 80)
    @Column(name = "EMAIL1")
    private String email1;
    @Size(max = 80)
    @Column(name = "EMAIL2")
    private String email2;
    @Size(max = 80)
    @Column(name = "WEBPAGE")
    private String webpage;
    @Size(max = 20)
    @Column(name = "TAXCODE")
    private String taxcode;
    @Size(max = 40)
    @Column(name = "CONTACTPERSON1")
    private String contactperson1;
    @Size(max = 40)
    @Column(name = "CONTACTPERSON2")
    private String contactperson2;
    @Size(max = 40)
    @Column(name = "COMMENT1")
    private String comment1;
    @Size(max = 40)
    @Column(name = "COMMENT2")
    private String comment2;
    @Size(max = 40)
    @Column(name = "COMMENT3")
    private String comment3;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DISCOUNT1")
    private BigDecimal discount1;
    @Column(name = "DISCOUNT2")
    private BigDecimal discount2;
    @Column(name = "DISCOUNT3")
    private BigDecimal discount3;
    @Column(name = "COMM_TYPE")
    private Short commType;
    @Column(name = "COMMISSION1")
    private BigDecimal commission1;
    @Column(name = "COMMISSION2")
    private BigDecimal commission2;
    @Column(name = "COMMISSION3")
    private BigDecimal commission3;
    @Column(name = "COMM_FIXEDTYPE1")
    private Short commFixedtype1;
    @Column(name = "COMM_FIXEDTYPE2")
    private Short commFixedtype2;
    @Column(name = "COMM_FIXEDAMOUNT")
    private BigDecimal commFixedamount;
    @Column(name = "FULLCREDIT")
    private Short fullcredit;
    @Column(name = "ANTIFULLCREDIT")
    private Short antifullcredit;
    @Column(name = "LAYOUTBILL")
    private Short layoutbill;
    @Column(name = "MAXIMUMBALANCE")
    private BigDecimal maximumbalance;
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
    @Column(name = "CRITERIA1")
    private Integer criteria1;
    @Column(name = "CRITERIA2")
    private Integer criteria2;
    @Size(max = 40)
    @Column(name = "TAXNAME")
    private String taxname;
    @Size(max = 80)
    @Column(name = "CHANNEL_WEB")
    private String channelWeb;
    @Size(max = 40)
    @Column(name = "CHANNEL_USER")
    private String channelUser;
    @Size(max = 40)
    @Column(name = "CHANNEL_PASSWORD")
    private String channelPassword;
    @Column(name = "CODE_EBILLING")
    private Long codeEbilling;
    @Column(name = "CHANNEL_NETRATES")
    private Short channelNetrates;

    public Agencies() {
    }

    public Agencies(AgenciesPK agenciesPK) {
        this.agenciesPK = agenciesPK;
    }

    public Agencies(int agencyno, int branchno) {
        this.agenciesPK = new AgenciesPK(agencyno, branchno);
    }

    public AgenciesPK getAgenciesPK() {
        return agenciesPK;
    }

    public void setAgenciesPK(AgenciesPK agenciesPK) {
        this.agenciesPK = agenciesPK;
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

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public String getContactperson1() {
        return contactperson1;
    }

    public void setContactperson1(String contactperson1) {
        this.contactperson1 = contactperson1;
    }

    public String getContactperson2() {
        return contactperson2;
    }

    public void setContactperson2(String contactperson2) {
        this.contactperson2 = contactperson2;
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

    public BigDecimal getDiscount1() {
        return discount1;
    }

    public void setDiscount1(BigDecimal discount1) {
        this.discount1 = discount1;
    }

    public BigDecimal getDiscount2() {
        return discount2;
    }

    public void setDiscount2(BigDecimal discount2) {
        this.discount2 = discount2;
    }

    public BigDecimal getDiscount3() {
        return discount3;
    }

    public void setDiscount3(BigDecimal discount3) {
        this.discount3 = discount3;
    }

    public Short getCommType() {
        return commType;
    }

    public void setCommType(Short commType) {
        this.commType = commType;
    }

    public BigDecimal getCommission1() {
        return commission1;
    }

    public void setCommission1(BigDecimal commission1) {
        this.commission1 = commission1;
    }

    public BigDecimal getCommission2() {
        return commission2;
    }

    public void setCommission2(BigDecimal commission2) {
        this.commission2 = commission2;
    }

    public BigDecimal getCommission3() {
        return commission3;
    }

    public void setCommission3(BigDecimal commission3) {
        this.commission3 = commission3;
    }

    public Short getCommFixedtype1() {
        return commFixedtype1;
    }

    public void setCommFixedtype1(Short commFixedtype1) {
        this.commFixedtype1 = commFixedtype1;
    }

    public Short getCommFixedtype2() {
        return commFixedtype2;
    }

    public void setCommFixedtype2(Short commFixedtype2) {
        this.commFixedtype2 = commFixedtype2;
    }

    public BigDecimal getCommFixedamount() {
        return commFixedamount;
    }

    public void setCommFixedamount(BigDecimal commFixedamount) {
        this.commFixedamount = commFixedamount;
    }

    public Short getFullcredit() {
        return fullcredit;
    }

    public void setFullcredit(Short fullcredit) {
        this.fullcredit = fullcredit;
    }

    public Short getAntifullcredit() {
        return antifullcredit;
    }

    public void setAntifullcredit(Short antifullcredit) {
        this.antifullcredit = antifullcredit;
    }

    public Short getLayoutbill() {
        return layoutbill;
    }

    public void setLayoutbill(Short layoutbill) {
        this.layoutbill = layoutbill;
    }

    public BigDecimal getMaximumbalance() {
        return maximumbalance;
    }

    public void setMaximumbalance(BigDecimal maximumbalance) {
        this.maximumbalance = maximumbalance;
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

    public Integer getCriteria1() {
        return criteria1;
    }

    public void setCriteria1(Integer criteria1) {
        this.criteria1 = criteria1;
    }

    public Integer getCriteria2() {
        return criteria2;
    }

    public void setCriteria2(Integer criteria2) {
        this.criteria2 = criteria2;
    }

    public String getTaxname() {
        return taxname;
    }

    public void setTaxname(String taxname) {
        this.taxname = taxname;
    }

    public String getChannelWeb() {
        return channelWeb;
    }

    public void setChannelWeb(String channelWeb) {
        this.channelWeb = channelWeb;
    }

    public String getChannelUser() {
        return channelUser;
    }

    public void setChannelUser(String channelUser) {
        this.channelUser = channelUser;
    }

    public String getChannelPassword() {
        return channelPassword;
    }

    public void setChannelPassword(String channelPassword) {
        this.channelPassword = channelPassword;
    }

    public Long getCodeEbilling() {
        return codeEbilling;
    }

    public void setCodeEbilling(Long codeEbilling) {
        this.codeEbilling = codeEbilling;
    }

    public Short getChannelNetrates() {
        return channelNetrates;
    }

    public void setChannelNetrates(Short channelNetrates) {
        this.channelNetrates = channelNetrates;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agenciesPK != null ? agenciesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencies)) {
            return false;
        }
        Agencies other = (Agencies) object;
        if ((this.agenciesPK == null && other.agenciesPK != null) || (this.agenciesPK != null && !this.agenciesPK.equals(other.agenciesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Agencies[ agenciesPK=" + agenciesPK + " ]";
    }
    
}
