SUMMARY = "NPM: colorette"
DESCRIPTION = "Color your terminal using pure idiomatic JavaScript."
HOMEPAGE = "https://github.com/jorgebucaran/colorette"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-1.2.1.tgz"
SRC_URI[md5sum] = "629382b110819702b48ed6bd5eccf2df"
SRC_URI[sha256sum] = "1d10b9e8394b23a05a2f425d47b786c2d829ad0ad7719f50bd7003ed846d638c"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
