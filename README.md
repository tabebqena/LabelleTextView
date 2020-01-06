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

> maven

 	 <dependency>
	    <groupId>com.github.tabebqena</groupId>
	    <artifactId>LabelledTextView</artifactId>
	    <version>Tag</version>
	 </dependency>


** How to use **

It is simple!  

in xml

     <com.ahmad.labelledtextview.LabelledTextView
        android:layout_marginTop="200dp"
        android:id="@+id/view1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:orientation="horizontal"
        app:labelGravity="center"
        app:labelBackgroundColor="@color/colorPrimaryDark"
        app:labelLines="1"
        app:valueGravity="center_horizontal"
        app:valueBackgroundColor="@color/colorAccent"
        app:labelWeight="1"
        app:valueWeight="5"
        app:labelText="Label Here"
        app:valueText="Value Here"    />
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
        
