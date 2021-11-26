package com.example.myapplication;

import android.location.Location;

public class Plant{
        private String name;
        private String description;
        private String Location;
        private PlantCat category;
        private String photo;



        public Plant(String name, String description, String Location,PlantCat category, String photo) {
            this.name = name;
            this.description = description;
            this.Location = Location;
            this.category = category;
            this.photo = photo;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAddress() {
            return Location;
        }

        public void setAddress(String address) {
            this.Location = address;
        }

        public PlantCat getCategory() {
            return category;
        }

        public void setCategory(PlantCat category) {
            this.category = category;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }


        @Override
        public String toString() {
            return "Restaurant{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", address='" + Location + '\'' +
                    ", category=" + category +
                    ", photo='" + photo + '\'' +
                    '}';
        }
}
