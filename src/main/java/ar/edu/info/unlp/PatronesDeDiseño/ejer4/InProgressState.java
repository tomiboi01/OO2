package ar.edu.info.unlp.PatronesDeDiseño.ejer4;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgressState extends ToDoItemState{
    public InProgressState()
    {
        
    }

   

    @Override
    public void togglePause(ToDoItem toDoItem) {
       toDoItem.setState(new PausedState());}

    @Override
    public void handleFinish(ToDoItem toDoItem) {
        toDoItem.setState(new FinishedState());
        toDoItem.setEndTime(LocalDateTime.now());
        }


    @Override
    public Duration workedTime(ToDoItem toDoItem) {
        LocalDateTime fechaDeFinalizacion = LocalDateTime.now();
        toDoItem.setEndTime(fechaDeFinalizacion);
        return toDoItem.getWorkedTime(toDoItem.getStartTime(), fechaDeFinalizacion);
    }

    @Override
    public boolean puedeAgregarComentario() {
       return true;
    }


}
