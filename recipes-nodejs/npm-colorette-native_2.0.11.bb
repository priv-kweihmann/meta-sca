SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set your terminal text color & styles."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-2.0.11.tgz"
SRC_URI[md5sum] = "c09037b695fa5503fc579c72fa8d0965"
SRC_URI[sha256sum] = "309ee0fef87501d94d11b71819b31c76e5011ca777ad854a34c6f534ecb5b2f8"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
