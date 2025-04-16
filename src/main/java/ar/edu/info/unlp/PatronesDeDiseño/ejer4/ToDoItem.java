package ar.edu.info.unlp.PatronesDeDiseño.ejer4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private ToDoItemState state;
    private List<String> comments;
    private LocalDateTime endTime;
    private LocalDateTime startTime;
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
    public ToDoItem(String name)
    {
        this.name = name;
        this.state = new PendingState();
        this.comments = new ArrayList<>();
    }

    void setState(ToDoItemState state)
    {
        this.state = state;
    }

    

    /**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
    public void start()
    {
        state.handleStart(this);
    }

/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
    public void togglePause()
    {
        state.togglePause(this);
    }


/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
    public void finish()
    {
        state.handleFinish(this);
    }


/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
    public Duration workedTime()
    {
        return state.workedTime(this);
    }
/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
    public boolean addComment(String comment)
    {
        if (state.puedeAgregarComentario()) {
            this.comments.add(comment);
            return true;
        }
    return false;
    }

    void setStartTime(LocalDateTime dateTime) {
    this.startTime = dateTime;
    }

    void setEndTime(LocalDateTime dateTime) {
        this.endTime = dateTime;
    }


    public LocalDateTime getEndTime() {
        return endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    Duration getWorkedTime (LocalDateTime start, LocalDateTime end)
    {
        return Duration.between(start, end);
    }
}
