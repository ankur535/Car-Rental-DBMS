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
@Table(name = "billing", catalog = "car_rental", schema = "")
@NamedQueries({
    @NamedQuery(name = "Billing.findAll", query = "SELECT b FROM Billing b")
    , @NamedQuery(name = "Billing.findByBillid", query = "SELECT b FROM Billing b WHERE b.billid = :billid")
    , @NamedQuery(name = "Billing.findByBillDate", query = "SELECT b FROM Billing b WHERE b.billDate = :billDate")
    , @NamedQuery(name = "Billing.findByAmt", query = "SELECT b FROM Billing b WHERE b.amt = :amt")
    , @NamedQuery(name = "Billing.findByActDur", query = "SELECT b FROM Billing b WHERE b.actDur = :actDur")
    , @NamedQuery(name = "Billing.findByLatefee", query = "SELECT b FROM Billing b WHERE b.latefee = :latefee")
    , @NamedQuery(name = "Billing.findByTax", query = "SELECT b FROM Billing b WHERE b.tax = :tax")
    , @NamedQuery(name = "Billing.findByTotalamt", query = "SELECT b FROM Billing b WHERE b.totalamt = :totalamt")
    , @NamedQuery(name = "Billing.findByBookid", query = "SELECT b FROM Billing b WHERE b.bookid = :bookid")})
public class Billing implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Bill_id")
    private Integer billid;
    @Column(name = "bill_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date billDate;
    @Column(name = "Amt")
    private Integer amt;
    @Column(name = "act_dur")
    private Integer actDur;
    @Column(name = "Late_fee")
    private Integer latefee;
    @Column(name = "Tax")
    private Integer tax;
    @Column(name = "Total_amt")
    private Integer totalamt;
    @Column(name = "Book_id")
    private Integer bookid;

    public Billing() {
    }

    public Billing(Integer billid) {
        this.billid = billid;
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        Integer oldBillid = this.billid;
        this.billid = billid;
        changeSupport.firePropertyChange("billid", oldBillid, billid);
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        Date oldBillDate = this.billDate;
        this.billDate = billDate;
        changeSupport.firePropertyChange("billDate", oldBillDate, billDate);
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        Integer oldAmt = this.amt;
        this.amt = amt;
        changeSupport.firePropertyChange("amt", oldAmt, amt);
    }

    public Integer getActDur() {
        return actDur;
    }

    public void setActDur(Integer actDur) {
        Integer oldActDur = this.actDur;
        this.actDur = actDur;
        changeSupport.firePropertyChange("actDur", oldActDur, actDur);
    }

    public Integer getLatefee() {
        return latefee;
    }

    public void setLatefee(Integer latefee) {
        Integer oldLatefee = this.latefee;
        this.latefee = latefee;
        changeSupport.firePropertyChange("latefee", oldLatefee, latefee);
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        Integer oldTax = this.tax;
        this.tax = tax;
        changeSupport.firePropertyChange("tax", oldTax, tax);
    }

    public Integer getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(Integer totalamt) {
        Integer oldTotalamt = this.totalamt;
        this.totalamt = totalamt;
        changeSupport.firePropertyChange("totalamt", oldTotalamt, totalamt);
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        Integer oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billid != null ? billid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billing)) {
            return false;
        }
        Billing other = (Billing) object;
        if ((this.billid == null && other.billid != null) || (this.billid != null && !this.billid.equals(other.billid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "car_rental.Billing[ billid=" + billid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
