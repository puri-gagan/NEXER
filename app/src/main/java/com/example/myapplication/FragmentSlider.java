package com.example.myapplication;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSlider extends Fragment {
    List<Plant> Basic;

    public FragmentSlider() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_slider, container, false);

        SliderView sliderView =view. findViewById(R.id.imageSlider);

        SliderAdapterExample adapter = new SliderAdapterExample(getActivity());

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3); //set scroll delay in seconds :
        sliderView.startAutoCycle();
        Basic=new ArrayList<>();
        Basic.add(new Plant("Sandeep Lamichhane","Selfie With Sandeep Lamichhane","50 Plants around Bhaktapur road lane separation","Plant at least 5 trees in you surroundings or any suitable areas where trees are needed most.","Make sure the environment is safe and secure for the trees to grow and flourish.","Send pictures and videos of the trees every week for two months","Personal appointments with best 5 candidates with signe cricket bat","Autographed cricket bats to 10 candidates","5 minutes video chat with everyone who complete the challenges.","Users are not allowed to post any irrelevant contents","The contents that a user post must be original and should not have been tampered.","The contents should provide enough evidence about the users achievement.","The contents should be delivered within the time constraints provided.",R.mipmap.sandipfan1,R.drawable.sandip));
        Basic.add(new Plant("Rabi Lamichhane","Selfie With Rabi Lamichhane","50 Plants around Bhaktapur road lane separation","Plant at least 5 trees in you surroundings or any suitable areas where trees are needed most.","Make sure the environment is safe and secure for the trees to grow and flourish.","Send pictures and videos of the trees every week for two months","Personal appointments with best 5 candidates with signe cricket bat","Autographed cricket bats to 10 candidates","5 minutes video chat with everyone who complete the challenges.","Users are not allowed to post any irrelevant contents","The contents that a user post must be original and should not have been tampered.","The contents should provide enough evidence about the users achievement.","The contents should be delivered within the time constraints provided.",R.mipmap.rabi1,R.drawable.rabi));
        Basic.add(new Plant("Rajesh Hamal","Selfie With Rajesh Hamal","50 Plants around Bhaktapur road lane separation","Plant at least 5 trees in you surroundings or any suitable areas where trees are needed most.","Make sure the environment is safe and secure for the trees to grow and flourish.","Send pictures and videos of the trees every week for two months","Personal appointments with best 5 candidates with signe cricket bat","Autographed cricket bats to 10 candidates","5 minutes video chat with everyone who complete the challenges.","Users are not allowed to post any irrelevant contents","The contents that a user post must be original and should not have been tampered.","The contents should provide enough evidence about the users achievement.","The contents should be delivered within the time constraints provided.",R.mipmap.rajesh1,R.drawable.rajeshhamal));

        RecyclerView recyclerView  =(RecyclerView) view.findViewById(R.id.Recycler);
       PlantAdapter plantAdapter=new PlantAdapter(getActivity(),Basic);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(plantAdapter);
        return view;
    }

}
