package com.sinping.iosdialog.animation.Attention;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.sinping.iosdialog.animation.BaseAnimatorSet;

public class Flash extends BaseAnimatorSet {
	public Flash() {
		duration = 1000;
	}

	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "alpha", 1, 0, 1, 0, 1));
	}
}
