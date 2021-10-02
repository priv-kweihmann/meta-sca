SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set your terminal text color & styles."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-2.0.13.tgz"
SRC_URI[md5sum] = "b28c124fc65233a159be983a92ac3a99"
SRC_URI[sha256sum] = "8b9cef73af510cab44c6d1de94db372a4b556ffc8fd080cd0e6ab03afcedffac"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
