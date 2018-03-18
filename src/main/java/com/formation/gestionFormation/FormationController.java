package com.formation.gestionFormation;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.gestionFormation.entity.Formation;
import com.formation.gestionFormation.service.FormationService;

@Controller
public class FormationController {
	
	@Autowired
	private FormationService formationService;
	
	@RequestMapping("/list")
	public ResponseEntity<List<Formation>> getListFormation() {
		return new ResponseEntity<List<Formation>>(formationService.listDeFormation(),HttpStatus.OK);
	}
	
	@RequestMapping("/formation/{id}")
	public ResponseEntity<Formation> getFormation(@PathVariable("id") Integer id){
		
		return new ResponseEntity<Formation>(formationService.getFormation(id),HttpStatus.OK);
	}


}
