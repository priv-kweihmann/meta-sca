SUMMARY = "NPM: chardet"
DESCRIPTION = "Character detector"
HOMEPAGE = "https://github.com/runk/node-chardet"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90c339b6009a31625309f490cd17c9e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/chardet/-/chardet-1.2.0.tgz"
SRC_URI[md5sum] = "4cd0f7ac7b634d038a60e766a172809c"
SRC_URI[sha256sum] = "63e4348149cc0f7825b1fbfbc43c7de00321ad16c3d6579d0cfb706b3eef8041"

NPM_PKGNAME = "chardet"

inherit npmhelper
inherit native
