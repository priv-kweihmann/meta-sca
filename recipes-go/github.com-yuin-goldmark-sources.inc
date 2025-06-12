SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.7.12.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.7.12;downloadfilename=github-com-yuin-goldmark-1.7.12.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "e27b5aa57440a3a4e8f2dc9bde7c0e288948c68112a76f888879434fe19acf05"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

