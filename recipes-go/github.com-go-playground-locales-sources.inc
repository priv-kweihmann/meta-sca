SRC_URI += "https://proxy.golang.org/github.com/go-playground/locales/@v/v0.13.0.zip;srcoutput=github.com/go-playground/locales;srcinput=github.com/go-playground/locales@v0.13.0;downloadfilename=github-com-go-playground-locales-0.13.0.zip;name=github-com-go-playground-locales"
SRC_URI[github-com-go-playground-locales.sha256sum] = "9c4b65273e135b1bdb9bafc7c0b5180a6c5936f54edecbc8807c57a9d107c6b9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-playground/locales/LICENSE;md5=3ccbda375ee345400ad1da85ba522301 \
"

GOSRC_INCLUDEGUARD += "github.com-go-playground-locales-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
