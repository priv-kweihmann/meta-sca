SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/tags/v3/@v/v3.1.0.zip;srcoutput=github.com/gobuffalo/tags/v3;srcinput=github.com/gobuffalo/tags/v3@v3.1.0;downloadfilename=github-com-gobuffalo-tags-v3-3.1.0.zip;name=github-com-gobuffalo-tags-v3"
SRC_URI[github-com-gobuffalo-tags-v3.sha256sum] = "273e3e01abfbbcd8e5d2b21f7bd172e2191380606dc518d714212a736b140c10"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/tags/v3/LICENSE.txt;md5=56a70d5e9a25b633e77f61ccc47789e7 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-tags-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-structs-sources.inc', '', 'github.com-fatih-structs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-validate-v3-sources.inc', '', 'github.com-gobuffalo-validate-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gofrs-uuid-sources.inc', '', 'github.com-gofrs-uuid-sources.inc', d)}
