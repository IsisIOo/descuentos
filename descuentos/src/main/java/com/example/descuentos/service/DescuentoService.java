package com.example.descuentos.service;

import com.example.descuentos.repository.DescuentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.descuentos.entity.Descuento;

import java.util.ArrayList;
@Service
public class DescuentoService {

    @Autowired
    DescuentoRepository descuentoRepository;
    @Autowired
    RestTemplate restTemplate;

    public ArrayList<Descuento> getRepairsList() {
        return (ArrayList<Descuento>) descuentoRepository.findAll();
    }

    public Descuento getRepairListById(Long id) {
        return descuentoRepository.findById(id).get();
    }

    public Descuento getDescuentoByMarcaName(String name) {
        return descuentoRepository.findByMarcaName(name);
    }

    public Descuento saveDescuento(Descuento des) {
        return descuentoRepository.save(des);
    }

    public Descuento saveAndSendDescuento(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }

    public boolean deleteDescuento(Long id) throws Exception {
        try{
            descuentoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
