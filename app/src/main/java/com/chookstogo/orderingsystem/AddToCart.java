package com.chookstogo.orderingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/* Procedure:
 * 1.) TO ENABLE THE CUSTOMER TO EDIT/DELETE ITEMS IN THE CART, THE ACTIVITY MUST HAVE THE FOLLOWING TEXT FIELDS:
 * - PRODUCT NAME
 * - QUANTITY PER PRODUCT
 * -SAVE BUTTON
 * - CANCEL BUTTON
 *
 * 2) CONSTRAINTS
 *  2.1) IF THE CUSTOMER MARKED 0 IN THE QUANTITY FIELD:
 *      - AUTOMATICALLY THE PRODUCT WILL BE DELETED (?)
 *  2.2) IF THE CUSTOMER DELETED THE PRODUCT
 *      - DELETE FIRST THE PRODUCT
 *      - FOLLOWED BY PROMPT FOR SUCCESS
 *      - HEAD BACK TO __________ ACTIVITY
 * */
public class AddToCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);
    }
}
