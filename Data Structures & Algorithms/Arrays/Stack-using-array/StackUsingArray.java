class Solution {
    int top = -1;
    int[] arr = new int[1000];

    void push(int x) {
        if (top == arr.length - 1) return;
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        st.push(10);
        st.push(20);
        st.push(40);

        System.out.println("Top element: " + st.peek());
        System.out.println("Popped: " + st.pop());
        System.out.println("Top element after pop: " + st.peek());
        System.out.println("Is stack empty? " + st.isEmpty());
    }
}