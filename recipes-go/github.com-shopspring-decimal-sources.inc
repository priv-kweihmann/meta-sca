SRC_URI += "https://proxy.golang.org/github.com/shopspring/decimal/@v/v1.3.1.zip;srcoutput=github.com/shopspring/decimal;srcinput=github.com/shopspring/decimal@v1.3.1;downloadfilename=github-com-shopspring-decimal-1.3.1.zip;name=github-com-shopspring-decimal"
SRC_URI[github-com-shopspring-decimal.sha256sum] = "7986d6c8489c4a55c077e3469a3c9a218f7ce4afbd25d68aa2b26a6ea5015438"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shopspring/decimal/LICENSE;md5=d21d25475326cf7f1b36eef8c9789801 \
"

GOSRC_INCLUDEGUARD += "github.com-shopspring-decimal-sources.inc"

