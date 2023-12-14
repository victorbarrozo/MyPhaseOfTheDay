package com.victorbarrozo.FraseDoDia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.victorbarrozo.apk1.R


class MainActivity : AppCompatActivity() {

    lateinit var botaoGerar: Button
    lateinit var textoResultado: TextView
    var fraseDoDia = listOf("Acredite em si mesmo e todo o resto se encaixa. Você é capaz de mais do que imagina.",
    "O sucesso não é final, o fracasso não é fatal: é a coragem de continuar que conta.",
    "Você é livre para fazer suas escolhas, mas é prisioneiro das consequências.",
    "A vida é 10% do que acontece comigo e 90% de como eu reajo a isso.",
    "Se você olhar para o que tem na vida, sempre terá mais. Se você olhar para o que não tem na vida, nunca terá o suficiente.",
    "Se você quer algo que nunca teve, precisa fazer algo que nunca fez.",
    "A única maneira de fazer um excelente trabalho é amar o que você faz.",
    "Acredite que você pode e você já está no meio do caminho.",
    "Não importa o que você decidiu. O que importa é que isso te faça feliz.",
    "A felicidade não é algo pronto. Ela vem de suas próprias ações.",
    "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
    "A felicidade não é algo que você adia para o futuro; é algo que você projeta para o presente." ,
    "A vida é uma jornada, e se você se apaixonar pela jornada, estará apaixonado para sempre.",
    "O sucesso não é a chave para a felicidade. A felicidade é a chave para o sucesso. Se você ama o que faz, terá sucesso.",
    "Acredite em seus sonhos e eles podem se tornar realidade.",
    "A vida é como andar de bicicleta. Para manter o equilíbrio, você precisa continuar se movendo.",
    "A felicidade é uma borboleta que, quando perseguida, está sempre além do seu alcance, mas que, se você sentar silenciosamente, pode pousar em você.",
    "A vida é 10% do que acontece comigo e 90% de como eu reajo a isso." ,
    "A felicidade não é ter o que você quer, mas querer o que você tem.",
    "A vida é uma aventura ousada ou nada." ,
    "A felicidade é uma atitude mental positiva, não uma condição.",
    "A vida é uma viagem, e se você cair no caminho, levante-se e continue.",
    "A felicidade é a arte de nunca se render ao desespero.",
    "A vida é uma oportunidade, aproveite-a. A vida é beleza, admire-a. A vida é um sonho, realize-o.",
    "A felicidade não é algo que você pode adiar para o futuro; é algo que você projeta para o presente.",
    "A vida é uma série de colisões com o futuro; não é uma soma de o que temos, mas do que aprendemos com o que temos.",
    "A felicidade é a consequência de uma escolha pessoal que você faz para se tornar o melhor que pode ser, independentemente das circunstâncias.",
    "A vida é uma aventura, ou nada.",
    "A felicidade não é algo feito. Vem das suas próprias ações.",
    "A vida é uma jornada, e se você se apaixonar pela jornada, estará apaixonado para sempre."
        )

    fun gerarFraseAleatoria() {
        textoResultado.text = fraseDoDia.random()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoResultado = findViewById(R.id.text_resultado)
        botaoGerar = findViewById(R.id.btn_gerar)
        botaoGerar.setOnClickListener {
            gerarFraseAleatoria()
        }
    }
}