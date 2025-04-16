package ar.edu.info.unlp.PatronesDeDiseño.ejer4;

import java.time.Duration;
import java.time.LocalDateTime;

public class PendingState extends ToDoItemState{

    @Override
    public void handleStart(ToDoItem toDoItem) {
        toDoItem.setState(new InProgressState());
        toDoItem.setStartTime(LocalDateTime.now());
        }

    @Override
    public void togglePause(ToDoItem toDoItem) {
   }

    @Override
    public void handleFinish(ToDoItem toDoItem) {
      }

    @Override
    public Duration workedTime(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem no se inició"); }

   
}
    

    

