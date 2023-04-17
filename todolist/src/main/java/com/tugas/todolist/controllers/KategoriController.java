package com.tugas.todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class KategoriController {
    @GetMapping
    public String lihatKategori(){
return "/Kategori/lihatKategori";
    }

    @GetMapping("/edit/{index}")
    public String editKategori(){
        return "/Kategori/editKategori";
    }
    @GetMapping("/delete/{edit}")
    public String deleteKategori(){
        return "/Kategori/hapusKategori";
    }
    @GetMapping("/add")
    public String addKategori(){
        return "/Kategori/tambahKategori";
    }


}
