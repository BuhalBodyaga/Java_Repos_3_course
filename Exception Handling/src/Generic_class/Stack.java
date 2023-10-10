package Generic_class;
import java.util.ArrayList;
public class Stack<T> {
    int size;
    private int pointer;

    ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
        this.size = 10;
        pointer = -1;
    }

    public Stack(int size) {
        stack = new ArrayList<>();
        this.size = size;
        pointer = -1;
    }

    public T pop() throws StackError {
        if (pointer == -1)
            throw new StackError("попытка извлечения из пустого стека");
        return stack.remove(pointer--);
    }

    public void push(T el) throws StackError {
        if (pointer == size - 1)
            throw new StackError("попытка положить в заполненный стек");
        else
            stack.add(++pointer, el);
    }

    @Override
    public String toString() {
        return "STACK: "  + stack;
    }

    public boolean search(T a) throws StackError {
        if (pointer == -1)
            throw new StackError("попытка поиска в пустом стеке"); //2 пункт на блекборде
        return stack.contains(a);
    }
}