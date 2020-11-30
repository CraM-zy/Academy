package by.academy.homework.internalClasses;

public class Task2_Array<T>
{
    T[] array;
    int SIZE;


    public Task2_Array()
    {
        array = (T[])(new Object[16]);
    }

    public Task2_Array(int size)
    {
        array = (T[])(new Object[size]);
    }

    public T ADD(T object)
    {
        if( SIZE == array.length )
        {
            T[] newArray = (T[])(new Object[SIZE * 2 + 1]);
            System.arraycopy(array, 0 , newArray, 0 , array.length);
            array = (T[]) newArray;
        }
        else
        {
            if(array == null)
            {
                array = (T[])(new Object[2]);
            }
        }
        array[SIZE ++] = object;
        return object;
    }

    public T getIndex(int i)
    {
        T el = (T)array[i];
        return el;
    }

    public T getLast()
    {
        T last = (T) array[array.length - 1];
        return last;
    }

    public T getFirst()
    {
        T first = (T) array[0];
        return first;
    }

    public int inputSize()
    {
        System.out.println(array.length);
        return array.length;
    }

    public int lastInd()
    {
        int index = 0;
        while (array[array.length] != null)
        {
            for (int i = 0; i <= array.length - 1; i++) {
                index = i - 1;
                break;
            }
        }
        return index;
    }

    public void DeleteInd(int ind)
    {
        if( array [array.length] != null)
        { T[] newArray = (T[])(new Object[array.length - 1]);
           if(ind != 0)
           {
               System.arraycopy(array, 0 , newArray, 0, array.length - 1);
               System.arraycopy(array, ind +1, newArray, ind, array.length - ind - 1 );
           }
           else
           {
               System.arraycopy(array, 1 , newArray, 0, array.length - 1);
           }
        }
        else
            System.out.println(" Array is NULL! ");
    }

    public void DeleteValue(T obj)
    {
        if( array [array.length] != null)
        {
            T[] newArray = (T[])(new Object[array.length - 1]);
            int index = 0;
            for (int i = 0; i <= array.length; i++) {
                if (array[i] == obj) {
                    index = i;
                    if(index != 0)
                    {
                        System.arraycopy(array, 0, newArray, 0, array.length - 1);
                        System.arraycopy(array, index +1, newArray, index, array.length - index - 1 );
                    }
                    else
                    {
                        System.arraycopy(array, 1 , newArray, 0, array.length - 1);
                    }
                    break;
                }
            }
        }
        else
            System.out.println(" Array is NULL! ");
    }
}
