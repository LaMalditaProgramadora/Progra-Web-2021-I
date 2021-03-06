package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.model.Pais;
import pe.edu.upc.service.IPaisService;

@RestController
@RequestMapping("/paises")
public class PaisController {

	@Autowired
	private IPaisService pService;

	@PostMapping
	public void insertar(@RequestBody Pais p) {
		pService.registrar(p);
	}

	@PutMapping
	public void modificar(@RequestBody Pais p) {
		pService.registrar(p);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		pService.eliminar(id);
	}

	@GetMapping
	public List<Pais> listar() {
		return pService.listar();
	}

}
