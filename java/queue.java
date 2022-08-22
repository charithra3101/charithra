import java.util.*;

class QueueException extends Exception{
    public void Error()
    {
        System.out.println("Queue is full");

    }
}
class Queue{
    int front;
    int rear;
    int q[];
    Queue(int n)
    {
        q=new int[n];
    }

    void insert(int ele)throws QueueException
    { 
         if(rear==q.length)
        {
            throw new QueueException();
        }
        //if(rear>=q.length-1)
    //{}
    if(front==-1)
    front=0;
    q[rear++]=ele;
}
int delete()
{
    int ele;
    if(front==-1)
    {
       throw new ArrayIndexOutOfBoundsException();
    }
    if(front==rear)
    {
        ele=q[front];
        rear=front=-1;
    }
    else{
        ele=q[front++];
    }
    return ele;
}
void display()
{ 
    int i;
    if(front==-1)
    {
        System.out.println("Queue is empty");
        return;
    }
    for(i=front;i<=rear;i++)
    System.out.println("The queue elements are"+q[i]+"\t");

}
}
public class queue {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Queue array:");
        int size=sc.nextInt();
        Queue que = new Queue(size);
         try{
            while(true)
            {
                System.out.println("\n\n\tQueue operations \n1.Insert\n 2.Delete \n3.Display\n");
                System.out.println("Enter your choice");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:System.out.print("\nEnter the number to insert:");
                            que.insert(sc.nextInt());
                            break;
                    case 2:System.out.println("Deleted item is:"+que.delete());
                          
                            break;
                    case 3:que.display();
                              break;

                 default:System.out.println("WRONG CHOICE");
                          return;
                }
            }
        }
            catch(QueueException e)
            {
               e.Error();
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Queue is empty");
            }
        }
    }

