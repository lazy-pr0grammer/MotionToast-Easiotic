package com.lazyprogrammer.motiontoast;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import java.util.Objects;

public class MotionToast {

    TextView title, desc;

    RelativeLayout container;

    ImageView icon;

    View view;

    View bar;

    final Toast toast;

    Animation pulseAnimation;

    int successToastColor = R.color.success_color;

    int errorToastColor = R.color.error_color;

    int warningToastColor = R.color.warning_color;

    int infoToastColor = R.color.info_color;

    int deleteToastColor = R.color.delete_color;

    final int darkToastColor = R.color.dark_bg_color;

    int successBackgroundToastColor = R.color.success_bg_color;

    int errorBackgroundToastColor = R.color.error_bg_color;

    int warningBackgroundToastColor = R.color.warning_bg_color;

    int infoBackgroundToastColor = R.color.info_bg_color;

    int deleteBackgroundToastColor = R.color.delete_bg_color;

    public MotionToast(Context c, int lm, String mode, String style, String gravity, String text, String des, int delay) {

        if (lm == 0) {

            view = LayoutInflater.from(c).inflate(R.layout.full_color_toast, null);

            title = view.findViewById(R.id.color_toast_text);

            desc = view.findViewById(R.id.color_toast_description);

            container = view.findViewById(R.id.color_toast_view);

            icon = view.findViewById(R.id.color_toast_image);

            icon.setVisibility(View.GONE);

            if (mode.equals("dark")) {

                switch (style) {
                    case "success":

                        setToastIcon(c, successToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, darkToastColor);
                        title.setTextColor(ContextCompat.getColor(c, successToastColor));
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "error":

                        setToastIcon(c, errorToastColor, R.drawable.ic_error_);
                        setBackgroundColor(c, darkToastColor);
                        title.setTextColor(ContextCompat.getColor(c, errorToastColor));
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "warning":

                        setToastIcon(c, warningToastColor, R.drawable.ic_warning_yellow);
                        setBackgroundColor(c, darkToastColor);
                        title.setTextColor(ContextCompat.getColor(c, warningToastColor));
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "info":

                        setToastIcon(c, infoToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, darkToastColor);
                        title.setTextColor(ContextCompat.getColor(c, infoToastColor));
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "delete":

                        setToastIcon(c, deleteToastColor, R.drawable.ic_delete_);
                        setBackgroundColor(c, darkToastColor);
                        title.setTextColor(ContextCompat.getColor(c, deleteToastColor));
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "no_internet":

                        setToastIcon(c, warningToastColor, R.drawable.ic_no_internet);
                        setBackgroundColor(c, darkToastColor);
                        title.setTextColor(ContextCompat.getColor(c, warningToastColor));
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                }

            } else {

                switch (style) {
                    case "success":

                        setToastIcon(c, successToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, successToastColor);
                        title.setTextColor(0XFFFFFFFF);
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "error":

                        setToastIcon(c, errorToastColor, R.drawable.ic_error_);
                        setBackgroundColor(c, errorToastColor);
                        title.setTextColor(0XFFFFFFFF);
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "warning":

                        setToastIcon(c, warningToastColor, R.drawable.ic_warning_yellow);
                        setBackgroundColor(c, warningToastColor);
                        title.setTextColor(0XFFFFFFFF);
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "info":

                        setToastIcon(c, infoToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, infoToastColor);
                        title.setTextColor(0XFFFFFFFF);
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "delete":

                        setToastIcon(c, deleteToastColor, R.drawable.ic_delete_);
                        setBackgroundColor(c, deleteToastColor);
                        title.setTextColor(0XFFFFFFFF);
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                    case "no_internet":

                        setToastIcon(c, warningToastColor, R.drawable.ic_no_internet);
                        setBackgroundColor(c, warningToastColor);
                        title.setTextColor(0XFFFFFFFF);
                        desc.setTextColor(0XFFFFFFFF);

                        break;
                }

            }

        } else if (lm == 1) {

            view = LayoutInflater.from(c).inflate(R.layout.motion_toast, null);

            title = view.findViewById(R.id.custom_toast_text);

            desc = view.findViewById(R.id.custom_toast_description);

            container = view.findViewById(R.id.motion_toast_view);

            icon = view.findViewById(R.id.custom_toast_image);

            bar = view.findViewById(R.id.colorView);

            icon.setVisibility(View.GONE);

            if (mode.equals("dark")) {

                switch (style) {
                    case "success":
                        setToastIcon(c, successToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, darkToastColor);
                        setBarBackgroundColor(c, successToastColor);
                        title.setTextColor(ContextCompat.getColor(c, successToastColor));
                        desc.setTextColor(0XFFFFFFFF);
                        break;
                    case "error":
                        setToastIcon(c, errorToastColor, R.drawable.ic_error_);
                        setBackgroundColor(c, darkToastColor);
                        setBarBackgroundColor(c, errorToastColor);
                        title.setTextColor(ContextCompat.getColor(c, errorToastColor));
                        desc.setTextColor(0XFFFFFFFF);
                        break;
                    case "warning":
                        setToastIcon(c, warningToastColor, R.drawable.ic_warning_yellow);
                        setBackgroundColor(c, darkToastColor);
                        title.setTextColor(ContextCompat.getColor(c, warningToastColor));
                        setBarBackgroundColor(c, warningToastColor);
                        desc.setTextColor(0XFFFFFFFF);
                        break;
                    case "info":
                        setToastIcon(c, infoToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, darkToastColor);
                        setBarBackgroundColor(c, infoToastColor);
                        title.setTextColor(ContextCompat.getColor(c, infoToastColor));
                        desc.setTextColor(0XFFFFFFFF);
                        break;
                    case "delete":
                        setToastIcon(c, deleteToastColor, R.drawable.ic_delete_);
                        setBackgroundColor(c, darkToastColor);
                        setBarBackgroundColor(c, deleteToastColor);
                        title.setTextColor(ContextCompat.getColor(c, deleteToastColor));
                        desc.setTextColor(0XFFFFFFFF);
                        break;
                    case "no_internet":
                        setToastIcon(c, warningToastColor, R.drawable.ic_no_internet);
                        setBackgroundColor(c, darkToastColor);
                        setBarBackgroundColor(c, warningToastColor);
                        title.setTextColor(ContextCompat.getColor(c, warningToastColor));
                        desc.setTextColor(0XFFFFFFFF);
                        break;
                }

            } else {

                switch (style) {
                    case "success":
                        setToastIcon(c, successToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, successBackgroundToastColor);
                        setBarBackgroundColor(c, successToastColor);
                        title.setTextColor(0XFF000000);
                        desc.setTextColor(0XFF000000);
                        break;
                    case "error":
                        setToastIcon(c, errorToastColor, R.drawable.ic_error_);
                        setBackgroundColor(c, errorBackgroundToastColor);
                        setBarBackgroundColor(c, errorToastColor);
                        title.setTextColor(0XFF000000);
                        desc.setTextColor(0XFF000000);
                        break;
                    case "warning":
                        setToastIcon(c, warningToastColor, R.drawable.ic_warning_yellow);
                        setBackgroundColor(c, warningBackgroundToastColor);
                        setBarBackgroundColor(c, warningToastColor);
                        title.setTextColor(0XFF000000);
                        desc.setTextColor(0XFF000000);
                        break;
                    case "info":
                        setToastIcon(c, infoToastColor, R.drawable.ic_info_blue);
                        setBackgroundColor(c, infoBackgroundToastColor);
                        setBarBackgroundColor(c, infoToastColor);
                        title.setTextColor(0XFF000000);
                        desc.setTextColor(0XFF000000);
                        break;
                    case "delete":
                        setToastIcon(c, deleteToastColor, R.drawable.ic_delete_);
                        setBackgroundColor(c, deleteBackgroundToastColor);
                        setBarBackgroundColor(c, deleteToastColor);
                        title.setTextColor(0XFF000000);
                        desc.setTextColor(0XFF000000);
                        break;
                    case "no_internet":
                        setToastIcon(c, warningToastColor, R.drawable.ic_no_internet);
                        setBackgroundColor(c, warningBackgroundToastColor);
                        setBarBackgroundColor(c, warningToastColor);
                        title.setTextColor(0XFF000000);
                        desc.setTextColor(0XFF000000);
                        break;
                }

            }

        }

        toast = Toast.makeText(c, "", delay);

        switch (gravity) {
            case "top":
                toast.setGravity(Gravity.TOP, 0, 150);
                break;
            case "center":
                toast.setGravity(Gravity.CENTER, 0, 0);
                break;
            case "bottom":
                toast.setGravity(Gravity.BOTTOM, 0, 150);
                break;
        }

        startIconPulseAnimation(c, R.anim.pulse);
        title.setText(text);
        desc.setText(des);

    }

    public void resetToastColors() {

        successToastColor = R.color.success_color;

        errorToastColor = R.color.error_color;

        warningToastColor = R.color.warning_color;

        infoToastColor = R.color.info_color;

        deleteToastColor = R.color.delete_color;

        successBackgroundToastColor = R.color.success_bg_color;

        errorBackgroundToastColor = R.color.error_bg_color;

        warningBackgroundToastColor = R.color.warning_bg_color;

        infoBackgroundToastColor = R.color.info_bg_color;

        deleteBackgroundToastColor = R.color.delete_bg_color;

    }

    public MotionToast setSuccessColor(int color) {
        successToastColor = color;
        return this;
    }

    public MotionToast setSuccessBackgroundColor(int color) {
        successBackgroundToastColor = color;
        return this;
    }

    public MotionToast setErrorColor(int color) {
        errorToastColor = color;
        return this;
    }

    public MotionToast setErrorBackgroundColor(int color) {
        errorBackgroundToastColor = color;
        return this;
    }

    public MotionToast setWarningColor(int color) {
        warningToastColor = color;
        return this;
    }

    public MotionToast setWarningBackgroundColor(int color) {
        warningBackgroundToastColor = color;
        return this;
    }

    public MotionToast setInfoColor(int color) {
        infoToastColor = color;
        return this;
    }

    public MotionToast setInfoBackgroundColor(int color) {
        infoBackgroundToastColor = color;
        return this;
    }

    public MotionToast setDeleteColor(int color) {
        deleteToastColor = color;
        return this;

    }

    public MotionToast setDeleteBackgroundColor(int color) {
        deleteBackgroundToastColor = color;
        return this;

    }

    private void setToastIcon(Context c, int color, int resId) {
        icon.setVisibility(View.VISIBLE);
        Drawable drawable = DrawableCompat.wrap(Objects.requireNonNull(ContextCompat.getDrawable(c, resId)));
        DrawableCompat.setTint(drawable.mutate(), ContextCompat.getColor(c, color));
        icon.setImageDrawable(drawable);
    }

    private void setBackgroundColor(Context c, int resId) {

        Drawable drawable = ContextCompat.getDrawable(c, R.drawable.toast_round_background);

        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(c, resId), PorterDuff.Mode.MULTIPLY));
            container.setBackground(drawable);
        }


        // container.setBackgroundColor(resId);

    }

    private void setBarBackgroundColor(Context c, int resId) {

        Drawable drawable = ContextCompat.getDrawable(c, R.drawable.toast_round_background);

        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(c, resId), PorterDuff.Mode.MULTIPLY));
            bar.setBackground(drawable);
        }

        // container.setBackgroundColor(resId);

    }

    private void startIconPulseAnimation(Context c, int resId) {
        pulseAnimation = AnimationUtils.loadAnimation(c, resId);
        icon.startAnimation(pulseAnimation);
    }

    public void show() {
        toast.setView(view);
        toast.show();
    }

}

