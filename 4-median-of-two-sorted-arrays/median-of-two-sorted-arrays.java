class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[(nums1.length + nums2.length)];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] >= nums2[j]) {
                arr[k] = nums2[j];
                j++;
            } else {
                arr[k] = nums1[i];
                i++;
            }
            k++;
        }

        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        //double median = 0;
        int mid = arr.length/2;

        if(arr.length % 2 != 0){
            //median = arr[mid];
            return arr[mid];
        } else {
            //median = (arr[mid-1] + arr[mid])/2.0;
            return (arr[mid-1] + arr[mid])/2.0;
        }
    }
}