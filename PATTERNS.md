Phase-1 (Creational (Yaratımsal) Örüntüler)
 - Factory Method: 
    Nerede Kullandım?
    Nesne yaratma işlemlerini yönetmek için `GameObjectFactory`adında yeni bir sınıf oluşturdum. `Main` sınıfının içindeki bütün o manuel `new GameObject...` kodlarını alıp bu sınıfa taşıdım.

    Neden Kullandım?
    İlk yazdığım spagetti kodda `Main` Main sınıfı, alt sınıflara gereğinden fazla bağımlıydı (tight coupling). Bu bağımlılığı azaltmak ve nesne üretimini tek bir merkeze almak için bu örüntüyü seçtim.

    Ne Kazandım?
    Nesne yaratma sorumluluğunu tamamen `GameObjectFactory` sınıfına devretmiş oldum. Artık `Main` sınıfı sadece GameObjectFactory.C_Player... diyor ve nesnenin arka planda nasıl üretildiğiyle ilgilenmiyor. Hem Main sınıfındaki kod kalabalığından kurtuldum hem de yeni bir karakter eklemek istediğimde sadece `GameObjectFactory` sınıfına yeni bir metot ekleyerek sistemi genişletebileceğim esnek bir yapı kurmuş oldum.

Phase-2 (Structural (Yapısal) Örüntüler)
 - Decorator Örüntüsü:
    Nerede Kullandım?
    `GameObjectDecorator` abstract sınıfı ve bu sınıfı miras alan sınıflarda(`LightsaberDecorator`).

    Neden Kullandım?
    Karakterlerin sınıfları bozulmadan onlara oyun esnasında dinamik özellikler eklemek için kullandım.
    
    Ne Kazandım?
    Mevcut kodu kırmadan sistemi genişletebilmemi sağladı ve yeni özellikler için fazla sayıda alt sınıf açma zahmetinden kurtardı.

 - Composeite Örüntüsü:
    Nerede Kullandım?
    Birden fazla düşmanı barındıran `GameObjectGroup` sınıfında.

    Neden Kullandım?
    Birden fazla düşmanı tek bir noktada toplayıp tek bir nesneymiş gibi yönetelebilmek için kullandım.

    Ne Kazandım?
    Sistemi karmaşık döngülerden ve kod kalabalığından kurtardım. Polimorfizm sayesinde tek bir düşman ya da ordu farketmeden, `Main` sınıfının sistemi yönetebilmesini sağladım.