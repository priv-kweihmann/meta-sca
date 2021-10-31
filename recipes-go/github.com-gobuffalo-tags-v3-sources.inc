SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/tags/v3/@v/v3.1.1.zip;srcoutput=github.com/gobuffalo/tags/v3;srcinput=github.com/gobuffalo/tags/v3@v3.1.1;downloadfilename=github-com-gobuffalo-tags-v3-3.1.1.zip;name=github-com-gobuffalo-tags-v3"
SRC_URI[github-com-gobuffalo-tags-v3.sha256sum] = "ac854347e49ef381a23f4affc630045d5bbbd3659fb69ca056584891818e0a6e"

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
