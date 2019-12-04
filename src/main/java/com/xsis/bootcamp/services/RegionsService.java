package com.xsis.bootcamp.services;

import com.xsis.bootcamp.model.Regions;

public interface RegionsService {
    // show regions
    Iterable<Regions> findAllRegions();
    
}