package tallermecanico.DAO;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import tallermecanico.config.HibernateUtil;
import tallermecanico.entities.EmpleadoEntity;

import java.util.List;

public class EmpleadoDAO {

    // OBTENER TODOS
    public List<EmpleadoEntity> obtenerTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<EmpleadoEntity> empleados = session.createQuery("FROM EmpleadoEntity", EmpleadoEntity.class).list();
            for (EmpleadoEntity empleado : empleados) {
                Hibernate.initialize(empleado.getCargo());
            }
            return empleados;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // OBTENER POR ID
    public EmpleadoEntity obtenerPorId(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(EmpleadoEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public EmpleadoEntity obtenerPorCedula(String cedula) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM EmpleadoEntity e WHERE e.cedula = :cedula";
            EmpleadoEntity empleado = session.createQuery(hql, EmpleadoEntity.class)
                    .setParameter("cedula", cedula)
                    .uniqueResult();
            if (empleado != null) {
                Hibernate.initialize(empleado.getCargo());
            }
            return empleado;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // GUARDAR
    public void guardar(EmpleadoEntity empleado) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(empleado);
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
            EmpleadoEntity empleado = session.get(EmpleadoEntity.class, id);
            if (empleado != null) {
                session.delete(empleado);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // ACTUALIZAR
    public void actualizar(EmpleadoEntity empleado) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(empleado);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // OBTENER POR ID (Con el CargoEntity cargado)
    public EmpleadoEntity obtenerPorIdConCargo(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<EmpleadoEntity> query = session.createQuery(
                    "SELECT e FROM EmpleadoEntity e LEFT JOIN FETCH e.cargo WHERE e.id = :id",
                    EmpleadoEntity.class
            );
            query.setParameter("id", id);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}