package cts.test.design.patterns.structurals.flyweight;

import java.util.HashMap;

public class ModelFactory {

    HashMap<String, Interface3DModel> models = new HashMap<>();  // map to store and reuse 3D model instances by name


    //Retrieves a model by name. If the model does not exist in the map, it creates a new instance of Model3D,
    // stores it in the map, and then returns it.
   public Interface3DModel getModel(String name)
   {
       Interface3DModel model = models.get(name);
       if(model==null)
       {
           model = new Model3D(name);
           models.put(name, model);
       }
       return model;
   }
}
