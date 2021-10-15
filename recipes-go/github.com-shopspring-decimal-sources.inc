SRC_URI += "https://proxy.golang.org/github.com/shopspring/decimal/@v/v1.3.0.zip;srcoutput=github.com/shopspring/decimal;srcinput=github.com/shopspring/decimal@v1.3.0;downloadfilename=github-com-shopspring-decimal-1.3.0.zip;name=github-com-shopspring-decimal"
SRC_URI[github-com-shopspring-decimal.sha256sum] = "50e6ff6e3ccc13b134bb282f4bd0490a2a9b4a8795e6c36ac4646b838d3e3277"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shopspring/decimal/LICENSE;md5=d21d25475326cf7f1b36eef8c9789801 \
"

GOSRC_INCLUDEGUARD += "github.com-shopspring-decimal-sources.inc"

