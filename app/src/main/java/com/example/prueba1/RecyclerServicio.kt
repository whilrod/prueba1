package com.example.prueba1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerServicio(val listaServicios: MutableList<Servicios>):RecyclerView.Adapter<RecyclerServicio.MiHolder>() {
    inner class MiHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        lateinit var documento:TextView
        lateinit var hClinica:TextView
        lateinit var nombres:TextView
        lateinit var origen:TextView
        lateinit var destino:TextView
        //lateinit var recomendaciones:TextView
        //lateinit var status:TextView
        lateinit var imagenOrden: ImageView
        init {
            // toma los id de la card
            documento=itemview.findViewById(R.id.numero_servicio)
            hClinica=itemview.findViewById(R.id.historia_clinica)
            nombres=itemview.findViewById(R.id.nombre_paciente)
            origen=itemview.findViewById(R.id.fecha_servicio)
            destino=itemview.findViewById(R.id.hora_servicio)
            //recomendaciones=itemview.findViewById(R.id.serv_recomendacion)
            //status=itemview.findViewById(R.id.ser)
            imagenOrden=itemview.findViewById(R.id.imagenOrden)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.card_servicio_jefe,parent,false)
        return MiHolder(itemView)
    }

    override fun onBindViewHolder(holder: MiHolder, position: Int) {
        var servicios=listaServicios[position]
        holder.documento.text=servicios.documento
        holder.hClinica.text=servicios.historiaClinica
        holder.nombres.text=servicios.nombrePaciente
        holder.origen.text=servicios.origenPaciente
        holder.destino.text=servicios.destinoPaciente
        holder.imagenOrden.setImageResource(servicios.imagenOrden.toInt())

        //holder.recomendaciones.text=servicios.recomendacines
       // holder.status.text=servicios.documento
      //  holder.fotoServicio.text=servicios.fotoOrdenServicio
    }

    override fun getItemCount(): Int {
        return listaServicios.size
    }
}