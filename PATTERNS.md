Phase-1 (Creational (Yaratımsal) Örüntüler)
 - Factory Method: 
    Nerede Kullandım?
    Nesne yaratma işlemlerini yönetmek için `GameObjectFactory`adında yeni bir sınıf oluşturdum. `Main` sınıfının içindeki bütün o manuel `new GameObject...` kodlarını alıp bu sınıfa taşıdım.

    Neden Kullandım?
    İlk yazdığım spagetti kodda `Main` Main sınıfı, alt sınıflara gereğinden fazla bağımlıydı (tight coupling). Bu bağımlılığı azaltmak ve nesne üretimini tek bir merkeze almak için bu örüntüyü seçtim.

    Ne Kazandım?
    Nesne yaratma sorumluluğunu tamamen `GameObjectFactory` sınıfına devretmiş oldum. Artık `Main` sınıfı sadece GameObjectFactory.C_Player... diyor ve nesnenin arka planda nasıl üretildiğiyle ilgilenmiyor. Hem Main sınıfındaki kod kalabalığından kurtuldum hem de yeni bir karakter eklemek istediğimde sadece `GameObjectFactory` sınıfına yeni bir metot ekleyerek sistemi genişletebileceğim esnek bir yapı kurmuş oldum.