/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restservice;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ZLATAN
 */
@Entity
@Table(name = "CUSTOMER_PSSTRUCTURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerPsstructure.findAll", query = "SELECT c FROM CustomerPsstructure c")
    , @NamedQuery(name = "CustomerPsstructure.findByCustomerCode", query = "SELECT c FROM CustomerPsstructure c WHERE c.customerCode = :customerCode")
    , @NamedQuery(name = "CustomerPsstructure.findByPricingStructure", query = "SELECT c FROM CustomerPsstructure c WHERE c.pricingStructure = :pricingStructure")})
public class CustomerPsstructure implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CUSTOMER_CODE")
    private String customerCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PRICING_STRUCTURE")
    private String pricingStructure;

    public CustomerPsstructure() {
    }

    public CustomerPsstructure(String customerCode) {
        this.customerCode = customerCode;
    }

    public CustomerPsstructure(String customerCode, String pricingStructure) {
        this.customerCode = customerCode;
        this.pricingStructure = pricingStructure;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPricingStructure() {
        return pricingStructure;
    }

    public void setPricingStructure(String pricingStructure) {
        this.pricingStructure = pricingStructure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerCode != null ? customerCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerPsstructure)) {
            return false;
        }
        CustomerPsstructure other = (CustomerPsstructure) object;
        if ((this.customerCode == null && other.customerCode != null) || (this.customerCode != null && !this.customerCode.equals(other.customerCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restservice.CustomerPsstructure[ customerCode=" + customerCode + " ]";
    }
    
}
