class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int low=0;
        int high=tasks.length;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
			//Check if  task assignment is possible
            if(isPossible(tasks,workers,pills,strength,mid))
            {
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
        
    }
    
    public boolean isPossible(int tasks[],int workers[],int pills,int strength,int n)
    {
        if(Math.min(workers.length,tasks.length)<n)
            return false;
        TreeMap<Integer,Integer> tm=new TreeMap<>();
		
		//Will add smallest n tasks to treemap
        for(int i=0;i<n;i++)
        {
            tm.put(tasks[i],tm.getOrDefault(tasks[i],0)+1);
        }
		
		//Will take n workers with most strength
        for(int j=workers.length-n;j<workers.length;j++)
        {
            int smallest=tm.firstKey();
            if(workers[j]<smallest)
            {
				//case 2: worker can not finish the task without the pill
                if(pills==0)
                    return false;
                pills--;
                if(tm.floorKey(workers[j]+strength)!=null)
                    smallest=tm.floorKey(workers[j]+strength);
                else
                    return false;
                
            }
            //smallest is the task which workers[j] can do
            if(tm.get(smallest)==1)
                tm.remove(smallest);
            else
                tm.put(smallest,tm.get(smallest)-1);
        }
        return true;
    }
    
  
}