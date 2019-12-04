package com.xsis.bootcamp.services.impl;

import com.xsis.bootcamp.model.Regions;
import com.xsis.bootcamp.repository.RegionsRepository;
import com.xsis.bootcamp.services.RegionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionsServiceImpl implements RegionsService  {
    @Autowired
    private RegionsRepository regionsRepos;
    
    @Override
    public Iterable<Regions> findAllRegions() {
        // TODO Auto-generated method stub
        return regionsRepos.findAll();
    }

    @Override
    public void saveRegions(Regions regions) {
        // TODO Auto-generated method stub
        regionsRepos.save(regions);

    }

    @Override
    public void saveAll(Iterable<Regions> regions) {
        // TODO Auto-generated method stub
        regionsRepos.saveAll(regions);
    }
    
}