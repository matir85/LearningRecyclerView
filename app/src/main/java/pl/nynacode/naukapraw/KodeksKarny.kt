package pl.nynacode.naukapraw

sealed class BaseKodeksKarnyItem {
    abstract val title: String
}

data class Article(override val title: String, val content: String) : BaseKodeksKarnyItem()
data class Title(override val title: String) : BaseKodeksKarnyItem()


object KodeksKarny {

    val kodeksKarnyList: ArrayList<BaseKodeksKarnyItem> = arrayListOf(
        Title("Rozdział I. Zasady odpowiedzialności karnej"),
        Article(
            "Art. 1. Warunki odpowiedzialności karnej",
            """
                § 1. Odpowiedzialności karnej podlega ten tylko, kto popełnia czyn zabroniony pod groźbą kary przez ustawę obowiązującą w czasie jego popełnienia.
                § 2. Nie stanowi przestępstwa czyn zabroniony, którego społeczna szkodliwość jest znikoma.
                § 3. Nie popełnia przestępstwa sprawca czynu zabronionego, jeżeli nie można mu przypisać winy w czasie czynu.
            """.trimIndent()
        ),
        Article(
            "Art. 2. Odpowiedzialność za przestępstwo skutkowe popełnione przez zaniechanie",
            "Odpowiedzialności karnej za przestępstwo skutkowe popełnione przez zaniechanie podlega ten tylko, na kim ciążył prawny, szczególny obowiązek zapobiegnięcia skutkowi."
        ),
        Article(
            "Art. 3. Zasada humanitaryzmu",
            "Kary oraz inne środki przewidziane w tym kodeksie stosuje się z uwzględnieniem zasad humanitaryzmu, w szczególności z poszanowaniem godności człowieka."
        ),
        Article(
            "Art. 4. Stosowanie ustawy karnej",
            """
                § 1. Jeżeli w czasie orzekania obowiązuje ustawa inna niż w czasie popełnienia przestępstwa, stosuje się ustawę nową, jednakże należy stosować ustawę obowiązującą poprzednio, jeżeli jest względniejsza dla sprawcy.
                § 2. Jeżeli według nowej ustawy za czyn objęty wyrokiem nie można orzec kary w wysokości kary orzeczonej, wymierzoną karę obniża się do wysokości najsurowszej kary możliwej do orzeczenia na podstawie nowej ustawy.
                § 3. Jeżeli według nowej ustawy czyn objęty wyrokiem nie jest już zagrożony karą pozbawienia wolności, wymierzoną karę pozbawienia wolności podlegającą wykonaniu zamienia się na grzywnę albo karę ograniczenia wolności, przyjmując że jeden miesiąc pozbawienia wolności równa się 60 stawkom dziennym grzywny albo 2 miesiącom ograniczenia wolności.
                § 4. Jeżeli według nowej ustawy czyn objęty wyrokiem nie jest już zabroniony pod groźbą kary, skazanie ulega zatarciu z mocy prawa."
            """.trimIndent()
        ),
        Article(
            "Art. 5. Zasada terytorialności",
            "Ustawę karną polską stosuje się do sprawcy, który popełnił czyn zabroniony na terytorium Rzeczypospolitej Polskiej, jak również na polskim statku wodnym lub powietrznym, chyba że umowa międzynarodowa, której Rzeczpospolita Polska jest stroną, stanowi inaczej."
        ),
        Article(
            "Art. 6. Czas i miejsce popełnienia czynu zabronionego",
            """
                § 1. Czyn zabroniony uważa się za popełniony w czasie, w którym sprawca działał lub zaniechał działania, do którego był obowiązany.
                § 2. Czyn zabroniony uważa się za popełniony w miejscu, w którym sprawca działał lub zaniechał działania, do którego był obowiązany, albo gdzie skutek stanowiący znamię czynu zabronionego nastąpił lub według zamiaru sprawcy miał nastąpić.
            """.trimIndent()
        ),
        Article(
            "Art. 7. Kategorie przestępstw - cechy zbrodni i występku",
            """
                § 1. Przestępstwo jest zbrodnią albo występkiem.
                § 2. Zbrodnią jest czyn zabroniony zagrożony karą pozbawienia wolności na czas nie krótszy od lat 3 albo karą surowszą.
                § 3. Występkiem jest czyn zabroniony zagrożony grzywną powyżej 30 stawek dziennych albo powyżej 5 000 złotych, karą ograniczenia wolności przekraczającą miesiąc albo karą pozbawienia wolności przekraczającą miesiąc.
            """.trimIndent()
        ),
        Article(
            "Art. 8. Formy winy a kwalifikacja przestępstw",
            "Zbrodnię można popełnić tylko umyślnie; występek można popełnić także nieumyślnie, jeżeli ustawa tak stanowi."
        ),
        Article(
            "Art. 9. Strona podmiotowa czynu - umyślność i nieumyślność",
            """
                § 1. Czyn zabroniony popełniony jest umyślnie, jeżeli sprawca ma zamiar jego popełnienia, to jest chce go popełnić albo przewidując możliwość jego popełnienia, na to się godzi.
                § 2. Czyn zabroniony popełniony jest nieumyślnie, jeżeli sprawca nie mając zamiaru jego popełnienia, popełnia go jednak na skutek niezachowania ostrożności wymaganej w danych okolicznościach, mimo że możliwość popełnienia tego czynu przewidywał albo mógł przewidzieć.
                § 3. Sprawca ponosi surowszą odpowiedzialność, którą ustawa uzależnia od określonego następstwa czynu zabronionego, jeżeli następstwo to przewidywał albo mógł przewidzieć.
            """.trimIndent()
        ),
        Article(
            "Art. 10. Wiek sprawcy a odpowiedzialność karna",
            """
                § 1. Na zasadach określonych w tym kodeksie odpowiada ten, kto popełnia czyn zabroniony po ukończeniu 17 lat.
                § 2. Nieletni, który po ukończeniu 15 lat dopuszcza się czynu zabronionego określonego w art. 134 zamach na życie Prezydenta RP, art. 148 zabójstwo § 1, 2 lub 3, art. 156 spowodowanie ciężkiego uszczerbku na zdrowiu § 1 lub 3, art. 163 sprowadzenie katastrofy § 1 lub 3, art. 166 piractwo, art. 173 sprowadzenie katastrofy w ruchu § 1 lub 3, art. 197 zgwałcenie lub wymuszenie czynności seksualnej § 3 lub 4, art. 223 czynna napaść na funkcjonariusza publicznego lub osobę do pomocy mu przybraną § 2, art. 252 wzięcie lub przetrzymywanie zakładnika § 1 lub 2 oraz w art. 280 rozbój, może odpowiadać na zasadach określonych w tym kodeksie, jeżeli okoliczności sprawy oraz stopień rozwoju sprawcy, jego właściwości i warunki osobiste za tym przemawiają, a w szczególności, jeżeli poprzednio stosowane środki wychowawcze lub poprawcze okazały się bezskuteczne.
                § 3. W wypadku określonym w § 2 orzeczona kara nie może przekroczyć dwóch trzecich górnej granicy ustawowego zagrożenia przewidzianego za przypisane sprawcy przestępstwo; sąd może zastosować także nadzwyczajne złagodzenie kary.
                § 4. W stosunku do sprawcy, który popełnił występek po ukończeniu lat 17, lecz przed ukończeniem lat 18, sąd zamiast kary stosuje środki wychowawcze, lecznicze albo poprawcze przewidziane dla nieletnich, jeżeli okoliczności sprawy oraz stopień rozwoju sprawcy, jego właściwości i warunki osobiste za tym przemawiają.
            """.trimIndent()
        ),
        Article(
            "Art. 11. Jedność czynu, kumulatywny zbieg przepisów ustawy",
            """
                § 1. Ten sam czyn może stanowić tylko jedno przestępstwo.
                § 2. Jeżeli czyn wyczerpuje znamiona określone w dwóch albo więcej przepisach ustawy karnej, sąd skazuje za jedno przestępstwo na podstawie wszystkich zbiegających się przepisów.
                § 3. W wypadku określonym w § 2 sąd wymierza karę na podstawie przepisu przewidującego karę najsurowszą, co nie stoi na przeszkodzie orzeczeniu innych środków przewidzianych w ustawie na podstawie wszystkich zbiegających się przepisów.
            """.trimIndent()
        ),
        Article(
            "Art. 12. Wielość zachowań, czyn ciągły",
            """
                § 1. Dwa lub więcej zachowań, podjętych w krótkich odstępach czasu w wykonaniu z góry powziętego zamiaru, uważa się za jeden czyn zabroniony; jeżeli przedmiotem zamachu jest dobro osobiste, warunkiem uznania wielości zachowań za jeden czyn zabroniony jest tożsamość pokrzywdzonego.
                § 2. Odpowiada jak za jeden czyn zabroniony wyczerpujący znamiona przestępstwa ten, kto w krótkich odstępach czasu, przy wykorzystaniu tej samej albo takiej samej sposobności lub w podobny sposób popełnia dwa lub więcej umyślnych wykroczeń przeciwko mieniu, jeżeli łączna wartość mienia uzasadnia odpowiedzialność za przestępstwo.
            """.trimIndent()
        )
    )
}