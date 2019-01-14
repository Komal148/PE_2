package com.stackroute.pe2;

/*Write a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive) and displays the average, minimum and maximum.Your program shall check for valid input. You should keep all the grades in an int[] and use a method for each of the computations*/

public class StudentAverageGrade {

    public int studentMinimum(int number,int array[])
    {
        int minimum = array[0];
        for( int i=1; i<number; i++)
        {
            if( (array[i] > 100) || (array[i] < 1) )
            {
                return -1;
            }

            if( minimum > array[i] )
            {
                minimum = array[i];

            }
        }
        return minimum;
    }

    public int studentMaximum(int number,int array[])
    {
        int maximum = array[0];
        for( int i=1; i<number; i++)
        {
            if( (array[i] > 100) || (array[i] < 1) )
            {
                return -1;
            }

            if( maximum < array[i])
            {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public String studentAverage(int number,int array[])
    {
        double average;
        double sum=0;
        for( int i=0; i<number ;i++ )
        {
            if( (array[i] > 100) || (array[i] < 1) )
            {
                return "-1";
            }
            sum=sum+array[i];
        }
        average=sum/number;
        return Double.toString(average)+"0";
    }

}