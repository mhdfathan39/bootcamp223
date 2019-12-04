package com.xsis.bootcamp.model;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class Countries {
    
    @Id
    @Column(name="country_id")
    private String countryId;

    @Column(name="country_name")
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Regions regions;

    public Countries() {
    }

    
    public Countries(String countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public Countries(String countryId, String countryName, Regions regions) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.regions = regions;
    }


    /**
     * @return char return the countryId
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * @param countryId the countryId to set
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    /**
     * @return String return the countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName the countryName to set
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * @return Regions return the regions
     */
    public Regions getRegions() {
        return regions;
    }

    /**
     * @param regions the regions to set
     */
    public void setRegions(Regions regions) {
        this.regions = regions;
    }

}