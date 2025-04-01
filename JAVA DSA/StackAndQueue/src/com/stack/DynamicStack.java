package com.stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // It will call Custom Stack
    }

    public DynamicStack (int size){
        super(size); // it will call customstack[size]
    }

    @Override
    public boolean push(int item) {
        // this take care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int [data.length * 2];

            // copy of all previous item in new data
            for(int i =0; i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we array is not full
        // insert item
        return super.push(item);
    }
}
