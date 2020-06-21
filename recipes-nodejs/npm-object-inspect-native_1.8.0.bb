SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/inspect-js/object-inspect"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.8.0.tgz"
SRC_URI[md5sum] = "faa7b438b987616e0c7dc6e486759098"
SRC_URI[sha256sum] = "57f0a3cc990946beeb6fa26994245dfa1053c1c5dc0a6512821dd459df3d8be6"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
