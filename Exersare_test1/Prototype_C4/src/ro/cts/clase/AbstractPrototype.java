package ro.cts.clase;

public abstract class AbstractPrototype {

    protected String numeDoctor;
    protected String codReteta;

    public AbstractPrototype(String numeDoctor, String codReteta) {
        if(numeDoctor.length()>4)
        {
            this.numeDoctor=numeDoctor;
        }
        else {
            this.numeDoctor="Anonim";
        }
        if(codReteta.length()>5){
        this.codReteta = codReteta;
        }
        else {
            this.codReteta="ddddddd";
        }

    }

    public AbstractPrototype() {
      this.numeDoctor="Anonim";
      this.codReteta="123xcv";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractPrototype{");
        sb.append("numeDoctor='").append(numeDoctor).append('\'');
        sb.append(", codReteta='").append(codReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractPrototype clone();
}
