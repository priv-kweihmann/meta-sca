SRC_URI += "https://proxy.golang.org/github.com/huandu/xstrings/@v/v1.3.2.zip;srcoutput=github.com/huandu/xstrings;srcinput=github.com/huandu/xstrings@v1.3.2;downloadfilename=github-com-huandu-xstrings-1.3.2.zip;name=github-com-huandu-xstrings"
SRC_URI[github-com-huandu-xstrings.sha256sum] = "d2adf0995f9b6e9e099be38b8412202633475c5bf8cc440245b3ddddf8b741de"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/huandu/xstrings/LICENSE;md5=0a9edd7ffc0f2c020fe849875cb6810d \
"

GOSRC_INCLUDEGUARD += "github.com-huandu-xstrings-sources.inc"

