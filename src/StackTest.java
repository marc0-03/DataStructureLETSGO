import org.junit.Test;

import static org.junit.Assert.*;

    public class StackTest {
        @Test
        public void shouldBeAbleToCreateStack() {
            new Stack();
        }

        @Test
        public void createdStackShouldBeEmpty() {
            Stack S = new Stack();
            assertEquals(true, S.isEmpty());
        }

        @Test
        public void createdStackShouldHaveSizeZero() {
            Stack S = new Stack();
            assertEquals(0, S.size());
        }

        @Test
        public void createdStackShouldHaveSizeTwo() {
            Stack S = new Stack();
            S.push("Test");
            S.push("Another test");
            assertEquals(2, S.size());
        }

        @Test
        public void createdStackShouldReturnData() {
            Stack S = new Stack();
            S.push("Test");
            S.push("Another test");
            assertEquals("Another test", S.peek());
        }

        @Test
        public void createdStackShouldReturnDataTEST2() {
            Stack S = new Stack();
            S.push("Test");
            S.push("Another test");
            S.push("Another test2");
            assertEquals("Another test2", S.peek());
        }

        @Test
        public void createdStackShouldReturnDataTEST3() {
            Stack S = new Stack();
            S.push("Test");
            S.push("Another test");
            S.push("Another test2");
            S.push("Another test3");
            assertEquals("Another test3", S.peek());
        }

        @Test
        public void createdStackShouldReturnDataTEST4() {
            Stack S = new Stack();
            S.push("Test");
            S.push("Another test");
            S.push("Another test2");
            S.push("Another test3");
            assertEquals("Another test3", S.peek());
            S.pop();
            assertEquals("Another test2", S.peek());
            S.pop();
            assertEquals("Another test", S.peek());
            S.pop();
            assertEquals("Test", S.peek());
        }
}
