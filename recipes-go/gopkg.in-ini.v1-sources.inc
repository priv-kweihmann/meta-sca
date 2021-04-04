SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.62.0.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.62.0;downloadfilename=gopkg-in-ini-v1-1.62.0.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "9cbe2a2bdd30dd07d98f431307e66607cbfcf344fc11cd29e592753015c2d77e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

