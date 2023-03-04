package com.kurs2_1sem.OOAIP.zadanie5Singleton.enumSingleton;

public class EnumDemo {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}

//enum-это объект, поэтому его можно не только передавать, но и реализовывать интерфейсы.Кроме того, поскольку мы создаем класс,
//мы можем использовать различные общедоступные/частные параметры, доступные для всех классов.
//Таким образом, на практике мы можем сделать singleton, который реализует интерфейс, а затем передает его в нашем коде,
//а код вызова не является более мудрым. Мы также можем сделать пакет enum class частным,
//но все равно передавать его другим классам в других пакетах, которые ожидают интерфейс.Если бы мы использовали версию
//статических методов, то вызывающий класс должен был бы знать, что этот объект является одиночным,
// и наш одноэлементный класс должен быть общедоступным, чтобы другие классы могли его видеть и использовать его методы.

//он более краткий, предоставляет бесплатную сериализующую технику и предоставляет отличную гарантию против множественного
//экземпляра даже в условиях сложных атак сериализации или отражения. этот подход еще не принят,
// одноэлементный тип перечисления - лучший способ реализовать singleton.


//No. The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create.
// If we don’t implement Cloneable interface, clone() method generates CloneNotSupportedException.