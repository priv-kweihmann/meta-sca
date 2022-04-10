SRC_URI += "git://github.com/dominikh/go-tools;nobranch=1;protocol=https;srcinput=honnef.co/go/tools;srcoutput=honnef.co/go/tools;destsuffix=honnef.co/go/tools;name=honnef-co-go-tools"
SRCREV_honnef-co-go-tools = "c8caa92bad8c27ae734c6725b8a04932d54a147b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/honnef.co/go/tools/LICENSE-THIRD-PARTY;md5=11fca0f24e6e6b41eb6dac1025d972f8 \
    file://src/honnef.co/go/tools/LICENSE;md5=ca0492e2abd2c12b3f3c25d6e33972ad \
    file://src/honnef.co/go/tools/go/gcsizes/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/honnef.co/go/tools/go/ir/LICENSE;md5=5ec8b64b7997364598d73f2d1e94f474 \
    file://src/honnef.co/go/tools/internal/gosmith/LICENSE;md5=34371deb29bfed5ca2285fbe4b9df6f5 \
"

GOSRC_INCLUDEGUARD += "honnef.co-go-tools-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
