package com.company;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        int numOfBucket = 0;
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBucket < 0)) {
            return -1;
        }

        double area = width * height;

        numOfBucket = (int) ((area / areaPerBucket) - extraBucket);
        if (numOfBucket < (area / areaPerBucket)) {
            numOfBucket++;
        }
        return numOfBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int numOfBucket;
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        numOfBucket = getBucketCount(width, height, areaPerBucket, 0);

        return numOfBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int numOfBucket;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        numOfBucket = (int) (area / areaPerBucket);
        if (numOfBucket < (area / areaPerBucket)) {
            numOfBucket++;
        }
        return numOfBucket;

    }
}