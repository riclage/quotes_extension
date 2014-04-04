/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mindmeapp.extensions.quotes;

import java.util.Locale;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.RemoteViews;

import com.mindmeapp.extensions.ExtensionData;
import com.mindmeapp.extensions.MindMeExtension;

public class QuotesExtension extends MindMeExtension {
	public static final String PREF_SPEAK_BEFORE = "pref_speak_before";
	public static final String PREF_DISPLAY_WALLPAPER = "pref_display_wallpaper";

	@Override
	protected void onUpdateData(int reason) {
		// Get a quote at random to show and speak
		Quote q = QuotesDb.getInstance().getRandomQuote();

		// Get preference value for text to speak before the quote
		// and to display wallpaper
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(this);
		String name = sp.getString(PREF_SPEAK_BEFORE,
				getString(R.string.pref_speak_before_default));
		boolean displayWallpaper = sp.getBoolean(PREF_DISPLAY_WALLPAPER, false);

		// Update RemoteViews layout with the fetched quote
		RemoteViews rv = new RemoteViews(this.getPackageName(),
				R.layout.quote_layout);
		rv.setTextViewText(R.id.quote, q.quote + " (" + q.author + ")");

		// Sets up the data to publish
		ExtensionData data = new ExtensionData()
				.visible(true)
				.icon(R.drawable.ic_action_book)
				.statusToDisplay(q.quote + " (" + q.author + ")")
				.statusToSpeak(name + " " + q.quote)
				.languageToSpeak(Locale.US)
				.contentDescription(getString(R.string.content_description, q.author, q.quote))
				.viewsToDisplay(rv);
		if (displayWallpaper) {
			data.background(R.drawable.background);
		}

		// Publish the extension data update
		publishUpdate(data);
	}

}
