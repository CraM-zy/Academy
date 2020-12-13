package by.academy.homework.collections;

import java.util.Iterator;

public class Task_3<T> implements Iterator {
    T[][] array;
    int i,j;

    @Override
    public boolean hasNext() {
        if(array == null)
            return false;
        else
        if(i >= array.length || j>= array[i].length) {
            System.out.println(" Index more then size of array!");
            return false;
        }
        else {
            System.out.println(" This index is exist in array!");
            return true;
        }
    }

    @Override
    public T next() {
        T next_el = array[i][j++];
        if (j >= array[i].length) {
            i++;
            j = 0;
        }
        return next_el;
    }

    public Task_3()
    {
        super();
    }

    public Task_3(T[][]array)
    {
        this.array = array;
    }
}
