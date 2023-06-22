SRC_URI += "https://proxy.golang.org/github.com/go-text/typesetting-utils/@v/v0.0.0-20230619144037-0468015c41af.zip;srcoutput=github.com/go-text/typesetting-utils;srcinput=github.com/go-text/typesetting-utils@v0.0.0-20230619144037-0468015c41af;downloadfilename=github-com-go-text-typesetting-utils-0.0.0-20230619144037-0468015c41af.zip;name=github-com-go-text-typesetting-utils"
SRC_URI[github-com-go-text-typesetting-utils.sha256sum] = "df713bb7145d1ddb98b61a5faee5ef2c2b77f8e96a8cbe0b3291b574fa3daabb"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
    OFL-1.1 \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-text/typesetting-utils/LICENSE;md5=165d8228d73aa036b651190f1fb41a77 \
    file://src/github.com/go-text/typesetting-utils/generators/unicodedata/data/ms-use/COPYING;md5=d4a904ca135bb7bc912156fee12726f0 \
    file://src/github.com/go-text/typesetting-utils/harfbuzz/harfbuzz_reference/aots/COPYING;md5=132cff9c1bbd21914067784ed58b0956 \
    file://src/github.com/go-text/typesetting-utils/harfbuzz/harfbuzz_reference/in-house/COPYING;md5=bdbddf9f3cd1aa7d3207962308760214 \
    file://src/github.com/go-text/typesetting-utils/harfbuzz/harfbuzz_reference/text-rendering-tests/COPYING;md5=19f54ae77ee329109be7705da20a4a10 \
"

GOSRC_INCLUDEGUARD += "github.com-go-text-typesetting-utils-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
