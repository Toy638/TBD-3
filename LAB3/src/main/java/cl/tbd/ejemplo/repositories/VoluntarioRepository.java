package cl.tbd.ejemplo.repositories;

import cl.tbd.ejemplo.models.Voluntario;

import java.util.List;

public interface VoluntarioRepository{

    public List<Voluntario> getVoluntarios();
    public Voluntario createVoluntario(Voluntario voluntario);
}
