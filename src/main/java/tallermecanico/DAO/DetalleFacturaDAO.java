package tallermecanico.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tallermecanico.config.HibernateUtil;
import tallermecanico.entities.DetalleFacturaEntity;

import java.util.List;

public class DetalleFacturaDAO {
    // LISTAR TODOS
    public List<DetalleFacturaEntity> obtenerTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM DetalleFacturaEntity ", DetalleFacturaEntity.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // OBTENER POR ID
    public DetalleFacturaEntity obtenerPorId(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(DetalleFacturaEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // GUARDAR
    public void guardar(DetalleFacturaEntity detalle) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(detalle);
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
            DetalleFacturaEntity detalle = session.get(DetalleFacturaEntity.class, id);
            if (detalle != null) {
                session.delete(detalle);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // ACTUALIZAR
    public void actualizar(DetalleFacturaEntity detalle) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(detalle);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
