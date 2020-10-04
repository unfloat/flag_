package com.flag.app.ui.profile;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.flag.app.R;
import com.flag.app.adapters.GalleryAdapter;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import timber.log.Timber;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {
    private GridView imageGrid;
    private ArrayList<Bitmap> bitmapList;

    public GalleryFragment() {
        // Required empty public constructor
    }

    public static GalleryFragment newInstance(int position, String title) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        RecyclerView rv = view.findViewById(R.id.rv);

        GridLayoutManager sglm = new GridLayoutManager(getContext(), 3 );
        //int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.gallery_span);
        rv.addItemDecoration(new EqualSpacingItemDecoration(0,0,0,0));

        rv.setLayoutManager(sglm);

        List<String> imageList = new ArrayList<>();
        for(int i=0; i < 9; i++)
        {
            imageList.add("https://i.picsum.photos/id/134/200/200.jpg?hmac=a3L-JjVSGeG8w3SdNpzxdh8WSC0xHJXgeD6QryCK7pU");
        }
        /*
        imageList.add("https://farm5.staticflickr.com/4301/35690634410_f5d0e312cb_c.jpg");
        imageList.add("https://farm4.staticflickr.com/3854/32890526884_7dc068fedd_c.jpg");
        imageList.add("https://farm8.staticflickr.com/7787/18143831616_a239c78056_c.jpg");
        imageList.add("https://farm9.staticflickr.com/8745/16657401480_57653ac8b0_c.jpg");
        imageList.add("https://farm3.staticflickr.com/2917/14144166232_44613c53c7_c.jpg");
        imageList.add("https://farm8.staticflickr.com/7453/13960410788_3dd02b7a02_c.jpg");
        imageList.add("https://farm1.staticflickr.com/920/29297133218_de38a7e4c8_c.jpg");
        imageList.add("https://farm2.staticflickr.com/1788/42989123072_6720c9608d_c.jpg");
        imageList.add("https://farm1.staticflickr.com/888/29062858008_89851766c9_c.jpg");
        imageList.add("https://farm2.staticflickr.com/1731/27940806257_8067196b41_c.jpg");
        imageList.add("https://farm1.staticflickr.com/884/42745897912_ff65398e38_c.jpg");
        imageList.add("https://farm2.staticflickr.com/1829/27971893037_1858467f9a_c.jpg");
        imageList.add("https://farm2.staticflickr.com/1822/41996470025_414452d7a0_c.jpg");
        imageList.add("https://farm2.staticflickr.com/1793/42937679651_3094ebb2b9_c.jpg");
        imageList.add("https://farm1.staticflickr.com/892/42078661914_b940d96992_c.jpg");
         */
        Log.d("image list", imageList.toString());
        GalleryAdapter iga = new GalleryAdapter(imageList);
        rv.setAdapter(iga);
        return view;
    }


    private Bitmap urlImageToBitmap(String imageUrl) throws Exception {
        Bitmap result = null;
        URL url = new URL(imageUrl);
        if(url != null) {
            result = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        }

        Timber.d(result.toString());
        return result;
    }

}