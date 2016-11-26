package com.example.bel.firebasebelex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

public class PromoScreenActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "PromoScreenActivity";
    private FirebaseAnalytics mFBAnalytics;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promoscreen);

        mFBAnalytics = FirebaseAnalytics.getInstance(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Bundle params = new Bundle();
        params.putString(FirebaseAnalytics.Param.ITEM_ID, "Promo Item");
        mFBAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_ITEM, params);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnBuyNow){
            Bundle params = new Bundle();
            params.putString(FirebaseAnalytics.Param.ITEM_ID, "Promo Item");
            mFBAnalytics.logEvent(FirebaseAnalytics.Event.ECOMMERCE_PURCHASE, params);

        }
    }
}
