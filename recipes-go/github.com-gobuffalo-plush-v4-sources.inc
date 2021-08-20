SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/plush/v4/@v/v4.1.6.zip;srcoutput=github.com/gobuffalo/plush/v4;srcinput=github.com/gobuffalo/plush/v4@v4.1.6;downloadfilename=github-com-gobuffalo-plush-v4-4.1.6.zip;name=github-com-gobuffalo-plush-v4"
SRC_URI[github-com-gobuffalo-plush-v4.sha256sum] = "e167c1fa8d9fe319604409549c3a3ed937297bc89b3eaa6c99d69b78394a7d88"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/plush/v4/LICENSE;md5=8d487ef2d40a9da39a2a5ced2b008cc2 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-plush-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', '', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-helpers-sources.inc', '', 'github.com-gobuffalo-helpers-sources.inc', d)}
