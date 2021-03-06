package model.pojo;
// Generated Jul 14, 2015 10:47:49 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Countries generated by hbm2java
 */
public class Countries  implements java.io.Serializable {


     private int id;
     private String countryName;
     private Set supplierses = new HashSet(0);
     private Set citieses = new HashSet(0);

    public Countries() {
    }

	
    public Countries(int id) {
        this.id = id;
    }
    public Countries(int id, String countryName, Set supplierses, Set citieses) {
       this.id = id;
       this.countryName = countryName;
       this.supplierses = supplierses;
       this.citieses = citieses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCountryName() {
        return this.countryName;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public Set getSupplierses() {
        return this.supplierses;
    }
    
    public void setSupplierses(Set supplierses) {
        this.supplierses = supplierses;
    }
    public Set getCitieses() {
        return this.citieses;
    }
    
    public void setCitieses(Set citieses) {
        this.citieses = citieses;
    }




}


