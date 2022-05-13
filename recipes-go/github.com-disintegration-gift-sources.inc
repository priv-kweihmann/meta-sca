SRC_URI += "https://proxy.golang.org/github.com/disintegration/gift/@v/v1.2.1.zip;srcoutput=github.com/disintegration/gift;srcinput=github.com/disintegration/gift@v1.2.1;downloadfilename=github-com-disintegration-gift-1.2.1.zip;name=github-com-disintegration-gift"
SRC_URI[github-com-disintegration-gift.sha256sum] = "d9a688a552dc8f5b2319325541e2bbc5c0af66b6e78273058893b259fcca5a0f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/disintegration/gift/LICENSE;md5=202bb60f30155782ccd48bce6e34d300 \
"

GOSRC_INCLUDEGUARD += "github.com-disintegration-gift-sources.inc"

