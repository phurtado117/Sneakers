public class Deportivo {

        private long model;
        private String color;
        private String marca;
        private double size;

        public Deportivo(long model, String color, String marca, double size) {
            this.model = model;
            this.color = color;
            this.marca = marca;
            this.size = size;
        }

        public Deportivo() {
        }

        public long getModel() {
            return model;
        }

        public void setModel(long model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public String toString() {
            System.out.println("zapatos"
                    +"\nmodelo:"+getModel()
                    +"\ntalla:"+getSize()
                    +"\ncolor:"+getColor()
                    +"\nmarca:"+getMarca());

            return null;
        }
    }



