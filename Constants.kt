package com.example.bbpathology

object Constants{

    const val USER_NAME: String= "user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getAllQuestions():ArrayList<Elements>{
        val allQuestions=ArrayList<Elements>()

        val que1 = Elements(4,
            R.drawable.s4,
            "Amyloidosis lienis"
            )

        val que2 = Elements(52,
            R.drawable.s52,
            "Hepatitis virosa"
            )

        val que3 = Elements(53,
            R.drawable.s53,
            "Cirrhosis hepatis"
            )

        val que4 = Elements(70,
            R.drawable.s70,
            "Seminoma testis"
    )

        val que5 = Elements(97,
            R.drawable.s97,
            "Lipoma"
      )
        val que6 = Elements(1,

            R.drawable.s1,
            "Atrophia et sclerosis testis"
    )
        val que7 = Elements(2,

            R.drawable.s2,
            "Atrophia fusca hepatis"
        )
        val que8 = Elements(3,

            R.drawable.s3,
            "Amyloidosis renis"
     )
        val que9 = Elements(5,

            R.drawable.s5,
            "Hyalinosis vasorum lienis"
   )
        val que10 = Elements(6,

            R.drawable.s6,
            "Infiltratio adiposa myocardii"
     )
        val que11 = Elements(7,

            R.drawable.s7,
            "Metamorphoisis adiposa hepatis diffusa"
      )
        val que12 = Elements(8,
            R.drawable.s8,
            "Hyperaemia pulmonis passiva chronica"

      )
        val que13 = Elements(9,
            R.drawable.s9,
            "Necrosis hepatis centralis haemorrhagica"
      )
        val que14 = Elements(10,
            R.drawable.s10,
            "Hyperaemia passiva lienis chronica"
     )
        val que15 = Elements(11,

            R.drawable.s11,
            "Thrombus venae in organisatione"
        )
        val que16 = Elements(12,
            R.drawable.s12,
            "Infarctus anaemicus renis"
            )
        val que17 = Elements(13,
            R.drawable.s13,
            "Infarctus haemorrhagicus pulmonis"
        )
        val que18 = Elements(14,
            R.drawable.s14,
            "Pleuritis fibrinoso-purulenta"
          )
        val que19 = Elements(15,
            R.drawable.s15,
            "Abscessus hepatis"
     )
        val que20 = Elements(16,
            R.drawable.s16,
            "Phlegmone cutis"
      )
        val que21 = Elements(17,
            R.drawable.s17,
            "Appendicitis phlegmonosa"
        )
        val que22 = Elements(18,
            R.drawable.s18,
            "Lymphadenitis TBC"
         )
        val que23 = Elements(19,
            R.drawable.s19,
            "Cysticercosis cerebri"
      )
        val que24 = Elements(20,
            R.drawable.s20,
            "Granuloma corporis alieni"
       )
        val que25 = Elements(21,
            R.drawable.s21,
            "Papilloma mucosae oris"
      )
        val que26 = Elements(22,
            R.drawable.s22,
            "Polypus cervicis uteri"
      )
        val que27 = Elements(23,
            R.drawable.s23,
            "Adenoma tubulare intestini coli"
     )
        val que28 = Elements(24,
            R.drawable.s24,
            "Maligne celije u razmazu"
         )
        val que29 = Elements(25,
            R.drawable.s25,
            "HSIL cervicis uteri"
    )
        val que30 = Elements(26,
            R.drawable.s26,
            "Carcinoma planocellulare invasivum cervicis uteri"
          )
        val que31 = Elements(27,
            R.drawable.s27,
            "Adenocarcinoma pulmonis"
         )
        val que32 = Elements(28,
            R.drawable.s28,
            "Carcinoma metastaticum in medulla ossis"
         )
        val que33 = Elements(29,
            R.drawable.s29,
            "Carcinoma metastaticum in nodo lymphatico"
           )
        val que34 = Elements(30,
            R.drawable.s30,
            "Myofibrosis cordis"
           )
        val que35 = Elements(31,
            R.drawable.s31,
            "Myocarditis virosa"
           )
        val que36 = Elements(32,
            R.drawable.s32,
            "Nephrocirrhosis arterio et arteriolosclerotica"
         )
        val que37 = Elements(33,
            R.drawable.s33,
            "Atherosclerosis aortae"
           )
        val que38 = Elements(34,
            R.drawable.s34,
            "Infarctus myocardii"
          )
        val que39 = Elements(35,
            R.drawable.s97,
            "Polyarteritis nodosa"
         )
        val que40 = Elements(36,
            R.drawable.s36,
            "Pneumonia fibrinosa s. cruposa"
         )
        val que41 = Elements(37,
            R.drawable.s37,
            "Bronchopneumonia fibrinoso-purulenta"
          )
        val que42 = Elements(38,
            R.drawable.s38,
            "Bronchopneumonia caseosa tuberculosa"
          )
        val que43 = Elements(39,
            R.drawable.s39,
            "TBC miliaris pulmonis"
          )
        val que44 = Elements(40,
            R.drawable.s40,
            "Membranae hylineae pulmonum (ARDS)"
           )
        val que45 = Elements(41,
            R.drawable.s41,
            "Emphysema pulmonum"
         )
        val que46 = Elements(42,
            R.drawable.s42,
            "Sitnocelijski karcinom bronha."
           )
        val que47 = Elements(43,
            R.drawable.s43,
            "Adenoma pleomorphe"
           )
        val que48 = Elements(44,
            R.drawable.s44,
            "Gastritis chronica"
           )
        val que49 = Elements(45,
            R.drawable.s45,
            "Adenocarcinoma ventriculi"
           )
        val que50 = Elements(46,
            R.drawable.s46,
            "Ulcus ventriculi chronicum"
           )
        val que51 = Elements(47,
            R.drawable.s47,
            "Colitis ulcerosa chronica"
           )
        val que52 = Elements(48,
            R.drawable.s48,
            "Adenocarcinoma intestini coli"
         )
        val que53 = Elements(49,
            R.drawable.s49,
            "Carcinoma pancreatis"
            )
        val que54 = Elements(50,
            R.drawable.s97,
            "Cholestasis"
        )
        val que55 = Elements(51,
            R.drawable.s97,
            "Adenocarcinoma ventriculi metastaticum in hepate"
          )
        val que56 = Elements(54,
            R.drawable.s97,
            "Carcinoma hepatis hepatocellulare"
           )
        val que57 = Elements(55,
            R.drawable.s97,
            "Struma colloides glandulae thyreoideae"
           )
        val que58 = Elements(56,
            R.drawable.s97,
            "Hashimoto thyreoiditis"
        )
        val que59 = Elements(57,
            R.drawable.s97,
            "Carcinoma papillare glandulae threoideae"
          )
        val que60 = Elements(58,
            R.drawable.s97,
            "Carcinoma folliculare glandulae thyreoideae"
          )
        val que61 = Elements(59,
            R.drawable.s97,
            "Pheochromocytoma"
          )
        val que62 = Elements(60,
            R.drawable.s97,
            "SFibrocisticna promena dojke"
           )
        val que63 = Elements(61,
            R.drawable.s97,
            "Fibroadenoma mammae"
         )
        val que64 = Elements(62,
            R.drawable.s97,
            "Carcinoma mammae ductale invasivum"
           )
        val que65 = Elements(63,
            R.drawable.s97,
            "Pyelonephritis purulenta"
          )
        val que66 = Elements(64,
            R.drawable.s97,
            "Glomerulonephritis endocapillaris s. acuta"
          )
        val que67 = Elements(65,
            R.drawable.s97,
            "Nephropathia diabetica"
         )
        val que68 = Elements(66,
            R.drawable.s97,
            "Carcinoma transitiocellulare papillare"
         )
        val que69 = Elements(67,
            R.drawable.s97,
            "Carcinoma lucidocellulare renis"
          )
        val que70 = Elements(68,
            R.drawable.s97,
            "Wilmsov tumor"
          )
        val que71 = Elements(69,
            R.drawable.s97,
            "Epididymitis purulenta subacuta"
           )
        val que72 = Elements(71,
            R.drawable.s97,
            "Hyperplasia nodularis prostatae"
        )
        val que73 = Elements(72,
            R.drawable.s72,
            "Graviditas tubaria"
            )
        val que74 = Elements(73,
            R.drawable.s73,
            "Hyperplasia endometrii simplex non atypica"
           )
        val que75 = Elements(74,
            R.drawable.s74,
            "Adenocarcinoma endometrii"
           )
        val que76 = Elements(75,
            R.drawable.s75,
            "Cystadenoma ovarii serosum"
           )
        val que77 = Elements(76,
            R.drawable.s76,
            "Mola hydatidosa"
           )
        val que78 = Elements(77,
            R.drawable.s77,
            "Choriocarcinoma"
         )
        val que79 = Elements(78,
            R.drawable.s97,
            "Teratoma maturum"
          )
        val que80 = Elements(79,
            R.drawable.s79,
            "Struma colloides glandulae thyreoideae"
         )
        val que81 = Elements(80,
            R.drawable.s80,
            "Hodgkinov limfom"
            )
        val que82 = Elements(81,
            R.drawable.s81,
            "Limfom malih limfocita-SLL"
          )
        val que83 = Elements(82,
            R.drawable.s82,
            "Difuzni limfom krupnih B celija"
           )
        val que84 = Elements(83,
            R.drawable.s83,
            "Burkittov limfom"
        )
        val que85 = Elements(84,
            R.drawable.s97,
            "Naevus naevocellularis"
           )
        val que86 = Elements(85,
            R.drawable.s97,
            "Keratosis seborrhoica")
        val que87 = Elements(86,
            R.drawable.s97,
            "Dermatofibroma"
          )
        val que88 = Elements(87,
            R.drawable.s97,
            "Haemangioma cutis"
           )
        val que89 = Elements(88,
            R.drawable.s97,
            "Melanoma malignum"
          )
        val que90 = Elements(89,
            R.drawable.s97,
            "Carcinoma planocellulare cutis"
         )
        val que91 = Elements(90,
            R.drawable.s97,
            "Carcinoma basocellulare cutis"
         )
        val que92 = Elements(91,
            R.drawable.s97,
            "Synovitis chronica"
          )
        val que93 = Elements(92,
            R.drawable.s97,
            "Osteomyelitis chronica"
        )
        val que94 = Elements(93,
            R.drawable.s97,
            "Chondroma"
          )
        val que95 = Elements(94,
            R.drawable.s97,
            "Sarcoma Ewing"
          )
        val que96 = Elements(95,
            R.drawable.s97,
            "Tumor gigantocellulare"
        )
        val que97 = Elements(96,
            R.drawable.s97,
            "Osteosarcoma"
         )
        val que98 = Elements(98,
            R.drawable.s97,
            "Leiomyoma"
       )
        val que99 = Elements(99,
            R.drawable.s97,
            "Rhabdomyosarcoma"
        )
        val que100 = Elements(100,
            R.drawable.s97,
            "Leiomyosarcoma"
           )
        val que101 = Elements(101,
            R.drawable.s97,
            "Haemorrhagia cerebri hypertensiva"
        )
        val que102 = Elements(102,
            R.drawable.s97,
            "Infarctus cerebri"
         )
        val que103 = Elements(103,

            R.drawable.s97,
            "Leptomeningitis purulenta"
        )
        val que104 = Elements(104,
            R.drawable.s97,
            "Leptomeningitis tuberculosa"
       )
        val que105 = Elements(105,
            R.drawable.s97,
            "Encephalitis virosa"
        )
        val que106 = Elements(106,

            R.drawable.s97,
            "Meningioma"
        )
        val que107 = Elements(107,
            R.drawable.s97,
            "Glioblastoma multiforme"
    )
        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)
        allQuestions.add(que7)
        allQuestions.add(que8)
        allQuestions.add(que9)
        allQuestions.add(que10)
        allQuestions.add(que11)
        allQuestions.add(que12)
        allQuestions.add(que13)
        allQuestions.add(que14)
        allQuestions.add(que15)
        allQuestions.add(que16)
        allQuestions.add(que17)
        allQuestions.add(que18)
        allQuestions.add(que19)
        allQuestions.add(que20)
        allQuestions.add(que21)
        allQuestions.add(que22)
        allQuestions.add(que23)
        allQuestions.add(que24)
        allQuestions.add(que25)
        allQuestions.add(que26)
        allQuestions.add(que27)
        allQuestions.add(que28)
        allQuestions.add(que29)
        allQuestions.add(que30)
        allQuestions.add(que31)
        allQuestions.add(que32)
        allQuestions.add(que33)
        allQuestions.add(que34)
        allQuestions.add(que35)
        allQuestions.add(que36)
        allQuestions.add(que37)
        allQuestions.add(que38)
        allQuestions.add(que39)
        allQuestions.add(que40)
        allQuestions.add(que41)
        allQuestions.add(que42)
        allQuestions.add(que43)
        allQuestions.add(que44)
        allQuestions.add(que45)
        allQuestions.add(que46)
        allQuestions.add(que47)
        allQuestions.add(que48)
        allQuestions.add(que49)
        allQuestions.add(que50)
        allQuestions.add(que51)
        allQuestions.add(que52)
        allQuestions.add(que53)
        allQuestions.add(que54)
        allQuestions.add(que55)
        allQuestions.add(que56)
        allQuestions.add(que57)
        allQuestions.add(que58)
        allQuestions.add(que59)
        allQuestions.add(que60)
        allQuestions.add(que61)
        allQuestions.add(que62)
        allQuestions.add(que63)
        allQuestions.add(que64)
        allQuestions.add(que65)
        allQuestions.add(que66)
        allQuestions.add(que67)
        allQuestions.add(que68)
        allQuestions.add(que69)
        allQuestions.add(que70)
        allQuestions.add(que71)
        allQuestions.add(que71)
        allQuestions.add(que72)
        allQuestions.add(que73)
        allQuestions.add(que74)
        allQuestions.add(que75)
        allQuestions.add(que76)
        allQuestions.add(que77)
        allQuestions.add(que78)
        allQuestions.add(que79)
        allQuestions.add(que80)
        allQuestions.add(que81)
        allQuestions.add(que82)
        allQuestions.add(que83)
        allQuestions.add(que84)
        allQuestions.add(que85)
        allQuestions.add(que86)
        allQuestions.add(que87)
        allQuestions.add(que88)
        allQuestions.add(que89)
        allQuestions.add(que90)
        allQuestions.add(que91)
        allQuestions.add(que92)
        allQuestions.add(que93)
        allQuestions.add(que94)
        allQuestions.add(que95)
        allQuestions.add(que96)
        allQuestions.add(que97)
        allQuestions.add(que98)
        allQuestions.add(que99)
        allQuestions.add(que100)
        allQuestions.add(que101)
        allQuestions.add(que102)
        allQuestions.add(que103)
        allQuestions.add(que104)
        allQuestions.add(que105)
        allQuestions.add(que106)
        allQuestions.add(que107)

        return allQuestions
    }
    fun getIspitQuestions():ArrayList<Elements>{
        val allQuestions=ArrayList<Elements>()

        val que1 = Elements(4,
            R.drawable.s4,
            "Amyloidosis lienis"
        )
        val que1drugi = Elements(4,
            R.drawable.s4druga,
            "Amyloidosis lienis"
        )
        allQuestions.add(que1drugi)
        val que2 = Elements(52,
            R.drawable.s52,
            "Hepatitis virosa"
        )

        val que3 = Elements(53,
            R.drawable.s53,
            "Cirrhosis hepatis"
        )

        val que4 = Elements(70,

            R.drawable.s70,
            "Seminoma testis"
        )

        val que5 = Elements(97,
            R.drawable.s97,
            "Lipoma"
        )
        val que6 = Elements(1,

            R.drawable.s1,
            "Atrophia et sclerosis testis"
        )
        val que7 = Elements(2,

            R.drawable.s2,
            "Atrophia fusca hepatis"
        )
        val que7drugi = Elements(2,

            R.drawable.s2druga,
            "Atrophia fusca hepatis"
        )
        allQuestions.add(que7drugi)
        val que8 = Elements(3,

            R.drawable.s3,
            "Amyloidosis renis"
        )
        val que8drugi = Elements(3,

            R.drawable.s3druga,
            "Amyloidosis renis"
        )
        allQuestions.add(que8drugi)
        val que9 = Elements(5,

            R.drawable.s5,
            "Hyalinosis vasorum lienis"
        )
        val que9drugi = Elements(5,

            R.drawable.s5druga,
            "Hyalinosis vasorum lienis"
        )
        allQuestions.add(que9drugi)
        val que10 = Elements(6,

            R.drawable.s6,
            "Infiltratio adiposa myocardii"
        )
        val que11 = Elements(7,

            R.drawable.s7,
            "Metamorphoisis adiposa hepatis diffusa"
        )
        val que12 = Elements(8,
            R.drawable.s8,
            "Hyperaemia pulmonis passiva chronica"

        )
        val que12drugi = Elements(8,
            R.drawable.s8druga,
            "Hyperaemia pulmonis passiva chronica"

        )
        allQuestions.add(que12drugi)
        val que13 = Elements(9,
            R.drawable.s9,
            "Necrosis hepatis centralis haemorrhagica"
        )

        val que14 = Elements(10,
            R.drawable.s10,
            "Hyperaemia passiva lienis chronica"
        )
        val que14drugi = Elements(10,
            R.drawable.s10druga,
            "Hyperaemia passiva lienis chronica"
        )
        allQuestions.add(que14drugi)
        val que15 = Elements(11,

            R.drawable.s11,
            "Thrombus venae in organisatione"
        )
        val que16 = Elements(12,
            R.drawable.s12,
            "Infarctus anaemicus renis"
        )
        val que17 = Elements(13,
            R.drawable.s13,
            "Infarctus haemorrhagicus pulmonis"
        )
        val que17drugi = Elements(13,
            R.drawable.s13druga,
            "Infarctus haemorrhagicus pulmonis"
        )
        allQuestions.add(que17drugi)
        val que18 = Elements(14,
            R.drawable.s14,
            "Pleuritis fibrinoso-purulenta"
        )
        val que19 = Elements(15,
            R.drawable.s15,
            "Abscessus hepatis"
        )
        val que20 = Elements(16,
            R.drawable.s16,
            "Phlegmone cutis"
        )
        val que21 = Elements(17,
            R.drawable.s17,
            "Appendicitis phlegmonosa"
        )
        val que22 = Elements(18,
            R.drawable.s18,
            "Lymphadenitis TBC"
        )
        val que23 = Elements(19,
            R.drawable.s19,
            "Cysticercosis cerebri"
        )
        val que24 = Elements(20,
            R.drawable.s20,
            "Granuloma corporis alieni"
        )
        val que25 = Elements(21,
            R.drawable.s21,
            "Papilloma mucosae oris"
        )
        val que26 = Elements(22,
            R.drawable.s22,
            "Polypus cervicis uteri"
        )
        val que27 = Elements(23,
            R.drawable.s23,
            "Adenoma tubulare intestini coli"
        )
        val que28 = Elements(24,
            R.drawable.s24,
            "Maligne celije u razmazu"
        )
        val que28druga = Elements(24,
            R.drawable.s24druga,
            "Maligne celije u razmazu"
        )
        allQuestions.add(que28druga)

        val que29 = Elements(25,
            R.drawable.s25,
            "HSIL cervicis uteri"
        )
        val que29druga = Elements(25,
            R.drawable.s25druga,
            "HSIL cervicis uteri"
        )
        allQuestions.add(que29druga)
        val que30 = Elements(26,
            R.drawable.s26,
            "Carcinoma planocellulare invasivum cervicis uteri"
        )
        val que31 = Elements(27,
            R.drawable.s27,
            "Adenocarcinoma pulmonis"
        )
        val que32 = Elements(28,
            R.drawable.s28,
            "Carcinoma metastaticum in medulla ossis"
        )
        val que33 = Elements(29,
            R.drawable.s29,
            "Carcinoma metastaticum in nodo lymphatico"
        )
        val que34 = Elements(30,
            R.drawable.s30,
            "Myofibrosis cordis"
        )
        val que35 = Elements(31,
            R.drawable.s31,
            "Myocarditis virosa"
        )
        val que36 = Elements(32,
            R.drawable.s32,
            "Nephrocirrhosis arterio et arteriolosclerotica"
        )
        val que37 = Elements(33,
            R.drawable.s33,
            "Atherosclerosis aortae"
        )
        val que38 = Elements(34,
            R.drawable.s34,
            "Infarctus myocardii"
        )
        val que38druga = Elements(34,
            R.drawable.s34druga,
            "Infarctus myocardii"
        )
        allQuestions.add(que38druga)
        val que39 = Elements(35,
            R.drawable.s97,
            "Polyarteritis nodosa"
        )
        val que40 = Elements(36,
            R.drawable.s36,
            "Pneumonia fibrinosa s. cruposa"
        )
        val que41 = Elements(37,
            R.drawable.s37,
            "Bronchopneumonia fibrinoso-purulenta"
        )
        val que42 = Elements(38,
            R.drawable.s38,
            "Bronchopneumonia caseosa tuberculosa"
        )
        val que42druga = Elements(38,
            R.drawable.s38druga,
            "Bronchopneumonia caseosa tuberculosa"
        )
        allQuestions.add(que42druga)

        val que43 = Elements(39,
            R.drawable.s39,
            "TBC miliaris pulmonis"
        )
        val que44 = Elements(40,
            R.drawable.s40,
            "Membranae hylineae pulmonum (ARDS)"
        )
        val que45 = Elements(41,
            R.drawable.s41,
            "Emphysema pulmonum"
        )
        val que46 = Elements(42,
            R.drawable.s42,
            "Sitnocelijski karcinom bronha."
        )
        val que47 = Elements(43,
            R.drawable.s43,
            "Adenoma pleomorphe"
        )
        val que47druga = Elements(43,
            R.drawable.s43druga,
            "Adenoma pleomorphe"
        )
        allQuestions.add(que47druga)
        val que48 = Elements(44,
            R.drawable.s44,
            "Gastritis chronica"
        )
        val que48druga = Elements(44,
            R.drawable.s44druga,
            "Gastritis chronica"
        )
        allQuestions.add(que48druga)
        val que49 = Elements(45,
            R.drawable.s45,
            "Adenocarcinoma ventriculi"
        )
        val que49druga = Elements(45,
            R.drawable.s45druga,
            "Adenocarcinoma ventriculi"
        )
        allQuestions.add(que49druga)
        val que50 = Elements(46,
            R.drawable.s46,
            "Ulcus ventriculi chronicum"
        )
        val que51 = Elements(47,
            R.drawable.s47,
            "Colitis ulcerosa chronica"
        )
        val que51druga = Elements(47,
            R.drawable.s47druga,
            "Colitis ulcerosa chronica"
        )
        allQuestions.add(que51druga)
        val que52 = Elements(48,
            R.drawable.s48,
            "Adenocarcinoma intestini coli"
        )
        val que52druga = Elements(48,
            R.drawable.s48druga,
            "Adenocarcinoma intestini coli"
        )
        allQuestions.add(que52druga)
        val que53 = Elements(49,
            R.drawable.s49,
            "Carcinoma pancreatis"
        )
        val que53druga = Elements(49,
            R.drawable.s49druga,
            "Carcinoma pancreatis"
        )
        allQuestions.add(que53druga)
        val que54 = Elements(50,
            R.drawable.s97,
            "Cholestasis"
        )
        val que55 = Elements(51,
            R.drawable.s97,
            "Adenocarcinoma ventriculi metastaticum in hepate"
        )
        val que56 = Elements(54,
            R.drawable.s97,
            "Carcinoma hepatis hepatocellulare"
        )
        val que57 = Elements(55,
            R.drawable.s97,
            "Struma colloides glandulae thyreoideae"
        )
        val que58 = Elements(56,
            R.drawable.s97,
            "Hashimoto thyreoiditis"
        )
        val que59 = Elements(57,
            R.drawable.s97,
            "Carcinoma papillare glandulae threoideae"
        )
        val que60 = Elements(58,
            R.drawable.s97,
            "Carcinoma folliculare glandulae thyreoideae"
        )
        val que61 = Elements(59,
            R.drawable.s97,
            "Pheochromocytoma"
        )
        val que62 = Elements(60,
            R.drawable.s97,
            "SFibrocisticna promena dojke"
        )
        val que63 = Elements(61,
            R.drawable.s97,
            "Fibroadenoma mammae"
        )
        val que64 = Elements(62,
            R.drawable.s97,
            "Carcinoma mammae ductale invasivum"
        )
        val que65 = Elements(63,
            R.drawable.s97,
            "Pyelonephritis purulenta"
        )
        val que66 = Elements(64,
            R.drawable.s97,
            "Glomerulonephritis endocapillaris s. acuta"
        )
        val que67 = Elements(65,
            R.drawable.s97,
            "Nephropathia diabetica"
        )
        val que68 = Elements(66,
            R.drawable.s97,
            "Carcinoma transitiocellulare papillare"
        )
        val que69 = Elements(67,
            R.drawable.s97,
            "Carcinoma lucidocellulare renis"
        )
        val que70 = Elements(68,
            R.drawable.s97,
            "Wilmsov tumor"
        )
        val que71 = Elements(69,
            R.drawable.s97,
            "Epididymitis purulenta subacuta"
        )
        val que72 = Elements(71,
            R.drawable.s97,
            "Hyperplasia nodularis prostatae"
        )
        val que73 = Elements(72,
            R.drawable.s72,
            "Graviditas tubaria"
        )
        val que74 = Elements(73,
            R.drawable.s73,
            "Hyperplasia endometrii simplex non atypica"
        )
        val que75 = Elements(74,
            R.drawable.s74,
            "Adenocarcinoma endometrii"
        )
        val que76 = Elements(75,
            R.drawable.s75,
            "Cystadenoma ovarii serosum"
        )
        val que77 = Elements(76,
            R.drawable.s76,
            "Mola hydatidosa"
        )
        val que78 = Elements(77,
            R.drawable.s77,
            "Choriocarcinoma"
        )
        val que79 = Elements(78,
            R.drawable.s97,
            "Teratoma maturum"
        )
        val que80 = Elements(79,
            R.drawable.s79,
            "Struma colloides glandulae thyreoideae"
        )
        val que81 = Elements(80,
            R.drawable.s80,
            "Hodgkinov limfom"
        )
        val que82 = Elements(81,
            R.drawable.s81,
            "Limfom malih limfocita-SLL"
        )
        val que83 = Elements(82,
            R.drawable.s82,
            "Difuzni limfom krupnih B celija"
        )
        val que84 = Elements(83,
            R.drawable.s83,
            "Burkittov limfom"
        )
        val que85 = Elements(84,
            R.drawable.s97,
            "Naevus naevocellularis"
        )
        val que86 = Elements(85,
            R.drawable.s97,
            "Keratosis seborrhoica")
        val que87 = Elements(86,
            R.drawable.s97,
            "Dermatofibroma"
        )
        val que88 = Elements(87,
            R.drawable.s97,
            "Haemangioma cutis"
        )
        val que89 = Elements(88,
            R.drawable.s97,
            "Melanoma malignum"
        )
        val que90 = Elements(89,
            R.drawable.s97,
            "Carcinoma planocellulare cutis"
        )
        val que91 = Elements(90,
            R.drawable.s97,
            "Carcinoma basocellulare cutis"
        )
        val que92 = Elements(91,
            R.drawable.s97,
            "Synovitis chronica"
        )
        val que93 = Elements(92,
            R.drawable.s97,
            "Osteomyelitis chronica"
        )
        val que94 = Elements(93,
            R.drawable.s97,
            "Chondroma"
        )
        val que95 = Elements(94,
            R.drawable.s97,
            "Sarcoma Ewing"
        )
        val que96 = Elements(95,
            R.drawable.s97,
            "Tumor gigantocellulare"
        )
        val que97 = Elements(96,
            R.drawable.s97,
            "Osteosarcoma"
        )
        val que98 = Elements(98,
            R.drawable.s97,
            "Leiomyoma"
        )
        val que99 = Elements(99,
            R.drawable.s97,
            "Rhabdomyosarcoma"
        )
        val que100 = Elements(100,
            R.drawable.s97,
            "Leiomyosarcoma"
        )
        val que101 = Elements(101,
            R.drawable.s97,
            "Haemorrhagia cerebri hypertensiva"
        )
        val que102 = Elements(102,
            R.drawable.s97,
            "Infarctus cerebri"
        )
        val que103 = Elements(103,

            R.drawable.s97,
            "Leptomeningitis purulenta"
        )
        val que104 = Elements(104,
            R.drawable.s97,
            "Leptomeningitis tuberculosa"
        )
        val que105 = Elements(105,

            R.drawable.s97,
            "Encephalitis virosa"
        )
        val que106 = Elements(106,

            R.drawable.s97,
            "Meningioma"
        )
        val que107 = Elements(107,
            R.drawable.s97,
            "Glioblastoma multiforme"
        )
        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)
        allQuestions.add(que7)
        allQuestions.add(que8)
        allQuestions.add(que9)
        allQuestions.add(que10)
        allQuestions.add(que11)
        allQuestions.add(que12)
        allQuestions.add(que13)
        allQuestions.add(que14)
        allQuestions.add(que15)
        allQuestions.add(que16)
        allQuestions.add(que17)
        allQuestions.add(que18)
        allQuestions.add(que19)
        allQuestions.add(que20)
        allQuestions.add(que21)
        allQuestions.add(que22)
        allQuestions.add(que23)
        allQuestions.add(que24)
        allQuestions.add(que25)
        allQuestions.add(que26)
        allQuestions.add(que27)
        allQuestions.add(que28)
        allQuestions.add(que29)
        allQuestions.add(que30)
        allQuestions.add(que31)
        allQuestions.add(que32)
        allQuestions.add(que33)
        allQuestions.add(que34)
        allQuestions.add(que35)
        allQuestions.add(que36)
        allQuestions.add(que37)
        allQuestions.add(que38)
        allQuestions.add(que39)
        allQuestions.add(que40)
        allQuestions.add(que41)
        allQuestions.add(que42)
        allQuestions.add(que43)
        allQuestions.add(que44)
        allQuestions.add(que45)
        allQuestions.add(que46)
        allQuestions.add(que47)
        allQuestions.add(que48)
        allQuestions.add(que49)
        allQuestions.add(que50)
        allQuestions.add(que51)
        allQuestions.add(que52)
        allQuestions.add(que53)
        allQuestions.add(que54)
        allQuestions.add(que55)
        allQuestions.add(que56)
        allQuestions.add(que57)
        allQuestions.add(que58)
        allQuestions.add(que59)
        allQuestions.add(que60)
        allQuestions.add(que61)
        allQuestions.add(que62)
        allQuestions.add(que63)
        allQuestions.add(que64)
        allQuestions.add(que65)
        allQuestions.add(que66)
        allQuestions.add(que67)
        allQuestions.add(que68)
        allQuestions.add(que69)
        allQuestions.add(que70)
        allQuestions.add(que71)
        allQuestions.add(que71)
        allQuestions.add(que72)
        allQuestions.add(que73)
        allQuestions.add(que74)
        allQuestions.add(que75)
        allQuestions.add(que76)
        allQuestions.add(que77)
        allQuestions.add(que78)
        allQuestions.add(que79)
        allQuestions.add(que80)
        allQuestions.add(que81)
        allQuestions.add(que82)
        allQuestions.add(que83)
        allQuestions.add(que84)
        allQuestions.add(que85)
        allQuestions.add(que86)
        allQuestions.add(que87)
        allQuestions.add(que88)
        allQuestions.add(que89)
        allQuestions.add(que90)
        allQuestions.add(que91)
        allQuestions.add(que92)
        allQuestions.add(que93)
        allQuestions.add(que94)
        allQuestions.add(que95)
        allQuestions.add(que96)
        allQuestions.add(que97)
        allQuestions.add(que98)
        allQuestions.add(que99)
        allQuestions.add(que100)
        allQuestions.add(que101)
        allQuestions.add(que102)
        allQuestions.add(que103)
        allQuestions.add(que104)
        allQuestions.add(que105)
        allQuestions.add(que106)
        allQuestions.add(que107)

        val p=(1..allQuestions.size).random()
        var d=(1..allQuestions.size).random()
        while(d==p){
            d=(1..allQuestions.size).random()
        }
        var t=(1..allQuestions.size).random()
        while(t==d || t==p){
            t=(1..allQuestions.size).random()
        }
        var c=(1..allQuestions.size).random()
        while(c==p || c==d || c==t){
            c=(1..allQuestions.size).random()
        }
        var e=(1..allQuestions.size).random()
        while(e==p || e==d || e==t || e==c){
            e=(1..allQuestions.size).random()
        }

        val questionList=ArrayList<Elements>()
        questionList.add(allQuestions[p-1])
        questionList.add(allQuestions[d-1])
        questionList.add(allQuestions[t-1])
        questionList.add(allQuestions[c-1])
        questionList.add(allQuestions[e-1])

        return questionList
    }
    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()
        val allQuestions=ArrayList<Question>()

        val que1 = Question(4,
        "What is shown in the image?",
        R.drawable.s4,
        "Amyloidosis lienis",
        "Amyloidosis renis",
        "Hyalinosis vasorum lienis",
        "Hyperaemia passiva lienis chronica",
        1)

        val que1drugi = Question(4,
            "What is shown in the image?",
            R.drawable.s4druga,
            "Amyloidosis lienis",
            "Amyloidosis renis",
            "Hyalinosis vasorum lienis",
            "Hyperaemia passiva lienis chronica",
            1)
        allQuestions.add(que1drugi)

        val que2 = Question(52,
            "What is shown in the image?",
            R.drawable.s52,
            "Hepatitis virosa",
            "Cirrhosis hepatis",
            "Cholestasis",
            "Metamorphosis adiposa hepatis diffusa",
            1)

        val que3 = Question(53,
            "What is shown in the image?",
            R.drawable.s53,
            "Cirrhosis hepatis",
            "Hepatitis virosa",
            "Metamorphosis adiposa hepatis diffusa",
            "Atrophia fusca hepatis",
            1)

        val que4 = Question(70,
            "What is shown in the image?",
            R.drawable.s70,
            "Seminoma testis",
            "Choriocarcinoma",
            "Teratoma maturum",
            "Wilmsov tumor",
            1)

        val que5 = Question(97,
            "What is shown in the image?",
            R.drawable.s97,
            "Lipoma",
            "Metamorphosis adiposa hepatis diffusa",
            "Infiltratio adiposa myocardii",
            "Fibroadenoma mammae",
            1)
        val que6 = Question(1,
            "What is shown in the image?",
            R.drawable.s1,
            "Atrophia et sclerosis testis",
            "Atrophia fusca hepatis",
            "Seminoma testis",
            "Epididymitis purulenta subacuta",
            1)
        val que7 = Question(2,
            "What is shown in the image?",
            R.drawable.s2,
            "Atrophia fusca hepatis",
            "Hepatitis virosa",
            "Cirrhosis hepatis",
            "TBC miliaris pulmonis",
            1)
        val que7drugi = Question(2,
            "What is shown in the image?",
            R.drawable.s2druga,
            "Atrophia fusca hepatis",
            "Hepatitis virosa",
            "Cirrhosis hepatis",
            "TBC miliaris pulmonis",
            1)
        allQuestions.add(que7drugi)
        val que8 = Question(3,
            "What is shown in the image?",
            R.drawable.s3,
            "Amyloidosis renis",
            "Amyloidosis lienis",
            "Pyelonephritis purulenta",
            "Glomerulonephritis endocapillaris s. acuta",
            1)
        val que8drugi = Question(3,
            "What is shown in the image?",
            R.drawable.s3druga,
            "Amyloidosis renis",
            "Amyloidosis lienis",
            "Pyelonephritis purulenta",
            "Glomerulonephritis endocapillaris s. acuta",
            1)
        allQuestions.add(que8drugi)
        val que9 = Question(5,
            "What is shown in the image?",
            R.drawable.s5,
            "Hyalinosis vasorum lienis",
            "Amyloidosis lienis",
            "Hyperaemia pulmonis passiva chronica",
            "Necrosis hepatis centralis haemorrhagica",
            1)
        val que9drugi = Question(5,
            "What is shown in the image?",
            R.drawable.s5druga,
            "Hyalinosis vasorum lienis",
            "Amyloidosis lienis",
            "Hyperaemia pulmonis passiva chronica",
            "Necrosis hepatis centralis haemorrhagica",
            1)
        allQuestions.add(que9drugi)
        val que10 = Question(6,
            "What is shown in the image?",
            R.drawable.s6,
            "Infiltratio adiposa myocardii",
            "Myofibrosis cordis",
            "Infarctus myocardii",
            "Metamorphoisis adiposa hepatis diffusa",
            1)
        val que11 = Question(7,
            "What is shown in the image?",
            R.drawable.s7,
            "Metamorphoisis adiposa hepatis diffusa",
            "Necrosis hepatis centralis haemorrhagica",
            "Infiltratio adiposa myocardii",
            "Hepatitis virosa",
            1)
        val que12 = Question(8,
            "What is shown in the image?",
            R.drawable.s8,
            "Hyperaemia pulmonis passiva chronica",
            "Bronchopneumonia caseosa tuberculosa",
            "TBC miliaris pulmonis",
            "Hyperaemia passiva lienis chronic",
            1)
        val que12drugi = Question(8,
            "What is shown in the image?",
            R.drawable.s8druga,
            "Hyperaemia pulmonis passiva chronica",
            "Bronchopneumonia caseosa tuberculosa",
            "TBC miliaris pulmonis",
            "Hyperaemia passiva lienis chronic",
            1)
        allQuestions.add(que12drugi)
        val que13 = Question(9,
            "What is shown in the image?",
            R.drawable.s9,
            "Necrosis hepatis centralis haemorrhagica",
            "Hepatitis virosa",
            "Infarctus haemorrhagicus pulmonis",
            "Abscessus hepatis",
            1)
        val que14 = Question(10,
            "What is shown in the image?",
            R.drawable.s10,
            "Hyperaemia passiva lienis chronica",
            "Hyperaemia pulmonis passiva chronica",
            "Amyloidosis lienis",
            "Amyloidosis renis",
            1)
        val que14drugi = Question(10,
            "What is shown in the image?",
            R.drawable.s10druga,
            "Hyperaemia passiva lienis chronica",
            "Hyperaemia pulmonis passiva chronica",
            "Amyloidosis lienis",
            "Amyloidosis renis",
            1)
        allQuestions.add(que14drugi)

        val que15 = Question(11,
            "What is shown in the image?",
            R.drawable.s11,
            "Thrombus venae in organisatione",
            "Atherosclerosis aortae",
            "Polyarteritis nodosa",
            "Ulcus ventriculi chronicum",
            1)
        val que16 = Question(12,
            "What is shown in the image?",
            R.drawable.s12,
            "Infarctus anaemicus renis",
            "Infarctus myocardii",
            "Pyelonephritis purulenta",
            "Glomerulonephritis endocapillaris s. acuta",
            1)
        val que17 = Question(13,
            "What is shown in the image?",
            R.drawable.s13,
            "Infarctus haemorrhagicus pulmonis",
            "Hyperaemia pulmonis passiva chronica",
            "Necrosis hepatis centralis haemorrhaica",
            "Infarctus myocardii",
            1)
        val que17drugi = Question(13,
            "What is shown in the image?",
            R.drawable.s13druga,
            "Infarctus haemorrhagicus pulmonis",
            "Hyperaemia pulmonis passiva chronica",
            "Necrosis hepatis centralis haemorrhaica",
            "Infarctus myocardii",
            1)
        allQuestions.add(que17drugi)
        val que18 = Question(14,
            "What is shown in the image?",
            R.drawable.s14,
            "Pleuritis fibrinoso-purulenta",
            "Bronchopneumonia caseosa tuberculosa",
            "Emphysema pulmonum",
            "Abscessus hepatis",
            1)
        val que19 = Question(15,
            "What is shown in the image?",
            R.drawable.s15,
            "Abscessus hepatis",
            "Pleuritis fibrinoso-purulenta",
            "Cholestasis",
            "Carcinoma hepatis hepatocellulare",
            1)
        val que20 = Question(16,
            "What is shown in the image?",
            R.drawable.s16,
            "Phlegmone cutis",
            "Haemangioma cutis",
            "Carcinoma basocellulare cutis",
            "Ulcus ventriculi chronicum",
            1)
        val que21 = Question(17,
            "What is shown in the image?",
            R.drawable.s17,
            "Appendicitis phlegmonosa",
            "Limfom malih limfocita-SLL",
            "Ulcus ventriculi chronicum",
            "Coltis ulcerosa chronica",
            1)
        val que22 = Question(18,
            "What is shown in the image?",
            R.drawable.s18,
            "Lymphadenitis TBC",
            "TBC miliaris pulmonis",
            "Hyperplasia follicularis lymphonodi",
            "Hodgkinov limfom",
            1)
        val que23 = Question(19,
            "What is shown in the image?",
            R.drawable.s19,
            "Cysticercosis cerebri",
            "Infarctus cerebri",
            "Leptomeningitis purulenta",
            "Leptomeningitis tuberculosa",
            1)
        val que24 = Question(20,
            "What is shown in the image?",
            R.drawable.s20,
            "Granuloma corporis alieni",
            "Bronchopneumonia caseosa tuberculosa",
            "Abscessus hepatis",
            "Carcinoma metastaticum in medulla ossis",
            1)
        val que25 = Question(21,
            "What is shown in the image?",
            R.drawable.s21,
            "Papilloma mucosae oris",
            "Adenocarcinoma intestini coli",
            "Polypus cervicis uteri",
            "Adenocarcinoma ventriculi",
            1)
        val que26 = Question(22,
            "What is shown in the image?",
            R.drawable.s22,
            "Polypus cervicis uteri",
            "Papilloma mucosae oris",
            "Hyperplasia endometrii simplex nonatypica",
            "Adenocarcinoma endometrii",
            1)
        val que27 = Question(23,
            "What is shown in the image?",
            R.drawable.s23,
            "Adenoma tubulare intestini coli",
            "Adenocarcinoma intestini coli",
            "Polypus cervicis uteri",
            "Adenocarcinoma ventriculi",
            1)
        val que28 = Question(24,
            "What is shown in the image?",
            R.drawable.s24,
            "Maligne celije u razmazu",
            "Limfom malih limfocita-SLL",
            "Difuzni limfom krupnih B celija",
            "Burkittov limfom",
            1)
        val que28druga = Question(24,
            "What is shown in the image?",
            R.drawable.s24druga,
            "Maligne celije u razmazu",
            "Limfom malih limfocita-SLL",
            "Difuzni limfom krupnih B celija",
            "Burkittov limfom",
            1)
        allQuestions.add(que28druga)
        val que29 = Question(25,
            "What is shown in the image?",
            R.drawable.s25,
            "HSIL cervicis uteri",
            "Carcinoma planocellulare invasivum cervicis uteri",
            "Polypus cervicis uteri",
            "Adenocarcinoma ventriculi",
            1)
        val que29druga = Question(25,
            "What is shown in the image?",
            R.drawable.s25druga,
            "HSIL cervicis uteri",
            "Carcinoma planocellulare invasivum cervicis uteri",
            "Polypus cervicis uteri",
            "Adenocarcinoma ventriculi",
            1)
        allQuestions.add(que29druga)
        val que30 = Question(26,
            "What is shown in the image?",
            R.drawable.s26,
            "Carcinoma planocellulare invasivum cervicis uteri",
            "Polypus cervicis uteri",
            "HSIL cervicis uteri",
            "Burkittov limfom",
            1)
        val que31 = Question(27,
            "What is shown in the image?",
            R.drawable.s27,
            "Adenocarcinoma pulmonis",
            "Carcinoma metastaticum in medulla ossis",
            "Emphysema pulmonum",
            "Sitnocelijski karcinom bronha.",
            1)
        val que32 = Question(28,
            "What is shown in the image?",
            R.drawable.s28,
            "Carcinoma metastaticum in medulla ossis",
            "Carcinoma metastaticum in nodo lymphatico",
            "Tumor gigantocellulare",
            "Osteosarcoma",
            1)
        val que33 = Question(29,
            "What is shown in the image?",
            R.drawable.s29,
            "Carcinoma metastaticum in nodo lymphatico",
            "Carcinoma metastaticum in medulla ossis",
            "Hyperplasia follicularis lymphonodi",
            "Lymphadenitis TBC",
            1)
        val que34 = Question(30,
            "What is shown in the image?",
            R.drawable.s30,
            "Myofibrosis cordis",
            "Myocarditis virosa",
            "Infarctus myocardii",
            "Infiltratio adiposa myocardii",
            1)
        val que35 = Question(31,
            "What is shown in the image?",
            R.drawable.s31,
            "Myocarditis virosa",
            "Infarctus myocardii",
            "Infiltratio adiposa myocardii",
            "Myofibrosis cordis",
            1)
        val que36 = Question(32,
            "What is shown in the image?",
            R.drawable.s32,
            "Nephrocirrhosis arterio et arteriolosclerotica",
            "Atherosclerosis aortae",
            "Thrombus venae in organisatione",
            "Polyarteritis nodosa",
            1)
        val que37 = Question(33,
            "What is shown in the image?",
            R.drawable.s33,
            "Atherosclerosis aortae",
            "Infractus anaemicus renis",
            "Seminoma testis",
            "Mola hydatidosa",
            1)
        val que38 = Question(34,
            "What is shown in the image?",
            R.drawable.s34,
            "Infarctus myocardii",
            "Myocarditis virosa",
            "Infiltratio adiposa myocardii",
            "Myofibrosis cordis",
            1)
        val que38druga = Question(34,
            "What is shown in the image?",
            R.drawable.s34druga,
            "Infarctus myocardii",
            "Myocarditis virosa",
            "Infiltratio adiposa myocardii",
            "Myofibrosis cordis",
            1)
        allQuestions.add(que38druga)
        val que39 = Question(35,
            "What is shown in the image?",
            R.drawable.s97,
            "Polyarteritis nodosa",
            "Atherosclerosis aortae",
            "Nephrocirrhosis arterio et arteriolosclerotica",
            "Thrombus venae in organisatione",
            1)
        val que40 = Question(36,
            "What is shown in the image?",
            R.drawable.s36,
            "Pneumonia fibrinosa s. cruposa",
            "Bronchopneumonia fibrinoso-purulenta",
            "Membranae hylineae pumonum (ARDS)",
            "Sitnocelijski karcinom bronha.",
            1)
        val que41 = Question(37,
            "What is shown in the image?",
            R.drawable.s37,
            "Bronchopneumonia fibrinoso-purulenta",
            "Broncopneumonia caseosa tuberculosa",
            "Pneumonia fibrinosa s. cruposa",
            "Hyperaemia pulmonis passiva chronica",
            1)
        val que42 = Question(38,
            "What is shown in the image?",
            R.drawable.s38,
            "Bronchopneumonia caseosa tuberculosa",
            "Bronchopneumonia fibrinoso-purulenta",
            "TBC miliaris pulmonis",
            "Lymphadenitis TBC",
            1)
        val que42druga = Question(38,
            "What is shown in the image?",
            R.drawable.s38druga,
            "Bronchopneumonia caseosa tuberculosa",
            "Bronchopneumonia fibrinoso-purulenta",
            "TBC miliaris pulmonis",
            "Lymphadenitis TBC",
            1)
        allQuestions.add(que42druga)
        val que43 = Question(39,
            "What is shown in the image?",
            R.drawable.s39,
            "TBC miliaris pulmonis",
            "Bronchopneumonia caseosa tuberculosa",
            "Bronchopneumonia fibrinoso-purulenta",
            "Lymphadenitis TBC",
            1)
        val que44 = Question(40,
            "What is shown in the image?",
            R.drawable.s40,
            "Membranae hylineae pulmonum (ARDS)",
            "Emphysema pulmonum",
            "Infarctus haemorrhagicus pulmonis",
            "Hyperaemia pulmonis passiva chronica",
            1)
        val que45 = Question(41,
            "What is shown in the image?",
            R.drawable.s41,
            "Emphysema pulmonum",
            "Membranae hylineae pulmonum (ARDS)",
            "Bronchopneumonia caseosa tuberculosa",
            "Cirrhosis hepatis",
            1)
        val que46 = Question(42,
            "What is shown in the image?",
            R.drawable.s42,
            "Sitnocelijski karcinom bronha.",
            "Adenorarcinoma pulmonis",
            "Carcinoma metastaticum in medulla ossis",
            "Bronchopneumonia caseosa tuberculosa",
            1)
        val que47 = Question(43,
            "What is shown in the image?",
            R.drawable.s43,
            "Adenoma pleomorphe",
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            "Carcinoma pancreatis",
            1)
        val que47druga = Question(43,
            "What is shown in the image?",
            R.drawable.s43druga,
            "Adenoma pleomorphe",
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            "Carcinoma pancreatis",
            1)
        allQuestions.add(que47druga)

        val que48 = Question(44,
            "What is shown in the image?",
            R.drawable.s44,
            "Gastritis chronica",
            "Ulcus ventriculi chronicum",
            "Colitis ulcerosa chronica",
            "Appendictis phlegmonosa",
            1)
        val que48druga = Question(44,
            "What is shown in the image?",
            R.drawable.s44druga,
            "Gastritis chronica",
            "Ulcus ventriculi chronicum",
            "Colitis ulcerosa chronica",
            "Appendictis phlegmonosa",
            1)
        allQuestions.add(que48druga)
        val que49 = Question(45,
            "What is shown in the image?",
            R.drawable.s45,
            "Adenocarcinoma ventriculi",
            "Gastritis chronica",
            "Ulcus ventriculi chronicum",
            "Colitis ulcerosa chronica",
            1)
        val que49druga = Question(45,
            "What is shown in the image?",
            R.drawable.s45druga,
            "Adenocarcinoma ventriculi",
            "Gastritis chronica",
            "Ulcus ventriculi chronicum",
            "Colitis ulcerosa chronica",
            1)
        allQuestions.add(que49druga)
        val que50 = Question(46,
            "What is shown in the image?",
            R.drawable.s46,
            "Ulcus ventriculi chronicum",
            "Gastritis chronica",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            1)
        val que51 = Question(47,
            "What is shown in the image?",
            R.drawable.s47,
            "Colitis ulcerosa chronica",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            "Adenocarcinoma ventriculi",
            1)
        val que51druga = Question(47,
            "What is shown in the image?",
            R.drawable.s47druga,
            "Colitis ulcerosa chronica",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            "Adenocarcinoma ventriculi",
            1)
        allQuestions.add(que51druga)
        val que52 = Question(48,
            "What is shown in the image?",
            R.drawable.s48,
            "Adenocarcinoma intestini coli",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            "Polypus cervicis uteri",
            1)
        val que52druga = Question(48,
            "What is shown in the image?",
            R.drawable.s48druga,
            "Adenocarcinoma intestini coli",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            "Polypus cervicis uteri",
            1)
        allQuestions.add(que52druga)
        val que53 = Question(49,
            "What is shown in the image?",
            R.drawable.s49,
            "Carcinoma pancreatis",
            "Adenoma pleomorphe",
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            1)
        val que53druga = Question(49,
            "What is shown in the image?",
            R.drawable.s49druga,
            "Carcinoma pancreatis",
            "Adenoma pleomorphe",
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            1)
        allQuestions.add(que53druga)
        val que54 = Question(50,
            "What is shown in the image?",
            R.drawable.s97,
            "Cholestasis",
            "Cirrhosis hepatis",
            "Atrophia fusca hepatis",
            "Hepatitis virosa",
            1)
        val que55 = Question(51,
            "What is shown in the image?",
            R.drawable.s97,
            "Adenocarcinoma ventriculi metastaticum in hepate",
            "Adenocarcinoma pulmonis",
            "Carcinoma metastaticum in medulla ossis",
            "Choriocarcinoma",
            1)
        val que56 = Question(54,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma hepatis hepatocellulare",
            "Wilmsov tumor",
            "Seminoma testis",
            "Chondroma",
            1)
        val que57 = Question(55,
            "What is shown in the image?",
            R.drawable.s97,
            "Struma colloides glandulae thyreoideae",
            "Hashimoto thyreoiditis (struma lymphomatosa)",
            "Carcinoma papillare glandulae thyreoidae",
            "Carcinoma folliculare glandulae thyreoidae",
            1)
        val que58 = Question(56,
            "What is shown in the image?",
            R.drawable.s97,
            "Hashimoto thyreoiditis (struma lymphomatosa)",
            "Glomerulonephritis endocapillaris s. acuta",
            "Nephropathia diabetica",
            "Struma colloides glandulae thyreoideae",
            1)
        val que59 = Question(57,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma papillare glandulae threoideae",
            "Hashimoto thyreoiditis (struma lympomatosa)",
            "Carcinoma folliculare glandulae thyreoideae",
            "Struma colloides glandulae threoideae",
            1)
        val que60 = Question(58,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma folliculare glandulae thyreoideae",
            "Carcinoma papillare glandulae thyreoideae",
            "Hashimoto threoiditis (struma lymphomatosa)",
            "Struma colloides glandulae threoideae",
            1)
        val que61 = Question(59,
            "What is shown in the image?",
            R.drawable.s97,
            "Pheochromocytoma",
            "Carcinoma folliculare glandulae thyreoideae",
            "Carcinoma mammae ductale invasivum",
            "Adenoma pleomorphe",
            1)
        val que62 = Question(60,
            "What is shown in the image?",
            R.drawable.s97,
            "Fibrocisticna promena dojke",
            "Fibroadenoma mammae",
            "Carcinoma mammae ductale invasivum",
            "Adenoma pleomorphe",
            1)
        val que63 = Question(61,
            "What is shown in the image?",
            R.drawable.s97,
            "Fibroadenoma mammae",
            "Myofibrosis cordis",
            "Carcinoma mammae ductale invasivum",
            "Adenoma pleomorphe",
            1)
        val que64 = Question(62,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            "Adenoma pleomorphe",
            "Carcinoma pancreatis",
            1)
        val que65 = Question(63,
            "What is shown in the image?",
            R.drawable.s97,
            "Pyelonephritis purulenta",
            "Glomerulonephritis endocapillaris s. acuta",
            "Infarctus anaemicus renis",
            "Amyloidosis renis",
            1)
        val que66 = Question(64,
            "What is shown in the image?",
            R.drawable.s97,
            "Glomerulonephritis endocapillaris s. acuta",
            "Nephropathia diabetica",
            "Wilmsov tumor",
            "Infarctus anaemicus renis",
            1)
        val que67 = Question(65,
            "What is shown in the image?",
            R.drawable.s97,
            "Nephropathia diabetica",
            "Amyloidosis renis",
            "Epididymitis purulenta subacuta",
            "Seminoma testis",
            1)
        val que68 = Question(66,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma transitiocellulare papillare",
            "Carcinoma lucidocellulare renis",
            "Wilmsov tumor",
            "Seminoma testis",
            1)
        val que69 = Question(67,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma lucidocellulare renis",
            "Carcinoma transitiocellulare (urotheliale) papillare",
            "Choriocarcinoma",
            "Teratoma maturum",
            1)
        val que70 = Question(68,
            "What is shown in the image?",
            R.drawable.s97,
            "Wilmsov tumor",
            "Glomerulonephritis endocapillaris s. acuta",
            "Epididymitis purulenta subacuta",
            "Seminoma testis",
            1)
        val que71 = Question(69,
            "What is shown in the image?",
            R.drawable.s97,
            "Epididymitis purulenta subacuta",
            "Nephropathia diabetica",
            "Amyloidosis renis",
            "Mola hydatidosa",
            1)
        val que72 = Question(71,
            "What is shown in the image?",
            R.drawable.s97,
            "Hyperplasia nodularis prostatae",
            "Epididymitis purulenta subacuta",
            "Carcinoma pancreatis",
            "Fibroadenoma mammae",
            1)
        val que73 = Question(72,
            "What is shown in the image?",
            R.drawable.s72,
            "Graviditas tubaria",
            "Adenocarcinoma endometrii",
            "Mola hydatidosa",
            "Choriocarcinoma",
            1)
        val que74 = Question(73,
            "What is shown in the image?",
            R.drawable.s73,
            "Hyperplasia endometrii simplex non atypica",
            "Adenocarcinoma endometrii",
            "Rhabdomyosarcoma",
            "Leiomyosarcoma",
            1)
        val que75 = Question(74,
            "What is shown in the image?",
            R.drawable.s74,
            "Adenocarcinoma endometrii",
            "Rhabdomyosarcoma",
            "Leiomyoma",
            "Infiltratio adiposa myocardii",
            1)
        val que76 = Question(75,
            "What is shown in the image?",
            R.drawable.s75,
            "Cystadenoma ovarii serosum",
            "Mola hydatidosa",
            "Choriocarcinoma",
            "Teratoma maturum",
            1)
        val que77 = Question(76,
            "What is shown in the image?",
            R.drawable.s76,
            "Mola hydatidosa",
            "Teratoma maturum",
            "Sarcoma Ewing",
            "Wilmsov tumor",
            1)
        val que78 = Question(77,
            "What is shown in the image?",
            R.drawable.s77,
            "Choriocarcinoma",
            "Teratoma maturum",
            "Adenocarcinoma endometrii",
            "Graviditas tubaria",
            1)
        val que79 = Question(78,
            "What is shown in the image?",
            R.drawable.s97,
            "Teratoma maturum",
            "Choriocarcinoma",
            "Seminoma testis",
            "Epididymitis purulenta subacuta",
            1)
        val que80 = Question(79,
            "What is shown in the image?",
            R.drawable.s79,
            "Hyperplasia follicularis lymphonodi",
            "Burkittov lomfom",
            "Lymophadenitis TBC",
            "Difuzni limfom krupnih B celija",
            1)
        val que81 = Question(80,
            "What is shown in the image?",
            R.drawable.s80,
            "Hodgkinov limfom",
            "Burkittov limfom",
            "Lymophadenitis TBC",
            "Difuzni limfom krupnih B celija",
            1)
        val que82 = Question(81,
            "What is shown in the image?",
            R.drawable.s81,
            "Limfom malih limfocita-SLL",
            "Difuzni limfom krupnih B celija",
            "Adenoma pleomorphe",
            "Maligne celije u razmazu",
            1)
        val que83 = Question(82,
            "What is shown in the image?",
            R.drawable.s82,
            "Difuzni limfom krupnih B celija",
            "Limfom malih limfocita-SLL",
            "Burkittov limfom",
            "Lymphadenitis TBC",
            1)
        val que84 = Question(83,
            "What is shown in the image?",
            R.drawable.s83,
            "Burkittov limfom",
            "Sarcoma Ewing",
            "Wilmsov tumor",
            "Hodgkinov limfom",
            1)
        val que85 = Question(84,
            "What is shown in the image?",
            R.drawable.s97,
            "Naevus naevocellularis",
            "Atrophia fusca hepatis",
            "Melanoma malignum",
            "Carcinoma basocellulare cutis",
            1)
        val que86 = Question(85,
            "What is shown in the image?",
            R.drawable.s97,
            "Keratosis seborrhoica",
            "Carcinoma planocellulare cutis",
            "Carcinoma basocellulare cutis",
            "Dermatofibroma",
            1)
        val que87 = Question(86,
            "What is shown in the image?",
            R.drawable.s97,
            "Dermatofibroma",
            "Keratosis seborrhoica",
            "Naevus naevocellularis",
            "Haemangioma cutis",
            1)
        val que88 = Question(87,
            "What is shown in the image?",
            R.drawable.s97,
            "Haemangioma cutis",
            "Carcinoma planocellulare cutis",
            "Carcinoma basocellulare cutis",
            "Dermatofibroma",
            1)
        val que89 = Question(88,
            "What is shown in the image?",
            R.drawable.s97,
            "Melanoma malignum",
            "Carcinoma planocellulare cutis",
            "Naevus naevocellularis",
            "Atrophia fusca hepatis",
            1)
        val que90 = Question(89,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma planocellulare cutis",
            "Melanoma malignum",
            "Naevus naevocellularis",
            "Carcinoma basocellulare cutis",
            1)
        val que91 = Question(90,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma basocellulare cutis",
            "Carcinoma planocellulare cutis",
            "Melanoma malignum",
            "Naevus naevocellularis",
            1)
        val que92 = Question(91,
            "What is shown in the image?",
            R.drawable.s97,
            "Synovitis chronica",
            "Sarcoma Ewing",
            "Osteomyelitis chronica",
            "Carcinoma metastaticum in medulla ossis",
            1)
        val que93 = Question(92,
            "What is shown in the image?",
            R.drawable.s97,
            "Osteomyelitis chronica",
            "Sarcoma Ewing",
            "Tumor gigantocellulare",
            "Osteosarcoma",
            1)
        val que94 = Question(93,
            "What is shown in the image?",
            R.drawable.s97,
            "Chondroma",
            "Osteosarcoma",
            "Carcinoma metastaticum in medulla ossis",
            "Osteomyelitis chronica",
            1)
        val que95 = Question(94,
            "What is shown in the image?",
            R.drawable.s97,
            "Sarcoma Ewing",
            "Tumor gigantocellulare",
            "Osteosarcoma",
            "Wilmsov tumor",
            1)
        val que96 = Question(95,
            "What is shown in the image?",
            R.drawable.s97,
            "Tumor gigantocellulare",
            "Osteosarcoma",
            "Chondroma",
            "Sarcoma Ewing",
            1)
        val que97 = Question(96,
            "What is shown in the image?",
            R.drawable.s97,
            "Osteosarcoma",
            "Carcinoma metastaticum in medulla ossis",
            "Tumor gigantocellulare",
            "Chondroma",
            1)
        val que98 = Question(98,
            "What is shown in the image?",
            R.drawable.s97,
            "Leiomyoma",
            "Leiomyosarcoma",
            "Rhabdomyosarcoma",
            "Adenocarcionma endometrii",
            1)
        val que99 = Question(99,
            "What is shown in the image?",
            R.drawable.s97,
            "Rhabdomyosarcoma",
            "Myocarditis virosa",
            "Myofibrosis cordis",
            "Infarctus myocardii",
            1)
        val que100 = Question(100,
            "What is shown in the image?",
            R.drawable.s97,
            "Leiomyosarcoma",
            "Leiomyoma",
            "Hyperplasia endometrii simplex nonatypica",
            "Adenocarcinoma endometrii",
            1)
        val que101 = Question(101,
            "What is shown in the image?",
            R.drawable.s97,
            "Haemorrhagia cerebri hypertensiva",
            "Infarctus cerebri",
            "Hyperaemia passiva lienis chronic",
            "Hyperaemia pulmonis passiva chronica",
            1)
        val que102 = Question(102,
            "What is shown in the image?",
            R.drawable.s97,
            "Infarctus cerebri",
            "Haemorrhagia cerebri hypertensive",
            "Abscessus hepatis",
            "Cysticercosis cerebri",
            1)
        val que103 = Question(103,
            "What is shown in the image?",
            R.drawable.s97,
            "Leptomeningitis purulenta",
            "Leptomeningitis tuberculosa",
            "Infarctus cerebri",
            "Haemorrhagia cerebri hypertensive",
            1)
        val que104 = Question(104,
            "What is shown in the image?",
            R.drawable.s97,
            "Leptomeningitis tuberculosa",
            "Encephalitis virosa",
            "Leptomeningitis purulenta",
            "TBC miliaris pulmonis",
            1)
        val que105 = Question(105,
            "What is shown in the image?",
            R.drawable.s97,
            "Encephalitis virosa",
            "Leptomeningitis purulenta",
            "Haemorrhagia cerebri hypertensive",
            "Pyelonephritis purulenta",
            1)
        val que106 = Question(106,
            "What is shown in the image?",
            R.drawable.s97,
            "Meningioma",
            "Wilmsov tumor",
            "Carcinoma lucidocellulare renis",
            "Glioblastoma multiforme",
            1)
        val que107 = Question(107,
            "What is shown in the image?",
            R.drawable.s97,
            "Glioblastoma multiforme",
            "Meningioma",
            "Seminoma testis",
            "Wilmsov tumor",
            1)

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)
        allQuestions.add(que7)
        allQuestions.add(que8)
        allQuestions.add(que9)
        allQuestions.add(que10)
        allQuestions.add(que11)
        allQuestions.add(que12)
        allQuestions.add(que13)
        allQuestions.add(que14)
        allQuestions.add(que15)
        allQuestions.add(que16)
        allQuestions.add(que17)
        allQuestions.add(que18)
        allQuestions.add(que19)
        allQuestions.add(que20)
        allQuestions.add(que21)
        allQuestions.add(que22)
        allQuestions.add(que23)
        allQuestions.add(que24)
        allQuestions.add(que25)
        allQuestions.add(que26)
        allQuestions.add(que27)
        allQuestions.add(que28)
        allQuestions.add(que29)
        allQuestions.add(que30)
        allQuestions.add(que31)
        allQuestions.add(que32)
        allQuestions.add(que33)
        allQuestions.add(que34)
        allQuestions.add(que35)
        allQuestions.add(que36)
        allQuestions.add(que37)
        allQuestions.add(que38)
        allQuestions.add(que39)
        allQuestions.add(que40)
        allQuestions.add(que41)
        allQuestions.add(que42)
        allQuestions.add(que43)
        allQuestions.add(que44)
        allQuestions.add(que45)
        allQuestions.add(que46)
        allQuestions.add(que47)
        allQuestions.add(que48)
        allQuestions.add(que49)
        allQuestions.add(que50)
        allQuestions.add(que51)
        allQuestions.add(que52)
        allQuestions.add(que53)
        allQuestions.add(que54)
        allQuestions.add(que55)
        allQuestions.add(que56)
        allQuestions.add(que57)
        allQuestions.add(que58)
        allQuestions.add(que59)
        allQuestions.add(que60)
        allQuestions.add(que61)
        allQuestions.add(que62)
        allQuestions.add(que63)
        allQuestions.add(que64)
        allQuestions.add(que65)
        allQuestions.add(que66)
        allQuestions.add(que67)
        allQuestions.add(que68)
        allQuestions.add(que69)
        allQuestions.add(que70)
        allQuestions.add(que71)
        allQuestions.add(que71)
        allQuestions.add(que72)
        allQuestions.add(que73)
        allQuestions.add(que74)
        allQuestions.add(que75)
        allQuestions.add(que76)
        allQuestions.add(que77)
        allQuestions.add(que78)
        allQuestions.add(que79)
        allQuestions.add(que80)
        allQuestions.add(que81)
        allQuestions.add(que82)
        allQuestions.add(que83)
        allQuestions.add(que84)
        allQuestions.add(que85)
        allQuestions.add(que86)
        allQuestions.add(que87)
        allQuestions.add(que88)
        allQuestions.add(que89)
        allQuestions.add(que90)
        allQuestions.add(que91)
        allQuestions.add(que92)
        allQuestions.add(que93)
        allQuestions.add(que94)
        allQuestions.add(que95)
        allQuestions.add(que96)
        allQuestions.add(que97)
        allQuestions.add(que98)
        allQuestions.add(que99)
        allQuestions.add(que100)
        allQuestions.add(que101)
        allQuestions.add(que102)
        allQuestions.add(que103)
        allQuestions.add(que104)
        allQuestions.add(que105)
        allQuestions.add(que106)
        allQuestions.add(que107)

        val p=(1..allQuestions.size).random()
        var d=(1..allQuestions.size).random()
        while(d==p){
            d=(1..allQuestions.size).random()
        }
        var t=(1..allQuestions.size).random()
        while(t==d || t==p){
            t=(1..allQuestions.size).random()
        }
        var c=(1..allQuestions.size).random()
        while(c==p || c==d || c==t){
            c=(1..allQuestions.size).random()
        }
        var e=(1..allQuestions.size).random()
        while(e==p || e==d || e==t || e==c){
            e=(1..allQuestions.size).random()
        }
        questionList.add(allQuestions[p-1])
        questionList.add(allQuestions[d-1])
        questionList.add(allQuestions[t-1])
        questionList.add(allQuestions[c-1])
        questionList.add(allQuestions[e-1])

        for(option in questionList){
            val x = (1..4).random()
            if(x!=option.correctAnswer){
                var pom = ""
                if (option.correctAnswer == 1) {
                    pom = option.optionOne
                    if (x == 2) {
                        option.optionOne = option.optionTwo
                        option.optionTwo = pom
                    }
                    if (x == 3) {
                        option.optionOne = option.optionThree
                        option.optionThree = pom
                    }
                    if (x == 4) {
                        option.optionOne = option.optionFour
                        option.optionFour = pom
                    }
                } else if (option.correctAnswer == 2) {
                    pom = option.optionTwo
                    if (x == 1) {
                        option.optionTwo = option.optionOne
                        option.optionOne = pom
                    }
                    if (x == 3) {
                        option.optionTwo = option.optionThree
                        option.optionThree = pom
                    }
                    if (x == 4) {
                        option.optionTwo = option.optionFour
                        option.optionFour = pom
                    }
                } else if (option.correctAnswer == 3) {
                    pom = option.optionThree
                    if (x == 1) {
                        option.optionThree = option.optionOne
                        option.optionOne = pom
                    }
                    if (x == 2) {
                        option.optionThree = option.optionTwo
                        option.optionTwo = pom
                    }
                    if (x == 4) {
                        option.optionThree = option.optionFour
                        option.optionFour = pom
                    }
                } else if (option.correctAnswer == 4) {
                    pom = option.optionFour
                    if (x == 1) {
                        option.optionFour = option.optionOne
                        option.optionOne = pom
                    }
                    if (x == 2) {
                        option.optionFour = option.optionTwo
                        option.optionTwo = pom
                    }
                    if (x == 3) {
                        option.optionFour = option.optionThree
                        option.optionThree = pom
                    }
                }
                option.correctAnswer = x
            }
        }

        return questionList;
    }
    fun get20Questions():ArrayList<Question>{
        //NE DODAJ BONUS SLIKE!!!
        val questionList=ArrayList<Question>()
        val allQuestions=ArrayList<Question>()

        val que1 = Question(4,
            "What is shown in the image?",
            R.drawable.s4,
            "Amyloidosis lienis",
            "Amyloidosis renis",
            "Hyalinosis vasorum lienis",
            "Hyperaemia passiva lienis chronica",
            1)

        val que2 = Question(52,
            "What is shown in the image?",
            R.drawable.s52,
            "Hepatitis virosa",
            "Cirrhosis hepatis",
            "Cholestasis",
            "Metamorphosis adiposa hepatis diffusa",
            1)

        val que3 = Question(53,
            "What is shown in the image?",
            R.drawable.s53,
            "Cirrhosis hepatis",
            "Hepatitis virosa",
            "Metamorphosis adiposa hepatis diffusa",
            "Atrophia fusca hepatis",
            1)

        val que4 = Question(70,
            "What is shown in the image?",
            R.drawable.s70,
            "Seminoma testis",
            "Choriocarcinoma",
            "Teratoma maturum",
            "Wilmsov tumor",
            1)

        val que5 = Question(97,
            "What is shown in the image?",
            R.drawable.s97,
            "Lipoma",
            "Metamorphosis adiposa hepatis diffusa",
            "Infiltratio adiposa myocardii",
            "Fibroadenoma mammae",
            1)
        val que6 = Question(1,
            "What is shown in the image?",
            R.drawable.s1,
            "Atrophia et sclerosis testis",
            "Atrophia fusca hepatis",
            "Seminoma testis",
            "Epididymitis purulenta subacuta",
            1)
        val que7 = Question(2,
            "What is shown in the image?",
            R.drawable.s2,
            "Atrophia fusca hepatis",
            "Hepatitis virosa",
            "Cirrhosis hepatis",
            "TBC miliaris pulmonis",
            1)
        val que8 = Question(3,
            "What is shown in the image?",
            R.drawable.s3,
            "Amyloidosis renis",
            "Amyloidosis lienis",
            "Pyelonephritis purulenta",
            "Glomerulonephritis endocapillaris s. acuta",
            1)
        val que9 = Question(5,
            "What is shown in the image?",
            R.drawable.s5,
            "Hyalinosis vasorum lienis",
            "Amyloidosis lienis",
            "Hyperaemia pulmonis passiva chronica",
            "Necrosis hepatis centralis haemorrhagica",
            1)
        val que10 = Question(6,
            "What is shown in the image?",
            R.drawable.s6,
            "Infiltratio adiposa myocardii",
            "Myofibrosis cordis",
            "Infarctus myocardii",
            "Metamorphoisis adiposa hepatis diffusa",
            1)
        val que11 = Question(7,
            "What is shown in the image?",
            R.drawable.s7,
            "Metamorphoisis adiposa hepatis diffusa",
            "Necrosis hepatis centralis haemorrhagica",
            "Infiltratio adiposa myocardii",
            "Hepatitis virosa",
            1)
        val que12 = Question(8,
            "What is shown in the image?",
            R.drawable.s8,
            "Hyperaemia pulmonis passiva chronica",
            "Bronchopneumonia caseosa tuberculosa",
            "TBC miliaris pulmonis",
            "Hyperaemia passiva lienis chronic",
            1)
        val que13 = Question(9,
            "What is shown in the image?",
            R.drawable.s9,
            "Necrosis hepatis centralis haemorrhagica",
            "Hepatitis virosa",
            "Infarctus haemorrhagicus pulmonis",
            "Abscessus hepatis",
            1)
        val que14 = Question(10,
            "What is shown in the image?",
            R.drawable.s10,
            "Hyperaemia passiva lienis chronica",
            "Hyperaemia pulmonis passiva chronica",
            "Amyloidosis lienis",
            "Amyloidosis renis",
            1)

        val que15 = Question(11,
            "What is shown in the image?",
            R.drawable.s11,
            "Thrombus venae in organisatione",
            "Atherosclerosis aortae",
            "Polyarteritis nodosa",
            "Ulcus ventriculi chronicum",
            1)
        val que16 = Question(12,
            "What is shown in the image?",
            R.drawable.s12,
            "Infarctus anaemicus renis",
            "Infarctus myocardii",
            "Pyelonephritis purulenta",
            "Glomerulonephritis endocapillaris s. acuta",
            1)
        val que17 = Question(13,
            "What is shown in the image?",
            R.drawable.s13,
            "Infarctus haemorrhagicus pulmonis",
            "Hyperaemia pulmonis passiva chronica",
            "Necrosis hepatis centralis haemorrhaica",
            "Infarctus myocardii",
            1)
        val que18 = Question(14,
            "What is shown in the image?",
            R.drawable.s14,
            "Pleuritis fibrinoso-purulenta",
            "Bronchopneumonia caseosa tuberculosa",
            "Emphysema pulmonum",
            "Abscessus hepatis",
            1)
        val que19 = Question(15,
            "What is shown in the image?",
            R.drawable.s15,
            "Abscessus hepatis",
            "Pleuritis fibrinoso-purulenta",
            "Cholestasis",
            "Carcinoma hepatis hepatocellulare",
            1)
        val que20 = Question(16,
            "What is shown in the image?",
            R.drawable.s16,
            "Phlegmone cutis",
            "Haemangioma cutis",
            "Carcinoma basocellulare cutis",
            "Ulcus ventriculi chronicum",
            1)
        val que21 = Question(17,
            "What is shown in the image?",
            R.drawable.s17,
            "Appendicitis phlegmonosa",
            "Limfom malih limfocita-SLL",
            "Ulcus ventriculi chronicum",
            "Coltis ulcerosa chronica",
            1)
        val que22 = Question(18,
            "What is shown in the image?",
            R.drawable.s18,
            "Lymphadenitis TBC",
            "TBC miliaris pulmonis",
            "Hyperplasia follicularis lymphonodi",
            "Hodgkinov limfom",
            1)
        val que23 = Question(19,
            "What is shown in the image?",
            R.drawable.s19,
            "Cysticercosis cerebri",
            "Infarctus cerebri",
            "Leptomeningitis purulenta",
            "Leptomeningitis tuberculosa",
            1)
        val que24 = Question(20,
            "What is shown in the image?",
            R.drawable.s20,
            "Granuloma corporis alieni",
            "Bronchopneumonia caseosa tuberculosa",
            "Abscessus hepatis",
            "Carcinoma metastaticum in medulla ossis",
            1)
        val que25 = Question(21,
            "What is shown in the image?",
            R.drawable.s21,
            "Papilloma mucosae oris",
            "Adenocarcinoma intestini coli",
            "Polypus cervicis uteri",
            "Adenocarcinoma ventriculi",
            1)
        val que26 = Question(22,
            "What is shown in the image?",
            R.drawable.s22,
            "Polypus cervicis uteri",
            "Papilloma mucosae oris",
            "Hyperplasia endometrii simplex nonatypica",
            "Adenocarcinoma endometrii",
            1)
        val que27 = Question(23,
            "What is shown in the image?",
            R.drawable.s23,
            "Adenoma tubulare intestini coli",
            "Adenocarcinoma intestini coli",
            "Polypus cervicis uteri",
            "Adenocarcinoma ventriculi",
            1)
        val que28 = Question(24,
            "What is shown in the image?",
            R.drawable.s24,
            "Maligne celije u razmazu",
            "Limfom malih limfocita-SLL",
            "Difuzni limfom krupnih B celija",
            "Burkittov limfom",
            1)
        val que29 = Question(25,
            "What is shown in the image?",
            R.drawable.s25,
            "HSIL cervicis uteri",
            "Carcinoma planocellulare invasivum cervicis uteri",
            "Polypus cervicis uteri",
            "Adenocarcinoma ventriculi",
            1)
        val que30 = Question(26,
            "What is shown in the image?",
            R.drawable.s26,
            "Carcinoma planocellulare invasivum cervicis uteri",
            "Polypus cervicis uteri",
            "HSIL cervicis uteri",
            "Burkittov limfom",
            1)
        val que31 = Question(27,
            "What is shown in the image?",
            R.drawable.s27,
            "Adenocarcinoma pulmonis",
            "Carcinoma metastaticum in medulla ossis",
            "Emphysema pulmonum",
            "Sitnocelijski karcinom bronha.",
            1)
        val que32 = Question(28,
            "What is shown in the image?",
            R.drawable.s28,
            "Carcinoma metastaticum in medulla ossis",
            "Carcinoma metastaticum in nodo lymphatico",
            "Tumor gigantocellulare",
            "Osteosarcoma",
            1)
        val que33 = Question(29,
            "What is shown in the image?",
            R.drawable.s29,
            "Carcinoma metastaticum in nodo lymphatico",
            "Carcinoma metastaticum in medulla ossis",
            "Hyperplasia follicularis lymphonodi",
            "Lymphadenitis TBC",
            1)
        val que34 = Question(30,
            "What is shown in the image?",
            R.drawable.s30,
            "Myofibrosis cordis",
            "Myocarditis virosa",
            "Infarctus myocardii",
            "Infiltratio adiposa myocardii",
            1)
        val que35 = Question(31,
            "What is shown in the image?",
            R.drawable.s31,
            "Myocarditis virosa",
            "Infarctus myocardii",
            "Infiltratio adiposa myocardii",
            "Myofibrosis cordis",
            1)
        val que36 = Question(32,
            "What is shown in the image?",
            R.drawable.s32,
            "Nephrocirrhosis arterio et arteriolosclerotica",
            "Atherosclerosis aortae",
            "Thrombus venae in organisatione",
            "Polyarteritis nodosa",
            1)
        val que37 = Question(33,
            "What is shown in the image?",
            R.drawable.s33,
            "Atherosclerosis aortae",
            "Infractus anaemicus renis",
            "Seminoma testis",
            "Mola hydatidosa",
            1)
        val que38 = Question(34,
            "What is shown in the image?",
            R.drawable.s34,
            "Infarctus myocardii",
            "Myocarditis virosa",
            "Infiltratio adiposa myocardii",
            "Myofibrosis cordis",
            1)
        val que39 = Question(35,
            "What is shown in the image?",
            R.drawable.s97,
            "Polyarteritis nodosa",
            "Atherosclerosis aortae",
            "Nephrocirrhosis arterio et arteriolosclerotica",
            "Thrombus venae in organisatione",
            1)
        val que40 = Question(36,
            "What is shown in the image?",
            R.drawable.s36,
            "Pneumonia fibrinosa s. cruposa",
            "Bronchopneumonia fibrinoso-purulenta",
            "Membranae hylineae pumonum (ARDS)",
            "Sitnocelijski karcinom bronha.",
            1)
        val que41 = Question(37,
            "What is shown in the image?",
            R.drawable.s37,
            "Bronchopneumonia fibrinoso-purulenta",
            "Broncopneumonia caseosa tuberculosa",
            "Pneumonia fibrinosa s. cruposa",
            "Hyperaemia pulmonis passiva chronica",
            1)
        val que42 = Question(38,
            "What is shown in the image?",
            R.drawable.s38,
            "Bronchopneumonia caseosa tuberculosa",
            "Bronchopneumonia fibrinoso-purulenta",
            "TBC miliaris pulmonis",
            "Lymphadenitis TBC",
            1)
        val que43 = Question(39,
            "What is shown in the image?",
            R.drawable.s39,
            "TBC miliaris pulmonis",
            "Bronchopneumonia caseosa tuberculosa",
            "Bronchopneumonia fibrinoso-purulenta",
            "Lymphadenitis TBC",
            1)
        val que44 = Question(40,
            "What is shown in the image?",
            R.drawable.s40,
            "Membranae hylineae pulmonum (ARDS)",
            "Emphysema pulmonum",
            "Infarctus haemorrhagicus pulmonis",
            "Hyperaemia pulmonis passiva chronica",
            1)
        val que45 = Question(41,
            "What is shown in the image?",
            R.drawable.s41,
            "Emphysema pulmonum",
            "Membranae hylineae pulmonum (ARDS)",
            "Bronchopneumonia caseosa tuberculosa",
            "Cirrhosis hepatis",
            1)
        val que46 = Question(42,
            "What is shown in the image?",
            R.drawable.s42,
            "Sitnocelijski karcinom bronha.",
            "Adenorarcinoma pulmonis",
            "Carcinoma metastaticum in medulla ossis",
            "Bronchopneumonia caseosa tuberculosa",
            1)
        val que47 = Question(43,
            "What is shown in the image?",
            R.drawable.s43,
            "Adenoma pleomorphe",
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            "Carcinoma pancreatis",
            1)
        val que48 = Question(44,
            "What is shown in the image?",
            R.drawable.s44,
            "Gastritis chronica",
            "Ulcus ventriculi chronicum",
            "Colitis ulcerosa chronica",
            "Appendictis phlegmonosa",
            1)
        val que49 = Question(45,
            "What is shown in the image?",
            R.drawable.s45,
            "Adenocarcinoma ventriculi",
            "Gastritis chronica",
            "Ulcus ventriculi chronicum",
            "Colitis ulcerosa chronica",
            1)
        val que50 = Question(46,
            "What is shown in the image?",
            R.drawable.s46,
            "Ulcus ventriculi chronicum",
            "Gastritis chronica",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            1)
        val que51 = Question(47,
            "What is shown in the image?",
            R.drawable.s47,
            "Colitis ulcerosa chronica",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            "Adenocarcinoma ventriculi",
            1)
        val que52 = Question(48,
            "What is shown in the image?",
            R.drawable.s48,
            "Adenocarcinoma intestini coli",
            "Appendicitis phlegmonosa",
            "Adenoma tubulare intestini coli",
            "Polypus cervicis uteri",
            1)
        val que53 = Question(49,
            "What is shown in the image?",
            R.drawable.s49,
            "Carcinoma pancreatis",
            "Adenoma pleomorphe",
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            1)
        val que54 = Question(50,
            "What is shown in the image?",
            R.drawable.s97,
            "Cholestasis",
            "Cirrhosis hepatis",
            "Atrophia fusca hepatis",
            "Hepatitis virosa",
            1)
        val que55 = Question(51,
            "What is shown in the image?",
            R.drawable.s97,
            "Adenocarcinoma ventriculi metastaticum in hepate",
            "Adenocarcinoma pulmonis",
            "Carcinoma metastaticum in medulla ossis",
            "Choriocarcinoma",
            1)
        val que56 = Question(54,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma hepatis hepatocellulare",
            "Wilmsov tumor",
            "Seminoma testis",
            "Chondroma",
            1)
        val que57 = Question(55,
            "What is shown in the image?",
            R.drawable.s97,
            "Struma colloides glandulae thyreoideae",
            "Hashimoto thyreoiditis (struma lymphomatosa)",
            "Carcinoma papillare glandulae thyreoidae",
            "Carcinoma folliculare glandulae thyreoidae",
            1)
        val que58 = Question(56,
            "What is shown in the image?",
            R.drawable.s97,
            "Hashimoto thyreoiditis (struma lymphomatosa)",
            "Glomerulonephritis endocapillaris s. acuta",
            "Nephropathia diabetica",
            "Struma colloides glandulae thyreoideae",
            1)
        val que59 = Question(57,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma papillare glandulae threoideae",
            "Hashimoto thyreoiditis (struma lympomatosa)",
            "Carcinoma folliculare glandulae thyreoideae",
            "Struma colloides glandulae threoideae",
            1)
        val que60 = Question(58,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma folliculare glandulae thyreoideae",
            "Carcinoma papillare glandulae thyreoideae",
            "Hashimoto threoiditis (struma lymphomatosa)",
            "Struma colloides glandulae threoideae",
            1)
        val que61 = Question(59,
            "What is shown in the image?",
            R.drawable.s97,
            "Pheochromocytoma",
            "Carcinoma folliculare glandulae thyreoideae",
            "Carcinoma mammae ductale invasivum",
            "Adenoma pleomorphe",
            1)
        val que62 = Question(60,
            "What is shown in the image?",
            R.drawable.s97,
            "Fibrocisticna promena dojke",
            "Fibroadenoma mammae",
            "Carcinoma mammae ductale invasivum",
            "Adenoma pleomorphe",
            1)
        val que63 = Question(61,
            "What is shown in the image?",
            R.drawable.s97,
            "Fibroadenoma mammae",
            "Myofibrosis cordis",
            "Carcinoma mammae ductale invasivum",
            "Adenoma pleomorphe",
            1)
        val que64 = Question(62,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma mammae ductale invasivum",
            "Lipoma",
            "Adenoma pleomorphe",
            "Carcinoma pancreatis",
            1)
        val que65 = Question(63,
            "What is shown in the image?",
            R.drawable.s97,
            "Pyelonephritis purulenta",
            "Glomerulonephritis endocapillaris s. acuta",
            "Infarctus anaemicus renis",
            "Amyloidosis renis",
            1)
        val que66 = Question(64,
            "What is shown in the image?",
            R.drawable.s97,
            "Glomerulonephritis endocapillaris s. acuta",
            "Nephropathia diabetica",
            "Wilmsov tumor",
            "Infarctus anaemicus renis",
            1)
        val que67 = Question(65,
            "What is shown in the image?",
            R.drawable.s97,
            "Nephropathia diabetica",
            "Amyloidosis renis",
            "Epididymitis purulenta subacuta",
            "Seminoma testis",
            1)
        val que68 = Question(66,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma transitiocellulare papillare",
            "Carcinoma lucidocellulare renis",
            "Wilmsov tumor",
            "Seminoma testis",
            1)
        val que69 = Question(67,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma lucidocellulare renis",
            "Carcinoma transitiocellulare (urotheliale) papillare",
            "Choriocarcinoma",
            "Teratoma maturum",
            1)
        val que70 = Question(68,
            "What is shown in the image?",
            R.drawable.s97,
            "Wilmsov tumor",
            "Glomerulonephritis endocapillaris s. acuta",
            "Epididymitis purulenta subacuta",
            "Seminoma testis",
            1)
        val que71 = Question(69,
            "What is shown in the image?",
            R.drawable.s97,
            "Epididymitis purulenta subacuta",
            "Nephropathia diabetica",
            "Amyloidosis renis",
            "Mola hydatidosa",
            1)
        val que72 = Question(71,
            "What is shown in the image?",
            R.drawable.s97,
            "Hyperplasia nodularis prostatae",
            "Epididymitis purulenta subacuta",
            "Carcinoma pancreatis",
            "Fibroadenoma mammae",
            1)
        val que73 = Question(72,
            "What is shown in the image?",
            R.drawable.s72,
            "Graviditas tubaria",
            "Adenocarcinoma endometrii",
            "Mola hydatidosa",
            "Choriocarcinoma",
            1)
        val que74 = Question(73,
            "What is shown in the image?",
            R.drawable.s73,
            "Hyperplasia endometrii simplex non atypica",
            "Adenocarcinoma endometrii",
            "Rhabdomyosarcoma",
            "Leiomyosarcoma",
            1)
        val que75 = Question(74,
            "What is shown in the image?",
            R.drawable.s74,
            "Adenocarcinoma endometrii",
            "Rhabdomyosarcoma",
            "Leiomyoma",
            "Infiltratio adiposa myocardii",
            1)
        val que76 = Question(75,
            "What is shown in the image?",
            R.drawable.s75,
            "Cystadenoma ovarii serosum",
            "Mola hydatidosa",
            "Choriocarcinoma",
            "Teratoma maturum",
            1)
        val que77 = Question(76,
            "What is shown in the image?",
            R.drawable.s76,
            "Mola hydatidosa",
            "Teratoma maturum",
            "Sarcoma Ewing",
            "Wilmsov tumor",
            1)
        val que78 = Question(77,
            "What is shown in the image?",
            R.drawable.s77,
            "Choriocarcinoma",
            "Teratoma maturum",
            "Adenocarcinoma endometrii",
            "Graviditas tubaria",
            1)
        val que79 = Question(78,
            "What is shown in the image?",
            R.drawable.s97,
            "Teratoma maturum",
            "Choriocarcinoma",
            "Seminoma testis",
            "Epididymitis purulenta subacuta",
            1)
        val que80 = Question(79,
            "What is shown in the image?",
            R.drawable.s79,
            "Hyperplasia follicularis lymphonodi",
            "Burkittov lomfom",
            "Lymophadenitis TBC",
            "Difuzni limfom krupnih B celija",
            1)
        val que81 = Question(80,
            "What is shown in the image?",
            R.drawable.s80,
            "Hodgkinov limfom",
            "Burkittov limfom",
            "Lymophadenitis TBC",
            "Difuzni limfom krupnih B celija",
            1)
        val que82 = Question(81,
            "What is shown in the image?",
            R.drawable.s81,
            "Limfom malih limfocita-SLL",
            "Difuzni limfom krupnih B celija",
            "Adenoma pleomorphe",
            "Maligne celije u razmazu",
            1)
        val que83 = Question(82,
            "What is shown in the image?",
            R.drawable.s82,
            "Difuzni limfom krupnih B celija",
            "Limfom malih limfocita-SLL",
            "Burkittov limfom",
            "Lymphadenitis TBC",
            1)
        val que84 = Question(83,
            "What is shown in the image?",
            R.drawable.s83,
            "Burkittov limfom",
            "Sarcoma Ewing",
            "Wilmsov tumor",
            "Hodgkinov limfom",
            1)
        val que85 = Question(84,
            "What is shown in the image?",
            R.drawable.s97,
            "Naevus naevocellularis",
            "Atrophia fusca hepatis",
            "Melanoma malignum",
            "Carcinoma basocellulare cutis",
            1)
        val que86 = Question(85,
            "What is shown in the image?",
            R.drawable.s97,
            "Keratosis seborrhoica",
            "Carcinoma planocellulare cutis",
            "Carcinoma basocellulare cutis",
            "Dermatofibroma",
            1)
        val que87 = Question(86,
            "What is shown in the image?",
            R.drawable.s97,
            "Dermatofibroma",
            "Keratosis seborrhoica",
            "Naevus naevocellularis",
            "Haemangioma cutis",
            1)
        val que88 = Question(87,
            "What is shown in the image?",
            R.drawable.s97,
            "Haemangioma cutis",
            "Carcinoma planocellulare cutis",
            "Carcinoma basocellulare cutis",
            "Dermatofibroma",
            1)
        val que89 = Question(88,
            "What is shown in the image?",
            R.drawable.s97,
            "Melanoma malignum",
            "Carcinoma planocellulare cutis",
            "Naevus naevocellularis",
            "Atrophia fusca hepatis",
            1)
        val que90 = Question(89,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma planocellulare cutis",
            "Melanoma malignum",
            "Naevus naevocellularis",
            "Carcinoma basocellulare cutis",
            1)
        val que91 = Question(90,
            "What is shown in the image?",
            R.drawable.s97,
            "Carcinoma basocellulare cutis",
            "Carcinoma planocellulare cutis",
            "Melanoma malignum",
            "Naevus naevocellularis",
            1)
        val que92 = Question(91,
            "What is shown in the image?",
            R.drawable.s97,
            "Synovitis chronica",
            "Sarcoma Ewing",
            "Osteomyelitis chronica",
            "Carcinoma metastaticum in medulla ossis",
            1)
        val que93 = Question(92,
            "What is shown in the image?",
            R.drawable.s97,
            "Osteomyelitis chronica",
            "Sarcoma Ewing",
            "Tumor gigantocellulare",
            "Osteosarcoma",
            1)
        val que94 = Question(93,
            "What is shown in the image?",
            R.drawable.s97,
            "Chondroma",
            "Osteosarcoma",
            "Carcinoma metastaticum in medulla ossis",
            "Osteomyelitis chronica",
            1)
        val que95 = Question(94,
            "What is shown in the image?",
            R.drawable.s97,
            "Sarcoma Ewing",
            "Tumor gigantocellulare",
            "Osteosarcoma",
            "Wilmsov tumor",
            1)
        val que96 = Question(95,
            "What is shown in the image?",
            R.drawable.s97,
            "Tumor gigantocellulare",
            "Osteosarcoma",
            "Chondroma",
            "Sarcoma Ewing",
            1)
        val que97 = Question(96,
            "What is shown in the image?",
            R.drawable.s97,
            "Osteosarcoma",
            "Carcinoma metastaticum in medulla ossis",
            "Tumor gigantocellulare",
            "Chondroma",
            1)
        val que98 = Question(98,
            "What is shown in the image?",
            R.drawable.s97,
            "Leiomyoma",
            "Leiomyosarcoma",
            "Rhabdomyosarcoma",
            "Adenocarcionma endometrii",
            1)
        val que99 = Question(99,
            "What is shown in the image?",
            R.drawable.s97,
            "Rhabdomyosarcoma",
            "Myocarditis virosa",
            "Myofibrosis cordis",
            "Infarctus myocardii",
            1)
        val que100 = Question(100,
            "What is shown in the image?",
            R.drawable.s97,
            "Leiomyosarcoma",
            "Leiomyoma",
            "Hyperplasia endometrii simplex nonatypica",
            "Adenocarcinoma endometrii",
            1)
        val que101 = Question(101,
            "What is shown in the image?",
            R.drawable.s97,
            "Haemorrhagia cerebri hypertensiva",
            "Infarctus cerebri",
            "Hyperaemia passiva lienis chronic",
            "Hyperaemia pulmonis passiva chronica",
            1)
        val que102 = Question(102,
            "What is shown in the image?",
            R.drawable.s97,
            "Infarctus cerebri",
            "Haemorrhagia cerebri hypertensive",
            "Abscessus hepatis",
            "Cysticercosis cerebri",
            1)
        val que103 = Question(103,
            "What is shown in the image?",
            R.drawable.s97,
            "Leptomeningitis purulenta",
            "Leptomeningitis tuberculosa",
            "Infarctus cerebri",
            "Haemorrhagia cerebri hypertensive",
            1)
        val que104 = Question(104,
            "What is shown in the image?",
            R.drawable.s97,
            "Leptomeningitis tuberculosa",
            "Encephalitis virosa",
            "Leptomeningitis purulenta",
            "TBC miliaris pulmonis",
            1)
        val que105 = Question(105,
            "What is shown in the image?",
            R.drawable.s97,
            "Encephalitis virosa",
            "Leptomeningitis purulenta",
            "Haemorrhagia cerebri hypertensive",
            "Pyelonephritis purulenta",
            1)
        val que106 = Question(106,
            "What is shown in the image?",
            R.drawable.s97,
            "Meningioma",
            "Wilmsov tumor",
            "Carcinoma lucidocellulare renis",
            "Glioblastoma multiforme",
            1)
        val que107 = Question(107,
            "What is shown in the image?",
            R.drawable.s97,
            "Glioblastoma multiforme",
            "Meningioma",
            "Seminoma testis",
            "Wilmsov tumor",
            1)

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)
        allQuestions.add(que7)
        allQuestions.add(que8)
        allQuestions.add(que9)
        allQuestions.add(que10)
        allQuestions.add(que11)
        allQuestions.add(que12)
        allQuestions.add(que13)
        allQuestions.add(que14)
        allQuestions.add(que15)
        allQuestions.add(que16)
        allQuestions.add(que17)
        allQuestions.add(que18)
        allQuestions.add(que19)
        allQuestions.add(que20)
        allQuestions.add(que21)
        allQuestions.add(que22)
        allQuestions.add(que23)
        allQuestions.add(que24)
        allQuestions.add(que25)
        allQuestions.add(que26)
        allQuestions.add(que27)
        allQuestions.add(que28)
        allQuestions.add(que29)
        allQuestions.add(que30)
        allQuestions.add(que31)
        allQuestions.add(que32)
        allQuestions.add(que33)
        allQuestions.add(que34)
        allQuestions.add(que35)
        allQuestions.add(que36)
        allQuestions.add(que37)
        allQuestions.add(que38)
        allQuestions.add(que39)
        allQuestions.add(que40)
        allQuestions.add(que41)
        allQuestions.add(que42)
        allQuestions.add(que43)
        allQuestions.add(que44)
        allQuestions.add(que45)
        allQuestions.add(que46)
        allQuestions.add(que47)
        allQuestions.add(que48)
        allQuestions.add(que49)
        allQuestions.add(que50)
        allQuestions.add(que51)
        allQuestions.add(que52)
        allQuestions.add(que53)
        allQuestions.add(que54)
        allQuestions.add(que55)
        allQuestions.add(que56)
        allQuestions.add(que57)
        allQuestions.add(que58)
        allQuestions.add(que59)
        allQuestions.add(que60)
        allQuestions.add(que61)
        allQuestions.add(que62)
        allQuestions.add(que63)
        allQuestions.add(que64)
        allQuestions.add(que65)
        allQuestions.add(que66)
        allQuestions.add(que67)
        allQuestions.add(que68)
        allQuestions.add(que69)
        allQuestions.add(que70)
        allQuestions.add(que71)
        allQuestions.add(que71)
        allQuestions.add(que72)
        allQuestions.add(que73)
        allQuestions.add(que74)
        allQuestions.add(que75)
        allQuestions.add(que76)
        allQuestions.add(que77)
        allQuestions.add(que78)
        allQuestions.add(que79)
        allQuestions.add(que80)
        allQuestions.add(que81)
        allQuestions.add(que82)
        allQuestions.add(que83)
        allQuestions.add(que84)
        allQuestions.add(que85)
        allQuestions.add(que86)
        allQuestions.add(que87)
        allQuestions.add(que88)
        allQuestions.add(que89)
        allQuestions.add(que90)
        allQuestions.add(que91)
        allQuestions.add(que92)
        allQuestions.add(que93)
        allQuestions.add(que94)
        allQuestions.add(que95)
        allQuestions.add(que96)
        allQuestions.add(que97)
        allQuestions.add(que98)
        allQuestions.add(que99)
        allQuestions.add(que100)
        allQuestions.add(que101)
        allQuestions.add(que102)
        allQuestions.add(que103)
        allQuestions.add(que104)
        allQuestions.add(que105)
        allQuestions.add(que106)
        allQuestions.add(que107)

        var p=(1..5).random()
        var d=(6..11).random()
        var t=(12..17).random()
        var c=(18..25).random()
        var e=(26..37).random()
        var s=(38..45).random()
        var sedmi=(46..51).random()
        var osmi=(52..57).random()
        var deveti=(58..61).random()
        var deseti=(62..68).random()
        var jedanaesti=(69..73).random()
        var dvanaesti=(74..78).random()
        var trinaesti=(79..81).random()
        var cetrnaesti=(82..85).random()
        var petnaesti=(86..90).random()
        var sesnaesti=(91..92).random()
        var sedamnaesti=(93..96).random()
        var osamnaesti=(97..100).random()
        var devetnaesti=(101..104).random()
        var dvadeseti=(105..107).random()
        questionList.add(allQuestions[p-1])
        questionList.add(allQuestions[d-1])
        questionList.add(allQuestions[t-1])
        questionList.add(allQuestions[c-1])
        questionList.add(allQuestions[e-1])
        questionList.add(allQuestions[s-1])
        questionList.add(allQuestions[sedmi-1])
        questionList.add(allQuestions[osmi-1])
        questionList.add(allQuestions[deveti-1])
        questionList.add(allQuestions[deseti-1])
        questionList.add(allQuestions[jedanaesti-1])
        questionList.add(allQuestions[dvanaesti-1])
        questionList.add(allQuestions[trinaesti-1])
        questionList.add(allQuestions[cetrnaesti-1])
        questionList.add(allQuestions[petnaesti-1])
        questionList.add(allQuestions[sesnaesti-1])
        questionList.add(allQuestions[sedamnaesti-1])
        questionList.add(allQuestions[osamnaesti-1])
        questionList.add(allQuestions[devetnaesti-1])
        questionList.add(allQuestions[dvadeseti-1])

        for(option in questionList){
            var x = (1..4).random()
            if(x!=option.correctAnswer){
                var pom = ""
                if (option.correctAnswer == 1) {
                    pom = option.optionOne
                    if (x == 2) {
                        option.optionOne = option.optionTwo
                        option.optionTwo = pom
                    }
                    if (x == 3) {
                        option.optionOne = option.optionThree
                        option.optionThree = pom
                    }
                    if (x == 4) {
                        option.optionOne = option.optionFour
                        option.optionFour = pom
                    }
                } else if (option.correctAnswer == 2) {
                    pom = option.optionTwo
                    if (x == 1) {
                        option.optionTwo = option.optionOne
                        option.optionOne = pom
                    }
                    if (x == 3) {
                        option.optionTwo = option.optionThree
                        option.optionThree = pom
                    }
                    if (x == 4) {
                        option.optionTwo = option.optionFour
                        option.optionFour = pom
                    }
                } else if (option.correctAnswer == 3) {
                    pom = option.optionThree
                    if (x == 1) {
                        option.optionThree = option.optionOne
                        option.optionOne = pom
                    }
                    if (x == 2) {
                        option.optionThree = option.optionTwo
                        option.optionTwo = pom
                    }
                    if (x == 4) {
                        option.optionThree = option.optionFour
                        option.optionFour = pom
                    }
                } else if (option.correctAnswer == 4) {
                    pom = option.optionFour
                    if (x == 1) {
                        option.optionFour = option.optionOne
                        option.optionOne = pom
                    }
                    if (x == 2) {
                        option.optionFour = option.optionTwo
                        option.optionTwo = pom
                    }
                    if (x == 3) {
                        option.optionFour = option.optionThree
                        option.optionThree = pom
                    }
                }
                option.correctAnswer = x
            }


        }

        return questionList;
    }
}