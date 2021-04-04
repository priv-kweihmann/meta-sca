SRC_URI += "https://proxy.golang.org/gopkg.in/warnings.v0/@v/v0.1.2.zip;srcoutput=gopkg.in/warnings.v0;srcinput=gopkg.in/warnings.v0@v0.1.2;downloadfilename=gopkg-in-warnings-v0-0.1.2.zip;name=gopkg-in-warnings-v0"
SRC_URI[gopkg-in-warnings-v0.sha256sum] = "c412b1f704c1e8ba59b6cfdb1072f8be847c03f77d6507c692913d6d9454e51c"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/warnings.v0/LICENSE;md5=c6775875c9d604beb22447dfae3d7049 \
"

GOSRC_INCLUDEGUARD += "gopkg.in-warnings.v0-sources.inc"

