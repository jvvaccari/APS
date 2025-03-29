package Command;

import java.util.function.Consumer;

public class GenericCommand<T> implements ICommand {
    private T receiver;
    private Consumer<T> executeAction;
    private Consumer<T> undoAction;

    public GenericCommand(T receiver,Consumer<T> executeAction,Consumer<T> undoAction){
        this.receiver = receiver;
        this.executeAction = executeAction;
        this.undoAction = undoAction;
    }

    @Override
    public void execute(){
        executeAction.accept(receiver);
    }

    @Override
    public void undo(){
        undoAction.accept(receiver);
    }
}
