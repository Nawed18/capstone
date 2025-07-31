package com.bookmyground.Capstone.controller;

import com.bookmyground.Capstone.Entity.Ground;
import com.bookmyground.Capstone.Service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grounds")
public class GroundController {

    @Autowired
    GroundService groundService;
    @PostMapping("/add")
    public Ground add(@RequestBody Ground ground){
        return groundService.add(ground);

    }
    @GetMapping("/search")
    public List<Ground> search(@RequestParam String location){
        return groundService.search(location);
    }


}
