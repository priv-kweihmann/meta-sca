SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.13.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.13;downloadfilename=github-com-yuin-goldmark-1.4.13.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "bb41a602b174345fda392c8ad83fcc93217c285c763699677630be90feb7a5e3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

