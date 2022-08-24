<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#00BCD4"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">


        <EditText
            android:id="@+id/editTextTextPersonName3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:ems="10"
            android:hint="First Name"
            android:inputType="textPersonName" />

        <EditText
            android:id="@+id/editTextTextPersonName4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:ems="10"
            android:hint="Last Name"
            android:inputType="textPersonName" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <EditText
            android:id="@+id/editTextTextPersonName5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:ems="10"
            android:hint="DOB"
            android:inputType="textPersonName" />

        <EditText
            android:id="@+id/editTextTextPersonName6"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:ems="10"
            android:hint="AGE"
            android:inputType="textPersonName" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@color/cardview_light_background"
        android:layout_marginTop="10dp"
        android:layout_marginBottom="10dp">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="GENDER"
            />

        <RadioGroup
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal"
           >

            <RadioButton
                android:id="@+id/radioButton"
                android:layout_width="100dp"
                android:layout_height="wrap_content"
                android:text="MALE"
                />

            <RadioButton
                android:id="@+id/radioButton2"
                android:layout_width="120dp"
                android:layout_height="wrap_content"
                android:text="FEMALE" />

            <RadioButton
                android:id="@+id/radioButton3"
                android:layout_width="120dp"
                android:layout_height="wrap_content"
                android:text="OTHERS" />
        </RadioGroup>


    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <Button
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="160dp"
            android:text="Button"
            android:textColor="@color/cardview_light_background"
            android:textStyle="italic" />


    </LinearLayout>
</LinearLayout>
