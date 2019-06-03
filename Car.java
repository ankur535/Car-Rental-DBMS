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
@Table(name = "car", catalog = "car_rental", schema = "")
@NamedQueries({
    @NamedQuery(name = "Car.findAll", query = "SELECT c FROM Car c")
    , @NamedQuery(name = "Car.findByCarid", query = "SELECT c FROM Car c WHERE c.carid = :carid")
    , @NamedQuery(name = "Car.findByMake", query = "SELECT c FROM Car c WHERE c.make = :make")
    , @NamedQuery(name = "Car.findByModel", query = "SELECT c FROM Car c WHERE c.model = :model")
    , @NamedQuery(name = "Car.findByMileage", query = "SELECT c FROM Car c WHERE c.mileage = :mileage")
    , @NamedQuery(name = "Car.findByRegno", query = "SELECT c FROM Car c WHERE c.regno = :regno")
    , @NamedQuery(name = "Car.findByAvailability", query = "SELECT c FROM Car c WHERE c.availability = :availability")
    , @NamedQuery(name = "Car.findByCatname", query = "SELECT c FROM Car c WHERE c.catname = :catname")
    , @NamedQuery(name = "Car.findByLocid", query = "SELECT c FROM Car c WHERE c.locid = :locid")})
public class Car implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Car_id")
    private Integer carid;
    @Column(name = "Make")
    private String make;
    @Column(name = "Model")
    private String model;
    @Column(name = "Mileage")
    private String mileage;
    @Column(name = "Reg_no")
    private String regno;
    @Column(name = "Availability")
    private Integer availability;
    @Column(name = "Cat_name")
    private String catname;
    @Column(name = "Loc_id")
    private Integer locid;

    public Car() {
    }

    public Car(Integer carid) {
        this.carid = carid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        Integer oldCarid = this.carid;
        this.carid = carid;
        changeSupport.firePropertyChange("carid", oldCarid, carid);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        String oldMake = this.make;
        this.make = make;
        changeSupport.firePropertyChange("make", oldMake, make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String oldModel = this.model;
        this.model = model;
        changeSupport.firePropertyChange("model", oldModel, model);
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        String oldMileage = this.mileage;
        this.mileage = mileage;
        changeSupport.firePropertyChange("mileage", oldMileage, mileage);
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        String oldRegno = this.regno;
        this.regno = regno;
        changeSupport.firePropertyChange("regno", oldRegno, regno);
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        Integer oldAvailability = this.availability;
        this.availability = availability;
        changeSupport.firePropertyChange("availability", oldAvailability, availability);
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        String oldCatname = this.catname;
        this.catname = catname;
        changeSupport.firePropertyChange("catname", oldCatname, catname);
    }

    public Integer getLocid() {
        return locid;
    }

    public void setLocid(Integer locid) {
        Integer oldLocid = this.locid;
        this.locid = locid;
        changeSupport.firePropertyChange("locid", oldLocid, locid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carid != null ? carid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Car)) {
            return false;
        }
        Car other = (Car) object;
        if ((this.carid == null && other.carid != null) || (this.carid != null && !this.carid.equals(other.carid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "car_rental.Car[ carid=" + carid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
