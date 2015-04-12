package mona.android.decor.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import mona.android.decor.DecorContextWrapper;
import mona.android.decorators.Decorators;

public class CreatesFragActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.emty_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.main, new TestFragment()).commit();
		}
	}

	@Override
	protected void attachBaseContext(Context newBase) {
		super.attachBaseContext(DecorContextWrapper.wrap(newBase)
				.with(Decorators.getAll()));
	}

}
