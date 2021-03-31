SRC_URI_append = " https://proxy.golang.org/github.com/gorilla/sessions/@v/v1.2.1.zip;srcoutput=github.com/gorilla/sessions;srcinput=github.com/gorilla/sessions@v1.2.1;downloadfilename=github-com-gorilla-sessions-1.2.1.zip;name=github-com-gorilla-sessions"
SRC_URI[github-com-gorilla-sessions.sha256sum] = "2c6aeebfef8062537fd7778067e5e99d4c13f79ac63114e905c97040a6e6b523"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/gorilla/sessions/LICENSE;md5=33fa1116c45f9e8de714033f99edde13 \
"
