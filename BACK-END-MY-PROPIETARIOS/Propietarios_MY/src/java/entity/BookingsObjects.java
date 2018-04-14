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
import javax.persistence.JoinColumns;
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
@Table(name = "BOOKINGS_OBJECTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookingsObjects.findAll", query = "SELECT b FROM BookingsObjects b")
    , @NamedQuery(name = "BookingsObjects.findByBookingno", query = "SELECT b FROM BookingsObjects b WHERE b.bookingsObjectsPK.bookingno = :bookingno")
    , @NamedQuery(name = "BookingsObjects.findByInternalno", query = "SELECT b FROM BookingsObjects b WHERE b.bookingsObjectsPK.internalno = :internalno")
    , @NamedQuery(name = "BookingsObjects.findByRoominglistno", query = "SELECT b FROM BookingsObjects b WHERE b.roominglistno = :roominglistno")
    , @NamedQuery(name = "BookingsObjects.findByRoominglistnoprov", query = "SELECT b FROM BookingsObjects b WHERE b.roominglistnoprov = :roominglistnoprov")
    , @NamedQuery(name = "BookingsObjects.findByObjectreservno", query = "SELECT b FROM BookingsObjects b WHERE b.objectreservno = :objectreservno")
    , @NamedQuery(name = "BookingsObjects.findByObjectreservno2", query = "SELECT b FROM BookingsObjects b WHERE b.objectreservno2 = :objectreservno2")
    , @NamedQuery(name = "BookingsObjects.findByBuildingno", query = "SELECT b FROM BookingsObjects b WHERE b.buildingno = :buildingno")
    , @NamedQuery(name = "BookingsObjects.findByObjectno", query = "SELECT b FROM BookingsObjects b WHERE b.objectno = :objectno")
    , @NamedQuery(name = "BookingsObjects.findByDatefrom", query = "SELECT b FROM BookingsObjects b WHERE b.datefrom = :datefrom")
    , @NamedQuery(name = "BookingsObjects.findByDateto", query = "SELECT b FROM BookingsObjects b WHERE b.dateto = :dateto")
    , @NamedQuery(name = "BookingsObjects.findByTimefrom", query = "SELECT b FROM BookingsObjects b WHERE b.timefrom = :timefrom")
    , @NamedQuery(name = "BookingsObjects.findByTimeto", query = "SELECT b FROM BookingsObjects b WHERE b.timeto = :timeto")
    , @NamedQuery(name = "BookingsObjects.findByIntervalfrom", query = "SELECT b FROM BookingsObjects b WHERE b.intervalfrom = :intervalfrom")
    , @NamedQuery(name = "BookingsObjects.findByIntervalto", query = "SELECT b FROM BookingsObjects b WHERE b.intervalto = :intervalto")
    , @NamedQuery(name = "BookingsObjects.findByCreatetimestamp", query = "SELECT b FROM BookingsObjects b WHERE b.createtimestamp = :createtimestamp")
    , @NamedQuery(name = "BookingsObjects.findByModifytimestamp", query = "SELECT b FROM BookingsObjects b WHERE b.modifytimestamp = :modifytimestamp")
    , @NamedQuery(name = "BookingsObjects.findByCreateuser", query = "SELECT b FROM BookingsObjects b WHERE b.createuser = :createuser")
    , @NamedQuery(name = "BookingsObjects.findByCreateposition", query = "SELECT b FROM BookingsObjects b WHERE b.createposition = :createposition")
    , @NamedQuery(name = "BookingsObjects.findByModifyuser", query = "SELECT b FROM BookingsObjects b WHERE b.modifyuser = :modifyuser")
    , @NamedQuery(name = "BookingsObjects.findByModifyposition", query = "SELECT b FROM BookingsObjects b WHERE b.modifyposition = :modifyposition")
    , @NamedQuery(name = "BookingsObjects.findByChangeno", query = "SELECT b FROM BookingsObjects b WHERE b.changeno = :changeno")
    , @NamedQuery(name = "BookingsObjects.findByVirtualno", query = "SELECT b FROM BookingsObjects b WHERE b.virtualno = :virtualno")})
public class BookingsObjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BookingsObjectsPK bookingsObjectsPK;
    @Column(name = "ROOMINGLISTNO")
    private Long roominglistno;
    @Column(name = "ROOMINGLISTNOPROV")
    private Long roominglistnoprov;
    @Column(name = "OBJECTRESERVNO")
    private Long objectreservno;
    @Column(name = "OBJECTRESERVNO2")
    private Long objectreservno2;
    @Column(name = "BUILDINGNO")
    private Integer buildingno;
    @Size(max = 6)
    @Column(name = "OBJECTNO")
    private String objectno;
    @Column(name = "DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date datefrom;
    @Column(name = "DATETO")
    @Temporal(TemporalType.DATE)
    private Date dateto;
    @Column(name = "TIMEFROM")
    @Temporal(TemporalType.TIME)
    private Date timefrom;
    @Column(name = "TIMETO")
    @Temporal(TemporalType.TIME)
    private Date timeto;
    @Column(name = "INTERVALFROM")
    private Short intervalfrom;
    @Column(name = "INTERVALTO")
    private Short intervalto;
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
    @Column(name = "CHANGENO")
    private Long changeno;
    @Column(name = "VIRTUALNO")
    private Integer virtualno;
    @JoinColumn(name = "BOOKINGNO", referencedColumnName = "BOOKINGNO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bookings bookings;
    @JoinColumns({
        @JoinColumn(name = "CATEGORYNO", referencedColumnName = "CATEGORYNO")
        , @JoinColumn(name = "SUBCATEGORYNO", referencedColumnName = "SUBCATEGORYNO")})
    @ManyToOne
    private Categories categories;

    public BookingsObjects() {
    }

    public BookingsObjects(BookingsObjectsPK bookingsObjectsPK) {
        this.bookingsObjectsPK = bookingsObjectsPK;
    }

    public BookingsObjects(long bookingno, long internalno) {
        this.bookingsObjectsPK = new BookingsObjectsPK(bookingno, internalno);
    }

    public BookingsObjectsPK getBookingsObjectsPK() {
        return bookingsObjectsPK;
    }

    public void setBookingsObjectsPK(BookingsObjectsPK bookingsObjectsPK) {
        this.bookingsObjectsPK = bookingsObjectsPK;
    }

    public Long getRoominglistno() {
        return roominglistno;
    }

    public void setRoominglistno(Long roominglistno) {
        this.roominglistno = roominglistno;
    }

    public Long getRoominglistnoprov() {
        return roominglistnoprov;
    }

    public void setRoominglistnoprov(Long roominglistnoprov) {
        this.roominglistnoprov = roominglistnoprov;
    }

    public Long getObjectreservno() {
        return objectreservno;
    }

    public void setObjectreservno(Long objectreservno) {
        this.objectreservno = objectreservno;
    }

    public Long getObjectreservno2() {
        return objectreservno2;
    }

    public void setObjectreservno2(Long objectreservno2) {
        this.objectreservno2 = objectreservno2;
    }

    public Integer getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(Integer buildingno) {
        this.buildingno = buildingno;
    }

    public String getObjectno() {
        return objectno;
    }

    public void setObjectno(String objectno) {
        this.objectno = objectno;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDateto() {
        return dateto;
    }

    public void setDateto(Date dateto) {
        this.dateto = dateto;
    }

    public Date getTimefrom() {
        return timefrom;
    }

    public void setTimefrom(Date timefrom) {
        this.timefrom = timefrom;
    }

    public Date getTimeto() {
        return timeto;
    }

    public void setTimeto(Date timeto) {
        this.timeto = timeto;
    }

    public Short getIntervalfrom() {
        return intervalfrom;
    }

    public void setIntervalfrom(Short intervalfrom) {
        this.intervalfrom = intervalfrom;
    }

    public Short getIntervalto() {
        return intervalto;
    }

    public void setIntervalto(Short intervalto) {
        this.intervalto = intervalto;
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

    public Long getChangeno() {
        return changeno;
    }

    public void setChangeno(Long changeno) {
        this.changeno = changeno;
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

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingsObjectsPK != null ? bookingsObjectsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookingsObjects)) {
            return false;
        }
        BookingsObjects other = (BookingsObjects) object;
        if ((this.bookingsObjectsPK == null && other.bookingsObjectsPK != null) || (this.bookingsObjectsPK != null && !this.bookingsObjectsPK.equals(other.bookingsObjectsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BookingsObjects[ bookingsObjectsPK=" + bookingsObjectsPK + " ]";
    }
    
}
