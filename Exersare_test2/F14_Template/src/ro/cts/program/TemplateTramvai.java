package ro.cts.program;

import java.util.List;

public abstract class TemplateTramvai {

    protected abstract List<String> getStatii();
    protected abstract void oprireInStatia(String numeStatii);
    public final void parcurgeTraseu()
   {
       for(String statie:getStatii()){
           oprireInStatia(statie);
       }
   }
}
