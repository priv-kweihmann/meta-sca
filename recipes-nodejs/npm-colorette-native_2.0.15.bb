SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set your terminal text color & styles."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-2.0.15.tgz"
SRC_URI[md5sum] = "6cda511cf70c33407cd3bb09f55eba3a"
SRC_URI[sha256sum] = "0c26bc3134c7776bd5a94331f09cebc0c5dc44e63bce025d5bf85e8314fb5b8d"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
