SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.65.0.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.65.0;downloadfilename=gopkg-in-ini-v1-1.65.0.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "876fb6e9c79af5ab7817c5d05c8f6eb1314f648d05db2ae979e7c91c96813ad2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

