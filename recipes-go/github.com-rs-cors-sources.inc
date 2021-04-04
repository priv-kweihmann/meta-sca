SRC_URI += "https://proxy.golang.org/github.com/rs/cors/@v/v1.7.0.zip;srcoutput=github.com/rs/cors;srcinput=github.com/rs/cors@v1.7.0;downloadfilename=github-com-rs-cors-1.7.0.zip;name=github-com-rs-cors"
SRC_URI[github-com-rs-cors.sha256sum] = "67815316761fddc4acfaad852965cf04ec88674abe3a05c6c332519556c55855"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rs/cors/LICENSE;md5=04924a837bc661a5d288479a17393ff2 \
"

GOSRC_INCLUDEGUARD += "github.com-rs-cors-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-codegangsta-negroni-sources.inc', '', 'github.com-codegangsta-negroni-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gin-gonic-gin-sources.inc', '', 'github.com-gin-gonic-gin-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-martini-martini-sources.inc', '', 'github.com-go-martini-martini-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-buffalo-sources.inc', '', 'github.com-gobuffalo-buffalo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-mux-sources.inc', '', 'github.com-gorilla-mux-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-julienschmidt-httprouter-sources.inc', '', 'github.com-julienschmidt-httprouter-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-justinas-alice-sources.inc', '', 'github.com-justinas-alice-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-martini-contrib-render-sources.inc', '', 'github.com-martini-contrib-render-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pressly-chi-sources.inc', '', 'github.com-pressly-chi-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-zenazn-goji-sources.inc', '', 'github.com-zenazn-goji-sources.inc', d)}
