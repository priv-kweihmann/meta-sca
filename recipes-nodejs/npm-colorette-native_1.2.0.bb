SUMMARY = "NPM: colorette"
DESCRIPTION = "Color your terminal using pure idiomatic JavaScript."
HOMEPAGE = "https://github.com/jorgebucaran/colorette"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-1.2.0.tgz"
SRC_URI[md5sum] = "8b3b4a6061144b03a40c92ae28ee5575"
SRC_URI[sha256sum] = "5646ad61f9253c40e3c5c45bf50113838826ca3e737e92b01b8271e7df1228d1"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
