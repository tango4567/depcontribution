/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;

/**
 *
 * @author ultra
 */ 
import com.sun.javafx.geom.AreaOp;
import java.util.Scanner;
public class binarySearch {
    static int[] array;
    static int key;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of length ");
        int i,temp=0;
        int num = input.nextInt();
         array = new int[num];
         System.out.println("Enter the array of element ");
        for(i=0;i<num;i++)
        {
            array[i] = input.nextInt();
        }
        for(i=0;i<num;i++)
        {  
            for(int j=0;j<num;j++)
            {                
            if(array[i]<array[j]){
            temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            }
            
            }
            
        }
        
        System.out.println("sorting in your element ");
        for(i=0;i<num;i++)
        {
            System.out.println(array[i]);
        }
        
        System.out.println("Enter the value of Search ");
        key = input.nextInt();
               int low =0;
               int high =array.length;
              int index=0;
               index=binarySch(low,high,key,num);
            if(index==-1)
            {
                System.out.println("element is not exist");
            }else{
                System.out.println("Element is founded on "+index+" index.");
            }
    }
    static int binarySch(int low,int high,int key ,int num) {
        
        int found=0;
         
        while(low<=high)
         {
             
         int mid=(low+high)/2;
         if(array[mid]<key){
             low=mid+1;            
             
         }
         else if(array[mid]>key)
         {
             high=mid-1;
             
            
         }
         else if(array[mid]==key)
         {
             found=mid;
             
             break;
         }
         else
         {
            found=-1;
         }
     
    }
        return found;
    }

}