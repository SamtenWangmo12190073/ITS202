public class BinarySearchTreeTest{
    public static void main(String[] args) {
        BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();
        assert(bst.isEmpty()==true);
        bst.put("Abdul",1);
        System.out.println(bst.get("Abdul"));
        bst.put("Hitik",2);
        bst.put("Sai",3);
        bst.put("Samal",8);
        System.out.println(bst.get("Sai"));
        bst.put("Tashi",4);
        System.out.println(bst.size());
        System.out.println(bst.min());
        System.out.println(bst.floor("Hitik"));
      
        System.out.println(bst.select(3));
        System.out.println(bst.keys("Abdul","Tashi"));
        bst.put("Chimi",12);
        bst.put("Samal",14);
        System.out.println(bst.get("Samal"));
        bst.put("Nima",17);
        System.out.println(bst.size());
        System.out.println(bst.get("Chimi"));
        System.out.println(bst.floor("Chimi"));
        System.out.println(bst.keys("Abdul","Tashi"));



        
        //System.out.print(bst.keys());
        System.out.print("\n");

        System.out.println("All test case pass");
    }

}