SRC_URI += "https://proxy.golang.org/github.com/codegangsta/negroni/@v/v1.0.0.zip;srcoutput=github.com/codegangsta/negroni;srcinput=github.com/codegangsta/negroni@v1.0.0;downloadfilename=github-com-codegangsta-negroni-1.0.0.zip;name=github-com-codegangsta-negroni"
SRC_URI[github-com-codegangsta-negroni.sha256sum] = "2e6301aa682a7c38305f2ee72b276181cd0990f224f9fe115a433a5beb138488"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/codegangsta/negroni/LICENSE;md5=ad35fc390e5be785ef854a14a761a6a0 \
"

GOSRC_INCLUDEGUARD += "github.com-codegangsta-negroni-sources.inc"

