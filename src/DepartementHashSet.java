import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private final Set<Departement> setDepartments ;

    public DepartementHashSet(HashSet<Departement> setDepartments) {
        this.setDepartments = setDepartments;
    }

    @Override
    public void ajouterDepartement(Departement dep) {
        setDepartments.add(dep);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep:
                setDepartments) {
            if (dep.getNom().equals(nom))
                return true;

        }
        return false ;
    }

    @Override
    public boolean rechercherDepartement(Departement dep) {
        return setDepartments.contains(dep);
    }

    @Override
    public void supprimerDepartement(Departement dep) {
        if (rechercherDepartement(dep))
            setDepartments.remove(dep);
    }

    @Override
    public void displayDepartement() {
        setDepartments.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(setDepartments);
    }
}