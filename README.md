CustomPreferenceLayout
======================

Add titlebar into PreferenceActivity
If your want to custom PreferenceActivity, like add title bar,
you can follow some step:

1. Create custom layout.
2. First, add the addPreferencesFromResource(R.xml.preference_setting) to init the preference choices.
3. Then, add setContentView(R.layout.preferences_layout) to override original layout style.


