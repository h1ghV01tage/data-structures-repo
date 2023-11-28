public class Main {

    public static void main(String[] args) {

        String [] strArr = new String[] {"a","b","c","d"};
        System.out.println(strArr);
        addElement(strArr, 4, 0,"z");
        for (String arr : strArr){
            System.out.println(arr);
        }
    }

    //A method that inserts a new element at the beginning of an array
    //at the index of 0
    public static void addElement(String a [], int size, int at, String newElement){

        //a loop that will shift the position of all the elements to the right
        //[a,b,c,d]
        for(int i = size - 1; i < 0; i -- ){
            //a[3] = a [2] and so on...
            a[i] = a [i -1];
        }
        //insert the first element
        a[at] = newElement;
    }




}