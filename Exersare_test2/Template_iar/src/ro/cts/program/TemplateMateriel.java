package ro.cts.program;

import java.util.List;

public abstract class TemplateMateriel {
    public abstract List<String> getMateriale();
    public abstract void materialLivrat(String material);
    public final void distribuieMateriale(){
        for(String material:getMateriale()){
            materialLivrat(material);
        }

    }
}
