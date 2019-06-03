/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rental;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author ankur
 */
@Entity
@Table(name = "booking", catalog = "car_rental", schema = "")
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
    , @NamedQuery(name = "Booking.findByBookid", query = "SELECT b FROM Booking b WHERE b.bookid = :bookid")
    , @NamedQuery(name = "Booking.findByFromDT", query = "SELECT b FROM Booking b WHERE b.fromDT = :fromDT")
    , @NamedQuery(name = "Booking.findByDuration", query = "SELECT b FROM Booking b WHERE b.duration = :duration")
    , @NamedQuery(name = "Booking.findByReturnDT", query = "SELECT b FROM Booking b WHERE b.returnDT = :returnDT")
    , @NamedQuery(name = "Booking.findByAmt", query = "SELECT b FROM Booking b WHERE b.amt = :amt")
    , @NamedQuery(name = "Booking.findByCarid", query = "SELECT b FROM Booking b WHERE b.carid = :carid")
    , @NamedQuery(name = "Booking.findByCId", query = "SELECT b FROM Booking b WHERE b.cId = :cId")})
public class Booking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Book_id")
    private Integer bookid;
    @Column(name = "From_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDT;
    @Column(name = "Duration")
    private Integer duration;
    @Column(name = "Return_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnDT;
    @Column(name = "Amt")
    private String amt;
    @Column(name = "Car_id")
    private Integer carid;
    @Column(name = "c_id")
    private Integer cId;

    public Booking() {
    }

    public Booking(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        Integer oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    public Date getFromDT() {
        return fromDT;
    }

    public void setFromDT(Date fromDT) {
        Date oldFromDT = this.fromDT;
        this.fromDT = fromDT;
        changeSupport.firePropertyChange("fromDT", oldFromDT, fromDT);
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        Integer oldDuration = this.duration;
        this.duration = duration;
        changeSupport.firePropertyChange("duration", oldDuration, duration);
    }

    public Date getReturnDT() {
        return returnDT;
    }

    public void setReturnDT(Date returnDT) {
        Date oldReturnDT = this.returnDT;
        this.returnDT = returnDT;
        changeSupport.firePropertyChange("returnDT", oldReturnDT, returnDT);
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        String oldAmt = this.amt;
        this.amt = amt;
        changeSupport.firePropertyChange("amt", oldAmt, amt);
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        Integer oldCarid = this.carid;
        this.carid = carid;
        changeSupport.firePropertyChange("carid", oldCarid, carid);
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        Integer oldCId = this.cId;
        this.cId = cId;
        changeSupport.firePropertyChange("CId", oldCId, cId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "car_rental.Booking[ bookid=" + bookid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
