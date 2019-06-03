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
@Table(name = "car_category", catalog = "car_rental", schema = "")
@NamedQueries({
    @NamedQuery(name = "CarCategory.findAll", query = "SELECT c FROM CarCategory c")
    , @NamedQuery(name = "CarCategory.findByCatName", query = "SELECT c FROM CarCategory c WHERE c.catName = :catName")
    , @NamedQuery(name = "CarCategory.findBySittingcapacity", query = "SELECT c FROM CarCategory c WHERE c.sittingcapacity = :sittingcapacity")
    , @NamedQuery(name = "CarCategory.findByCostperhour", query = "SELECT c FROM CarCategory c WHERE c.costperhour = :costperhour")
    , @NamedQuery(name = "CarCategory.findByLatefeeperhour", query = "SELECT c FROM CarCategory c WHERE c.latefeeperhour = :latefeeperhour")})
public class CarCategory implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cat_name")
    private String catName;
    @Column(name = "Sitting_capacity")
    private Integer sittingcapacity;
    @Column(name = "Cost_per_hour")
    private Integer costperhour;
    @Column(name = "Late_fee_per_hour")
    private Integer latefeeperhour;

    public CarCategory() {
    }

    public CarCategory(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        String oldCatName = this.catName;
        this.catName = catName;
        changeSupport.firePropertyChange("catName", oldCatName, catName);
    }

    public Integer getSittingcapacity() {
        return sittingcapacity;
    }

    public void setSittingcapacity(Integer sittingcapacity) {
        Integer oldSittingcapacity = this.sittingcapacity;
        this.sittingcapacity = sittingcapacity;
        changeSupport.firePropertyChange("sittingcapacity", oldSittingcapacity, sittingcapacity);
    }

    public Integer getCostperhour() {
        return costperhour;
    }

    public void setCostperhour(Integer costperhour) {
        Integer oldCostperhour = this.costperhour;
        this.costperhour = costperhour;
        changeSupport.firePropertyChange("costperhour", oldCostperhour, costperhour);
    }

    public Integer getLatefeeperhour() {
        return latefeeperhour;
    }

    public void setLatefeeperhour(Integer latefeeperhour) {
        Integer oldLatefeeperhour = this.latefeeperhour;
        this.latefeeperhour = latefeeperhour;
        changeSupport.firePropertyChange("latefeeperhour", oldLatefeeperhour, latefeeperhour);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catName != null ? catName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarCategory)) {
            return false;
        }
        CarCategory other = (CarCategory) object;
        if ((this.catName == null && other.catName != null) || (this.catName != null && !this.catName.equals(other.catName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "car_rental.CarCategory[ catName=" + catName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
