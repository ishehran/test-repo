public class HelloWorld{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j>0 && j<n-1 || i==(n-1)/2 || j==0 && i!=0 || j ==n-1 && i!=0)
                    System.out.print("#");
                else
                    System.out.print(" ");
                }
                //System.out.print(i+""+j+" ");
                System.out.print("  ");
                //B
                for (int j =0;j<n;j++){
                    if(i==0 && j!=n-1 || i==n-1 && j!=n-1 || i==(n-1)/2 && j!=n-1 || j==0 || j==n-1 && i!=0 && i!=(n-1)/2 && i!=n-1 ){
                        System.out.print("#");
                    } else{
                        System.out.print(" ");
                        
                    }
                }
                System.out.print("  ");
                for (int j =0;j<n;j++){
                    if(i==0&&j!=0 || j==0 && i!=0 && i!=n-1 || i==n-1 && j!=0){
                        System.out.print("#");
                    } else{
                        System.out.print(" ");
                        
                    }
                }
            System.out.println();
        }
    }
}

// Task for myself print ABC in console using java only