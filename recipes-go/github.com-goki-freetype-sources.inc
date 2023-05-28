SRC_URI += "https://proxy.golang.org/github.com/goki/freetype/@v/v1.0.1.zip;srcoutput=github.com/goki/freetype;srcinput=github.com/goki/freetype@v1.0.1;downloadfilename=github-com-goki-freetype-1.0.1.zip;name=github-com-goki-freetype"
SRC_URI[github-com-goki-freetype.sha256sum] = "deddff668e0e208ab923bbd9fb1dde5b5b4060ae0dba464591b9f34983a051cb"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    GPL-1.0-or-later \
    GPL-2.0-or-later \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/goki/freetype/LICENSE;md5=8e050e4860234723098ceeefa49edd05 \
"

GOSRC_INCLUDEGUARD += "github.com-goki-freetype-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
