package it.step.controller;

import it.step.dto.DigitalSkillDTO;
import it.step.mapper.DigitalSkillMapper;
import it.step.model.DigitalSkill;
import it.step.service.DigitalSkillService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/digitalskill")
@RequiredArgsConstructor
public class DigitalSkillController {

    private final DigitalSkillService digitalSkillService;

    private final DigitalSkillMapper digitalSkillMapper;
    @GetMapping("all")
    public ResponseEntity<List<DigitalSkillDTO>> getAllDigitalSkill(){
        try{
            List<DigitalSkill> digitalSkills = digitalSkillService.getAllDigitalSkills();
            List<DigitalSkillDTO> digitalSkillDTO = new ArrayList<>();

            digitalSkills.forEach(digitalSkill -> {
                digitalSkillDTO.add(digitalSkillMapper.digitalSkillToDigitalSkillDto(digitalSkill));
            });
            return new ResponseEntity<>(digitalSkillDTO, HttpStatus.OK);
        } catch ( Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<DigitalSkillDTO> getAllCustomers(@PathVariable("id") String id) {
        try {
            Optional<DigitalSkill> customer = digitalSkillService.getDigitalSkillByID(id);
            DigitalSkillDTO response;

            if(customer.isPresent()){
                response = digitalSkillMapper.digitalSkillToDigitalSkillDto(customer.get());
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("save")
    public ResponseEntity<DigitalSkillDTO> saveDigitalSkill(@RequestBody DigitalSkillDTO digitalSkillDTO){
        try{
            DigitalSkill response;
            DigitalSkill digitalSkill = Mappers.getMapper(DigitalSkillMapper.class).digitalSkillDtoToDigitalSkill(digitalSkillDTO);
            response = digitalSkillService.saveDigitalSkill(digitalSkill);
            return new ResponseEntity<>(digitalSkillDTO, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDigitalSkill(@PathVariable DigitalSkill id) {
        try {
            DigitalSkill deletedSkill = digitalSkillService.deleteDigitalSkill(id);
            if (deletedSkill != null) {
                return ResponseEntity.ok("Digital skill with ID " + id + " deleted successfully.");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Digital skill with ID " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while deleting the digital skill.");
        }
    }


}