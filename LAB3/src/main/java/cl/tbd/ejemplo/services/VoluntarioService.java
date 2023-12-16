package cl.tbd.ejemplo.services;

import cl.tbd.ejemplo.models.Voluntario;
import cl.tbd.ejemplo.repositories.VoluntarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoluntarioService {
    private final VoluntarioRepository voluntarioRepository;
    VoluntarioService(VoluntarioRepository voluntarioRepository){
        this.voluntarioRepository= voluntarioRepository;
    }


    @GetMapping("/voluntario")
    public List<Voluntario> getTareas(){
        return voluntarioRepository.getVoluntarios();
    }

    @PostMapping("/voluntario")
    @ResponseBody
    public Voluntario createVoluntario(@RequestBody Voluntario voluntario){
        Voluntario result = voluntarioRepository.createVoluntario(voluntario);
        return result;
    }
}
