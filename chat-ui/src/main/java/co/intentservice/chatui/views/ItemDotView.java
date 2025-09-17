package co.intentservice.chatui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.ColorInt;
import androidx.cardview.widget.CardView;

import co.intentservice.chatui.R;
import pl.tajchert.sample.DotsTextView;

/**
 * View to display messages that have been received throught the chat-ui.
 *
 * Created by James Lendrem
 */

public class ItemDotView extends MessageView {

    private CardView bubble;
    private DotsTextView dotTextView;

    @Override
    public void setMessage(String message) {

    }

    @Override
    public void setTimestamp(String timestamp) {

    }

    /**
     * Method to set the background color that you want to use in your message.
     * @param background The background that you want to be displayed.
     */
    public void setBackground(@ColorInt int background) {

        if (bubble == null) {

            this.bubble = (CardView) findViewById(R.id.bubble);

        }

        bubble.setCardBackgroundColor(background);

    }

    /**
     * Method to set the elevation of the view.
     * @param elevation The elevation that you want the view to be displayed at.
     */
    public void setElevation(float elevation) {

        if (bubble == null) {

            this.bubble = (CardView) findViewById(R.id.bubble);

        }

        bubble.setCardElevation(elevation);

    }

    /**
     * Constructs a new message view.
     * @param context
     */
    public ItemDotView(Context context) {

        super(context);
        initializeView(context);

    }

    /**
     * Constructs a new message view with attributes, this constructor is used when we create a
     * message view using XML.
     * @param context
     * @param attrs
     */
    public ItemDotView(Context context, AttributeSet attrs) {

        super(context, attrs);
        initializeView(context);

    }

    /**
     * Inflates the view so it can be displayed and grabs any child views that we may require
     * later on.
     * @param context   The context that is used to inflate the view.
     */
    private void initializeView(Context context) {

        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.chat_item_dots, this);

        this.bubble = (CardView) findViewById(R.id.bubble);
        this.dotTextView = (DotsTextView) findViewById(R.id.dots);
    }

}
