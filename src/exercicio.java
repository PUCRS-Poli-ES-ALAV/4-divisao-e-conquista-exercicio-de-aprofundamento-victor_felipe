public class exercicio{
    public static void main(String[] args){
        int[] array1 = {67,3,6,30,55,12,45,10,4,22,80};
        exer1(array1);
        for(int i=0;i<array1.length;i++)
        {
        System.out.println(array1[i]);
        }
    }

    public static int[] exer1(int v[]) {
        int aux;
        int max = v.length;
        int min = 0;
        int mid = (max + 0) / 2;
        int[] l = new int[mid];
        int[] r = new int[max - mid];

        if(v.length < 2) {
            return v;
        } else {
            
            for(int p=0; p < mid; p++)
                l[p]=v[p];
            for(int q=0, p=0; q < max - mid; q++, p++)
                r[q]=v[p];
        }
        exer1(l);
        exer1(r); 
        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r)
    {
        int i=0, j=0, k=0;

        while(i < l.length && j < r.length)
            {
                if(l[i] < r[j])
                    {
                        i++;
                        k++;
                    }
                else
                    {
                        j++;
                        k++;
                    }
            }

        /*copying remaining elements into a*/
        while(i<l.length)
            {
                i++;
                k++;
            }

        while(j<r.length)
            {
                j++;
                k++;
            }
        return ArrayUtils.addAll(l, r);;
    }
}