SRC_URI += "https://proxy.golang.org/github.com/gorilla/css/@v/v1.0.0.zip;srcoutput=github.com/gorilla/css;srcinput=github.com/gorilla/css@v1.0.0;downloadfilename=github-com-gorilla-css-1.0.0.zip;name=github-com-gorilla-css"
SRC_URI[github-com-gorilla-css.sha256sum] = "d854362b9d723daf613b26aae0254723a4ed1bff680683c3e2a01aeb398168e5"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gorilla/css/LICENSE;md5=4d8d46bc2d62ed6ac9293a579a144344 \
"

GOSRC_INCLUDEGUARD += "github.com-gorilla-css-sources.inc"

