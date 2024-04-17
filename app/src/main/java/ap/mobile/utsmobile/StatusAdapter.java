package ap.mobile.utsmobile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StatusAdapter extends RecyclerView.Adapter {

  private final Context context;
  List<Person> data;

  StatusAdapter(Context context) {
    this.context = context;
    this.data = new ArrayList<>();
  }

  public void setData(List<Person> data) {
    this.data = data;
  }

  public List<Person> getData() {
    return this.data;
  }

  class StatusVH extends RecyclerView.ViewHolder {

    TextView tvNama;
    TextView tvStatus;

    public StatusVH(@NonNull View itemView) {
      super(itemView);
      this.tvNama = itemView.findViewById(R.id.tvNamaPerson);
      this.tvStatus = itemView.findViewById(R.id.tvStatus);
    }
  }

  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return null; // implementasikan
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    // implementasikan
  }

  @Override
  public int getItemCount() {
    return 0; // implementasikan
  }
}
