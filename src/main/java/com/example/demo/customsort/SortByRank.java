package com.example.demo.customsort;

import java.util.Comparator;
import java.util.Date;

import com.example.demo.entities.Task;

public class SortByRank implements Comparator<Task> {
	
	  @Override
	  public int compare(Task t1, Task t2) {
	    if (t1.getPriority() == t2.getPriority()) {
	      return compareTwoTime(t1.getTimeEstimatedFinish(), t2.getTimeEstimatedFinish());
	    }
	    return t1.getPriority()<t2.getPriority()?-1:1;
	  }

	  private int compareTwoTime(Date d1, Date d2) {
	    long difference = d1.getTime() - d2.getTime();
	    if (difference == 0) {
	      return 0;
	    } else if (difference > 0) {
	      return 1;
	    } else {
	      return -1;
	    }
	  }

}
