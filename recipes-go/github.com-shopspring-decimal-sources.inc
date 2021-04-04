SRC_URI += "https://proxy.golang.org/github.com/shopspring/decimal/@v/v1.2.0.zip;srcoutput=github.com/shopspring/decimal;srcinput=github.com/shopspring/decimal@v1.2.0;downloadfilename=github-com-shopspring-decimal-1.2.0.zip;name=github-com-shopspring-decimal"
SRC_URI[github-com-shopspring-decimal.sha256sum] = "65c34c248e7f736cadf03a7caa0c0870d15499eb593f933fe106c96c2b7699a7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shopspring/decimal/LICENSE;md5=d21d25475326cf7f1b36eef8c9789801 \
"

GOSRC_INCLUDEGUARD += "github.com-shopspring-decimal-sources.inc"

