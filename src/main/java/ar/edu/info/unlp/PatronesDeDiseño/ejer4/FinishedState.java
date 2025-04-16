package ar.edu.info.unlp.PatronesDeDiseño.ejer4;

import java.time.Duration;

public class FinishedState extends ToDoItemState{

    @Override
    public void togglePause(ToDoItem toDoItem) {
        }

    @Override
    public void handleFinish(ToDoItem toDoItem) {
          }

    @Override
    public Duration workedTime(ToDoItem toDoItem) {
        return toDoItem.getWorkedTime(toDoItem.getStartTime(), toDoItem.getEndTime());
    }

    @Override
    public boolean puedeAgregarComentario() {
       return false; }

}
