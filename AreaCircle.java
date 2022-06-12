import java.lang.*;

interface Circle
{
    float PI=3.14f;                        //public static final PI=3.14f;

    float CalculaterArea(float Redius);  // public abstract float CalculaterArea(float Redius)
    float CalculaterCircumference(float Redius); // public abstract float CalculaterCircumference(float Redius)
}

class Area implements Circle
{
    public float CalculaterArea(float Redius)
    {
        return (PI * Redius * Redius);
    }
    public float CalculaterCircumference(float Redius)
    {
        return (2 * PI * Redius);
    }

}

class AreaCircle
{
    public static void main(String arr[])
    {
        System.out.println("Value of PI :"+Circle.PI);
       // Circle.PI=6.14f; Not allowed.
        Area obj= new Area();

        float fRet=0.0f;
        fRet=obj.CalculaterArea(10.5f);
        System.out.println("Area is:"+fRet);

        fRet =obj.CalculaterCircumference(10.5f);
        System.out.println("Circumference is:"+fRet);
    }
}