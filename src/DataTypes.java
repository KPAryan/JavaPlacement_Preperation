public class DataTypes {
    public static void main(String[] args) {
        System.out.println(dataTypes("Long"));
    }
        public static int dataTypes(String type) {
            // Write your code here
            int o=0;
            if(type=="Integer"){
                o=4;
            }
            if(type=="Long"){
                o=8;
            }
            if(type=="Float"){
                o=4;
            }
            if(type=="Double"){
                o=8;
            }
            if(type=="Character"){
                o=1;
            }
        return o;
        }
    }

