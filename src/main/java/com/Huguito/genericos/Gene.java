package com.Huguito.genericos;

class Gene<T extends Number> {
    T[] nums;

    // CONSTRUCTOR
    Gene(T[] nums){
        this.nums = nums;
    }

    // METODO
    double average(){
        double sum = 0;
        for(T num : nums){
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }


}
