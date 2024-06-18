package com.example.demo.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

    @Entity
    public class Employee {

        @Id
        private Integer id;
        private String name;
        private String department;
        private String country;
        private String state;
        private String phone_number;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public void setPhone_Number(String phone_number) {
            this.phone_number = phone_number;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

