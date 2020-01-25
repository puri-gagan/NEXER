"""BROs URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/1.11/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  url(r'^$', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  url(r'^$', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.conf.urls import url, include
    2. Add a URL to urlpatterns:  url(r'^blog/', include('blog.urls'))
"""
from django.conf.urls import url, include
from django.conf.urls.static import static
from django.conf import settings
from django.contrib import admin
from profiles import views

urlpatterns = [
    url(r'^$', views.IndexView.as_view(), name='index'),
    url(r'^register_profile/$', views.RegisterProfileView.as_view(), name='register_profile'),
    url(r'^accounts/register/$', views.MyRegistrationView.as_view(), name='registration_register'),
    url(r'^accounts/', include('registration.backends.simple.urls')),
    url(r'^admin/', admin.site.urls),
    url(r'^search/$', views.SearchView.as_view(), name='search'),
    url(r'^', include('profiles.urls')),
    url(r'^add_post_form/$', views.AddPostForm.as_view(), name='add_post_form'),

] + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)