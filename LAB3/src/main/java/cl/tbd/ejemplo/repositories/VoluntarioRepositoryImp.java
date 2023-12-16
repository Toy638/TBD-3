package cl.tbd.ejemplo.repositories;

import cl.tbd.ejemplo.models.Tarea;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import cl.tbd.ejemplo.models.Voluntario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VoluntarioRepositoryImp implements VoluntarioRepository {

    @Autowired
    MongoDatabase database;

    @Override
    public Voluntario createVoluntario(Voluntario voluntario) {
        MongoCollection<Voluntario> collection = database.getCollection("voluntario", Voluntario.class);
        collection.insertOne(voluntario);
        return voluntario;
    }

    @Override
    public List<Voluntario> getVoluntarios() {
        MongoCollection<Voluntario> collection = database.getCollection("voluntario", Voluntario.class);
        List <Voluntario> voluntario = collection.find().into(new ArrayList<>());
        return voluntario;
    }
}
