//package ru.Mika3210.javapractice2020.pr13;
//
//public class Studs {
//
//    public static void main(String[] args) {
//        Studs stu = new Studs();
//        stu.sort();
//    }
//
//    Student[] st = new Student[3];
//    int[] idNum = new int[3];
//
//    public Student[] getSt() {
//        return st;
//    }
//
//    public void setSt(Student[] st) {
//        this.st = st;
//    }
//
//    public int[] getIdNum() {
//        return idNum;
//    }
//
//    public void setIdNum(int[] idNum) {
//        this.idNum = idNum;
//    }
//
//    public Studs(){
//        st[0]= new Student(4, 0);
//        st[1]= new Student(3.5, 2);
//        st[2]= new Student(5, 1);
//    }
//
//    public void sort(){
//        for (int i = 0; i <3 ; i++) {
//            idNum[i] = st[i].getIdNum();
//        }
//        for (int i = 0; i < idNum.length - 1; i++) {
//            for (int j = idNum.length - 1; j > i; j--) {
//                if (idNum[j - 1] > idNum[j]) {
//                    double a = idNum[j - 1];
//                    idNum[j - 1] = idNum[j];
//                    idNum[j] = (int) a;
//                }
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(idNum[i]+" ");
//        }
//    }
//}
