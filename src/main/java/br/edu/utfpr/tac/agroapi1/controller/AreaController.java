package br.edu.utfpr.tac.agroapi1.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.tac.agroapi1.dto.AreaDTO;
import br.edu.utfpr.tac.agroapi1.model.Area;
import br.edu.utfpr.tac.agroapi1.repository.AreaRepository;

@RestController
@RequestMapping("/area")
public class AreaController {
    
    @Autowired
    private AreaRepository areaRepository;

    @GetMapping
    public List<Area> getAreaList(){
        return areaRepository.findAll();
    }

    @PostMapping
    public Area add(@RequestBody AreaDTO areaDTO){
        System.out.println(areaDTO);

        Area p = new Area();
        BeanUtils.copyProperties(areaDTO, p);

        LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));

        p.setCreatedAt(now);
        p.setUpdatedAt(now);
        return areaRepository.save(p);
    }
}
