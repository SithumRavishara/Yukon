package com.sithum.classroom.controller;

import com.sithum.classroom.service.ClassRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/classroom")
@RequiredArgsConstructor
public class ClassRoomContrller {

    private final ClassRoomService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
