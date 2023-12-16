package cl.tbd.ejemplo.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;


public class Tarea {
    @BsonId
    ObjectId _id;

    private String asunto_tarea;

    private Boolean estado_tarea;

    private Long id_emergencia;

    private double latitud;

    private double longitud;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getAsunto_tarea() {
        return asunto_tarea;
    }

    public void setAsunto_tarea(String asunto_tarea) {
        this.asunto_tarea = asunto_tarea;
    }

    public Boolean getEstado_tarea() {
        return estado_tarea;
    }

    public void setEstado_tarea(Boolean estado_tarea) {
        this.estado_tarea = estado_tarea;
    }

    public Long getId_emergencia() {
        return id_emergencia;
    }

    public void setId_emergencia(Long id_emergencia) {
        this.id_emergencia = id_emergencia;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}