SRC_URI += "https://proxy.golang.org/github.com/pressly/chi/@v/v1.5.4.zip;srcoutput=github.com/pressly/chi;srcinput=github.com/pressly/chi@v1.5.4;downloadfilename=github-com-pressly-chi-1.5.4.zip;name=github-com-pressly-chi"
SRC_URI[github-com-pressly-chi.sha256sum] = "317a8f409682758e8ee69af42f8ce81889eacb6c617b04e923ac7c524b5e3e71"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pressly/chi/LICENSE;md5=eef59fdf1c5117072cbf52b79c6ea691 \
"

GOSRC_INCLUDEGUARD += "github.com-pressly-chi-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-chi-chi-sources.inc', '', 'github.com-go-chi-chi-sources.inc', d)}
