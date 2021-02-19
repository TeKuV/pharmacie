package com.mapharmacie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import org.w3c.dom.Text;

public class SingleProduct extends AppCompatActivity {

    private TextView add_qte, remove_qte, qte;
    private ImageView iv_pay_sp, iv_add_cart_sp, iv_msg_sp, iv_favorite;
    private int favorite = 0;
    private int[] nImages = new int[]{
            R.drawable.ic_medicine_bro, R.drawable.ic_pharmacist, R.drawable.ic_medicine_amico
    };

    private CarouselView image_prod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_product);

        add_qte = findViewById(R.id.add_qte);
        remove_qte = findViewById(R.id.remove_qte);
        qte = findViewById(R.id.qte);
        iv_favorite = findViewById(R.id.iv_favorite);
        image_prod = findViewById(R.id.image_prod);

        image_prod.setPageCount(nImages.length);
        image_prod.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(nImages[position]);
            }
        });

        add_qte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int last_qte = Integer.parseInt((String)qte.getText());
                last_qte++;
                qte.setText(String.valueOf(last_qte));
            }
        });
        remove_qte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int last_qte = Integer.parseInt((String)qte.getText());
                if (last_qte <= 0)
                    last_qte = 0;
                else
                    last_qte--;
                qte.setText(String.valueOf(last_qte));
            }
        });
        iv_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(favorite == 0){
                    iv_favorite.setImageResource(R.drawable.favorite_click);
                    favorite = 1;
                }
                else{
                    iv_favorite.setImageResource(R.drawable.favorite_unclick);
                    favorite = 0;
                }


            }
        });
    }
}