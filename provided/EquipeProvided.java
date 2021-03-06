package com.example.helpdesk.provided;

import java.util.List;


import com.example.helpdesk.entity.Equipe;
import com.example.helpdesk.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipe")
public class EquipeProvided {

 @Autowired
 private EquipeService equipeService;

 @DeleteMapping("/reference/{ref}")
 public int deleteByRef(@PathVariable String ref) {
  return equipeService.deleteByRef(ref);
 }

 @GetMapping("/libelle/{libelle}")
 public Equipe findByLibelle(String libelle) {
  return equipeService.findByLibelle(libelle);
 }

 @GetMapping("/Chef/Collaborateur/nom/{code}")
 public Equipe findByChefEquipeCollaborateurCode(@PathVariable String code) {
  return equipeService.findByChefEquipeCollaborateurCode(code);
 }

 @GetMapping("/code/{code}")
 public Equipe findByCode(@PathVariable String code) {
  return equipeService.findByCode(code);
 }

 @GetMapping("/reference/{ref}")
 public Equipe findByRef(@PathVariable String ref) {
  return equipeService.findByRef(ref);
 }

 @GetMapping("/")
 public List<Equipe> findAll() {
  return equipeService.findAll();
 }

 @PostMapping("/")
 public int save(@RequestBody Equipe equipe) {
  return equipeService.save(equipe);
 }

 @PutMapping("/ref/{ref}")
 public int update(@PathVariable String ref,@RequestBody Equipe equipe) {
  return equipeService.update(ref, equipe);
 }
}
