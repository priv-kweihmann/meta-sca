SRC_URI_append = " https://proxy.golang.org/github.com/gorilla/securecookie/@v/v1.1.1.zip;srcoutput=github.com/gorilla/securecookie;srcinput=github.com/gorilla/securecookie@v1.1.1;downloadfilename=github-com-gorilla-securecookie-1.1.1.zip;name=github-com-gorilla-securecookie"
SRC_URI[github-com-gorilla-securecookie.sha256sum] = "dd83a4230e11568159756bbea4d343c88df0cd1415bbbc7cd5badad6cd2ed903"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/gorilla/securecookie/LICENSE;md5=c50f6bd9c1e15ed0bad3bea18e3c1b7f \
"
