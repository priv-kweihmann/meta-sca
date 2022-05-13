SRC_URI += "https://proxy.golang.org/github.com/golang/freetype/@v/v0.0.0-20170609003504-e2365dfdc4a0.zip;srcoutput=github.com/golang/freetype;srcinput=github.com/golang/freetype@v0.0.0-20170609003504-e2365dfdc4a0;downloadfilename=github-com-golang-freetype-0.0.0-20170609003504-e2365dfdc4a0.zip;name=github-com-golang-freetype"
SRC_URI[github-com-golang-freetype.sha256sum] = "cdcb9e6a14933dcbf167b44dcd5083fc6a2e52c4fae8fb79747c691efeb7d84e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    GPL-1.0-or-later \
    GPL-2.0-or-later \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/freetype/LICENSE;md5=8e050e4860234723098ceeefa49edd05 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-freetype-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
