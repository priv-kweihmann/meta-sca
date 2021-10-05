SUMMARY = "NPM: colorette"
DESCRIPTION = "Easily set your terminal text color & styles."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-2.0.14.tgz"
SRC_URI[md5sum] = "87199cf75cdcbae07a3fefd5682304c0"
SRC_URI[sha256sum] = "fa0a43195ed6bb8bc39ac8e073e0ff88bc51147ddb84c665ea874d0407ac2c0b"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
