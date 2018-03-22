/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.TablaAuto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author es_es
 */
@Controller
@RequestMapping("/ver.htm")
public class VerController {
    
    //siempre los métodos de los controladores deben retornar un 
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model){
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("txtRut") String rut, Model model){
        if(rut.trim().equals("")) {
            String a = "Campos vacios";
            model.addAttribute("err", a);
            return "error";
        }
        else{
            TablaAuto a1 = new TablaAuto(1,"dodge","negro");
            model.addAttribute("auto", a1);
            return "exito";
        }
    }
    
}