SRC_URI += "https://proxy.golang.org/gopkg.in/errgo.v2/@v/v2.1.0.zip;srcoutput=gopkg.in/errgo.v2;srcinput=gopkg.in/errgo.v2@v2.1.0;downloadfilename=gopkg-in-errgo-v2-2.1.0.zip;name=gopkg-in-errgo-v2"
SRC_URI[gopkg-in-errgo-v2.sha256sum] = "6b8954819a20ec52982a206fd3eb94629ff53c5790aa77534e6d8daf7de01bee"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/errgo.v2/LICENSE;md5=b12dc1c35d3811435428bb9d3fe62c07 \
"

GOSRC_INCLUDEGUARD += "gopkg.in-errgo.v2-sources.inc"

