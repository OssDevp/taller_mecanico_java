package tallermecanico.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tallermecanico.config.HibernateUtil;
import tallermecanico.entities.ServicioEntity;

import java.util.List;

public class ServicioDAO {
    // LISTAR TODOS
    public List<ServicioEntity> obtenerTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM ServicioEntity ", ServicioEntity.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // OBTENER POR ID
    public ServicioEntity obtenerPorId(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(ServicioEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // GUARDAR
    public void guardar(ServicioEntity servicio) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(servicio);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // ELIMINAR POR ID
    public void eliminar(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            ServicioEntity servicio = session.get(ServicioEntity.class, id);
            if (servicio != null) {
                session.delete(servicio);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // ACTUALIZAR
    public void actualizar(ServicioEntity servicio) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(servicio);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
