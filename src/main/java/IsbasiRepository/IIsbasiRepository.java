package IsbasiRepository;

import java.util.List;

public interface IIsbasiRepository<T> {
    T get(Object id);

    List<T> getList();

    void save(T object);

    T update(T object);

    void delete(T object);
}
