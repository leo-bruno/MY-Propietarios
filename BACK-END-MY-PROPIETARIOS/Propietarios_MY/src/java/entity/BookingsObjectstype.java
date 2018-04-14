/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "BOOKINGS_OBJECTSTYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookingsObjectstype.findAll", query = "SELECT b FROM BookingsObjectstype b")
    , @NamedQuery(name = "BookingsObjectstype.findByBookingno", query = "SELECT b FROM BookingsObjectstype b WHERE b.bookingsObjectstypePK.bookingno = :bookingno")
    , @NamedQuery(name = "BookingsObjectstype.findByInternalno", query = "SELECT b FROM BookingsObjectstype b WHERE b.bookingsObjectstypePK.internalno = :internalno")
    , @NamedQuery(name = "BookingsObjectstype.findByQuantity", query = "SELECT b FROM BookingsObjectstype b WHERE b.quantity = :quantity")
    , @NamedQuery(name = "BookingsObjectstype.findByCategoryno", query = "SELECT b FROM BookingsObjectstype b WHERE b.categoryno = :categoryno")
    , @NamedQuery(name = "BookingsObjectstype.findBySubcategoryno", query = "SELECT b FROM BookingsObjectstype b WHERE b.subcategoryno = :subcategoryno")
    , @NamedQuery(name = "BookingsObjectstype.findByOperatordebit", query = "SELECT b FROM BookingsObjectstype b WHERE b.operatordebit = :operatordebit")
    , @NamedQuery(name = "BookingsObjectstype.findByCreatetimestamp", query = "SELECT b FROM BookingsObjectstype b WHERE b.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "BookingsObjectstype.findByModifytimestamp", query = "SELECT b FROM BookingsObjectstype b WHERE b.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "BookingsObjectstype.findByCreateuser", query = "SELECT b FROM BookingsObjectstype b WHERE b.createuser = :createuser")
    , @NamedQuery(name = "BookingsObjectstype.findByCreateposition", query = "SELECT b FROM BookingsObjectstype b WHERE b.createposition = :createposition")
    , @NamedQuery(name = "BookingsObjectstype.findByModifyuser", query = "SELECT b FROM BookingsObjectstype b WHERE b.modifyuser = :modifyuser")
    , @NamedQuery(name = "BookingsObjectstype.findByModifyposition", query = "SELECT b FROM BookingsObjectstype b WHERE b.modifyposition = :modifyposition")
    , @NamedQuery(name = "BookingsObjectstype.findByVirtualno", query = "SELECT b FROM BookingsObjectstype b WHERE b.virtualno = :virtualno")})
public class BookingsObjectstype implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BookingsObjectstypePK bookingsObjectstypePK;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "CATEGORYNO")
    private Integer categoryno;
    @Column(name = "SUBCATEGORYNO")
    private Integer subcategoryno;
    @Column(name = "OPERATORDEBIT")
    private Short operatordebit;
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
    @Column(name = "VIRTUALNO")
    private Integer virtualno;
    @JoinColumn(name = "BOOKINGNO", referencedColumnName = "BOOKINGNO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bookings bookings;

    public BookingsObjectstype() {
    }

    public BookingsObjectstype(BookingsObjectstypePK bookingsObjectstypePK) {
        this.bookingsObjectstypePK = bookingsObjectstypePK;
    }

    public BookingsObjectstype(long bookingno, long internalno) {
        this.bookingsObjectstypePK = new BookingsObjectstypePK(bookingno, internalno);
    }

    public BookingsObjectstypePK getBookingsObjectstypePK() {
        return bookingsObjectstypePK;
    }

    public void setBookingsObjectstypePK(BookingsObjectstypePK bookingsObjectstypePK) {
        this.bookingsObjectstypePK = bookingsObjectstypePK;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public Short getOperatordebit() {
        return operatordebit;
    }

    public void setOperatordebit(Short operatordebit) {
        this.operatordebit = operatordebit;
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

    public Integer getVirtualno() {
        return virtualno;
    }

    public void setVirtualno(Integer virtualno) {
        this.virtualno = virtualno;
    }

    public Bookings getBookings() {
        return bookings;
    }

    public void setBookings(Bookings bookings) {
        this.bookings = bookings;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingsObjectstypePK != null ? bookingsObjectstypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookingsObjectstype)) {
            return false;
        }
        BookingsObjectstype other = (BookingsObjectstype) object;
        if ((this.bookingsObjectstypePK == null && other.bookingsObjectstypePK != null) || (this.bookingsObjectstypePK != null && !this.bookingsObjectstypePK.equals(other.bookingsObjectstypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BookingsObjectstype[ bookingsObjectstypePK=" + bookingsObjectstypePK + " ]";
    }
    
}
