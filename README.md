# prosit-10
continuation for prosit 9 .
# Enonce
Votre chef vous demande de créer la classe département sachant qu’un  département est caractérisé par :  
<br>● Un id (int) 
<br>● Un nom de département (String) 
<br>● Un nombre des employés (int) 
<br>Cette classe possède :  
<br>● 2 constructeurs dont un sans paramètre 
<br>● La redéfinition de la méthode « equals » permettant de tester l'égalité entre 2  départements selon l’id et le nom. 
<br>● La redéfinition de la méthode « toString » 
<br>Pour une meilleure gestion des entités vous êtes amené de créer l’interface  « IDépartement » définit comme suit :  
```
public interface IDepartement<T>{  
public void ajouterDepartement(T t);  
public boolean rechercherDepartement(String nom);  
public boolean rechercherDepartement(T t);  
public void supprimerDepartement(T t);  
public void displayDepartement(); 
public TreeSet<T> trierDepartementById(); 
}
```
