/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.limelight;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f040000;
        public static final int activity_vertical_margin=0x7f040001;
    }
    public static final class drawable {
        public static final int app_icon=0x7f020000;
        public static final int atv_banner=0x7f020001;
        public static final int ic_launcher=0x7f020002;
        public static final int list_view_unselected=0x7f020003;
        public static final int ouya_icon=0x7f020004;
    }
    public static final class id {
        public static final int addPc=0x7f070001;
        public static final int advancedSettingsButton=0x7f070015;
        public static final int advancedSettingsText=0x7f070002;
        public static final int appListText=0x7f07000a;
        public static final int autoDec=0x7f070005;
        public static final int bitrateLabel=0x7f070007;
        public static final int bitrateSeekBar=0x7f070008;
        public static final int config1080p30Selected=0x7f070013;
        public static final int config1080p60Selected=0x7f070014;
        public static final int config720p30Selected=0x7f070011;
        public static final int config720p60Selected=0x7f070012;
        public static final int decoderConfigGroup=0x7f070003;
        public static final int disableToasts=0x7f070016;
        public static final int discoveryText=0x7f07000c;
        public static final int enableSops=0x7f070018;
        public static final int hardwareDec=0x7f070006;
        public static final int hostTextView=0x7f070000;
        public static final int manuallyAddPc=0x7f07000d;
        public static final int pcListView=0x7f070009;
        public static final int rowTextView=0x7f070019;
        public static final int settingsButton=0x7f07000e;
        public static final int softwareDec=0x7f070004;
        public static final int streamConfigGroup=0x7f070010;
        public static final int streamSettingsText=0x7f07000f;
        public static final int stretchToFill=0x7f070017;
        public static final int surfaceView=0x7f07000b;
    }
    public static final class layout {
        public static final int activity_add_computer_manually=0x7f030000;
        public static final int activity_advanced_settings=0x7f030001;
        public static final int activity_app_view=0x7f030002;
        public static final int activity_game=0x7f030003;
        public static final int activity_pc_view=0x7f030004;
        public static final int activity_stream_settings=0x7f030005;
        public static final int simplerow=0x7f030006;
    }
    public static final class string {
        /**  General strings 
         */
        public static final int app_name=0x7f050000;
        /**  Add computer manually activity 
         */
        public static final int button_add_pc=0x7f050005;
        public static final int button_add_pc_manually=0x7f050004;
        public static final int button_advanced_settings=0x7f050007;
        public static final int button_stream_settings=0x7f050003;
        public static final int check_disableToasts=0x7f05000e;
        public static final int check_enableSops=0x7f05000d;
        public static final int check_stretchToFill=0x7f05000c;
        public static final int ip_hint=0x7f050001;
        public static final int radio_1080p30=0x7f05000a;
        public static final int radio_1080p60=0x7f05000b;
        public static final int radio_720p30=0x7f050008;
        public static final int radio_720p60=0x7f050009;
        public static final int radio_autoSelect=0x7f050010;
        public static final int radio_forceHardware=0x7f050011;
        /**  Advanced settings activity 
         */
        public static final int radio_forceSoftware=0x7f05000f;
        /**  PC view activity 
         */
        public static final int title_pc_view=0x7f050002;
        /**  Stream settings activity 
         */
        public static final int title_streaming_settings=0x7f050006;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 

        Base application theme for API 21+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 21+ devices.
    
 API 21 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f060000;
        /**  Application theme. 
         */
        public static final int AppTheme=0x7f060001;
        public static final int ButtonBar=0x7f060003;
        public static final int ButtonBarButton=0x7f060004;
        public static final int FullscreenTheme=0x7f060002;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle com.limelight:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle com.limelight:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.limelight.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.limelight:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.limelight.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.limelight:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}
