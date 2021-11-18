SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.64.0.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.64.0;downloadfilename=gopkg-in-ini-v1-1.64.0.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "fb95c4b5add927e3ea0a7cc479efcc86f98ae7dcc78f6194b423b5ad37c3041d"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

