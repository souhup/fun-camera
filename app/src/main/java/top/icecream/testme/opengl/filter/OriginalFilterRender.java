package top.icecream.testme.opengl.filter;

import android.content.Context;

import top.icecream.testme.R;

/**
 * AUTHOR: 86417
 * DATE: 5/23/2017
 */

public class OriginalFilterRender extends FilterRender{

    public OriginalFilterRender(Context context) {
        super(context, R.raw.filter_vertex_shader_ori, R.raw.filter_fragment_shader_ori);
    }
}
