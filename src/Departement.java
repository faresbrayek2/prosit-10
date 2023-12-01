import java.util.Objects;

public class Departement implements Comparable<Departement> {


    private int id ;
    private String nom ;
    private int nbrEmp ;


    public Departement() {
    }

    public Departement(int id, String nom, int nbrEmp) {
        this.id = id;
        this.nom = nom;
        this.nbrEmp = nbrEmp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }


    @Override
    public String toString() {
        return "Departement : " +
                "id=" + id +
                " - nom='" + nom + '\'' +
                " - nbrEmp=" + nbrEmp +
                '\n';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    public int getNbrEmp() {
        return nbrEmp;
    }

    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    @Override
    public int compareTo(Departement o) {
        return this.id - o.getId();
    }
}