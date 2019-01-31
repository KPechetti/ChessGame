package com.example.anil6066.chessgame;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;


public class ButtonGridAndTextView extends GridLayout {
    private int side = 8;
    private ImageButton[][] buttons;
    public ButtonGridAndTextView(Context context, int width, int newSide,
                                 OnClickListener listener ) {
        super( context );
        // Set # of rows and columns of this GridLayout
        setRowCount(newSide);
        setColumnCount(newSide);

        buttons = new ImageButton[side][side];
        int yellow = 0xFFFFFF00;
        int orange = 0xFFFFA500;

        // Create the buttons and add them to this GridLayout
        for(int row = 0; row < newSide ; row++)
        {
            for(int col = 0; col < newSide ; col++)
            {
                buttons[row][col] = new ImageButton(context);
                buttons[row][col].setOnClickListener(listener);

                buttons[row][col].setScaleType(ImageView.ScaleType.CENTER_CROP);

                //buttons[row][col].
                if((row % 2 == 0 && col %2 == 0) || (row % 2 != 0 && col %2 != 0))
                {
                    buttons[row][col].setBackgroundColor(orange);
                }
                else {
                    buttons[row][col].setBackgroundColor(yellow);
                }

                addView(buttons[row][col], width, width);

            }
        }
        // set buttons by loading the drawable images and setting the background color for cells





        // Drawable drawable= getResources().getDrawable(getResources().getIdentifier("bb", "drawable", context.getPackageName()));
        for(int col = 0; col < newSide ; col++) {
            buttons[1][col].setImageResource(R.drawable.bp);
            buttons[1][col].setTag("bp");
        }

        for(int col = 0; col < newSide ; col++) {
            buttons[6][col].setImageResource(R.drawable.wp);
            buttons[6][col].setTag("wp");
        }
        buttons[0][0].setImageResource(R.drawable.br);
        buttons[0][0].setTag("br");
        buttons[0][7].setImageResource(R.drawable.br);
        buttons[0][7].setTag("br");
        buttons[0][1].setImageResource(R.drawable.bn);
        buttons[0][1].setTag("bn");
        buttons[0][6].setImageResource(R.drawable.bn);
        buttons[0][6].setTag("bn");
        buttons[0][2].setImageResource(R.drawable.bb);
        buttons[0][2].setTag("bb");
        buttons[0][5].setImageResource(R.drawable.bb);
        buttons[0][5].setTag("bb");
        buttons[0][3].setImageResource(R.drawable.bq);
        buttons[0][3].setTag("bq");
        buttons[0][4].setImageResource(R.drawable.bk);
        buttons[0][4].setTag("bk");

        buttons[7][0].setImageResource(R.drawable.wr);
        buttons[7][7].setImageResource(R.drawable.wr);
        buttons[7][1].setImageResource(R.drawable.wn);
        buttons[7][6].setImageResource(R.drawable.wn);
        buttons[7][2].setImageResource(R.drawable.wb);
        buttons[7][5].setImageResource(R.drawable.wb);
        buttons[7][3].setImageResource(R.drawable.wq);
        buttons[7][4].setImageResource(R.drawable.wk);


        buttons[7][0].setTag("wr");
        buttons[7][7].setTag("wr");
        buttons[7][1].setTag("wn");
        buttons[7][6].setTag("wn");
        buttons[7][2].setTag("wb");
        buttons[7][5].setTag("wb");
        buttons[7][3].setTag("wq");
        buttons[7][4].setTag("wk");
    }



    public void setButton(int row, int col)
    {
        //add your code below
    }

    public void setButtonColor( int row, int column, int color ) {

        //add your code below
        buttons[row][column].setBackgroundColor(color);
    }
    public boolean isButton( ImageButton b, int row, int column ) {
        //add your code below
        if(b == buttons[row][column])
        return true;
        return false;

    }

    public void resetButtons( ) {

        int yellow = 0xFFFFFF00;
        int orange = 0xFFFFA500;
        //add your code below
        for(int row = 0; row < side ; row++)
        {
            for(int col = 0; col < side ; col++)
            {
                if((row % 2 == 0 && col %2 == 0) || (row % 2 != 0 && col %2 != 0))
                {
                    buttons[row][col].setBackgroundColor(orange);
                }
                else {
                    buttons[row][col].setBackgroundColor(yellow);
                }
            }
        }
    }

    public void enableButtons( boolean enabled ) {
        //add your code below
        for(int row = 0; row < side ; row++) {
            for (int col = 0; col < side; col++) {
                buttons[row][col].setEnabled(enabled);
            }
        }
    }


    public ImageButton [][] getButton(){
        return buttons;
    }

    // add more functions if needed
}
