package interfaces;

public interface ISearch {

    public interface View {

        void startDatePicker();

        void goBack();
    }

    public interface Presenter {

        public void onClickDatePicker();



        public void onClickAboutButton() ;
        void onBack();
    }
}
