package com.bookmyground.Capstone.Service;

import com.bookmyground.Capstone.Entity.Ground;
import com.bookmyground.Capstone.repository.GroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroundService {

    @Autowired
    GroundRepository groundRepository;
    public Ground add(Ground ground){
        return groundRepository.save(ground);
    }
    public List<Ground> search(String location){
        return groundRepository.findByLocationAndAvailableTrue(location);
    }
}
