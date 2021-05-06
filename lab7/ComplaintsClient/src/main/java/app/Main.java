/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adrian.glapinski
 */
public class Main {

    private static final String URL = "http://localhost:8080/Complaints/";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();

        System.out.println("Count: " + getComplaintsCount(client));

        System.out.println("a. All complaints:\n" + getAllComplaints(client));

        System.out.println("b. Sample open complaint with id = 201:");
        Complaint openComplaint = getComplaint(client);
        System.out.println(openComplaint);

        System.out.println("c. Close complaint");
        closeComplaint(client, openComplaint);

        System.out.println("d. All open complaints:\n" + getAllOpenComplaints(client));

        client.close();
    }

    private static String getComplaintsCount(Client client) {
        return client
                .target(URL + "resources/complaints/count")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
    }

    private static List<Complaint> getAllComplaints(Client client) {
        return client
                .target(URL + "resources/complaints")
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Complaint>>() {
                });
    }

    private static Complaint getComplaint(Client client) {
        return client
                .target(URL + "resources/complaints/201")
                .request(MediaType.APPLICATION_JSON)
                .get(Complaint.class);
    }

    private static void closeComplaint(Client client, Complaint complaint) {
        complaint.setStatus("closed");

        client
                .target(URL + "resources/complaints/201")
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.entity(complaint, MediaType.APPLICATION_JSON));
    }

    private static List<Complaint> getAllOpenComplaints(Client client) {
        return client
                .target(URL + "resources/complaints?status=open")
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Complaint>>() {
                });
    }

}
