package com.pablo.order.model;

final class Client {
    private Long id;
    private String firstName;
    private String lastName;
    private Address address;
    private String phone;

    public Client(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private Address address;
        private String phone;

        public static Builder newInstance()
        {
            return new Builder();
        }

        private Builder() {}

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress(Address address){
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public Client build(){
            return new Client(this);
        }

    }

}
