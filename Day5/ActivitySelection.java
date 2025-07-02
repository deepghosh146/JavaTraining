package Day5;


import java.util.ArrayList;
import java.util.Arrays;

class Activity {
    int start;
    int end;

    Activity(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {3,3,1,5};
        int[] end = {7,4,2,9};
        int n = start.length;

        Activity[] activiteis = new Activity[n];
        for (int i = 0; i < n; i++) {
            activiteis[i] = new Activity(start[i], end[i]);
        }
        Arrays.sort(activiteis,(a,b) -> a.end - b.end);
        ArrayList<Activity> selected = new ArrayList<Activity>();
        selected.add(activiteis[0]);
        int lastEnd = activiteis[0].end;

        for (int i = 1; i < n; i++) {
            if (activiteis[i].start >= lastEnd) {
                selected.add(activiteis[i]);
                lastEnd = activiteis[i].end;
            }
        }
        int totalActivities = selected.size();
        System.out.println("Total activities: " + totalActivities);
    }
}
