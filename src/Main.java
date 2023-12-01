import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {        
        // Create an instance of SocieteArrayList
        SocieteArrayList societe = new SocieteArrayList();
        
        // Create a HashSet to store Departement objects
        HashSet<Departement> departements = new HashSet<>();
        
        // Create an instance of DepartementHashSet and pass the HashSet as a parameter
        DepartementHashSet departementService = new DepartementHashSet(departements);
        
        // Create two Departement objects
        Departement d = new Departement(1,"informatique",10);
        Departement d2 = new Departement(1,"informatique",10);
        
        // Add the Departement objects to the departementService
        departementService.ajouterDepartement(d);
        departementService.ajouterDepartement(d2);

        System.out.println("Liste de departements:");

        // Display the list of departements
        departementService.displayDepartement();

        // Create a new Departement object
        Departement d3 = new Departement(0,"finance",20);
        
        // Add the new Departement object to the departementService
        departementService.ajouterDepartement(d3);

        System.out.println("Liste de departements apres ajout:");
        
        // Sort and print the list of departements by ID
        System.out.println(departementService.trierDepartementById() + "\n");
        
        // Add Employe objects to the societe
        societe.ajouterEmploye(new Employe(1, 3, "Doe", "John", "IT"));
        societe.ajouterEmploye(new Employe(2, 2, "Smith", "Jane", "HR"));
        societe.ajouterEmploye(new Employe(3, 1, "Johnson", "Bob", "Finance"));

        System.out.println("Liste d'employés:");
        
        // Sort the employes by name, departement, and grade, and display them
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
    }
}
