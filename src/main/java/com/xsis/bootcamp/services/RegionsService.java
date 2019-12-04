package com.xsis.bootcamp.services;

import com.xsis.bootcamp.model.Regions;

public interface RegionsService {
    // show regions
    Iterable<Regions> findAllRegions();

    void saveRegions(Regions regions);

    void saveAll(Iterable<Regions> regions);

    void saveRegion(Regions regions);
    
}