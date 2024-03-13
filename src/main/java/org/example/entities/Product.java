package org.example.entities;

import java.util.Random;

public class Product {
    long id;
    String name;
    String category;
    double price;

    public Product(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", price=" + price +
                    '}';
        }
    public static Product sortRandomProd() {
        long newProdId = new Random().nextLong();
        ProductInfo productInfo = ProductInfo.getRandomProductInfo();
        return new Product(newProdId, productInfo.name, productInfo.category, productInfo.price);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public enum ProductInfo {
        GARDENING_TOOLS_SET("Gardening Tools Set", "Gardening", 59.99),
        GARDENING_GLOVES("Durable Gardening Gloves", "Gardening", 15.99),
        PLANT_FERTILIZER("Organic Plant Fertilizer", "Gardening", 29.99),
        KITCHEN_KNIFE_SET("Professional Kitchen Knife Set", "Kitchen", 99.99),
        ESPRESSO_MACHINE("Espresso Coffee Machine", "Kitchen", 499.99),
        BLENDER("High-Speed Blender", "Kitchen", 199.99),
        SMART_FRIDGE("Smart Refrigerator", "Electronics", 2000.00),
        VACUUM_ROBOT("Robotic Vacuum Cleaner", "Electronics", 299.99),
        SMART_TV("Smart TV 55' 4K", "Electronics", 799.99),
        WIRELESS_SPEAKER("Wireless Bluetooth Speaker", "Electronics", 149.99),
        BOYS_ACTION_FIGURE("Superhero Action Figure", "Boys", 14.99),
        BOYS_REMOTE_CONTROL_CAR("Remote Control Car", "Boys", 29.99),
        BOYS_LEGO_SET("Space Explorer Lego Set", "Boys", 59.99),
        BOYS_DIGITAL_WATCH("Digital Sports Watch", "Boys", 19.99),
        BOYS_BASKETBALL("Junior Basketball", "Boys", 9.99),
        BOYS_SKATEBOARD("Skateboard with Cool Design", "Boys", 39.99),
        BOYS_VIDEO_GAME("Popular Video Game", "Boys", 59.99),
        BOYS_GRAPHIC_TSHIRT("Graphic T-Shirt", "Boys", 12.99),
        BOYS_BOOK_SERIES("Adventure Book Series", "Boys", 25.99),
        BOYS_PUZZLE_GAME("3D Puzzle Game", "Boys", 15.99),
        BOYS_SCIENCE_KIT("Young Scientist Kit", "Boys", 24.99),
        BOYS_DRONE("Mini Drone", "Boys", 49.99),
        BOYS_BIKE_HELMET("Cool Bike Helmet", "Boys", 29.99),
        BOYS_SNEAKERS("High-Top Sneakers", "Boys", 34.99),
        BOYS_SWIMMING_GOGGLES("Swimming Goggles", "Boys", 9.99),
        BOYS_CAMPING_TENT("Backyard Camping Tent", "Boys", 49.99),
        BOYS_TOOL_SET("Junior Tool Set", "Boys", 19.99),
        BOYS_WALKIE_TALKIES("Walkie Talkies", "Boys", 20.99),
        BOYS_MAGIC_TRICKS_SET("Magic Tricks Set", "Boys", 22.99),
        BOYS_MODEL_AIRPLANE_KIT("Model Airplane Kit", "Boys", 18.99),
        EBOOK_READER("E-Book Reader", "Electronics", 129.99),
        FITNESS_TRACKER("Fitness Tracker Watch", "Sports", 59.99),
        MOUNTAIN_BIKE("Mountain Bike", "Sports", 489.99),
        YOGA_MAT("Eco-Friendly Yoga Mat", "Sports", 29.99),
        RUNNING_SHOES("Running Shoes", "Sports", 99.99),
        CAMPING_TENT("Four-Person Camping Tent", "Outdoor", 199.99),
        SLEEPING_BAG("Warm Sleeping Bag", "Outdoor", 89.99),
        PORTABLE_GRILL("Portable Grill", "Outdoor", 129.99),
        ANTIQUE_CLOCK("Antique Wall Clock", "Home Decor", 325.99),
        WALL_ART_PRINT("Abstract Wall Art Print", "Home Decor", 45.99),
        DECORATIVE_VASE("Ceramic Decorative Vase", "Home Decor", 70.50),
        LED_DESK_LAMP("LED Desk Lamp", "Office Supplies", 29.99),
        ERGONOMIC_OFFICE_CHAIR("Ergonomic Office Chair", "Office Supplies", 249.99),
        WIRELESS_CHARGING_PAD("Wireless Charging Pad", "Electronics", 60.00),
        HANDHELD_STEAM_CLEANER("Handheld Steam Cleaner", "Home Appliances", 89.99),
        SMART_HOME_HUB("Smart Home Hub", "Electronics", 99.99),
        ELECTRIC_SCOOTER("Electric Scooter", "Transportation", 399.99),
        SOLAR_POWERED_BACKPACK("Solar Powered Backpack", "Tech Gadgets", 120.00),
        AUTOMATIC_PET_FEEDER("Automatic Pet Feeder", "Pet Supplies", 59.99),
        WATERPROOF_ACTION_CAMERA("Waterproof Action Camera", "Electronics", 159.99),
        DIGITAL_ART_TABLET("Digital Art Tablet", "Creative Tech", 199.99),
        VR_HEADSET("VR Headset", "Gaming", 299.99),
        BOARD_GAME_CLASSIC("Classic Board Game Collection", "Games", 49.99),
        POCKET_PROJECTOR("Pocket Projector", "Electronics", 289.99),
        NOISE_CANCELLING_HEADPHONES("Noise Cancelling Headphones", "Tech Gadgets", 349.99),
        PORTABLE_ESPRESSO_MAKER("Portable Espresso Maker", "Outdoor", 64.99),
        TRAVEL_GUIDE_BOOK("Ultimate World Travel Guide", "Books", 29.99),
        SUSTAINABLE_WATER_BOTTLE("Sustainable Water Bottle", "Eco-Friendly", 24.99),
        ORGANIC_SKIN_CARE_SET("Organic Skin Care Set", "Beauty", 59.99),
        HANDCRAFTED_JEWELRY_BOX("Handcrafted Jewelry Box", "Crafts", 45.00),
        DESIGNER_SUNGLASSES("Designer Sunglasses", "Fashion", 175.99),
        LUXURY_WATCH("Luxury Watch", "Accessories", 450.00),
        HIGH_PERFORMANCE_ROUTER("High Performance Router", "Tech Gadgets", 199.99),
        BOOK_HOBBIT("The Hobbit", "Books", 10.99),
        BOOK_HP("Harry Potter Series", "Books", 29.99),
        BOOK_1984("1984", "Books", 8.99),
        BOOK_GOT("Game of Thrones", "Books", 19.99),
        BOOK_SAPIENS("Sapiens", "Books", 14.99),
        BOOK_LUXURY_EDITION("Encyclopedia Luxuria", "Books", 250.00),
        BOOK_ART_HISTORY("The History of Art", "Books", 120.99),
        BOOK_SCIENCE_COMPENDIUM("Compendium of Science", "Books", 200.00),
        BOOK_SPACE_EXPLORATION("Space Exploration: A Visual History", "Books", 105.00),
        BOOK_MEDICAL_TEXTBOOK("Advanced Medical Textbook", "Books", 180.99),
        BABY_CAR_SEAT("Convertible Car Seat", "Baby", 199.99),
        BABY_STROLLER("Lightweight Stroller", "Baby", 149.99),
        BABY_DIAPERS("Disposable Diapers", "Baby", 39.99),
        BABY_BOTTLES("Baby Bottles", "Baby", 29.99),
        BABY_TOYS("Educational Toys", "Baby", 19.99),
        TECH_SMARTPHONE("Smartphone", "Tech", 999.99),
        TECH_LAPTOP("Laptop", "Tech", 1299.99),
        TECH_HEADPHONES("Headphones", "Tech", 199.99),
        TECH_CAMERA("Digital Camera", "Tech", 499.99),
        TECH_SMARTWATCH("Smartwatch", "Tech", 299.99),
        FOOD_CHOCOLATE("Chocolate Bar", "Food", 2.99),
        FOOD_COFFEE("Coffee Beans", "Food", 14.99),
        FOOD_TEABAGS("Teabags", "Food", 4.99),
        FOOD_OLIVE_OIL("Olive Oil", "Food", 10.99),
        FOOD_PASTA("Pasta", "Food", 1.99);


        final String name;
        final String category;
        final double price;

        ProductInfo(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        private static ProductInfo getRandomProductInfo() {
            Random random = new Random();
            ProductInfo[] values = ProductInfo.values();
            return values[random.nextInt(values.length)];
        }

    }

}
