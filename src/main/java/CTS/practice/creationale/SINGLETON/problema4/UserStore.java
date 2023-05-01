package CTS.practice.creationale.SINGLETON.problema4;

public class UserStore extends ObservableStore {
        private boolean isAuthenticated;
        private boolean authError;

        public UserStore(String name) {
            super(name);
        }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public void setAuthError(boolean authError) {
        this.authError = authError;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserStore{");
        sb.append("isAuthenticated=").append(isAuthenticated);
        sb.append(", authError=").append(authError);
        sb.append('}');
        return sb.toString();
    }
}


