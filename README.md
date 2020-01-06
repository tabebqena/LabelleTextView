# LabelledTextView
Simple customview to display key-value information on android

**How to**

**To get a Git project into your build:

**Step 1.** Add the JitPack repository to your build file


> gradle
      
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
> maven
    
     <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
**Step 2.** Add the dependency
>gradle
	dependencies {
	        implementation 'com.github.tabebqena:LabelledTextView:1.0.0'
	}
>maven
 	 <dependency>
	    <groupId>com.github.tabebqena</groupId>
	    <artifactId>LabelledTextView</artifactId>
	    <version>Tag</version>
	 </dependency>


** How to use **

 > It is simple!  

in xml

     <com.ahmad.labelledtextview.LabelledTextView
        android:layout_marginTop="200dp"
        android:id="@+id/view1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        ltv:orientation="horizontal"
        ltv:labelGravity="center"
        ltv:labelWidth="wrap_content"
        ltv:labelBackgroundColor="@color/colorPrimaryDark"
        ltv:labelLines="1"
        ltv:valueGravity="center_horizontal"
        ltv:valueBackgroundColor="@color/colorAccent"
        ltv:valueWidth="wrap_content"
        
        ltv:labelWeight="1"
        ltv:valueWeight="5"
        
        ltv:labelText="Label Here"
        ltv:valueText="Value Here"    />
</LinearLayout>

or in java code:
    
    final LabelledTextView labelledTextView =findViewById(R.id.view1);
    labelledTextView.setOrientation(LinearLayout.HORIZONTAL);
    labelledTextView.setLabelText("Label here");
    labelledTextView.setValueText("Value Here");
    // etc

** Attributes **

    orientation
    labelText
    labelGravity
    labelWidth
    labelHeight
    labelWeight
    valueWeight
    labelTextAllCaps
    labelTextColor
    labelTextIsSelectable
    labelTextSize
    labelBackgroundColor
    labelEnabled
    labelAlpha
    labelLines
    labelMinLines
    labelMaxLines
    labelMaxLength
    
    valueText
    valueGravity
    valueWidth
    valueHeight
    valueTextAllCaps
    valueTextColor
    valueTextIsSelectable
    valueTextSize
    valueBackgroundColor
    valueEnabled
    valueAlpha
    valueLines
    valueMinLines
    valueMaxLines
    valueMaxLength
    


** For more Attributes , you can:

    TextView labelView = labelledTextView.getLabelView()  // return TextView you can
                                                          // add Any supported attributes here. 
        
