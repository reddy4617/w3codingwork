package BreakFast_Bread;

import java.util.ArrayList;
import java.util.List;

public class orderBread {
        private List<Slice> list = new ArrayList<>();

        public void take(Slice slice){
            list.add(slice);
        }

        public void place(){
            for(Slice slice : list){
                slice.execute();
            }
            list.clear();
        }
}
