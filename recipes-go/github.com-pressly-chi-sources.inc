SRC_URI += "https://proxy.golang.org/github.com/pressly/chi/@v/v4.1.2+incompatible.zip;srcoutput=github.com/pressly/chi;srcinput=github.com/pressly/chi@v4.1.2+incompatible;downloadfilename=github-com-pressly-chi-4.1.2+incompatible.zip;name=github-com-pressly-chi"
SRC_URI[github-com-pressly-chi.sha256sum] = "7a308fa241438bffaa1d14a970af4bab6bc891624616039c1795998f97a646c3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pressly/chi/LICENSE;md5=eef59fdf1c5117072cbf52b79c6ea691 \
"

GOSRC_INCLUDEGUARD += "github.com-pressly-chi-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-chi-chi-sources.inc', '', 'github.com-go-chi-chi-sources.inc', d)}
