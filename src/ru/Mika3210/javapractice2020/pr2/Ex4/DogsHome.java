package ru.Mika3210.javapractice2020.pr2.Ex4;

public class DogsHome {
    public Dog[] arr = new Dog[50];
    public int i;

    public void addDogs(Dog n){
        arr[i]=n;
        i++;
    }

    public void list(){
        for (int p=0; p<i+1;p++){
            if (arr[p]!=null)
                System.out.println(arr[p]);
        }
    }
}
