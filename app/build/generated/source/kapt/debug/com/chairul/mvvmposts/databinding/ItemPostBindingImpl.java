package com.chairul.mvvmposts.databinding;
import com.chairul.mvvmposts.R;
import com.chairul.mvvmposts.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemPostBindingImpl extends ItemPostBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPostBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemPostBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.postBody.setTag(null);
        this.postTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.chairul.mvvmposts.ui.post.PostViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.chairul.mvvmposts.ui.post.PostViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetPostBody((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelGetPostTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetPostBody(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelGetPostBody, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetPostTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelGetPostTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelGetPostBody = null;
        java.lang.String viewModelGetPostTitleGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelGetPostTitle = null;
        com.chairul.mvvmposts.ui.post.PostViewModel viewModel = mViewModel;
        java.lang.String viewModelGetPostBodyGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getPostBody()
                        viewModelGetPostBody = viewModel.getPostBody();
                    }
                    updateLiveDataRegistration(0, viewModelGetPostBody);


                    if (viewModelGetPostBody != null) {
                        // read viewModel.getPostBody().getValue()
                        viewModelGetPostBodyGetValue = viewModelGetPostBody.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getPostTitle()
                        viewModelGetPostTitle = viewModel.getPostTitle();
                    }
                    updateLiveDataRegistration(1, viewModelGetPostTitle);


                    if (viewModelGetPostTitle != null) {
                        // read viewModel.getPostTitle().getValue()
                        viewModelGetPostTitleGetValue = viewModelGetPostTitle.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.chairul.mvvmposts.util.BindingAdaptersKt.setMutableText(this.postBody, viewModelGetPostBody);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.chairul.mvvmposts.util.BindingAdaptersKt.setMutableText(this.postTitle, viewModelGetPostTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getPostBody()
        flag 1 (0x2L): viewModel.getPostTitle()
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}