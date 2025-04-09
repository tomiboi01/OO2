package ar.edu.info.unlp.ejer4;

import java.time.Duration;
import java.time.LocalDateTime;

public interface ToDoItemState {

     public void handleStart(ToDoItem toDoItem );


     public void togglePause(ToDoItem toDoItem);



     public void handleFinish(ToDoItem toDoItem);



     public Duration workedTime(ToDoItem toDoItem, LocalDateTime fechaDeInicio, LocalDateTime fechaDeFin);

     public boolean puedeAgregarComentario();
}
