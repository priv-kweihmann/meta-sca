SRC_URI += "https://proxy.golang.org/github.com/monoculum/formam/@v/v0.0.0-20210131081218-41b48e2a724b.zip;srcoutput=github.com/monoculum/formam;srcinput=github.com/monoculum/formam@v0.0.0-20210131081218-41b48e2a724b;downloadfilename=github-com-monoculum-formam-0.0.0-20210131081218-41b48e2a724b.zip;name=github-com-monoculum-formam"
SRC_URI[github-com-monoculum-formam.sha256sum] = "077e9f9d8d2708c2ab4279eb913e38aea9cd142122ab39719b8c63b0afbfff85"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/monoculum/formam/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
"

GOSRC_INCLUDEGUARD += "github.com-monoculum-formam-sources.inc"

