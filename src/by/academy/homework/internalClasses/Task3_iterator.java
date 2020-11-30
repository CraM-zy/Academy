package by.academy.homework.internalClasses;
import java.util.Iterator;

public class Task3_iterator<T> implements Iterator {
    T[] array;
    int i;

    @Override
    public boolean hasNext()
    {
        if(array==null)
            return false;
        else
            if(i >= array.length)
            {
                System.out.println(" Index more then size of array!");
                return false;
            }
            else
            {
                System.out.println(" This index is exist in array!");
                return true;
            }
    }

    @Override
    public T next()
    {
        return array[i ++];
    }

    public Task3_iterator()
    {
        super();
    }

    public Task3_iterator(T[]array)
    {
        this.array = array;
    }
}
