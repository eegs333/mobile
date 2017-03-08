Image i;
try{
    i=Image.createImage("foto.png");
}cath(IOException ioe){}
  ImagenItem ii = new ImagenItem("","foto.png",ImagenItem.LAYOUT_DEFAULT,"logo");
  f.append(ii);

  Constantes: LAYOUT_DEFAULT
              LAYOUT_LEFT
              LAYOUT_RIGHT
              LAYOUT_CENTER
              LAYOUT_NEWLINE_BEFORE
              LAYOUT_NEWLINE_AFTER

Nota: Las imagenes se almacenan en la carpeta res. se puede indicar la imagen anteponiendo la barra / para referirse a ella, por ejempñlo "/foto.png".


- DateField:
DateField df = new DateField("",DateField.DATE);
f.append(df);

Metodos: Date getDate();

void setDate(Date d)

Constantes: DateField.TIME
DateField.DATA
DAteField.DATE_TIME

- ChoiceGroup:
String [] pais = {"México","Francia","Canada","España"};
ChoiceGroup chg = new ChoiceGroup("Paises:",LIST.EXCLUSIVE,pais,null);
f.append()chg;

- Gauge:
  Gauge g = new Gauge("valor", false, 1, 10);
  f.append(g);
  Metodos:
    int getValue()
    void setValue(int n)
    int getMacValue()
    void setMaxValue(int n)





-
