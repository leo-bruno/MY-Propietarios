/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "BOOKINGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookings.findAll", query = "SELECT b FROM Bookings b")
    , @NamedQuery(name = "Bookings.findByBookingno", query = "SELECT b FROM Bookings b WHERE b.bookingno = :bookingno")
    , @NamedQuery(name = "Bookings.findByDatearrival", query = "SELECT b FROM Bookings b WHERE b.datearrival = :datearrival")
    , @NamedQuery(name = "Bookings.findByDatedeparture", query = "SELECT b FROM Bookings b WHERE b.datedeparture = :datedeparture")
    , @NamedQuery(name = "Bookings.findByClientname", query = "SELECT b FROM Bookings b WHERE b.clientname = :clientname")
    , @NamedQuery(name = "Bookings.findByClientnameclear", query = "SELECT b FROM Bookings b WHERE b.clientnameclear = :clientnameclear")
    , @NamedQuery(name = "Bookings.findByClientno", query = "SELECT b FROM Bookings b WHERE b.clientno = :clientno")
    , @NamedQuery(name = "Bookings.findByStatus", query = "SELECT b FROM Bookings b WHERE b.status = :status")
    , @NamedQuery(name = "Bookings.findByBookingtype", query = "SELECT b FROM Bookings b WHERE b.bookingtype = :bookingtype")
    , @NamedQuery(name = "Bookings.findByOperatortype", query = "SELECT b FROM Bookings b WHERE b.operatortype = :operatortype")
    , @NamedQuery(name = "Bookings.findByOperatorno", query = "SELECT b FROM Bookings b WHERE b.operatorno = :operatorno")
    , @NamedQuery(name = "Bookings.findByOperatorbranch", query = "SELECT b FROM Bookings b WHERE b.operatorbranch = :operatorbranch")
    , @NamedQuery(name = "Bookings.findByRateno", query = "SELECT b FROM Bookings b WHERE b.rateno = :rateno")
    , @NamedQuery(name = "Bookings.findByRatetype", query = "SELECT b FROM Bookings b WHERE b.ratetype = :ratetype")
    , @NamedQuery(name = "Bookings.findByDebitType", query = "SELECT b FROM Bookings b WHERE b.debitType = :debitType")
    , @NamedQuery(name = "Bookings.findByVatIncluded", query = "SELECT b FROM Bookings b WHERE b.vatIncluded = :vatIncluded")
    , @NamedQuery(name = "Bookings.findByDebitConjunct", query = "SELECT b FROM Bookings b WHERE b.debitConjunct = :debitConjunct")
    , @NamedQuery(name = "Bookings.findByPaymentno", query = "SELECT b FROM Bookings b WHERE b.paymentno = :paymentno")
    , @NamedQuery(name = "Bookings.findByFullcredit", query = "SELECT b FROM Bookings b WHERE b.fullcredit = :fullcredit")
    , @NamedQuery(name = "Bookings.findByAntifullcredit", query = "SELECT b FROM Bookings b WHERE b.antifullcredit = :antifullcredit")
    , @NamedQuery(name = "Bookings.findByQuota", query = "SELECT b FROM Bookings b WHERE b.quota = :quota")
    , @NamedQuery(name = "Bookings.findByCreditdepartm", query = "SELECT b FROM Bookings b WHERE b.creditdepartm = :creditdepartm")
    , @NamedQuery(name = "Bookings.findByCreditamount", query = "SELECT b FROM Bookings b WHERE b.creditamount = :creditamount")
    , @NamedQuery(name = "Bookings.findByChargeinit", query = "SELECT b FROM Bookings b WHERE b.chargeinit = :chargeinit")
    , @NamedQuery(name = "Bookings.findByWellcomecard", query = "SELECT b FROM Bookings b WHERE b.wellcomecard = :wellcomecard")
    , @NamedQuery(name = "Bookings.findByLastdatecharged", query = "SELECT b FROM Bookings b WHERE b.lastdatecharged = :lastdatecharged")
    , @NamedQuery(name = "Bookings.findByComments", query = "SELECT b FROM Bookings b WHERE b.comments = :comments")
    , @NamedQuery(name = "Bookings.findByCreateuser", query = "SELECT b FROM Bookings b WHERE b.createuser = :createuser")
    , @NamedQuery(name = "Bookings.findByCreateposition", query = "SELECT b FROM Bookings b WHERE b.createposition = :createposition")
    , @NamedQuery(name = "Bookings.findByModifyuser", query = "SELECT b FROM Bookings b WHERE b.modifyuser = :modifyuser")
    , @NamedQuery(name = "Bookings.findByModifyposition", query = "SELECT b FROM Bookings b WHERE b.modifyposition = :modifyposition")
    , @NamedQuery(name = "Bookings.findByCreatetimestamp", query = "SELECT b FROM Bookings b WHERE b.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "Bookings.findByModifytimestamp", query = "SELECT b FROM Bookings b WHERE b.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "Bookings.findByWebChannel", query = "SELECT b FROM Bookings b WHERE b.webChannel = :webChannel")
    , @NamedQuery(name = "Bookings.findByPolicedatano", query = "SELECT b FROM Bookings b WHERE b.policedatano = :policedatano")})
public class Bookings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOOKINGNO")
    private Long bookingno;
    @Column(name = "DATEARRIVAL")
    @Temporal(TemporalType.DATE)
    private Date datearrival;
    @Column(name = "DATEDEPARTURE")
    @Temporal(TemporalType.DATE)
    private Date datedeparture;
    @Size(max = 120)
    @Column(name = "CLIENTNAME")
    private String clientname;
    @Size(max = 120)
    @Column(name = "CLIENTNAMECLEAR")
    private String clientnameclear;
    @Column(name = "CLIENTNO")
    private Long clientno;
    @Column(name = "STATUS")
    private Short status;
    @Column(name = "BOOKINGTYPE")
    private Integer bookingtype;
    @Column(name = "OPERATORTYPE")
    private Short operatortype;
    @Column(name = "OPERATORNO")
    private Integer operatorno;
    @Column(name = "OPERATORBRANCH")
    private Integer operatorbranch;
    @Column(name = "RATENO")
    private Integer rateno;
    @Column(name = "RATETYPE")
    private Short ratetype;
    @Column(name = "DEBIT_TYPE")
    private Short debitType;
    @Column(name = "VAT_INCLUDED")
    private Short vatIncluded;
    @Column(name = "DEBIT_CONJUNCT")
    private Short debitConjunct;
    @Column(name = "PAYMENTNO")
    private Integer paymentno;
    @Column(name = "FULLCREDIT")
    private Short fullcredit;
    @Column(name = "ANTIFULLCREDIT")
    private Short antifullcredit;
    @Column(name = "QUOTA")
    private Short quota;
    @Column(name = "CREDITDEPARTM")
    private Short creditdepartm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CREDITAMOUNT")
    private BigDecimal creditamount;
    @Column(name = "CHARGEINIT")
    private Short chargeinit;
    @Column(name = "WELLCOMECARD")
    private Short wellcomecard;
    @Column(name = "LASTDATECHARGED")
    @Temporal(TemporalType.DATE)
    private Date lastdatecharged;
    @Size(max = 80)
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "CREATEUSER")
    private Integer createuser;
    @Column(name = "CREATEPOSITION")
    private Integer createposition;
    @Column(name = "MODIFYUSER")
    private Integer modifyuser;
    @Column(name = "MODIFYPOSITION")
    private Integer modifyposition;
    @Column(name = "CREATETIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtimestamp;
    @Column(name = "MODIFYTIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifytimestamp;
    @Column(name = "WEB_CHANNEL")
    private Short webChannel;
    @Column(name = "POLICEDATANO")
    private Long policedatano;
    @JoinColumn(name = "BUILDINGNO", referencedColumnName = "BUILDINGNO")
    @ManyToOne(optional = false)
    private Buildings buildingno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookings")
    private Collection<BookingsObjects> bookingsObjectsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookings")
    private Collection<BookingsObjectstype> bookingsObjectstypeCollection;

    public Bookings() {
    }

    public Bookings(Long bookingno) {
        this.bookingno = bookingno;
    }

    public Long getBookingno() {
        return bookingno;
    }

    public void setBookingno(Long bookingno) {
        this.bookingno = bookingno;
    }

    public Date getDatearrival() {
        return datearrival;
    }

    public void setDatearrival(Date datearrival) {
        this.datearrival = datearrival;
    }

    public Date getDatedeparture() {
        return datedeparture;
    }

    public void setDatedeparture(Date datedeparture) {
        this.datedeparture = datedeparture;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientnameclear() {
        return clientnameclear;
    }

    public void setClientnameclear(String clientnameclear) {
        this.clientnameclear = clientnameclear;
    }

    public Long getClientno() {
        return clientno;
    }

    public void setClientno(Long clientno) {
        this.clientno = clientno;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getBookingtype() {
        return bookingtype;
    }

    public void setBookingtype(Integer bookingtype) {
        this.bookingtype = bookingtype;
    }

    public Short getOperatortype() {
        return operatortype;
    }

    public void setOperatortype(Short operatortype) {
        this.operatortype = operatortype;
    }

    public Integer getOperatorno() {
        return operatorno;
    }

    public void setOperatorno(Integer operatorno) {
        this.operatorno = operatorno;
    }

    public Integer getOperatorbranch() {
        return operatorbranch;
    }

    public void setOperatorbranch(Integer operatorbranch) {
        this.operatorbranch = operatorbranch;
    }

    public Integer getRateno() {
        return rateno;
    }

    public void setRateno(Integer rateno) {
        this.rateno = rateno;
    }

    public Short getRatetype() {
        return ratetype;
    }

    public void setRatetype(Short ratetype) {
        this.ratetype = ratetype;
    }

    public Short getDebitType() {
        return debitType;
    }

    public void setDebitType(Short debitType) {
        this.debitType = debitType;
    }

    public Short getVatIncluded() {
        return vatIncluded;
    }

    public void setVatIncluded(Short vatIncluded) {
        this.vatIncluded = vatIncluded;
    }

    public Short getDebitConjunct() {
        return debitConjunct;
    }

    public void setDebitConjunct(Short debitConjunct) {
        this.debitConjunct = debitConjunct;
    }

    public Integer getPaymentno() {
        return paymentno;
    }

    public void setPaymentno(Integer paymentno) {
        this.paymentno = paymentno;
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

    public Short getQuota() {
        return quota;
    }

    public void setQuota(Short quota) {
        this.quota = quota;
    }

    public Short getCreditdepartm() {
        return creditdepartm;
    }

    public void setCreditdepartm(Short creditdepartm) {
        this.creditdepartm = creditdepartm;
    }

    public BigDecimal getCreditamount() {
        return creditamount;
    }

    public void setCreditamount(BigDecimal creditamount) {
        this.creditamount = creditamount;
    }

    public Short getChargeinit() {
        return chargeinit;
    }

    public void setChargeinit(Short chargeinit) {
        this.chargeinit = chargeinit;
    }

    public Short getWellcomecard() {
        return wellcomecard;
    }

    public void setWellcomecard(Short wellcomecard) {
        this.wellcomecard = wellcomecard;
    }

    public Date getLastdatecharged() {
        return lastdatecharged;
    }

    public void setLastdatecharged(Date lastdatecharged) {
        this.lastdatecharged = lastdatecharged;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public Short getWebChannel() {
        return webChannel;
    }

    public void setWebChannel(Short webChannel) {
        this.webChannel = webChannel;
    }

    public Long getPolicedatano() {
        return policedatano;
    }

    public void setPolicedatano(Long policedatano) {
        this.policedatano = policedatano;
    }

    public Buildings getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(Buildings buildingno) {
        this.buildingno = buildingno;
    }

    @XmlTransient
    public Collection<BookingsObjects> getBookingsObjectsCollection() {
        return bookingsObjectsCollection;
    }

    public void setBookingsObjectsCollection(Collection<BookingsObjects> bookingsObjectsCollection) {
        this.bookingsObjectsCollection = bookingsObjectsCollection;
    }

    @XmlTransient
    public Collection<BookingsObjectstype> getBookingsObjectstypeCollection() {
        return bookingsObjectstypeCollection;
    }

    public void setBookingsObjectstypeCollection(Collection<BookingsObjectstype> bookingsObjectstypeCollection) {
        this.bookingsObjectstypeCollection = bookingsObjectstypeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingno != null ? bookingno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookings)) {
            return false;
        }
        Bookings other = (Bookings) object;
        if ((this.bookingno == null && other.bookingno != null) || (this.bookingno != null && !this.bookingno.equals(other.bookingno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bookings[ bookingno=" + bookingno + " ]";
    }
    
}
