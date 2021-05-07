SRC_URI += "https://github.com/dominikh/go-tools/archive/refs/tags/2020.2.3.zip;srcoutput=honnef.co/go/tools;srcinput=go-tools-2020.2.3;downloadfilename=honnef-co-go-tools-2020.2.4.zip;name=honnef-co-go-tools"
SRC_URI[honnef-co-go-tools.sha256sum] = "d622b009c9754d5c66a1cfd7cfda3de5f9cda2249d99f5ff6db984287cd8ffad"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/honnef.co/go/tools/LICENSE-THIRD-PARTY;md5=310cf4b1e8d243f332294d0ac2c88d97 \
    file://src/honnef.co/go/tools/LICENSE;md5=ca0492e2abd2c12b3f3c25d6e33972ad \
    file://src/honnef.co/go/tools/go/gcsizes/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/honnef.co/go/tools/go/ir/LICENSE;md5=5ec8b64b7997364598d73f2d1e94f474 \
    file://src/honnef.co/go/tools/internal/gosmith/LICENSE;md5=34371deb29bfed5ca2285fbe4b9df6f5 \
"

GOSRC_INCLUDEGUARD += "honnef.co-go-tools-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kisielk-gotool-sources.inc', '', 'github.com-kisielk-gotool-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
