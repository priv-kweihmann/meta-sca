SRC_URI += "https://proxy.golang.org/github.com/gorilla/sessions/@v/v1.2.1.zip;srcoutput=github.com/gorilla/sessions;srcinput=github.com/gorilla/sessions@v1.2.1;downloadfilename=github-com-gorilla-sessions-1.2.1.zip;name=github-com-gorilla-sessions"
SRC_URI[github-com-gorilla-sessions.sha256sum] = "2c6aeebfef8062537fd7778067e5e99d4c13f79ac63114e905c97040a6e6b523"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gorilla/sessions/LICENSE;md5=33fa1116c45f9e8de714033f99edde13 \
"

GOSRC_INCLUDEGUARD += "github.com-gorilla-sessions-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-securecookie-sources.inc', '', 'github.com-gorilla-securecookie-sources.inc', d)}
