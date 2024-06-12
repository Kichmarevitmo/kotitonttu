package fr.mossaab.security.service.impl;

import fr.mossaab.security.entities.ServiceCentre;
import fr.mossaab.security.repository.ServiceCentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateServiceCentreService {
    @Autowired
    private ServiceCentreService serviceCentreService;

    @Autowired
    private ServiceCentreRepository serviceCentreRepository;

    public void CreateServiceCentre() {
        if (serviceCentreRepository.count() == 0) {

            final var serviceList = List.of(
                    new ServiceCentre("ООО \"Гудмаер\"", "Ижевск", "с. Завьялово, ул. Гольянская, д. 2а", "(3412)77-11-04 доб. 2", "Газовые котлы, колонки", 56.806787, 53.373223),
                    new ServiceCentre("ГК «Термотехника»", "Чебоксары", "г. Чебоксары, Петрова С.П., д. 6, строение 2", "(8352) 57-32-44, 57-34-44", "Газовые котлы, колонки", 56.140851, 47.245913),
                    new ServiceCentre("ООО «Тепломеханика Газ»", "Кемерово", "г. Кемерово, улица Сарыгина, дом 27, офис 103", "(3842) 67-02-88", "Газовые котлы", 55.339524, 86.071926),
                    new ServiceCentre("ООО «ЦИК Аквавольт»", "Новосибирск", "Новосибирская область, г. Бердск, ул. Зеленая Роща, дом 7/34, этаж 1", "(7913) 484-1010", "Газовые котлы", 54.737964, 83.036151),
                    new ServiceCentre("ООО \"Газмастер\"", "Белгород", "г. Белгород, ул. Гостенская, д. 12", "+7 (903) 642-80-53", "Котлы, колонки", 50.597261, 36.572760),
                    new ServiceCentre("ИП Ливцов В.В.", "Саранск", "г. Саранск, ул. Рабочая, д.№169", "(8342)- 34-50-30", "Газовые котлы, колонки", 54.199475, 45.193631),
                    new ServiceCentre("ООО \"Котельный сервис\"", "Оренбург", "г. Оренбург, ул. Карагандинская, д. 32", "(3532) 92-70-00", "Газовые котлы, колонки", 51.791813, 55.135358),
                    new ServiceCentre("ИП Фоменко А.А.", "Ставрополь", "г. Ставрополь 3-я Промышленная дом 3 ТЦ «Мой Дом»", "(8652) 92-00-32", "Газовые котлы, колонки", 45.057645, 41.914160),
                    new ServiceCentre("ООО Компания «СЭТ»", "Ставрополь", "г. Ставрополь, ул. Тухачевского, д. 22/4", "+7(928) 321-85-83", "Газовые котлы", 45.013632, 41.906246),
                    new ServiceCentre("ООО «Гео-Газ-Сервис»", "Георгиевск", "Ставропольский, город Георгиевск, улица Воровского, 1", "(87951) 3-66-80", "Газовые котлы", 44.173716, 43.460404),
                    new ServiceCentre("ООО «Аксон»", "Екатеринбург", "г.Екатеринбург, ул Московская, стр. 287, помещение 32", "(343)345-22-13", "Газовые котлы, колонки", 56.798196, 60.598696),
                    new ServiceCentre("ООО «СЗГАЗ»", "Санкт-Петербург", "г.Санкт-Петербург, Ленинский проспект 51-507", "(812)244-68-82", "Газовые котлы, колонки", 59.862569, 30.167305),
                    new ServiceCentre("ИП Зиновьев Д.И.", "Брянск", "г. Брянск, c.Супонево, ул. Московская, д. 517", "(4832) 92-23-21", "Газовые котлы, колонки", 53.197766, 34.271096),
                    new ServiceCentre("ООО \"Теплоцентр\"", "Казань", "г. Казань, Проспект Победы, д. 90", "(843) 250-40-60, (843) 266-55-06", "Газовые котлы, колонки", 55.766207, 49.220590),
                    new ServiceCentre("ООО \"Регионторг\"", "Курган", "г. Курган пр. Машиностроителей, 30", "(3522) 601-701 доб. 101", "Газовые котлы, колонки", 55.469255, 65.331623),
                    new ServiceCentre("ООО «Газсервис»", "Челябинск", "Челябинская область, г.Коркино, ул. Цвилинга д. 28, оф.28", "", "Газовые котлы, колонки", 54.891163, 61.402994),
                    new ServiceCentre("ИП Усачев", "Воронеж", "г.Воронеж, ул.Дорожная, д.2", "+7 920-40-88-444", "Газовые котлы, колонки", 51.663825, 39.155794),
                    new ServiceCentre("ИП Валиуллин Р.Р.", "Белгород", "г. Белгород ул. Победы 69а", "+7 906-608-0204", "Газовые котлы, колонки", 50.591766, 36.594921),
                    new ServiceCentre("ООО «Стройкомплект»", "Самара", "г. Самара, ул. Молодогвардейская, д.104, оф.6", "(846) 332-14-34", "Газовые котлы, колонки", 53.189210, 50.097480),
                    new ServiceCentre("ООО \"ЛенГазСервис\"", "Санкт-Петербург", "Санкт-Петербург, ул. Автовская, 16, Литер А, кабинет 116", "+7 911-922-44-58", "Газовые котлы, колонки", 59.868939, 30.268913),
                    new ServiceCentre("ООО \"Аванпост\"", "Владимир", "г.Владимир, ул.Б.Нижегородская, 1-а", "(4922) 32-22-10", "Газовые котлы, колонки", 56.134506, 40.421520),
                    new ServiceCentre("ООО «СОКОЛ»", "Орел", "Орел, ул. Гагарина, д.23", "+7 920-829-32-23", "Газовые котлы, колонки", 52.960174, 36.071401),
                    new ServiceCentre("ИП Киселев А.В.", "Нальчик", "г. Нальчик, ул. Мальбахова, д. 35", "+7 928-711-40-72", "Газовые котлы, колонки", 43.505368, 43.611608),
                    new ServiceCentre("ООО \"Компания Оптима\"", "Тула", "г.Тула, ул. Октябрьская, д.80А. пом/оф/лит I/1/А эт 1", "(4872) 25-20-89", "Газовые котлы, колонки", 54.219795, 37.624687),
                    new ServiceCentre("ООО «Мир тепла сервис»", "Н.Новгород", "г. Н.Новгород, п. Черепичный, д.14, офис 10", "(831) 413-35-15", "Газовые котлы, колонки", 56.244640, 44.005232),
                    new ServiceCentre("ИП Воробьев Т.В.", "Омск", "г. Омск, ул. 8 Амурская, д. 64/1", "+7 913-967-80-17", "Газовые котлы, колонки", 55.028507, 73.394587),
                    new ServiceCentre("ООО \"Газовик Сервис\"", "Пенза", "Пенза г, Чаадаева ул, стр 135", "(4812) 26-29-27", "Газовые котлы, колонки", 53.210592, 45.065936),
                    new ServiceCentre("ООО «РЕСУРС-МРГ»", "Кострома", "ул. Костромская д. 105 неж. пом. №5", "+7 920-646-19-97", "Газовые котлы, колонки", 57.806885, 40.999429),
                    new ServiceCentre("ООО «ТеплотехникаСервис»", "Тула", "г. Тула, ул. Оборонная, д. 37", "(4872) 700-113", "Газовые котлы, колонки", 54.184108, 37.625424),
                    new ServiceCentre("ИП Лукин", "Липецк", "проезд Сержанта Кувшинова, д. 10, оф. 32", "+7 960-142-88-81", "Газовые котлы, колонки", 52.598702, 39.514185),
                    new ServiceCentre("ООО \"ГОРГАЗ\"", "Новоалтайск", "г. Новоалтайск, ул.Белякова 1а, оф.22", "(38532)56393", "Газовые котлы и колонки", 53.387566, 83.958262),
                    new ServiceCentre("ИП Нуртдинов", "Пермь", "г. Пермь, ул. Карпинского, д.83.", "(342) 280-16-61, (342) 290-38-88", "Газовые котлы и колонки", 57.975551, 56.212941),
                    new ServiceCentre("ИП Вилков", "Н. Челны", "г. Набережные Челны, пр-т Московский, д.89", "+7 937-777-67-99", "Газовые котлы и колонки", 55.727293, 52.399503),
                    new ServiceCentre("ИП Кузнецова", "Орел", "г. Орел, ул. Медведева, д.30", "(4862)48-85-89", "Газовые котлы, электрокотлы, колонки", 52.971976, 36.100057),
                    new ServiceCentre("ИП Лисичкин С.В.", "Шахты", "г.Шахты, ул. Шевченко, д.109", "+7 950-860-58-57, +7 952-588-02-16, +7 918-542-49-39", "Газовые котлы, электрокотлы, колонки", 47.704028, 40.220755),
                    new ServiceCentre("ИП Мартыненков Ю.Л.", "Смоленск", "г. Смоленск, ул. Шевченко д. 83", "+7 920-666-26-63", "Газовые котлы и колонки", 54.782589, 32.085711),
                    new ServiceCentre("ИП Савоськина А.Ю.", "Орел", "г. Орел, Пионерская ул., д. 4", "(4862)63-22-62", "Газовые котлы, электрокотлы, колонки", 52.976233, 36.061394),
                    new ServiceCentre("ИП Комышов Ф.И.", "Козельск", "г. Козельск, ул. Чкалова, д. 40", "+7 920-612-10-77", "Газовые котлы, электрокотлы, колонки", 54.036330, 35.770663),
                    new ServiceCentre("ООО \"ТЕПЛОСИТИ-96\"", "Екатеринбург", "г Екатеринбург, пр-кт Орджоникидзе, строение 8, офис 305", "+7 965-522-47-79", "Газовые котлы, электрокотлы, колонки, ЭВН", 56.889115, 60.591995),
                    new ServiceCentre("ООО «ТД «Феникс»", "Аксай", "Ростовская область, м.р-н Аксайский, с.п. Щепкинское, х. Нижнетемерницкий, ул. Гайдара, зд.6, скл. 3/4, помещ.1", "+7 903-471-64-40", "Газовые котлы и колонки", 47.357204, 39.753245),
                    new ServiceCentre("ООО «ОТОПИТЕЛЬНЫЕ СИСТЕМЫ»", "Новосибирск", "г. Новосибирск ул.9-го Ноября 95", "(383) 380-93-79", "Газовые котлы и колонки", 55.007359, 82.955886),
                    new ServiceCentre("АО «Газпром газораспределение Брянск»", "Брянск", "г. Брянск, ул. Щукина, д. 54", "(4832) 74-31-88", "Газовые котлы и колонки", 53.241632, 34.325579),
                    new ServiceCentre("ТП Калабин Д.И.", "Сосново", "Пермский край, Чайковский район, с.Сосново, ул. Советская, д.81", "+7 922-646-22-99, +7 922-318-63-", "Газовые котлы и колонки", 56.676765, 54.583604),
                    new ServiceCentre("ИП Магомедов М.М.", "Махачкала, Каспийск", "Респ. Дагестан, г. Каспийск, ул. Ермака, д. 13.", "+7 989-899-96-69", "Газовые котлы, электрокотлы, колонки, ЭВН", 42.877020, 47.627095),
                    new ServiceCentre("ИП Утемов А.С.", "Суксун", "Пермский край, Суксунский район, п. Суксун, ул. Маношина, д. 11", "+7 950-454-39-37", "Газовые котлы и колонки", 57.142052, 57.396876),
                    new ServiceCentre("ИП Аксенов К.В", "Медынь", "г. Медынь, пр-т Ленина, д, 27, пом. 9", "+7 920-615-53-44", "Газовые котлы и колонки", 54.966882, 35.863899),
                    new ServiceCentre("ООО «ГорГаз»", "Дзержинск", "г. Дзержинск, пр-т Ленина, д. 105Б, оф. 1", "(8313) 234-666, 233-662, +7 904-049-76-14", "Газовые котлы и колонки", 56.240338, 43.490704),
                    new ServiceCentre("ООО «СаяныЭнергоСервис»", "Н. Новгород", "г. Нижний Новгород пр. Ленина, 93, офис 10", "(831) 22-888-00", "Газовые котлы и колонки", 56.267192, 43.910891),
                    new ServiceCentre("ООО \"МТ Сервис\"", "Н. Новгород", "Н. Новгород, ул. Кемеровская д.12, офис 3", "(831) 413-35-15", "Газовые котлы и колонки", 56.248256, 43.976117),
                    new ServiceCentre("ИП Середа А.Н.", "Пермь", "г. Пермь, ул. Решетникова, д. 17", "(34261) 44368", "Газовые котлы и колонки", 58.009644, 56.206330),
                    new ServiceCentre("ООО \"Теплый Дом\"", "Мичуринск", "г.Мичуринск, Садовый проезд д.12 Б", "(47545) 2-01-11", "Газовые котлы, колонки, ЭВН", 52.894825, 40.446610),
                    new ServiceCentre("ИП Расторгуев В.В.", "Южноуральск", "г. Южноуральск, ул. Московская, д. 24", "+7 963-079-66-66", "Газовые котлы и колонки", 54.443617, 61.251870),
                    new ServiceCentre("ИП Барабанов А.П.", "Н. Новгород", "Нижегородская обл. Кстовский район, дер. Крутая, ул. Березовая д.101", "+7 920-020-75-96", "Газовые котлы", 56.196612, 44.081669),
                    new ServiceCentre("ООО \"ИСЦ\"", "Ульяновск", "г.Ульяновск, ул.Промышленная, д.30", "(9272) 70-16-39", "Газовые котлы и колонки", 54.286377, 48.296331),
                    new ServiceCentre("ООО \"СамараКомплектСервис-М\"", "Самара", "г. Самара,ул. Партизанская,д.80,ком.11", "(846) 202-12-00", "Газовые котлы и колонки", 53.192366, 50.169705),
                    new ServiceCentre("ООО \"Аква-Юг\"", "Краснодар", "г. Краснодар, ул. Российская, д. 253/1", "(861) 228-98-55", "Газовые котлы, электрокотлы, колонки, ЭВН", 45.083616, 39.014408),
                    new ServiceCentre("ООО «Теплоград»", "Коломна", "г.Коломна, ул. Октябрьской революции, д.387 «а»", "8(926)907-53-00", "Газовые котлы, электрокотлы, колонки, ЭВН", 55.081065, 38.815305),
                    new ServiceCentre("ООО \"Евросесвис\"", "Шилово", "Рязанская обл, р.п.Шилово, ул.Советская,д.46, помещение Н5", "+7 910-610-22-44", "Газовые котлы, электрокотлы, колонки, ЭВН", 54.323860, 40.892677),
                    new ServiceCentre("ООО «ЕСМ»", "Ульяновск", "г. Ульяновск, пер. Робеспьера, дом 2/79, офис 10", "(8422)76-52-91", "Газовые котлы", 54.321339, 48.381141),
                    new ServiceCentre("ИП Лукьянов Р.М.", "Симферополь", "г. Симферополь, ул. Кубанская, д. 32", "+7 978-835-23-57", "ЭВН", 44.967767, 34.159247),
                    new ServiceCentre("ООО \"ИНГТЕПЛО\"", "Назрань", "г. Сунжа, ул. Висаитова, д. 51 офис 3", "+7 928-695-62-99", "Газовые котлы, электрокотлы, колонки, ЭВН", 43.317264, 45.050862),
                    //new ServiceCentre("ООО \"БРАВО-ГРУПП\"", "", "", "", "", 0, 0),
                    new ServiceCentre("ООО «Академия Мастеров»", "Пермь", "г. Пермь, ул. Переездная 2, литер С", "(342) 288-68-18", "Газовые котлы, электрокотлы, колонки, ЭВН", 58.071018, 56.346988),
                    new ServiceCentre("ООО «ИЦЛТ»", "Новосибирск", "г Новосибирск, ул Мусы Джалиля 23", "+7 913-007-61-79, +7 993-007-06-45", "Газовые котлы, электрокотлы, колонки", 54.861710, 83.094793),
                    new ServiceCentre("ООО «РАКУРС»", "Мичуринск", "г.Мичуринск, ул.Лаврова д.69/10", "+7 910-750-67-27", "Газовые котлы, колонки", 52.900801, 40.484474),
                    new ServiceCentre("ИП Акулов М.А.", "Арзамас", "г. Арзамас, ул. Октябрьская, д. 34А", "+7 908-239-73-94", "Газовые котлы", 52.900801, 40.484474),
                    new ServiceCentre("ГАЗТЕПЛОСЕРВИС", "Курган", "г. Курган, ул. Куйбышева, 56", "(3522)66-25-65", "Газовые котлы", 55.434615, 65.349607),
                    new ServiceCentre("Юсупбаев Э.Ю.", "Подольск", "г Подольск, ул Давыдова, Д 5", "+7 925 925-34-95", "Газовые котлы, электрокотлы, колонки, ЭВН", 55.404269, 37.560889),
                    new ServiceCentre("ООО «ТЕРМ Центр»", "Жуковский", "Московская область, г. Жуковский, ул. Мясищева, д.1, офис 313", "(499) 670-45-46", "Газовые котлы и колонки", 55.600704, 38.106858),
                    new ServiceCentre("ООО «Первый Газовый»", "Калуга", "г. Калуга, ул. Декабристов, д. 15, оф.1", "(4842) 56-34-11", "Газовые котлы, электрокотлы, колонки, ЭВН", 54.505775, 36.261215)
            );


            serviceCentreService.addAllServiceCentre(serviceList);
        }
    }

}
