package com.xsis.bootcamp.dto;

import java.util.ArrayList;

import javax.validation.constraints.NotBlank;

import com.xsis.bootcamp.model.Countries;

/**
 * RegionsDto
 */
public class RegionsDto {
    @NotBlank(message="region name required")
    private String regionName;

    private ArrayList<Countries> countries;


    public RegionsDto() {
    }


    public RegionsDto(String regionName, ArrayList<Countries> countries){
        this.regionName = regionName;
        this.countries = countries;
    }
    

    /**
     * @return String return the regionName
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * @param regionName the regionName to set
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * @return ArrayList<Countries> return the countries
     */
    public ArrayList<Countries> getCountries() {
        if (this.countries == null) {
            this.countries = new ArrayList<Countries>();
        }
        return this.countries;
    }

    /**
     * @param countries the countries to set
     */
    public void setCountries(ArrayList<Countries> countries) {
        this.countries = countries;
    }

}