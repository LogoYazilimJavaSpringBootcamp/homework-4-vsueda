package IsbasiRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractIsbasiRepository<T> implements IIsbasiRepository<T>{

    //Buradaki yapı ile oluşturulacak tüm repositorylerin temel metotları extends edilebilecektir.
    @PersistenceContext
    EntityManager entityManager;

    protected Class<T> useClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @Override
    public T get(Object id)  {
        try {
            return entityManager.find(useClass, id);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public List<T> getList() {
        try {
            @SuppressWarnings("unchecked")
            List<T> list = (entityManager.createQuery("SELECT v FROM " + useClass.getCanonicalName() + " v").getResultList());
            return list;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void save(T object) {
        try {
            entityManager.persist(object);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public T update(T object) {
        try {
            return entityManager.merge(object);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void delete(T object) {
        try {
            entityManager.remove(object);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
