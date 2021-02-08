import java.util.*;
class maths
{
	   public static void main(String args[])    throws InputMismatchException        
    {
        Scanner sc =new Scanner(System.in);

        maths obj = new maths();

        System.out.println("Enter 1 for algebraic equation, 2 for trigonometric equation and 3 for exponential equation.");
        int c=sc.nextInt();

        if(c==1)//checks if input id for algebraic 
        {
        System.out.println("Enter the point about which it's to be found.");//point at which linear dependence is to be checked
        int x=sc.nextInt();

        int sum=0,t=0;
        float a[],arr[];

        float m[][]=new float[3][3];
        
        for(int s=0;s<3;s++)
        {
            System.out.println("Enter the highest power of variable in equation.");
               t=sc.nextInt();
               t+=1;
               a=new float [t];
               arr=new float [t];
              for(int i=0;i<t;i++)
              {
                System.out.println("Enter coefficient of term with x to the power "+i+".");
                a[i]=sc.nextFloat();
                arr[i]=a[i];                
              }//for loop for taking inputs
  
            for(int p=0;p<3;p++)
            {
                for(int b=0;b<t;b++)
                sum+=a[b]*(obj.pow(x,b));
                m[p][s]=sum;
                sum=0;
              t--;          
              for(int q=0;q<t;q++)
              {
            a[q]=(q+1)*arr[q+1];
              }//for loop to find the derivative
              a[t]=0;
              for(int d=0;d<t;d++)
              arr[d]=a[d];              
            }
        }
        System.out.println("\n The Wronskian of "+"\n");
        //loops to print the Matrix
            for(int h=0;h<3;h++)
            {
                for(int g=0;g<3;g++)
                {
                    System.out.print(m[h][g]+"\t");
                }
                System.out.println(" ");
            }
            System.out.print ("\n is : ");
            //calculating the Wronskian
            float u=(m[0][0]*((m[1][1]*m[2][2])-(m[1][2]*m[2][1])));
float y=(m[0][1] * ((m[1][0] * m[2][2])-(m[1][2] * m[2][0])));
float z=(m[0][2] * ((m[1][0]*m[2][1])-(m[1][1] * m[2][0])));

System.out.println(u-y+z);
if(u-y+z==0)//checking for linear dependency
System.out.println("It is linearly dependent");
else 
System.out.println("It is linearly independent");
          }
          else 
          if(c==2)
          obj.trig();
          else 
          obj.main();
    sc.close();
}
//function to fnd power
int pow(int x,int k)
{
    int y=1;
    for(int i=0;i<k;i++)
    y*=x;
    return y;
}
//function for trigonometric equations
void trig() throws InputMismatchException
{
  Scanner sc=new Scanner (System.in);

  System.out.println("Enter the value for which it is to be found.");
  double x=sc.nextDouble();

  double a[];
  double a1[];
  double a2[];

  double m[][]=new double[3][3];
  double sum1=0,sum2=0,sum3=0;
  int r=0;

  for(int p=0;p<3;p++)
  {
    System.out.println("Enter number of terms in the equation.");
    int t=sc.nextInt();
    a=new double[t];
    a1=new double[t];
    a2=new double[t];

    System.out.println("Enter s-sin"+"\n"+"c-cos"+"\n"+"t-tan"+"\n"+"o-cosec"+"\n"+"e-sec"+"\n"+"h-cot");

  for(int i=0;i<t;i++)
  {
    System.out.println("Enter term "+(i+1));
    char ch=sc.next().charAt(0);
    if(ch=='s')
   { a[i]=Math.sin(x);
    sum1+=a[i];
     a1[i]=Math.cos(x);
     sum2+=a1[i];
     a2[i]=-a[i];
     sum3+=a2[i];
   }
    else
    if(ch=='c')
    {a[i]=Math.cos(x);
      sum1+=a[i];
      a1[i]=(-(Math.sin(x)));
      sum2+=a1[i];
      a2[i]=-a[i];
      sum3+=a2[i];
    }
    else 
    if(ch=='t')
    {a[i]=Math.tan(x);
      sum1+=a[i];
      a1[i]=((1/Math.cos(x))*(1/Math.cos(x)));
      sum2+=a1[i];
      a2[i]=2*a1[i]*a[i];
      sum3+=a2[i];
    }
    else 
    if(ch=='o')
    {a[i]=(1/(Math.sin(x)));
      sum1+=a[i];
      a1[i]=-a[i]*(1/Math.tan(x));
      sum2+=a1[i];
      a2[i]=a[i]*(a[i]*a[i]-(1/Math.tan(x)*(1/Math.tan(x))));
      sum3+=a2[i];
    }
    else 
    if(ch=='e')
    {a[i]=(1/Math.cos(x));
      sum1+=a[i];
      a1[i]=(a[i]*(1/Math.tan(x)));
      sum2+=a1[i];
      a2[i]=a[i]*((Math.tan(x)*Math.tan(x))+a[i]*a[i]);
      sum3+=a2[i];
    }
    else 
    if(ch=='h')
   {a[i]=(1/Math.tan(x)); 
    sum1+=a[i];
    a1[i]=-((1/Math.sin(x)*(1/Math.sin(x))));
    sum2+=a1[i];
    a2[i]=-2*a[i]*a1[i];
    sum3+=a2[i];
  }
}
  m[r][p]=sum1;
  m[r+1][p]=sum2;
  m[r+2][p]=sum3;
  sum1=0;
  sum2=0;
  sum3=0;
  r=0;
}
  System.out.println("\n The Wronskian of "+"\n");
            for(int h=0;h<3;h++)
            {
                for(int g=0;g<3;g++)
                {
                    System.out.print(m[h][g]+"\t");
                }
                System.out.println(" ");
            }
            System.out.print ("\n is : ");

            double u=(m[0][0]*((m[1][1]*m[2][2])-(m[1][2]*m[2][1])));
double y=(m[0][1] * ((m[1][0] * m[2][2])-(m[1][2] * m[2][0])));
double z=(m[0][2] * ((m[1][0]*m[2][1])-(m[1][1] * m[2][0])));

System.out.println(u-y+z);
if(u-y+z==0)//checking for linear depenency
System.out.println("It is linearly dependent");
else 
System.out.println("It is linearly independent");

sc.close();
}//end of main 


void main() throws InputMismatchException
{
  Scanner sc=new Scanner(System.in);
        System.out.println("Three function of form a*e^(b*x):");
        float a[]=new float[3];
        float b[]=new float[3];
        System.out.println("Enter value of a and b three times:");

        for(int i=0;i<3;i++)
            {
              System.out.println("Enter value for a.");
              a[i]=sc.nextFloat();
              
              System.out.println("Enter value for b.");
              b[i]=sc.nextFloat();

            }

        System.out.println("Three functions are:");

        for(int i=0;i<3;i++)
            System.out.println((i+1)+"expression: "+a[i]+"e^"+b[i]);
        Wronskian(a,b);
        sc.close();
}

void Wronskian(float A[],float B[])
{
   
        float a1=A[0];
        float b1=B[0];
        float a2=A[1];
        float b2=B[1];
        float a3=A[2];
        float b3=B[2];
        float Determinant;
        Determinant=(a1*a2*a3)*(((b2*b3*b3)-(b2*b2*b3))-((b1*b3*b3)-(b2*b2*b3))+((b2*b2*b1)-(b1*b1*b2)));
        System.out.println("The wronskian value="+Determinant+"e^"+(b1+b2+b3));
        if(Determinant==0)
            System.out.println("The functions are linearly dependent.");
        else
           System.out.println("The functions are linearly independent.");
  
}


}//end of class
