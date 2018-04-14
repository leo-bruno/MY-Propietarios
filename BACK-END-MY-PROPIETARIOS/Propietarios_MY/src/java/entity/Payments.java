/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "PAYMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payments.findAll", query = "SELECT p FROM Payments p")
    , @NamedQuery(name = "Payments.findByPaymentno", query = "SELECT p FROM Payments p WHERE p.paymentno = :paymentno")
    , @NamedQuery(name = "Payments.findByBookingno", query = "SELECT p FROM Payments p WHERE p.bookingno = :bookingno")
    , @NamedQuery(name = "Payments.findByRoominglistno", query = "SELECT p FROM Payments p WHERE p.roominglistno = :roominglistno")
    , @NamedQuery(name = "Payments.findByIntno2Credcard", query = "SELECT p FROM Payments p WHERE p.intno2Credcard = :intno2Credcard")
    , @NamedQuery(name = "Payments.findByPaymentdate", query = "SELECT p FROM Payments p WHERE p.paymentdate = :paymentdate")
    , @NamedQuery(name = "Payments.findByAmount", query = "SELECT p FROM Payments p WHERE p.amount = :amount")
    , @NamedQuery(name = "Payments.findByPaymentformno", query = "SELECT p FROM Payments p WHERE p.paymentformno = :paymentformno")
    , @NamedQuery(name = "Payments.findByTypeno", query = "SELECT p FROM Payments p WHERE p.typeno = :typeno")
    , @NamedQuery(name = "Payments.findByAccounted", query = "SELECT p FROM Payments p WHERE p.accounted = :accounted")
    , @NamedQuery(name = "Payments.findByCreatetimestamp", query = "SELECT p FROM Payments p WHERE p.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "Payments.findByModifytimestamp", query = "SELECT p FROM Payments p WHERE p.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "Payments.findByCreateuser", query = "SELECT p FROM Payments p WHERE p.createuser = :createuser")
    , @NamedQuery(name = "Payments.findByCreateposition", query = "SELECT p FROM Payments p WHERE p.createposition = :createposition")
    , @NamedQuery(name = "Payments.findByModifyuser", query = "SELECT p FROM Payments p WHERE p.modifyuser = :modifyuser")
    , @NamedQuery(name = "Payments.findByModifyposition", query = "SELECT p FROM Payments p WHERE p.modifyposition = :modifyposition")
    , @NamedQuery(name = "Payments.findByBuildingno", query = "SELECT p FROM Payments p WHERE p.buildingno = :buildingno")
    , @NamedQuery(name = "Payments.findByGatewayAuthcode", query = "SELECT p FROM Payments p WHERE p.gatewayAuthcode = :gatewayAuthcode")
    , @NamedQuery(name = "Payments.findByGatewayReference", query = "SELECT p FROM Payments p WHERE p.gatewayReference = :gatewayReference")
    , @NamedQuery(name = "Payments.findByGatewayResult", query = "SELECT p FROM Payments p WHERE p.gatewayResult = :gatewayResult")})
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAYMENTNO")
    private Long paymentno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOOKINGNO")
    private long bookingno;
    @Column(name = "ROOMINGLISTNO")
    private Long roominglistno;
    @Column(name = "INTNO2_CREDCARD")
    private Long intno2Credcard;
    @Column(name = "PAYMENTDATE")
    @Temporal(TemporalType.DATE)
    private Date paymentdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "PAYMENTFORMNO")
    private Integer paymentformno;
    @Column(name = "TYPENO")
    private Short typeno;
    @Column(name = "ACCOUNTED")
    private Short accounted;
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
    @Column(name = "BUILDINGNO")
    private Integer buildingno;
    @Size(max = 20)
    @Column(name = "GATEWAY_AUTHCODE")
    private String gatewayAuthcode;
    @Size(max = 80)
    @Column(name = "GATEWAY_REFERENCE")
    private String gatewayReference;
    @Column(name = "GATEWAY_RESULT")
    private Short gatewayResult;

    public Payments() {
    }

    public Payments(Long paymentno) {
        this.paymentno = paymentno;
    }

    public Payments(Long paymentno, long bookingno) {
        this.paymentno = paymentno;
        this.bookingno = bookingno;
    }

    public Long getPaymentno() {
        return paymentno;
    }

    public void setPaymentno(Long paymentno) {
        this.paymentno = paymentno;
    }

    public long getBookingno() {
        return bookingno;
    }

    public void setBookingno(long bookingno) {
        this.bookingno = bookingno;
    }

    public Long getRoominglistno() {
        return roominglistno;
    }

    public void setRoominglistno(Long roominglistno) {
        this.roominglistno = roominglistno;
    }

    public Long getIntno2Credcard() {
        return intno2Credcard;
    }

    public void setIntno2Credcard(Long intno2Credcard) {
        this.intno2Credcard = intno2Credcard;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPaymentformno() {
        return paymentformno;
    }

    public void setPaymentformno(Integer paymentformno) {
        this.paymentformno = paymentformno;
    }

    public Short getTypeno() {
        return typeno;
    }

    public void setTypeno(Short typeno) {
        this.typeno = typeno;
    }

    public Short getAccounted() {
        return accounted;
    }

    public void setAccounted(Short accounted) {
        this.accounted = accounted;
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

    public Integer getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(Integer buildingno) {
        this.buildingno = buildingno;
    }

    public String getGatewayAuthcode() {
        return gatewayAuthcode;
    }

    public void setGatewayAuthcode(String gatewayAuthcode) {
        this.gatewayAuthcode = gatewayAuthcode;
    }

    public String getGatewayReference() {
        return gatewayReference;
    }

    public void setGatewayReference(String gatewayReference) {
        this.gatewayReference = gatewayReference;
    }

    public Short getGatewayResult() {
        return gatewayResult;
    }

    public void setGatewayResult(Short gatewayResult) {
        this.gatewayResult = gatewayResult;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentno != null ? paymentno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.paymentno == null && other.paymentno != null) || (this.paymentno != null && !this.paymentno.equals(other.paymentno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Payments[ paymentno=" + paymentno + " ]";
    }
    
}
