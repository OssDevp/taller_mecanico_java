package tallermecanico.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tallermecanico.config.HibernateUtil;
import tallermecanico.entities.ClienteEntity;

import java.util.List;

public class ClienteDAO {

    // Metodo para obtener todos los clientes
    public List<ClienteEntity> obtenerTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM ClienteEntity ", ClienteEntity.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Metodo para obtener un cliente por su ID
    public ClienteEntity obtenerPorId(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(ClienteEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // OBTENER POR CEDULA
    public ClienteEntity obtenerPorCedula(String cedulaIdentidad) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM ClienteEntity c WHERE c.cedula = :cedulaIdentidad";
            return session.createQuery(hql, ClienteEntity.class)
                    .setParameter("cedulaIdentidad", cedulaIdentidad)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Metodo para guardar un cliente
    public void guardar(ClienteEntity cliente) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(cliente); // Usamos saveOrUpdate para insertar o actualizar
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Metodo para eliminar un cliente por su ID
    public void eliminar(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            ClienteEntity cliente = session.get(ClienteEntity.class, id);
            if (cliente != null) {
                session.delete(cliente);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Metodo para actualizar un cliente
    public void actualizar(ClienteEntity cliente) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(cliente); // Actualiza el cliente en la base de datos
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
