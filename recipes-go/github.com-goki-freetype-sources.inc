SRC_URI += "https://proxy.golang.org/github.com/goki/freetype/@v/v0.0.0-20220119013949-7a161fd3728c.zip;srcoutput=github.com/goki/freetype;srcinput=github.com/goki/freetype@v0.0.0-20220119013949-7a161fd3728c;downloadfilename=github-com-goki-freetype-0.0.0-20220119013949-7a161fd3728c.zip;name=github-com-goki-freetype"
SRC_URI[github-com-goki-freetype.sha256sum] = "687ec8f84dcff1375ee6677116caaf39c1e6e510e4dd75bcafe653e7c5d74e9d"

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
