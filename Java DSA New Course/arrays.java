import java.util.*;

public class arrays {

    // pass by reference
    // public static void update(int marks[]) {
    // for (int i = 0; i < marks.length; i++) {
    // marks[i] += 1;

    // }
    // }

    // Linear Search
    // public static int linearsearch(int numbers[], int key) {

    // for (int i = 0; i < numbers.length; i++) {
    // if (numbers[i] == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // print canteencard
    // public static int canteencard(String menu[], String key) {

    // for (int i = 0; i < menu.length; i++) {
    // if (menu[i] == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // print largest value
    // public static int getlargest(int numbers[]) {

    // int largest = Integer.MIN_VALUE; // - infinity
    // int smallest = Integer.MAX_VALUE; // +infinity

    // for (int i = 0; i < numbers.length; i++) {
    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }
    // if (smallest > numbers[i]) {
    // smallest = numbers[i];
    // }
    // }
    // System.out.println("Smallest number is = " + smallest);
    // return largest;
    // }

    // print binary search
    // public static int binarysearch(int numbers[], int key) {

    // int start = 0, end = numbers.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;

    // if (numbers[mid] == key) {
    // return mid;
    // }
    // if (numbers[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // print reverse array
    // public static void reverse(int numbers[]) {
    // int first = 0, last = numbers.length - 1;

    // while (first < last) {
    // int temp = numbers[first];
    // numbers[first] = numbers[last];
    // numbers[last] = temp;

    // first++;
    // last--;
    // }
    // }

    // // print pairs in array
    // public static void printpairs(int numbers[]) {
    // int tp = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // int curr = numbers[i];
    // for (int j = i + 1; j < numbers.length; j++) {
    // System.out.print("(" + curr + "," + numbers[j] + ")");
    // tp++;
    // }
    // System.out.println();
    // }
    // System.out.println("Total Pairs is = " + tp);
    // }

    // print sub arrays
    // public static void printsubarray(int numbers[]) {

    // int tp = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // for (int k = start; k <= end; k++) { // print
    // System.out.print(numbers[k] + " "); // print sub arrays
    // }
    // tp++;

    // System.out.println();
    // }
    // System.out.println();
    // }
    // System.out.println("Total sub arrays are = " + tp);
    // }

    // Print Sum of sub array By Brute force method

    // public static void subarraysum(int number[]) {
    // int curr = 0;
    // int minsum = Integer.MAX_VALUE;

    // for (int i = 0; i < number.length; i++) {
    // int start = i;
    // for (int j = i; j < number.length; j++) {
    // int end = j;
    // curr = 0;
    // for (int k = start; k <= end; k++) {
    // curr += number[k];
    // }
    // System.out.println(curr);
    // if (minsum > curr) {
    // minsum = curr;
    // }
    // }
    // }
    // System.out.println("Maximum Sum of sub array is = " + minsum);
    // }

    // Print max sum of sub array using prefix
    // public static void maxsum(int number[]) {
    // int currsum = 0;
    // int maxsum = Integer.MIN_VALUE;
    // int prefix[] = new int[number.length];

    // prefix[0] = number[0];
    // // calculate prefix in array
    // for (int i = 1; i < prefix.length; i++) {
    // prefix[i] = prefix[i - 1] + number[i];
    // }

    // for (int i = 0; i < number.length; i++) {
    // int start = i;
    // for (int j = i; j < number.length; j++) {
    // int end = j;
    // // Ternray Operator
    // currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

    // if (maxsum < currsum) {
    // maxsum = currsum;
    // }
    // }
    // }
    // System.out.println("max sum =" + maxsum);

    // }

    // print max sub array sum using kadane`s algorithm
    // public static void kadanes(int numbers[]) {
    // int ms = Integer.MIN_VALUE;
    // int cs = 0;

    // for (int i = 0; i < numbers.length; i++) {
    // cs += numbers[i];
    // if (cs < 0) {
    // cs = 0;
    // }
    // ms = Math.max(cs, ms);
    // }
    // System.out.println("Our max sub array sum is =" + ms);

    // }

    // Medium level DSA question
    // print the total trapped water are collected
    // public static int trappedrainwater(int height[]) {
    // int n = height.length;
    // // calculate left max boundary array
    // int leftmax[] = new int[n];
    // leftmax[0] = height[0];

    // for (int i = 1; i < n; i++) {
    // leftmax[i] = Math.max(height[i], leftmax[i - 1]);
    // }
    // // calculate right max boundary array
    // int rightmax[] = new int[n];
    // rightmax[n - 1] = height[n - 1];

    // for (int i = n - 2; i >= 0; i--) {
    // rightmax[i] = Math.max(height[i], rightmax[i + 1]);
    // }

    // int trappedwater = 0;
    // // loop
    // for (int i = 0; i < n; i++) {
    // int waterlevel = Math.min(leftmax[i], rightmax[i]);

    // trappedwater += (waterlevel - height[i]);

    // }
    // return trappedwater;
    // }

    // print the maximum using buying and selling stocks profit
    // public static int buyandsellstocks(int prices[]) {
    // int buyprice = Integer.MAX_VALUE;
    // int maxprofit = 0;

    // for (int i = 0; i < prices.length; i++) {
    // // profit
    // if (buyprice < prices[i]) {

    // int profit = prices[i] - buyprice; // today profit

    // maxprofit = Math.max(maxprofit, profit);
    // // System.out.println("The day you have getting " + prices[i] + " profit is
    // :" + profit);
    // } else {
    // buyprice = prices[i];

    // }
    // }
    // return maxprofit;
    // }

    // sort the array using bubble sort
    // public static void bubblesort(int arr[]) {

    // for (int turn = 0; turn < arr.length - 1; turn++) {
    // for (int j = 0; j < arr.length - 1 - turn; j++) {
    // if (arr[j] > arr[j + 1]) {
    // // swap
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // public static void PrintArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // sort array using selection sort

    // public static void selectionsort(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // int minpos = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[minpos] < arr[j]) {
    // minpos = j;
    // }
    // }
    // // swap
    // int temp = arr[minpos];
    // arr[minpos] = arr[i];
    // arr[i] = temp;
    // }
    // }

    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // sort array using insertion sort
    // public static void insertionsort(int arr[]) {
    //     for (int i = 1; i < arr.length; i++) {
    //         int curr = arr[i];
    //         int prev = i - 1;
    //         // finding out the correct position of insertion
    //         while (prev >= 0 && arr[prev] > curr) {
    //             arr[prev + 1] = arr[prev];
    //             prev--;
    //         }
    //         // insertion sort
    //         arr[prev + 1] = curr;
    //     }
    // }

    // public static void printArr(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    // Counting sort
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            // frequency array 
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;

            }
        } 
        }

        public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


    



    public static void main(String args[]) {
        // int marks[] = { 97, 98, 99 };
        // update(marks);

        // // print our marks
        // for (int i = 0; i < marks.length; i++) {

        // System.out.print(marks[i] + " ");
        // }
        // System.out.println();

        // print linearsearch
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 12;
        // int index = linearsearch(numbers, key);
        // if (index == -1) {
        // System.out.println("Not Found ");
        // } else {
        // System.out.println("Key is found at index = " + index);
        // }

        // String menu[] = { " Dosa ", "Idali sambar", "Samosa", " Chole bhature",
        // "Fruite", " Coca", " Pepsi",
        // " Sting" };
        // String key = " Pepsi";
        // int choose = canteencard(menu, key);
        // if (choose == -1) {
        // System.out.println("not found ");
        // } else {
        // System.out.println("Your choose item is found at position = " + choose);
        // }

        // print largest number
        // int numbers[] = { 1, 2, 6, 3, 5 };
        // System.out.println("Value is = " + getlargest(numbers));

        // print binary search
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 23;

        // System.out.println("The key is at position =" + binarysearch(numbers, key));

        // print reverse array
        // int numbers[] = { 2, 4, 6, 8, 10 };

        // reverse(numbers);

        // for (int i = 0; i < numbers.length; i++) {

        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();

        // print pairs in array
        // int numbers[] = { 2, 4, 6, 8, 10 };

        // printpairs(numbers);

        // print sub arrays
        // int numbers[] = { 2, 4, 6, 8, 10 };
        // printsubarray(numbers);

        // Print maximum sum of sub array By Brute force method
        // int number[] = { 2, 4, 6, 8, 10 };
        // subarraysum(number);

        // print maximum sum of sub array using prefix method
        // int number[] = { 1, -2, 6, -1, 3 };
        // maxsum(number);

        // print max sub array sum using kadane`s algorithm
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // kadanes(numbers);

        // Medium level DSA question
        // print the total trapped water are collected
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println("Total water are collected by rain is :" +
        // trappedrainwater(height));

        // print the maximum using buying and selling stocks profit
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println("Maximum profit is :" + buyandsellstocks(prices));

        // sort array using bubble sort
        // int arr[] = { 5, 4, 3, 2, 1 };
        // bubblesort(arr);
        // PrintArr(arr);

        // sort array using selection sort
        // int arr[] = { 5, 4, 3, 2, 1 };
        // selectionsort(arr);
        // printArr(arr);

        // sort array using insertion sort
        // int arr[] = { 5, 4, 3, 2, 1 };
        // insertionsort(arr);
        // printArr(arr);

        // counting sort
        int arr[] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        printArr(arr);

    }

}
