SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set your terminal text color & styles."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-2.0.2.tgz"
SRC_URI[md5sum] = "ba563f5d7feb56290c613563b6a63b34"
SRC_URI[sha256sum] = "bcd6b39973a4f70821228f3a8eabab02a7153d1b540e17d4fd8a1495240b1e56"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
