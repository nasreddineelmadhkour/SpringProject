package tn.esprit.sprintproject.Service;

import java.util.List;

public interface Iservice <object>{

    object Create(object T);
    List<object> Read();
    object Update(int ID,object T);
    String  Delete(int ID );

}
