class Box{
    int width;
    int height;
    int depth;
    Box(int w, int h, int d){
        width = w;
        height =h;
        depth =d;
    }
    int volume(){
        return width*height*depth;
    }
    public static void main(String args[]){
        Box b = new Box(5,6,7);
        System.out.println( b.volume());
    }
}