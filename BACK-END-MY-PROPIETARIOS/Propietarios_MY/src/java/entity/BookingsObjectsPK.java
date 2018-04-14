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
public class BookingsObjectsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "BOOKINGNO")
    private long bookingno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INTERNALNO")
    private long internalno;

    public BookingsObjectsPK() {
    }

    public BookingsObjectsPK(long bookingno, long internalno) {
        this.bookingno = bookingno;
        this.internalno = internalno;
    }

    public long getBookingno() {
        return bookingno;
    }

    public void setBookingno(long bookingno) {
        this.bookingno = bookingno;
    }

    public long getInternalno() {
        return internalno;
    }

    public void setInternalno(long internalno) {
        this.internalno = internalno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) bookingno;
        hash += (int) internalno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookingsObjectsPK)) {
            return false;
        }
        BookingsObjectsPK other = (BookingsObjectsPK) object;
        if (this.bookingno != other.bookingno) {
            return false;
        }
        if (this.internalno != other.internalno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BookingsObjectsPK[ bookingno=" + bookingno + ", internalno=" + internalno + " ]";
    }
    
}
