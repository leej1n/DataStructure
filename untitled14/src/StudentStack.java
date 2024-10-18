public class StudentStack {
    Student[] stack;
    int top;

    public StudentStack(int capacity) {
        stack = new Student[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Student student) {
        if (top == stack.length - 1) {
            // If stack is full, resize
            Student[] newStack = new Student[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = student;
    }

    public Student pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public Student peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }
}