SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.66.2.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.66.2;downloadfilename=gopkg-in-ini-v1-1.66.2.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "6b254863a368f5365b2a21e41a97aa09e5b0a5aaade684bb88bb981e0e8b6c75"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

