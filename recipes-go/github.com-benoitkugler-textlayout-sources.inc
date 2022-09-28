SRC_URI += "https://proxy.golang.org/github.com/benoitkugler/textlayout/@v/v0.2.0.zip;srcoutput=github.com/benoitkugler/textlayout;srcinput=github.com/benoitkugler/textlayout@v0.2.0;downloadfilename=github-com-benoitkugler-textlayout-0.2.0.zip;name=github-com-benoitkugler-textlayout"
SRC_URI[github-com-benoitkugler-textlayout.sha256sum] = "57baa730479f5c4f5533f4091599eaa7b36f22e662fbca64713082e905e0da66"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/benoitkugler/textlayout/LICENSE;md5=df65e9e2a0877cce974ddfc6e3fdd6b4 \
    file://src/github.com/benoitkugler/textlayout/fonts/LICENSE;md5=df65e9e2a0877cce974ddfc6e3fdd6b4 \
    file://src/github.com/benoitkugler/textlayout/graphite/LICENSE;md5=fce85f29a6fd1159add4544764cd60ce \
    file://src/github.com/benoitkugler/textlayout/harfbuzz/LICENSE;md5=0c02738f95d7ce8b830e39543ca76c41 \
    file://src/github.com/benoitkugler/textlayout/unicodedata/generate/ms-use/COPYING;md5=d4a904ca135bb7bc912156fee12726f0 \
"

GOSRC_INCLUDEGUARD += "github.com-benoitkugler-textlayout-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-benoitkugler-pstokenizer-sources.inc', '', 'github.com-benoitkugler-pstokenizer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
