SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.4.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.4;downloadfilename=github-com-yuin-goldmark-1.4.4.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "ef67e23e1c7c8d32a1ab6158db797dac78ca4ea2589d88c15a7ed675f37daf23"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

