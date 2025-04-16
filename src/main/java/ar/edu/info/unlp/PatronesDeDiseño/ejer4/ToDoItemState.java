package ar.edu.info.unlp.PatronesDeDiseño.ejer4;

import java.time.Duration;

     public abstract class ToDoItemState {

     public void handleStart(ToDoItem toDoItem )
     {
          throw new RuntimeException("El objeto ToDoItem ya fue iniciado"); 
     }


     public abstract void togglePause(ToDoItem toDoItem);



     public abstract void handleFinish(ToDoItem toDoItem);



     public abstract Duration workedTime(ToDoItem toDoItem);

     public boolean puedeAgregarComentario(){
          return true;
     }
}
