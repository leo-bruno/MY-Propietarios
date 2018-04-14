/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Bookings;
import entity.BookingsObjects;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Leo
 */
@Stateless
@Path("entity.bookings")
public class BookingsFacadeREST extends AbstractFacade<Bookings> {

    @PersistenceContext(unitName = "Propietarios_MYPU")
    private EntityManager em;

    public BookingsFacadeREST() {
        super(Bookings.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Bookings entity) {
        super.create(entity);
    }
    
    
    /*@GET //FUNCIONA
    @Path("booking/{objeto}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<BookingsObjects> objetosReservas (@PathParam("objeto")String objeto){
        //Objects aviso = em.find(Objects.class, objectno);
         
        Query q=em.createQuery("select b from BookingsObjects b \n" +                        
                            "where b.datefrom >= current_date\n" +
                            "and b.objectno = :objeto");
        q.setParameter("objeto", objeto);
        
         return (List<BookingsObjects>)q.getResultList();
    }*/
    
    @GET
    @Path("metodo1/d/{objeto_reserva}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Bookings> countReservas(@PathParam("objeto_reserva") String objeto) {
        Query q;
        
        String sql="select bo.objectno, bk.bookingno, bk.clientname, bk.datearrival, bk.datedeparture, bk.status "
                + "from Bookings bk, BookingsObjects bo"+
                           " where bk.bookingno = bo.bookingsObjectsPK.bookingno "+
                           " and bk.datearrival >= current_date" +
                           " and bo.objectno = :objeto";
        
        q=em.createQuery(sql);
        q.setParameter("objeto", objeto);
        return q.getResultList();
    }
    @GET //FUNCIONA
    @Path("metodo2/{reserva}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Bookings> reserva(@PathParam("reserva") long reserva) {
        Query q;
        
        String sql="select bk"
                + " from Bookings bk where bk.bookingno = :reserva";
               
        q=em.createQuery(sql);
        q.setParameter("reserva", reserva);
        return q.getResultList();
    } 

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Bookings entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Bookings find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Bookings> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Bookings> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
