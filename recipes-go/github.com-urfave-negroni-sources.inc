SRC_URI += "https://proxy.golang.org/github.com/urfave/negroni/@v/v1.0.0.zip;srcoutput=github.com/urfave/negroni;srcinput=github.com/urfave/negroni@v1.0.0;downloadfilename=github-com-urfave-negroni-1.0.0.zip;name=github-com-urfave-negroni"
SRC_URI[github-com-urfave-negroni.sha256sum] = "7b50615961d34d748866565b8885edd7013e33812acdbaed47502d7cc73a4bbd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/urfave/negroni/LICENSE;md5=ad35fc390e5be785ef854a14a761a6a0 \
"

GOSRC_INCLUDEGUARD += "github.com-urfave-negroni-sources.inc"

