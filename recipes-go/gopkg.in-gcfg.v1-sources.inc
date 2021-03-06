SRC_URI += "https://proxy.golang.org/gopkg.in/gcfg.v1/@v/v1.2.3.zip;srcoutput=gopkg.in/gcfg.v1;srcinput=gopkg.in/gcfg.v1@v1.2.3;downloadfilename=gopkg-in-gcfg-v1-1.2.3.zip;name=gopkg-in-gcfg-v1"
SRC_URI[gopkg-in-gcfg-v1.sha256sum] = "06cdad29610507bafb35e2e73d64fd7aa6c5c2ce1e5feff30a622af5475bca3b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/gcfg.v1/LICENSE;md5=13cea479df204c85485b5db6eb1bc9d5 \
"

GOSRC_INCLUDEGUARD += "gopkg.in-gcfg.v1-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-warnings.v0-sources.inc', '', 'gopkg.in-warnings.v0-sources.inc', d)}
