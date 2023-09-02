package basics;

public class TestArray {
    public static void main(String[] args) {
        double[] mylist ={1.9,2.9,3.4,3.5};

        // 1.print all  the array elements
        for(int i=0;i<mylist.length;i++)
        {
            System.out.println(mylist[i]+" ");
        }
        //  2. summing all  elements
        double total=0;
        for(int i=0;i< mylist.length;i++)
        {
            total+=mylist[i];
        }
        System.out.println("Total is :"+total);

        //  finding the largest element
        double max =  mylist[0];
        for(int i=1;i<mylist.length;i++)
        {
            if(mylist[i]>max)
                max = mylist[i];
        }
        System.out.println("Max is :"+max);
    }
}
