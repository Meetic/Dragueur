package com.meetic.dragueur.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.meetic.dragueur.Direction;
import com.meetic.dragueur.DraggableView;
import com.meetic.dragueur.ExitViewAnimator;
import com.meetic.dragueur.ViewAnimator;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.draggableView) DraggableView draggableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        draggableView.setRotationValue(10f);
        draggableView.setRotationEnabled(true);
        draggableView.setViewAnimator(new ViewAnimator() {
            @Override
            public boolean animateExit(@NonNull DraggableView draggableView, Direction direction, int duration) {
                return false;
            }

            @Override
            public boolean animateToOrigin(@NonNull DraggableView draggableView, int duration) {
                return false;
            }

            @Override
            public void update(@NonNull DraggableView draggableView, float percentX, float percentY) {

            }
        });
        draggableView.setDragListener(new DraggableView.DraggableViewListener() {
            @Override
            public void onDrag(DraggableView draggableView, float percentX, float percentY) {

            }

            @Override
            public void onDraggedStarted(DraggableView draggableView, Direction direction) {

            }

            @Override
            public void onDraggedEnded(DraggableView draggableView, Direction direction) {

            }

            @Override
            public void onDragCancelled(DraggableView draggableView) {

            }
        });
        //draggableView.setViewAnimator(new ExitViewAnimator());
    }
}
