SRC_URI += "https://proxy.golang.org/github.com/jackc/pgio/@v/v1.0.0.zip;srcoutput=github.com/jackc/pgio;srcinput=github.com/jackc/pgio@v1.0.0;downloadfilename=github-com-jackc-pgio-1.0.0.zip;name=github-com-jackc-pgio"
SRC_URI[github-com-jackc-pgio.sha256sum] = "1a83c03d53f6a40339364cafcbbabb44238203c79ca0c9b98bf582d0df0e0468"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/pgio/LICENSE;md5=ea2961e52eec5b1203f8147a49ef985f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-pgio-sources.inc"

