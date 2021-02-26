SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set the color and style of text in the terminal."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-1.2.2.tgz"
SRC_URI[md5sum] = "167726f5ce147d47632657b9ef6c5637"
SRC_URI[sha256sum] = "ec434f7f1a440538bbad28aee971c812209878d97f92e76989ff5f4a50676c29"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
