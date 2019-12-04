package com.xsis.bootcamp.model;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Entity
@Table(name="regions")
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "region_id_seq")
    @SequenceGenerator(name = "region_id_seq", sequenceName = "regions_region_id_seq", initialValue = 5, allocationSize = 1)
    @Column(name="region_id")
    private Integer regionId;

    @Column(name="region_name")
    private String regionName;

    @OneToMany(mappedBy = "regions", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Countries> countries;

    public Regions() {
    }


    public Regions(String regionName) {
        this.regionName = regionName;
    }
    
    public Regions(String regionName, Countries... countries){
        this.regionName = regionName;
        this.countries = Stream.of(countries).collect(Collectors.toSet());
        this.countries.forEach(x -> x.setRegions(this));
    }
    

    /**
     * @return Integer return the regionId
     */
    public Integer getRegionId() {
        return regionId;
    }

    /**
     * @param regionId the regionId to set
     */
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
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
     * @return Set<Countries> return the countries
     */
    public Set<Countries> getCountries() {
        return countries;
    }

    /**
     * @param countries the countries to set
     */
    public void setCountries(Set<Countries> countries) {
        this.countries = countries;
    }

}