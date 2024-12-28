package tallermecanico.DAO;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tallermecanico.config.HibernateUtil;
import tallermecanico.entities.OrdenEntity;

import java.util.List;

public class OrdenDAO {
    // LISTAR TODOS
    public List<OrdenEntity> obtenerTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<OrdenEntity> ordenes = session.createQuery("FROM OrdenEntity ", OrdenEntity.class).list();
            for (OrdenEntity orden : ordenes) {
                Hibernate.initialize(orden.getCliente());
                Hibernate.initialize(orden.getVehiculo());
                Hibernate.initialize(orden.getEmpleado());
                Hibernate.initialize(orden.getServicio());
            }
            return ordenes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // OBTENER POR ID
    public OrdenEntity obtenerPorId(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            OrdenEntity orden = session.get(OrdenEntity.class, id);
            if (orden != null) {
                Hibernate.initialize(orden.getCliente());
                Hibernate.initialize(orden.getVehiculo());
                Hibernate.initialize(orden.getEmpleado());
                Hibernate.initialize(orden.getServicio());
            }
            return orden;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // GUARDAR
    public void guardar(OrdenEntity orden) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(orden);
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
            OrdenEntity orden = session.get(OrdenEntity.class, id);
            if (orden != null) {
                session.delete(orden);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // ACTUALIZAR
    public void actualizar(OrdenEntity orden) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(orden);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
