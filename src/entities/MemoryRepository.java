package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.Repository;
	
public class MemoryRepository<T> implements Repository<T> {
    private List<T> data = new ArrayList<>();

    @Override
    public void save(T obj) {
        data.add(obj);
    }

    @Override
    public List<T> findAll() {
        return Collections.unmodifiableList(data);
    }
}