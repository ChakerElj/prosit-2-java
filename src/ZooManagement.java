import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /*    Prosit 1
    // instruction 1

            int nbrCages = 20 ;
            String zooName = "my zoo";
            System.out.println(zooName + " comporte "+nbrCages+" cages");

    // Instruction 2
        Scanner input = new Scanner(System.in);
        System.out.println("Donner le nombre des cages ? : ");
        int nbrCages = input.nextInt();
        input.nextLine();
        System.out.println("Donner le nom de zoo ? : ");
        String zooName = input.nextLine();
    // Instruction 3
        System.out.println(zooName + " comporte "+nbrCages+" cages");
        input.close(); */
    // Prosit 2
    // Instruction 5
     /*   Animal lion = new Animal();
        lion.setFamily("lions");
        lion.setAge(13);
        lion.setMammal(true);
        Zoo myZoo = new Zoo();
        myZoo.setCity("tunis");
        myZoo.setName("bilvidaire");*/
        // ==> Dans la methode main les constructors non parametrés commme Zoo() ou Animal() ne sont plus accesibles parceque
        // on a redefinir le constructeur par default en un constructor paramtré si on veut corriger ce problem on peut ajouter
        // un constructor non parametres dans les deux classes
        Animal lion = new Animal("lions", "jack", 10, true);
        Zoo myZoo = new Zoo("bilvidaire","tunis",23);
        // Instruction 8
        /*
        System.out.println(myZoo); // Out => Zoo@4617c264
        System.out.println(myZoo.toString()); // Out => Zoo@4617c264*/
        // => l'output de deux instructions c'est la meme
        // Instruction 9
        System.out.println(myZoo);

//        System.out.println(myZoo.toString());

        myZoo.addAnimal(lion) ;
        myZoo.addAnimal(lion);
        //Instruction 11
        Animal cat_New = new Animal("cats","ketty",13,true);
        Animal cat = new Animal("cats","ketty",13,true);
        myZoo.addAnimal(cat);
        // Instruction 11 : le probleme si on a plusieurs occurences porte la meme valeur dans ue tableau
        // le compilateur java traite cette instance comme un nouveau objet malgre les deux instances ont la meme valeur
        System.out.println(myZoo.searchAnimal("ketty"));


    }
}