SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set the text color and style in the terminal."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-1.3.0.tgz"
SRC_URI[md5sum] = "07bfe52119a7f202e7718fdb415df366"
SRC_URI[sha256sum] = "ef23031b7e43c368defd2a31416b89dbd02c6d8bf35060fac0f9eef423e6757d"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
