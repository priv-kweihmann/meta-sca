SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/helpers/@v/v0.6.1.zip;srcoutput=github.com/gobuffalo/helpers;srcinput=github.com/gobuffalo/helpers@v0.6.1;downloadfilename=github-com-gobuffalo-helpers-0.6.1.zip;name=github-com-gobuffalo-helpers"
SRC_URI[github-com-gobuffalo-helpers.sha256sum] = "647c610e3643068122e5d7b266b6ab4e1953c1d07fda3ba1d731942c1ce6c948"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/helpers/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
    file://src/github.com/gobuffalo/helpers/helpers/LICENSE;md5=650d488e190d4d61932b595f4fb64253 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-helpers-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', '', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-tags-v3-sources.inc', '', 'github.com-gobuffalo-tags-v3-sources.inc', d)}
