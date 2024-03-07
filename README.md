sortiranje

public static void main(String[] args){

//sort array

        int array[] = new int[]{9,8,5,1,0,-5};
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++){
                int temp=0;
            //rastuci niz
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
            System.out.println(array[i]);
        }

}
        
        
    
