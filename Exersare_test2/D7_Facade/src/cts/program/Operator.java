package cts.program;

public class Operator {
    public void verificareCreareCont(Persoana persoana){
        Varsta varsta=new Varsta();
        Politie politie=new Politie();
        CreanteBanci creanteBanci=new CreanteBanci();

        if(!varsta.verificaVarsta(persoana)){
            System.out.println("Trebuie sa aiba peste 18 ani");
            return ;
        }
        if(politie.verificarePolitie(persoana)){
            System.out.println("Este urmarit de politie");
            return;
        }
        if(creanteBanci.verificareCreanteBanci(persoana)){
            System.out.println("Persoana "+ persoana.getNume()+ " are creante la banci");
            return;
        }

        System.out.println("Creaza cont pentru persoana cu numele " +persoana.getNume());
    }
}
