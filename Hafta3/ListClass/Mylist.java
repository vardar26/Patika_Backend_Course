package Hafta3.ListClass;

import java.util.Arrays;

public class Mylist <T> {

    private T[] array;
    private int size = 0;
    private int capacity;


    //kapasite tanımlayan metod
    public Mylist() {
        this.capacity = 10;
        array = (T[]) new Object[capacity];

    }

    //2 katına çıkaran metod, aslında yeni bir dizi oluşturup eskisinin kapasitesinin 2 katını alıyoruz
    private void growsize () {
        int newCapacity = capacity * 2;
        T[] newArray = (T[]) new Object[newCapacity];


        //eski elemanları yeni diziye ekleme metodu
        for (int i = 0; i <size ; i++) {
            newArray[i]= array[i];
        }

        //yeni diizini aktif ediyoruz
        array = newArray;
        capacity = newCapacity;
    }

    //eleman ekleme metodu

    public void add(T element){
        if (size == capacity) {
            growsize();
        }
        array[size++] = element;
    }

    //size vermek için
    public int size(){
        return size;
    }

    //belirli indeksteki elemanı döndüren metod
    public T get(int index) {
        return (index >= 0 && index < size) ? array[index] : null;
    }

    //belirli indeksteki elemanı silen metod

    public void remove(int index) {
        if (index < 0 || index >= size) return;

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[--size] = null; // Son elemanı null yap ve size azalt
    }

    // Tüm elemanları temizleyen metot
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        return "Mylist{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
