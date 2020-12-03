public class SeparateChainingHashSTTest {
    public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        st.put("Apple",18);
        st.put("Cherry",24);
        st.put("Elderberry",12);
        st.put("Hackberry",52);
        st.put("Lemon",11);
        st.put("Mango",19);
        st.put("Papaya",10);
        st.put("Raspberry",13);
        st.put("Strawberry",10);
        st.put("Xango",71);
        st.put("zucchini",33);
        st.delete("Mango");

        System.out.println(st.get("Apple"));
        System.out.println(st.get("Cherry"));
        System.out.println(st.get("Mango"));
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.contains("Apple"));

        assert(st.isEmpty() == false);
        assert(st.size() == 10);
        System.out.println("All Test Cases Passed.");
    }

}
