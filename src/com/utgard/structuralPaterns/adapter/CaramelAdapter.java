package com.utgard.structuralPaterns.adapter;

import com.utgard.structuralPaterns.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}

    //OR IF WE DONT WANT INHERITANCE (EXTENDS CARAMEL), BECAUSE WE CAN EXTEND
    //  ONLY ONE OTHER CLASS AND WE NEED IT ELSEWHERE, THIS METHOD IS BETTER -
    //  MORE FLEXIBLE:
    //

//public class CaramelAdapter implements Filter {
//    Caramel caramel;
//
//    public CaramelAdapter(Caramel caramel) {
//        this.caramel = caramel;
//    }
//
//    @Override
//    public void apply(Image image) {
//        caramel.init();
//        caramel.render(image);
//    }
//}