package com.example.custompreferencelayout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class TitleBar extends RelativeLayout{

	private static int DEFAULT_VISIBILITY = View.VISIBLE;
	private static int DEFAULT_TEXTCOLOR = Color.WHITE;
	
	private TextView textViewTitle;
	
	private View btnLeftBtn;
	private boolean isImageLeftBtn;
	private int leftBtnVisibility = DEFAULT_VISIBILITY;
	private Button.OnClickListener leftBtnClickEventListener;
	
	private View btnRightBtn;
	private boolean isImageRightBtn;
	private int rightBtnVisibility = DEFAULT_VISIBILITY;
	private Button.OnClickListener rightBtnClickEventListener;
	private ImageView imageViewTitle;

	public TitleBar(Context context) {
		super(context);
	}

	public TitleBar(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public TitleBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	/**
	 * init all subcomponent 
	 */
	private void findAllView(){
		textViewTitle = (TextView)findViewById(R.id.textview_title);
		imageViewTitle = (ImageView)findViewById(R.id.imageview_title);
	}
	
	/**
	 * set TitleBar String
	 * @param title title string
	 */
	public void setTitle(String title){
		if(textViewTitle == null){
			findAllView();
		}
		textViewTitle.setText(title);
	}
		
	/**
	 * set TitleBar String
	 * @param res_str_title title string resource
	 */
	public void setTitle(int res_str_title){
		if(textViewTitle == null){
			findAllView();
		}
		
		textViewTitle.setVisibility(View.VISIBLE);
		imageViewTitle.setVisibility(View.INVISIBLE);
		
		textViewTitle.setText(res_str_title);
	}
	
	public void setTitleIMG(int res_img_title){
		if(textViewTitle == null){
			findAllView();
		}
		
		textViewTitle.setVisibility(View.INVISIBLE);
		imageViewTitle.setVisibility(View.VISIBLE);
		
		imageViewTitle.setImageResource(res_img_title);
	}
	
	/**
	 * set image of left button
	 * @param context
	 * @param res_img_btn image resource display on left button
	 */
	public void setLeftBtnImg(Context context, int res_img_btn){
		this.isImageLeftBtn = true;
		
		if (btnLeftBtn != null) {
			btnLeftBtn.setVisibility(View.INVISIBLE);
		}
		btnLeftBtn = (ImageButton) findViewById(R.id.imageButton_Titlebar_LeftBtn);
		((ImageButton)btnLeftBtn).setImageResource(res_img_btn);
		((ImageButton)btnLeftBtn).setVisibility(leftBtnVisibility);
		if(leftBtnClickEventListener != null){
			((ImageButton)btnLeftBtn).setOnClickListener(leftBtnClickEventListener);
		}
	}
	
	/**
	 * set text of left button
	 * @param context
	 * @param btn_text text display on left button
	 */
	public void setLeftBtnText(Context context, String btn_text){
		this.isImageLeftBtn = false;

		if (btnLeftBtn != null) {
			btnLeftBtn.setVisibility(View.INVISIBLE);
		}
		btnLeftBtn = (Button) findViewById(R.id.button_Titlebar_LeftBtn);
		((Button)btnLeftBtn).setText(btn_text);
		((Button)btnLeftBtn).setTextColor(context.getResources().getColor(R.color.color_dodgerblue));
		((Button)btnLeftBtn).setVisibility(leftBtnVisibility);
		if(leftBtnClickEventListener != null){
			((Button)btnLeftBtn).setOnClickListener(leftBtnClickEventListener);
		}
	}
	
	/**
	 * set text of left button
	 * @param context
	 * @param res_btn_text text resource display on left button
	 */
	public void setLeftBtnText(Context context, int res_btn_text){
		this.isImageLeftBtn = false;

		if (btnLeftBtn != null) {
			btnLeftBtn.setVisibility(View.INVISIBLE);
		}
		btnLeftBtn = (Button) findViewById(R.id.button_Titlebar_LeftBtn);
		((Button)btnLeftBtn).setText(res_btn_text);
		((Button)btnLeftBtn).setTextColor(context.getResources().getColor(R.color.color_dodgerblue));
		((Button)btnLeftBtn).setVisibility(leftBtnVisibility);
		if(leftBtnClickEventListener != null){
			((Button)btnLeftBtn).setOnClickListener(leftBtnClickEventListener);
		}
	}
	
	/**
	 * set click event listener of left button
	 * @param listener click event listener
	 */
	public void setLeftBtnOnClickListener(Button.OnClickListener listener){
		if(btnLeftBtn != null && listener != null){
			btnLeftBtn.setOnClickListener(listener);
		}
		leftBtnClickEventListener = listener;
	}
	
	/**
	 * set left button visibility.
	 * @param visibility one of VISIBLE, INVISIBLE, GONE.
	 */
	public void setLeftBtnVisibility(int visibility){
		if(btnLeftBtn != null){
			switch(visibility){
				case View.VISIBLE:
				case View.INVISIBLE:
				case View.GONE:
					btnLeftBtn.setVisibility(visibility);
					break;
				default:
					btnLeftBtn.setVisibility(DEFAULT_VISIBILITY);
			}
		}
		switch(visibility){
			case View.VISIBLE:
			case View.INVISIBLE:
			case View.GONE:
				leftBtnVisibility = visibility;
				break;
			default:
				leftBtnVisibility = DEFAULT_VISIBILITY;
		}
	}
	
	/**
	 * set image of right button.
	 * @param context 
	 * @param res_img_btn image resource display on right button
	 */
	public void setRightBtnImg(Context context, int res_img_btn){
		this.isImageRightBtn = true;
		
		if (btnRightBtn != null) {
			btnRightBtn.setVisibility(View.INVISIBLE);
		}
		btnRightBtn = (ImageButton) findViewById(R.id.imageButton_Titlebar_RightBtn);
		((ImageButton)btnRightBtn).setImageResource(res_img_btn);
		((ImageButton)btnRightBtn).setVisibility(rightBtnVisibility);
		if(rightBtnClickEventListener != null){
			((ImageButton)btnRightBtn).setOnClickListener(rightBtnClickEventListener);
		}
	}
	
	/**
	 * set text of right button.
	 * @param context
	 * @param btn_text text display on right button
	 */
	public void setRightBtnText(Context context, String btn_text){
		this.isImageRightBtn = false;
		
		if (btnRightBtn != null) {
			btnRightBtn.setVisibility(View.INVISIBLE);
		}
		btnRightBtn = (Button) findViewById(R.id.button_Titlebar_RightBtn);
		((Button)btnRightBtn).setText(btn_text);
		((Button)btnRightBtn).setVisibility(rightBtnVisibility);
		((Button)btnRightBtn).setTextColor(context.getResources().getColor(R.color.color_dodgerblue));
		if(rightBtnClickEventListener != null){
			((Button)btnRightBtn).setOnClickListener(rightBtnClickEventListener);
		}
	}
	
	/**
	 * set text of right button.
	 * @param context
	 * @param res_btn_text text resource display on right button
	 */
	public void setRightBtnText(Context context, int res_btn_text){
		this.isImageRightBtn = false;
		
		if (btnRightBtn != null) {
			btnRightBtn.setVisibility(View.INVISIBLE);
		}
		btnRightBtn = (Button) findViewById(R.id.button_Titlebar_RightBtn);
		((Button)btnRightBtn).setText(res_btn_text);
		((Button)btnRightBtn).setVisibility(rightBtnVisibility);
		((Button)btnRightBtn).setTextColor(context.getResources().getColor(R.color.color_dodgerblue));
		if(rightBtnClickEventListener != null){
			((Button)btnRightBtn).setOnClickListener(rightBtnClickEventListener);
		}
	}

	/**
	 * set click event listener of right button
	 * @param listener click event listener
	 */
	public void setRightBtnOnClickListener(Button.OnClickListener listener){
		if(btnRightBtn != null && listener != null){
			btnRightBtn.setOnClickListener(listener);
		}
		rightBtnClickEventListener = listener;
	}
	
	/**
	 * set right button visibility.
	 * @param visibility one of VISIBLE, INVISIBLE, GONE.
	 */
	public void setRightBtnVisibility(int visibility){
		if(btnRightBtn != null){
			switch(visibility){
				case View.VISIBLE:
				case View.INVISIBLE:
				case View.GONE:
					btnRightBtn.setVisibility(visibility);
					break;
				default:
					btnRightBtn.setVisibility(DEFAULT_VISIBILITY);
			}
		}
		switch(visibility){
			case View.VISIBLE:
			case View.INVISIBLE:
			case View.GONE:
				rightBtnVisibility = visibility;
				break;
			default:
				rightBtnVisibility = DEFAULT_VISIBILITY;
		}
	}
	
	public View getLeftBtn(){
		return this.btnLeftBtn;
	}
	
	public View getRightBtn(){
		return this.btnRightBtn;
	}
}
