package com.kienast.intro.paintJob;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets <0)) {
            System.out.println("Invalid inputs");
            return -1;
        }

        double requiredArea = width * height;
        double residueArea = requiredArea - extraBuckets * areaPerBucket;

        if (residueArea > 0) {
            double bucketsToBuy = residueArea / areaPerBucket;
            int wholeBucketsToBuy = (int) bucketsToBuy;

            wholeBucketsToBuy =  (wholeBucketsToBuy < bucketsToBuy) ? wholeBucketsToBuy+1 : wholeBucketsToBuy ;
            System.out.println("Whole buckets to buy: " + wholeBucketsToBuy);
            return wholeBucketsToBuy;
        }

        System.out.println("No need to buy more buckets.");
        return 0;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

}
