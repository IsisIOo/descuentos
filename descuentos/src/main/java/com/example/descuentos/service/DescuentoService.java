package com.example.descuentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import com.example.descuentos.entitiy.Descuento;

import java.util.ArrayList;

public class DescuentoService {

    @Autowired
    RepairListRepository repairListRepository;
    @Autowired
    RestTemplate restTemplate;

    public ArrayList<RepairList> getRepairsList() {
        return (ArrayList<RepairList>) repairListRepository.findAll();
    }

    public Descuento getRepairListById(Long id) {
        return repairListRepository.findById(id).get();
    }

    public Descuento getRepairListByName(String name) {
        return repairListRepository.findByRepairName(name);
    }

    public Descuento saveRepairList(Descuento repairList) {
        return repairListRepository.save(repairList);
    }

    public Descuento saveAndSendRepairList(Descuento descuento) {
        return repairListRepository.save(descuento);
    }

    public boolean deleteRepairList(Long id) throws Exception {
        try{
            repairListRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
