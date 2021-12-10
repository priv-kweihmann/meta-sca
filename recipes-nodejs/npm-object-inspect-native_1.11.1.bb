SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/inspect-js/object-inspect"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.11.1.tgz"
SRC_URI[md5sum] = "885ab56e0144604a7ff0beaba2286380"
SRC_URI[sha256sum] = "1f14444e07c585155ead160d3a5a31436d21b052c96d066226a99ac2de61a9a4"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
