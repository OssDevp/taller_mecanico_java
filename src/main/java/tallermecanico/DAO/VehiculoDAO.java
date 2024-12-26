package tallermecanico.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tallermecanico.config.HibernateUtil;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.entities.VehiculoEntity;
import org.hibernate.query.Query;

import java.util.List;

public class VehiculoDAO {
    // LISTAR TODOS
    public List<VehiculoEntity> obtenerTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM VehiculoEntity ", VehiculoEntity.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // OBTENER POR ID
    public VehiculoEntity obtenerPorId(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(VehiculoEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // OBTENER POR CHAPA
    public VehiculoEntity obtenerPorPlaca(String placa) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM VehiculoEntity c WHERE c.placa = :placa";
            return session.createQuery(hql, VehiculoEntity.class)
                    .setParameter("placa", placa)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // GUARDAR
    public void guardar(VehiculoEntity vehiculo) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(vehiculo);
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
            VehiculoEntity vehiculo = session.get(VehiculoEntity.class, id);
            if (vehiculo != null) {
                session.delete(vehiculo);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // ELIMINAR POR PLACA
    public void eliminarPorPlaca(String placa) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();


            String hql = "FROM VehiculoEntity WHERE placa = :placa";
            Query<VehiculoEntity> query = session.createQuery(hql, VehiculoEntity.class);
            query.setParameter("placa", placa);


            VehiculoEntity vehiculo = query.uniqueResult();


            if (vehiculo != null) {
                session.delete(vehiculo);
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
    }

    // ACTUALIZAR
    public void actualizar(VehiculoEntity vehiculo) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(vehiculo);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
