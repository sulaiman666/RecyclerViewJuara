package id.solo.belajarrecyclerview.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.solo.belajarrecyclerview.R;
import id.solo.belajarrecyclerview.model.MahasiswaModel;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private ArrayList<MahasiswaModel> dataMahasiswa;

    public MahasiswaAdapter(ArrayList<MahasiswaModel> dataMahasiswa) {
        this.dataMahasiswa = dataMahasiswa;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.tvNama.setText(dataMahasiswa.get(position).getNama());
        holder.tvNik.setText(dataMahasiswa.get(position).getNik());
        holder.tvNoHp.setText(dataMahasiswa.get(position).getNoHp());
    }

    @Override
    public int getItemCount() {
        return (dataMahasiswa != null) ? dataMahasiswa.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNama, tvNik, tvNoHp;
        public MahasiswaViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.item_tv_nama);
            tvNik = itemView.findViewById(R.id.item_tv_nik);
            tvNoHp = itemView.findViewById(R.id.item_tv_nohp);
        }
    }
}
