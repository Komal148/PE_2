public class StudentAvgGrade {

    public int studentMin(int num,int arr[])
    {
        int min=arr[0];
        for( int i=1; i<num; i++)
        {
            // System.out.println(arr[i]);
            if( (arr[i] > 100) || (arr[i] < 1) )
            {
                //System.out.println("hello");
                return -1;
            }

            if( min > arr[i] )
            {
                //System.out.println(arr[i]);
                min =arr[i];

            }
        }
        return min;
    }
    public int studentMax(int num,int arr[])
    {
        int max=arr[0];
        for( int i=1; i<num; i++)
        {
            if( (arr[i] > 100) || (arr[i] < 1) )
            {
                return -1;
            }

            if( max < arr[i])
            {
                max =arr[i];
            }
        }
        return max;
    }
    public String studentAvg(int num,int arr[])
    {
        double avg;
        double sum=0;
        for( int i=0; i<num ;i++ )
        {
            if( (arr[i] > 100) || (arr[i] < 1) )
            {
                return "-1";
            }
            sum=sum+arr[i];
        }
        avg=sum/num;
        return Double.toString(avg)+"0";
    }

}