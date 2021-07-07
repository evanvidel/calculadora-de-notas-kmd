package com.axweb.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axweb.calculadoradenotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCalcular.setOnClickListener {
            val num1 = binding.nota1
            val num2 = binding.nota2
            val num3 = binding.nota3
            val num4 = binding.nota4
            val faltas = binding.faltas
            val resultado = binding.resultado

            val nota1 = Integer.parseInt(num1.text.toString())
            val nota2 = Integer.parseInt(num2.text.toString())
            val nota3= Integer.parseInt(num3.text.toString())
            val nota4 = Integer.parseInt(num4.text.toString())
            val numerosFaltas = Integer.parseInt(faltas.text.toString())

            val media = (nota1 + nota2 + nota3 + nota4) / 4

            if (media >= 5 && numerosFaltas <= 20) {
                resultado.setText("O aluno foi Aprovado \n Média Final $media")
                resultado.setTextColor(getColor(R.color.green))
            }else if(numerosFaltas > 20) {
                resultado.setText("O aluno foi Reprovado por Faltas \n Média Final $media")
                resultado.setTextColor(getColor(R.color.red))
            }else if (media < 5) {
                resultado.setText("O aluno foi Reprovado por Faltas \n Média Final $media")
                resultado.setTextColor(getColor(R.color.red))
            }
        }
    }
}