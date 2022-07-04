package date0704.java15.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO<T> {
    private Map<String, T> map;

    public DAO() {
        this.map = new HashMap<>();
    }

    public void save(String id, T entity) {
        this.map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        for (Object o : this.map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            list.add((T) entry.getValue());
        }
        return list;
    }

    public void delete(String id) {
        this.map.remove(id);
    }
}
