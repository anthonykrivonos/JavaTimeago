/*
    Developed by Anthony Krivonos
    http://www.anthonykrivonos.com
    Use with Attribution
    October 26th, 2017
 */

public class TimeAgo {

    public static void main(String args[]) {
        long testValue = 1509064319516L;
        System.out.printf("Testing TimeAgo for %d: %s\n", testValue, timeAgo(testValue));
    }

    public static String timeAgo(long timestamp) {
        double seconds = Math.floor((System.currentTimeMillis() - timestamp) / 1000);
        double period = Math.floor(seconds / 31536000);
        if (period >= 1) {
            return Math.round(period) + " years ago";
        }
        period = Math.floor(seconds / 2592000);
        if (period >= 1) {
            return Math.round(period) + " months ago";
        }
        period = Math.floor(seconds / 604800);
        if (period >= 1) {
            return Math.round(period) + " weeks ago";
        }
        period = Math.floor(seconds / 86400);
        if (period >= 1) {
            return Math.round(period) + " days ago";
        }
        period = Math.floor(seconds / 3600);
        if (period >= 1) {
            return Math.round(period) + " hours ago";
        }
        period = Math.floor(seconds / 60);
        if (period >= 1) {
            return Math.round(period) + " minutes ago";
        }
        return "now";
    }
}
