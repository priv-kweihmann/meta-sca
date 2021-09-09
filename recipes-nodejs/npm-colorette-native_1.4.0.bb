SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set the text color and style in the terminal."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-1.4.0.tgz"
SRC_URI[md5sum] = "968e4b6c4284f11d760353ef32a66708"
SRC_URI[sha256sum] = "e6f3e47e264cbf911efa07154de8a401ae6b01ce8d7ba3a064a35baa161b926f"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
