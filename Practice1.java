//yusef

public class Practice1{
    public static void main(String[] args){
        int sum = 0;
        double avg = 0;
        int io = 0;
        int [] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};
       int [] testGrades = {99, 98, 88, 77, 85, 90};
        System.out.println ("Array length: " + primeNums.length);
        String [] friends = {"Suhaib", "Nkosi", "Muhammed"};
      
      
        for(int i = 0; i <= friends.length-1; i++){
            System.out.println(friends[i]);
        }
        
        
        for(int i = 0; i <= testGrades.length-1; i++){

            sum += testGrades[i];
        }
        avg = sum/testGrades.length;
        
        
        sum=0;


        while(io<=testGrades.length-1){
            sum += testGrades[io];
            io++;

        }
        avg = (double)sum/testGrades.length;

        System.out.println("Average test grades: " + avg);

    }
}   