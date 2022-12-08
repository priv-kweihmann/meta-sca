SRC_URI += "https://proxy.golang.org/github.com/huandu/xstrings/@v/v1.4.0.zip;srcoutput=github.com/huandu/xstrings;srcinput=github.com/huandu/xstrings@v1.4.0;downloadfilename=github-com-huandu-xstrings-1.4.0.zip;name=github-com-huandu-xstrings"
SRC_URI[github-com-huandu-xstrings.sha256sum] = "619760fde0a5e414a529f67fefa40877a1e9a20c1f7288bbb02fa42b67aaa1ad"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/huandu/xstrings/LICENSE;md5=0a9edd7ffc0f2c020fe849875cb6810d \
"

GOSRC_INCLUDEGUARD += "github.com-huandu-xstrings-sources.inc"

