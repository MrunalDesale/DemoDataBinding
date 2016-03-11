package shoppingpad.com.demodatabind;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by bridgelabz3 on 9/3/16.
 */
public class User extends BaseObservable {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
        notifyPropertyChanged(shoppingpad.com.demodatabind.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(shoppingpad.com.demodatabind.BR.lastName);
    }
}
