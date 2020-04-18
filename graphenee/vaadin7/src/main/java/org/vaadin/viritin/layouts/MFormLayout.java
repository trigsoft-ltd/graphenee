package org.vaadin.viritin.layouts;

import org.vaadin.viritin.MSize;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;

public class MFormLayout extends FormLayout {

    private static final long serialVersionUID = -4097293516833876208L;

    public MFormLayout() {
    }

    public MFormLayout(Component... children) {
        super(children);
    }

    public MFormLayout withMargin(boolean marging) {
        setMargin(marging);
        return this;
    }

    public MFormLayout withMargin(MarginInfo marginInfo) {
        setMargin(marginInfo);
        return this;
    }

    public MFormLayout withCaption(String caption) {
        setCaption(caption);
        return this;
    }

    public MFormLayout withCaption(String caption, boolean captionAsHtml) {
        setCaption(caption);
        setCaptionAsHtml(captionAsHtml);
        return this;
    }

    public MFormLayout withWidth(String width) {
        setWidth(width);
        return this;
    }

    public MFormLayout withWidth(float width, Unit unit) {
        setWidth(width, unit);
        return this;
    }

    public MFormLayout withFullWidth() {
        setWidth(100, Unit.PERCENTAGE);
        return this;
    }

    public MFormLayout withHeight(String height) {
        setHeight(height);
        return this;
    }

    public MFormLayout withHeight(float height, Unit unit) {
        setHeight(height, unit);
        return this;
    }

    public MFormLayout withSize(MSize size) {
        setWidth(size.getWidth(), size.getWidthUnit());
        setHeight(size.getHeight(), size.getHeightUnit());
        return this;
    }

    public MFormLayout withStyleName(String... styleNames) {
        for (String styleName : styleNames) {
            addStyleName(styleName);
        }
        return this;
    }

    public MFormLayout withIcon(Resource icon) {
        setIcon(icon);
        return this;
    }

    public MFormLayout withVisible(boolean visible) {
        setVisible(visible);
        return this;
    }

    public MFormLayout withSizeUndefined() {
        setSizeUndefined();
        return this;
    }

    public MFormLayout withWidthUndefined() {
        setWidthUndefined();
        return this;
    }

    public MFormLayout withHeightUndefined() {
        setHeightUndefined();
        return this;
    }

    public MFormLayout withResponsive(boolean responsive) {
        setResponsive(responsive);
        return this;
    }

    public MFormLayout withId(String id) {
        setId(id);
        return this;
    }

    public MFormLayout withDescription(String description) {
        setDescription(description);
        return this;
    }
    
    public MFormLayout with(Component... components) {
        addComponents(components);
        return this;
    }
}
