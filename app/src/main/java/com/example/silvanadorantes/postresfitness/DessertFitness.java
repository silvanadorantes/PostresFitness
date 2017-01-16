package com.example.silvanadorantes.postresfitness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by silvana on 16/03/16.
 */
public class DessertFitness {
    private static DessertFit[] dessertFits = {


        new DessertFit(0,"Brownies bites de banana","Deliciosos y saludables brownies libres de azucar",
               "Ingredientes:\n" +
                       "\n" +
                       "– 1 scoop de proteína de vainilla o chocolate\n" +
                       "\n" +
                       "– 2 cucharadas de harina de coco\n" +
                       "\n" +
                       "– 2 cucharadas de cacao en polvo sin azúcar\n" +
                       "\n" +
                       "– 1 cucharadita de polvo de hornear\n" +
                       "\n" +
                       "– 1/8 de cucharadita de bicarbonato de sodio\n" +
                       "\n" +
                       "– 1 pizca de sal\n" +
                       "\n" +
                       "– 3 cucharadas de extracto de stevia natural (o el edulcorante que utilicen, aconsejo ir probando hasta alcanzar el punto deseado de dulzura)\n" +
                       "\n" +
                       "– 3 claras\n" +
                       "\n" +
                       "– 1 chorrito de vinagre\n" +
                       "\n" +
                       "– 1 cucharada de miel o jarabe sin azúcar\n" +
                       "\n" +
                       "– 1 banano (cambur) maduro\n" +
                       "\n" +
                       "– 1 cucharadita de esencia de vainilla\n" +
                       "\n",
                "Preparación:\n" +
                        "\n" +
                        "1. Integra todos los ingredientes secos, reserva.\n" +
                        "\n" +
                        "2. Bate las claras con el chorrito de vinagre hasta conseguir el punto de nieve.\n" +
                        "\n" +
                        "3. Mezcla el resto de ingredientes húmedos (banano, miel o jarabe y vainilla) y añádelos a la mezcla seca, luego integra las claras montadas con movimientos envolventes. Revuelve o bate hasta que la mezcla esté homogénea.\n" +
                        "\n" +
                        "4. Vierte la preparación en moldes engrasados, llenando 3/4 partes de cada uno. Puedes decorar opcionalmente con chips de chocolate sin azúcar o trocitos de cacao.\n" +
                        "\n" +
                        "5. Hornea por 10-15 minutos a 180°C/350°F. Desmolda y disfruta.",
                R.drawable.brownies_bites_de_banana),

        new DessertFit(1, "Crepe con durazno y mango","Rapida y deliciosa crepe con un importante aporte de fibra, vitaminas y totalmete libre de azucar",
                "Ingredientes: (para una porción)\n" +
                        "\n" +
                        "– 2 claras de huevo\n" +
                        "\n" +
                        "– 1 cucharada de avena molida\n" +
                        "\n" +
                        "– 1 cucharada de leche vegetal\n" +
                        "\n" +
                        "– Pizca de edulcorante\n" +
                        "\n" +
                        "– Pizca de sal\n" +
                        "\n" +
                        "Para la compota:\n" +
                        "\n" +
                        "– 1 durazno pequeño\n" +
                        "\n" +
                        "– 1/2 mango maduro pequeño\n" +
                        "\n" +
                        "– 2 sobres de edulcorante\n" +
                        "\n" +
                        "– 4 cucharadas de agua\n" +
                        "\n" +
                        "– 1 cucharadita de canela",
                "Preparación:\n" +
                        "\n" +
                        "1. Mezcla todos los ingredientes de la masa de crepes y vierte en una sartén antiadherente.\n" +
                        "\n" +
                        "2. Deja dorar por 5 minutos y desprende cuidadosamente los bordes de la tortilla, voltear hasta dorar por la otra cara, de 2 a 3 minutos. Retirar de la sartén.\n" +
                        "\n" +
                        "3. Pica las frutas en trozos y pon a cocinar tapadas junto con el agua, la canela y el edulcorante. Dejar reducir por 10 minutos a fuego bajo.\n" +
                        "\n" +
                        "4. Rellenar la tortilla con la compota y servir.",
                R.drawable.creppe_con_durazno_y_mango),

        new DessertFit(2, "French toast sandwich","RiquisimoFrench Toast Sandwich libre de azucar y grasas",
                "Ingredientes (para dos porciones de french toast sandwich)\n" +
                        "\n" +
                        "– 4 tajadas de pan integral\n" +
                        "\n" +
                        "– 1 banano\n" +
                        "\n" +
                        "– 2 cucharadas de mantequilla de maní o almendras\n" +
                        "\n" +
                        "– 1 huevo\n" +
                        "\n" +
                        "– 1 cucharada de leche de almendras\n" +
                        "\n" +
                        "– 1 cucharada de syrup sin azúcar\n" +
                        "\n" +
                        "– 1 cucharadita de vainilla\n" +
                        "\n" +
                        "– 1 cucharadita de canela\n" +
                        "\n" +
                        "– 1 pizca de sal\n" +
                        "\n",
                "Preparación:\n" +
                        "\n" +
                        "1. Toma dos rebanadas de pan y esparce en cada una una cucharada de mantequilla de maní.\n" +
                        "\n" +
                        "2. Sobre las otras dos rebanadas reparte el banano cortado en tajadas delgadas.\n" +
                        "\n" +
                        "3. Arma cada sándwich con una rebanada con mantequilla de maní y otra con banano. Reserva.\n" +
                        "\n" +
                        "4. Mezcla la leche de almendras, el huevo, la canela, el syrup, la vainilla y la pizca de sal.\n" +
                        "\n" +
                        "5. Remoja cada sándwich en esta mezcla y lleva a una plancha para dorar por ambas caras. Cuando esté listo, acompaña con más syrup.",
                R.drawable.french_toash_sandwich),
        new DessertFit(3, "Galletas de chocolate","Deliciosas galletas de cholate oscuros libre de azucar ideales para los momentos de anciedad por dulces",
                "Ingredientes:\n" +
                        "\n" +
                        "– 1 taza y media (un bojote) de mantequilla de mani natural\n" +
                        "\n" +
                        "– 1 cambur/banana machacado\n" +
                        "\n" +
                        "– 100 gr. de chocolate oscuro derretido, usé uno con valor 70% dark/sugar free que tiene exacto 100 gr., puedes usar cualquier otro.\n" +
                        "\n" +
                        "– 3 huevos\n" +
                        "\n" +
                        "– 2 tazas de stevia granulada para cocinar, o cualquier otro edulcorante granulado, les soy sincera, si es una receta para adultos y es algo eventual, no le paro.  Si es artificial/splenda/ o no, acá en Vzla no nos podemos poner exquisitos, recuerden mi formula: 85-90% alimentos naturales en el día, el cuerpo no es tan indefenso. Si van a comer niños usa Xilitol o azúcar de coco.\n" +
                        "\n" +
                        "– 1 medida (el scoop que trae el pote) de whey protein de chocolate o 1/4 de taza de harina de almendras o coco\n" +
                        "\n" +
                        "– 3/4 de taza de cacao en polvo, de ese amargo para cocinar\n" +
                        "\n" +
                        "– 1 taza de avena en hojuelas, avena CRUDA + 1 cucharadita de polvo para hornear\n" +
                        "\n" +
                        "– Mucho chocolate sin azúcar picado en cuadritos, piqué como 4 tabletas de chocolate oscuro sin azúcar\n" +
                        "\n" +
                        "– 1 taza de avellanas o almendras tostadas o la que más te guste",
                "Preparación:\n" +
                        "\n" +
                        "– Mezcla los ingredientes en orden, haz las galletas así grandotas y groseras.\n" +
                        "\n" +
                        "– Hornea a 375 F, por 15 minutos. ¡No las sobre cocines! ¡Que queden chicluitas!\n" +
                        "\n" +
                        "*PD: Si estás en régimen estricto de perdida de grasa come estas galletas en tu comida trampa, ¡como una trampita limpia! Si estás buscando mantenerte, échale pichón y ¡cómelas YA!",
                R.drawable.galletas_de_chocolate_750x300),
        new DessertFit(4, "Galletas de aullama y banana", "Galletas rapidas ideales para las meriendas son una gran fuente de energia y estan libres de azucar",
                "Ingredientes (para 20 unidades):\n" +
                        "\n" +
                        "– 1 banano pequeño y muy maduro\n" +
                        "\n" +
                        "– 1 taza de puré de auyama\n" +
                        "\n" +
                        "– 1 taza de avena en hojuelas\n" +
                        "\n" +
                        "– 2 cucharadas de miel o syrup light\n" +
                        "\n" +
                        "– 2 cucharaditas de canela\n" +
                        "\n" +
                        "– 2 cucharaditas de esencia de vainilla\n" +
                        "\n" +
                        "– Edulcorante al gusto\n" +
                        "\n" +
                        "– Pizca de sal",
                "Preparación:\n" +
                        "\n" +
                        "1. Precalienta el horno a 180C/350F.\n" +
                        "\n" +
                        "2. Tritura el banano y la auyama hasta obtener un puré.\n" +
                        "\n" +
                        "3. Adiciona el resto de ingredientes, revuelve bien.\n" +
                        "\n" +
                        "4. Vierte de a cucharadas en una bandeja engrasada o con placa siliconada.\n" +
                        "\n" +
                        "5. Hornea de 15 a 20 minutos.",
                R.drawable.galletas_rapidas_de_auyama_y_banano),
        new DessertFit(5, "Mandocas horneadas","deliciosa receta libre de grasa y azucar ideales para consumir antes o despues de una fuerte rutina de ejercicios",
                "Ingredientes (para 14 mandocas):\n" +
                        "\n" +
                        "– 1 taza de puré de plátano\n" +
                        "\n" +
                        "– 3/4 de taza de harina de maíz\n" +
                        "\n" +
                        "– 1/2 taza de queso fresco\n" +
                        "\n" +
                        "– 1 clara de huevo\n" +
                        "\n" +
                        "– 1 cucharada de leche vegetal (coco, almendras, arroz, etc)\n" +
                        "\n" +
                        "– Edulcorante al gusto\n" +
                        "\n" +
                        "1 cucharadita de canela",
                "Preparación:\n" +
                        "\n" +
                        "1. Mezcla todos los ingredientes hasta obtener una masa suave, como la de arepas. Deja reposar por 10 minutos cubriendo con un trapo.\n" +
                        "\n" +
                        "2. Amasa, formando lacitos, y lleva a una bandeja previamente engrasada o con superficie siliconada.\n" +
                        "\n" +
                        "3. Hornea por 25 minutos a 180°C.\n" +
                        "\n" +
                        "4. Retira del horno, deja reposar y disfruta.\n" +
                        "\n",
                R.drawable.mandocas_hormenadas),
        new DessertFit(6, "Muffins de pan con zanahoria","Ricos muffins ideal para disfrutar en todo momento",
                "Ingredientes (para 6 unidades):\n" +
                        "\n" +
                        "– 2 1/2 tazas de pan integral picado\n" +
                        "\n" +
                        "– 1 taza de leche vegetal\n" +
                        "\n" +
                        "– 1/4 de taza de zanahoria rallada\n" +
                        "\n" +
                        "– 2 cucharadas de maní picado\n" +
                        "\n" +
                        "– 2 cucharadas de pasas\n" +
                        "\n" +
                        "– 1 cucharadita de vainilla\n" +
                        "\n" +
                        "– 1 cucharadita de canela\n" +
                        "\n" +
                        "– Edulcorante al gusto\n" +
                        "\n" +
                        "– 1 pizca de sal\n" +
                        "\n" +
                        "– 1 huevo",
                "Preparación:\n" +
                        "\n" +
                        "1. Remoja el pan en la leche por 10 minutos, adiciona vainilla y canela.\n" +
                        "\n" +
                        "2. Integra los demás ingredientes y mezcla. Decora con maní picado.\n" +
                        "\n" +
                        "3. Vierte en moldes engrasados y hornea por 25 minutos a 180C/350F.",
                R.drawable.muffins_de_pan_con_zanohoria),
        new DessertFit(7, "Muffins integrales de banana","Esta es una estupenda forma de disfrutar los muffins ya que tienen mucha fibra y estan libres de azucar",
                "Ingredientes: (para 10-12 unidades)\n" +
                        "\n" +
                        "– 3 bananos\n" +
                        "\n" +
                        "– 1/2 taza de leche de almendras\n" +
                        "\n" +
                        "– 2 cucharadas de miel o syrup light\n" +
                        "\n" +
                        "– 1 taza de harina integral\n" +
                        "\n" +
                        "– Dos huevos\n" +
                        "\n" +
                        "– 1/4 de taza de aceite vegetal\n" +
                        "\n" +
                        "– 1 cucharada de mantequilla de maní\n" +
                        "\n" +
                        "– 2 cucharaditas de polvo de hornear\n" +
                        "\n" +
                        "– 2 cucharaditas de esencia de vainilla\n" +
                        "\n" +
                        "– 2 cucharaditas de canela molida\n" +
                        "\n" +
                        "– Pizca de sal\n" +
                        "\n" +
                        "– Edulcorante al gusto",
                "Preparación:\n" +
                        "\n" +
                        "1. Precalienta el horno a 180C/350F.\n" +
                        "\n" +
                        "2. Licúa las bananas, el líquido y el jarabe hasta que obtengas una textura similar a un batido, sin grumos.\n" +
                        "\n" +
                        "3. Añade edulcorante, huevos, vainilla, aceite y mantequilla de maní. Licúa nuevamente.\n" +
                        "\n" +
                        "4. Integra los ingredientes secos (harina, sal, canela, polvo de hornear y sal). Añade a la licuadora, procesa hasta obtener una mezcla homogénea.\n" +
                        "\n" +
                        "5. Vierte en moldes de muffins engrasados y hornea por 20 minutos. Deja reposar y disfruta.",
                R.drawable.muffins_integrales),
        new DessertFit(8, "Palmeritas de banana", "Espectaculares palmeritas libres de azucares y grasas. Son una Gran fuente de proteinas y vitaminas",
                "Ingredientes:\n" +
                        "\n" +
                        "(Palmeritas de banano para 6 unidades)\n" +
                        "\n" +
                        "– 3 cucharadas de harina de coco\n" +
                        "\n" +
                        "– 1 cucharada de harina de almendras\n" +
                        "\n" +
                        "– 1 cucharada de proteína sabor vainilla\n" +
                        "\n" +
                        "– 1 cucharadita de coco rallado deshidratado\n" +
                        "\n" +
                        "– 1/2 cucharadita de semillas de chia\n" +
                        "\n" +
                        "– 1/2 banano maduro (cambur)\n" +
                        "\n" +
                        "– Edulcorante al gusto",
                "Preparación: \n" +
                        "\n" +
                        "1. Tritura el banano hasta convertir en puré y añade los ingredientes secos.\n" +
                        "\n" +
                        "2. Revuelve bien hasta obtener una masa pastosa.\n" +
                        "\n" +
                        "3. Toma secciones de la masa (una cucharada aproximadamente) y enrolla entre las manos hasta formar tiras.\n" +
                        "\n" +
                        "4. Lleva ambos extremos hacia el centro formando un espiral.\n" +
                        "\n" +
                        "5. Coloca las palmeritas en una placa engrasada o con superficie siliconada (silpat) y hornea a 180°C/350°F por 15 minutos.\n" +
                        "\n" +
                        "6. Apaga el horno y deja que las galletas se doren 10 minutos más bajo este resplandor.",
                R.drawable.palmeritas_de_banana),
        new DessertFit(9, "Pan Low Carb de Calabacin","Exquisito Pan Low Carb de Calabacin, libre de azucares",
                "Ingredientes (porciones según molde para el pan low carb):\n" +
                        "\n" +
                        "– 1 y ½ taza de linaza molida (puedes sustituir por almendras o coco)\n" +
                        "\n" +
                        "– 1/3 taza de harina de coco\n" +
                        "\n" +
                        "– 1 cucharadita de bicarbonato de sodio\n" +
                        "\n" +
                        "– 1 cucharadita de polvo para hornear\n" +
                        "\n" +
                        "– ¼ taza de stevia o edulcorante que uses\n" +
                        "\n" +
                        "– 2 huevos enteros\n" +
                        "\n" +
                        "– 1 pizca de sal marina\n" +
                        "\n" +
                        "– ½ cucharada de esencia de vainilla\n" +
                        "\n" +
                        "– 1 cucharadita de canela molida\n" +
                        "\n" +
                        "– ¼ taza de aceite de oliva o de coco\n" +
                        "\n" +
                        "– 1 taza de calabacín rallado",
                "Preparación:\n" +
                        "\n" +
                        "1. En una licuadora o batidora mezclar los huevos, aceite y stevia.\n" +
                        "\n" +
                        "2. A esta mezcla agregar la linaza , harina de coco, bicarbonato y polvo para hornear, canela y la sal.\n" +
                        "\n" +
                        "3. Una vez tengamos una mezcla homogénea agregar 2 cucharadas de chia (opcional) y el calabacín rallado.\n" +
                        "\n" +
                        "4. Llevar la mezcla a molde para pan y hornear a 180°C por aproximadamente 30 minutos. Dejar enfriar y desmoldar.\n" +
                        "\n",
                R.drawable.pan_de_calabacin_750x300),
        new DessertFit(10, "Panquecas de cacao con topping de banana","Esplendidas Panquecas de cacao con topping de banana, son una gran fuente de proteinas oxitocinas y fibras ideales para calmar la ansiedasd",
                "Ingredientes:\n" +
                        "\n" +
                        "-1 huevo.\n" +
                        "\n" +
                        "-3 claras.\n" +
                        "\n" +
                        "-1/4 de taza de harina de plátano, avena o almendras.\n" +
                        "\n" +
                        "-1 cucharada de cacao.\n" +
                        "\n" +
                        "-1 chorrito de vainilla.\n" +
                        "\n" +
                        "-1/4 de leche vegetal o agua.\n" +
                        "\n" +
                        "-Stevia al gusto.\n" +
                        "\n" +
                        "-1 cambur o banana.\n" +
                        "\n" +
                        "-Sirope de maple sugar free.\n" +
                        "\n" +
                        "-Canela.\n" +
                        "\n" +
                        "-Aceite en spray.",
                "Preparación:\n" +
                        "\n" +
                        "-Licúa 1 huevo y 3 claras, 1/4 de taza de harina de plátano, de avena o de almendras, 1 cucharada de cacao, 1 chorrito de vainilla, 1/4 de taza de leche vegetal o agua, y stevia al gusto.\n" +
                        "\n" +
                        "Para hacer el topping corta en trozos la banana/cambur y espolvoréalos con canela y un poquito de stevia o xilitol. Pásalos hasta que se doren por un sartén con un poquito de spray, aceite de coco o ghee (solo media cucharadita, para que no se peguen).\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "-Finalmente, sirve las panquecas y colócales el topping de banana/ cambur y el sirope de maple sugar free.",
                R.drawable.panquecas_de_cacao_con_topping_de_banana),

};

        //otiene la lista de todos los postres
        public static List<DessertFit> getDessertFitness(){
                return Arrays.asList(dessertFits);
        }

        //Otiene un postre basado en la posicion del arreglo
        public static DessertFit getDessertFitByPosition(int position){
                return dessertFits[position];

        }




}
