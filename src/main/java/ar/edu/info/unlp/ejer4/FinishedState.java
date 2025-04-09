package ar.edu.info.unlp.ejer4;

import java.time.Duration;
import java.time.LocalDateTime;

public class FinishedState implements ToDoItemState{

    @Override
    public void handleStart(ToDoItem toDoItem) {
        }

    @Override
    public void togglePause(ToDoItem toDoItem) {
        }

    @Override
    public void handleFinish(ToDoItem toDoItem) {
          }

    @Override
    public Duration workedTime(ToDoItem toDoItem, LocalDateTime fechaDeInicio, LocalDateTime fechaDeFin) {
        return Duration.between(fechaDeInicio, fechaDeFin);}

    @Override
    public boolean puedeAgregarComentario() {
       return false; }

}
