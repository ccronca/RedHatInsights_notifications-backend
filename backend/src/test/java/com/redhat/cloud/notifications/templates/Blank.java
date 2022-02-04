package com.redhat.cloud.notifications.templates;

import com.redhat.cloud.notifications.models.EmailSubscriptionType;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

// TODO NOTIF-450 Temp duplicate of the same class in the engine module. Remove ASAP!
public class Blank implements EmailTemplate {

    @Override
    public TemplateInstance getTitle(String eventType, EmailSubscriptionType type) {
        return Templates.blank();
    }

    @Override
    public TemplateInstance getBody(String eventType, EmailSubscriptionType type) {
        return Templates.blank();
    }

    @Override
    public boolean isSupported(String eventType, EmailSubscriptionType type) {
        return true;
    }

    @Override
    public boolean isEmailSubscriptionSupported(EmailSubscriptionType type) {
        return true;
    }

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance blank();
    }

}
