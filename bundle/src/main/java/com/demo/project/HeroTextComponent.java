package com.demo.project;

import com.adobe.cq.sightly.WCMUsePojo;
import javax.jcr.Node;

/**
 * The Class HeroTextComponent.
 */
public class HeroTextComponent extends WCMUsePojo {

    /** The hero text bean. */
    private HeroTextBean heroTextBean = null;

    @Override
    public void activate() throws Exception {


        Node currentNode = getResource().adaptTo(Node.class);

        heroTextBean = new HeroTextBean();

        if(currentNode.hasProperty("heading")){
            String heading=getProperties().get("heading","");
            heroTextBean.setHeadingText(heading);
        }
        if(currentNode.hasProperty("description")){
            String description=getProperties().get("description","");
            heroTextBean.setDescription(description);
        }

    }



    public HeroTextBean getHeroTextBean() {
        return this.heroTextBean;
    }
}