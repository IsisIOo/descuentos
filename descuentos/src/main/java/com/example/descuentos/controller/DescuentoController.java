package com.example.descuentos.controller;

import com.example.descuentos.entity.Descuento;
import com.example.descuentos.service.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/descuento")
public class DescuentoController {
    @Autowired
    DescuentoService descuentoService;


    @GetMapping("/")
    public ResponseEntity<List<Descuento>> listDiscount() {
        List<Descuento> repairs = descuentoService.getDescuento();
        return ResponseEntity.ok(repairs);
    }

    @GetMapping("/get-id/{id}")
    public ResponseEntity<Descuento> getDiscountById(@PathVariable Long id) {
        Descuento repair = descuentoService.getDescuentoById(id);
        return ResponseEntity.ok(repair);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Descuento> deleteDiscount(@PathVariable Long id) throws Exception {
        var isDeleted = descuentoService.deleteDescuento(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/")
    public ResponseEntity<Descuento> updateDiscount(@PathVariable Long id, @RequestBody Descuento repair) {
        Descuento repairUpdated = descuentoService.saveDescuento(repair);
        return ResponseEntity.ok(repairUpdated);
    }

    @PostMapping("/")
    public ResponseEntity<Descuento> saveDiscount(@RequestBody Descuento descuento) {
        Descuento desNew = descuentoService.saveAndSendDescuento(descuento);
        return ResponseEntity.ok(desNew);
    }

}
