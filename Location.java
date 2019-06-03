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
@Table(name = "location", catalog = "car_rental", schema = "")
@NamedQueries({
    @NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
    , @NamedQuery(name = "Location.findByLocid", query = "SELECT l FROM Location l WHERE l.locid = :locid")
    , @NamedQuery(name = "Location.findByLocname", query = "SELECT l FROM Location l WHERE l.locname = :locname")
    , @NamedQuery(name = "Location.findByStreet", query = "SELECT l FROM Location l WHERE l.street = :street")
    , @NamedQuery(name = "Location.findByArea", query = "SELECT l FROM Location l WHERE l.area = :area")
    , @NamedQuery(name = "Location.findByZip", query = "SELECT l FROM Location l WHERE l.zip = :zip")})
public class Location implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Loc_id")
    private Integer locid;
    @Column(name = "Loc_name")
    private String locname;
    @Column(name = "Street")
    private String street;
    @Column(name = "Area")
    private String area;
    @Column(name = "zip")
    private String zip;

    public Location() {
    }

    public Location(Integer locid) {
        this.locid = locid;
    }

    public Integer getLocid() {
        return locid;
    }

    public void setLocid(Integer locid) {
        Integer oldLocid = this.locid;
        this.locid = locid;
        changeSupport.firePropertyChange("locid", oldLocid, locid);
    }

    public String getLocname() {
        return locname;
    }

    public void setLocname(String locname) {
        String oldLocname = this.locname;
        this.locname = locname;
        changeSupport.firePropertyChange("locname", oldLocname, locname);
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        String oldZip = this.zip;
        this.zip = zip;
        changeSupport.firePropertyChange("zip", oldZip, zip);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locid != null ? locid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.locid == null && other.locid != null) || (this.locid != null && !this.locid.equals(other.locid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "car_rental.Location[ locid=" + locid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
