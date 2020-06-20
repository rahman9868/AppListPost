package com.chairul.mvvmposts.databinding;
import com.chairul.mvvmposts.R;
import com.chairul.mvvmposts.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityPostListBindingImpl extends ActivityPostListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPostListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityPostListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ProgressBar) bindings[1];
        this.mboundView1.setTag(null);
        this.postList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.chairul.mvvmposts.ui.post.PostListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.chairul.mvvmposts.ui.post.PostListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetLoadingVisibility((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetLoadingVisibility(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelGetLoadingVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.chairul.mvvmposts.ui.post.PostListAdapter viewModelGetPostListAdapter = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelGetLoadingVisibility = null;
        java.lang.Integer viewModelGetLoadingVisibilityGetValue = null;
        com.chairul.mvvmposts.ui.post.PostListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getPostListAdapter()
                        viewModelGetPostListAdapter = viewModel.getPostListAdapter();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.getLoadingVisibility()
                    viewModelGetLoadingVisibility = viewModel.getLoadingVisibility();
                }
                updateLiveDataRegistration(0, viewModelGetLoadingVisibility);


                if (viewModelGetLoadingVisibility != null) {
                    // read viewModel.getLoadingVisibility().getValue()
                    viewModelGetLoadingVisibilityGetValue = viewModelGetLoadingVisibility.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.chairul.mvvmposts.util.BindingAdaptersKt.setMutableVisibility(this.mboundView1, viewModelGetLoadingVisibility);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.chairul.mvvmposts.util.BindingAdaptersKt.setAdapter(this.postList, viewModelGetPostListAdapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getLoadingVisibility()
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}