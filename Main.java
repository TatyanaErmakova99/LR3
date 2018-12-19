public class Main {
    void figures(Figure figure) {
        figure.drow();
        System.out.println(figure.getPiecesOfFigure()+"\t Количество фигур в наследуемом классе");
    }
    public static void main(String[] args) {
        Main main=new Main();
        Figure figure = new New Figure(); //метод getPiecesOfFigure() вызывается не в Figure, а в NewFigure - это полиморфизм
        main.figures(figure);

        Figure figure1 = new Figure();
        System.out.println(figure1.getPiecesOfFigure()+"\t Количество фигур в базовом классе");
    }
}
