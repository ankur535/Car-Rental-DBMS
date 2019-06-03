/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rental;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ankur
 */
@Entity
@Table(name = "customer", catalog = "car_rental", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCid", query = "SELECT c FROM Customer c WHERE c.cid = :cid")
    , @NamedQuery(name = "Customer.findByFname", query = "SELECT c FROM Customer c WHERE c.fname = :fname")
    , @NamedQuery(name = "Customer.findByLname", query = "SELECT c FROM Customer c WHERE c.lname = :lname")
    , @NamedQuery(name = "Customer.findByPhoneno", query = "SELECT c FROM Customer c WHERE c.phoneno = :phoneno")
    , @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email")
    , @NamedQuery(name = "Customer.findByDLno", query = "SELECT c FROM Customer c WHERE c.dLno = :dLno")
    , @NamedQuery(name = "Customer.findByStreet", query = "SELECT c FROM Customer c WHERE c.street = :street")
    , @NamedQuery(name = "Customer.findByArea", query = "SELECT c FROM Customer c WHERE c.area = :area")
    , @NamedQuery(name = "Customer.findByZip", query = "SELECT c FROM Customer c WHERE c.zip = :zip")
    , @NamedQuery(name = "Customer.findByPassword", query = "SELECT c FROM Customer c WHERE c.password = :password")})
public class Customer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "C_id")
    private Integer cid;
    @Basic(optional = false)
    @Column(name = "Fname")
    private String fname;
    @Basic(optional = false)
    @Column(name = "Lname")
    private String lname;
    @Basic(optional = false)
    @Column(name = "Phone_no")
    private String phoneno;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "DL_no")
    private String dLno;
    @Basic(optional = false)
    @Column(name = "Street")
    private String street;
    @Column(name = "Area")
    private String area;
    @Column(name = "Zip")
    private Integer zip;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;

    public Customer() {
    }

    public Customer(Integer cid) {
        this.cid = cid;
    }

    public Customer(Integer cid, String fname, String lname, String phoneno, String email, String dLno, String street, String password) {
        this.cid = cid;
        this.fname = fname;
        this.lname = lname;
        this.phoneno = phoneno;
        this.email = email;
        this.dLno = dLno;
        this.street = street;
        this.password = password;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        Integer oldCid = this.cid;
        this.cid = cid;
        changeSupport.firePropertyChange("cid", oldCid, cid);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        String oldLname = this.lname;
        this.lname = lname;
        changeSupport.firePropertyChange("lname", oldLname, lname);
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        String oldPhoneno = this.phoneno;
        this.phoneno = phoneno;
        changeSupport.firePropertyChange("phoneno", oldPhoneno, phoneno);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getDLno() {
        return dLno;
    }

    public void setDLno(String dLno) {
        String oldDLno = this.dLno;
        this.dLno = dLno;
        changeSupport.firePropertyChange("DLno", oldDLno, dLno);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        String oldStreet = this.street;
        this.street = street;
        changeSupport.firePropertyChange("street", oldStreet, street);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        String oldArea = this.area;
        this.area = area;
        changeSupport.firePropertyChange("area", oldArea, area);
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        Integer oldZip = this.zip;
        this.zip = zip;
        changeSupport.firePropertyChange("zip", oldZip, zip);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "car_rental.Customer[ cid=" + cid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
