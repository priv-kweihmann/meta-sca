SRC_URI += "https://proxy.golang.org/github.com/boombuler/barcode/@v/v1.0.1.zip;srcoutput=github.com/boombuler/barcode;srcinput=github.com/boombuler/barcode@v1.0.1;downloadfilename=github-com-boombuler-barcode-1.0.1.zip;name=github-com-boombuler-barcode"
SRC_URI[github-com-boombuler-barcode.sha256sum] = "812c5beeaa87864227f9d92a9ae71792dc0e6302a33737a91aabe1e511cde42b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/boombuler/barcode/LICENSE;md5=d9c4b9f155cefe2a7f441c187a253943 \
"

GOSRC_INCLUDEGUARD += "github.com-boombuler-barcode-sources.inc"

