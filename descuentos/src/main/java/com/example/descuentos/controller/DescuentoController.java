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
    public ResponseEntity<List<RepairList>> listRepairList() {
        List<RepairList> repairs = repairListService.getRepairsList();
        return ResponseEntity.ok(repairs);
    }

    @GetMapping("/get-id/{id}")
    public ResponseEntity<RepairList> getRepairListById(@PathVariable Long id) {
        RepairList repair = repairListService.getRepairListById(id);
        return ResponseEntity.ok(repair);
    }

    @GetMapping("/by-repair/{repairName}")
    public ResponseEntity<RepairList> getRepairListByName(@PathVariable String repairName) {
        RepairList repair = repairListService.getRepairListByName(repairName);
        return ResponseEntity.ok(repair);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<RepairList> deleteRepairList(@PathVariable Long id) throws Exception {
        var isDeleted = repairListService.deleteRepairList(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/")
    public ResponseEntity<Descuento> updateRepairList(@PathVariable Long id, @RequestBody Descuento repair) {
        Descuento repairUpdated = descuentoService.saveDescuento(repair);
        return ResponseEntity.ok(repairUpdated);
    }

    @PostMapping("/")
    public ResponseEntity<Descuento> saveRepairList(@RequestBody Descuento descuento) {
        Descuento desNew = descuentoService.saveAndSendDescuento(descuento);
        return ResponseEntity.ok(desNew);
    }

}
