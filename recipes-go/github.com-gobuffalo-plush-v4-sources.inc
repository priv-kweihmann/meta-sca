SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/plush/v4/@v/v4.1.10.zip;srcoutput=github.com/gobuffalo/plush/v4;srcinput=github.com/gobuffalo/plush/v4@v4.1.10;downloadfilename=github-com-gobuffalo-plush-v4-4.1.10.zip;name=github-com-gobuffalo-plush-v4"
SRC_URI[github-com-gobuffalo-plush-v4.sha256sum] = "53f5abe09cd87de4dac47694ccd29d6ed9f4d7ea8ac6d822d0eb1b4e0fe8603e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/plush/v4/LICENSE;md5=8d487ef2d40a9da39a2a5ced2b008cc2 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-plush-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', '', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-helpers-sources.inc', '', 'github.com-gobuffalo-helpers-sources.inc', d)}
