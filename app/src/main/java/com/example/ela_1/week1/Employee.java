package com.example.ela_1.week1;


    public class Employee {
        String name;
        int age;
        String address;

        public Employee(String name, int age, String address) {
            Stu1 student = new Stu1("jeon ",30,"mumbai");
            System.out.println("employee is getting created "+ student.getName());
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }


