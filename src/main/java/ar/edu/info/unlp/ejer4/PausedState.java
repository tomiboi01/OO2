package ar.edu.info.unlp.ejer4;

import java.time.Duration;
import java.time.LocalDateTime;

public class PausedState implements ToDoItemState{
    public PausedState(){
        
    }

    @Override
    public void handleStart(ToDoItem toDoItem) {
    }

    @Override
    public void togglePause(ToDoItem toDoItem) {
        toDoItem.setState(new InProgressState());}

    @Override
    public void handleFinish(ToDoItem toDoItem) {
        toDoItem.setState(new FinishedState());
        toDoItem.setEndTime(LocalDateTime.now());}
    
    

    @Override
    public boolean puedeAgregarComentario() {
        return true;}

    @Override
    public Duration workedTime(ToDoItem toDoItem, LocalDateTime fechaDeInicio, LocalDateTime fechaDeFin) {
        LocalDateTime fechaDeFinalizacion = LocalDateTime.now();
        toDoItem.setEndTime(fechaDeFinalizacion);
        return Duration.between(fechaDeInicio, fechaDeFinalizacion);
    }
    
   

}
