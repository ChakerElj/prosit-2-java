import java.util.Arrays;

public class Zoo {
    private Animal[] animals ;
    private String name ;
    private String city ;
    private int nbrCages ;



    private int compteur = 0 ;


    // Instruction 9 : Redefinir la methode toString()
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    // Instruction 6
    public Zoo( String name, String city, int nbrCages) {
        this.name = name;
        this.animals = new Animal[nbrCages];
        this.city = city;
        this.nbrCages = nbrCages;
    }



    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    // Instruction 8
    public void displayZoo(){
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(nbrCages);
    }
    // Instruction 10
    public boolean addAnimal(Animal animal){
        // Instruction 12
        if (Animal.animalsInstance <23){
            // Instruction 12
            if (animal != null && searchAnimal(animal.getName())== -1){
                this.animals[compteur] = animal ;
                this.compteur ++ ;
                return true ;
            }
            return false ;
        }
        return false ;

    }
    // Instruction 11
    public void afficherAnimals(){
        for (int i = 0; i < this.animals.length ; i++) {
            System.out.println(animals[i]);
        }
    }
    // Instruction 11
    public int searchAnimal(String animalName) {
        for (int i = 0; i < this.animals.length ; i++) {
            if(this.animals[i].getName() == animalName)
                return i ;
        }
        return -1 ;
    }
    // Instruction 13
    public void removeAnimal(Animal animal){
        int indexAnimalToRemove = searchAnimal(animal.getName());
        this.animals[indexAnimalToRemove] = null;
        System.out.println("Supprimer animal effectuer avec succes");
    }
}
