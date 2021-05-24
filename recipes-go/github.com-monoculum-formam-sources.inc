SRC_URI += "https://proxy.golang.org/github.com/monoculum/formam/@v/v0.0.0-20210523135142-1af3317b7b9b.zip;srcoutput=github.com/monoculum/formam;srcinput=github.com/monoculum/formam@v0.0.0-20210523135142-1af3317b7b9b;downloadfilename=github-com-monoculum-formam-0.0.0-20210523135142-1af3317b7b9b.zip;name=github-com-monoculum-formam"
SRC_URI[github-com-monoculum-formam.sha256sum] = "33dbef45f25790e97ad2df7a88472751b1d31489a09af990e3d65c08f0918798"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/monoculum/formam/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
"

GOSRC_INCLUDEGUARD += "github.com-monoculum-formam-sources.inc"

