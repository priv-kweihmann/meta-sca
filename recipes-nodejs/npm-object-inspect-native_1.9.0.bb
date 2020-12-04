SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/inspect-js/object-inspect"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.9.0.tgz"
SRC_URI[md5sum] = "221d12c29092d358e6150ca201750a3a"
SRC_URI[sha256sum] = "acc35adbd0289c081ce0a107536730bc32361168547fdc6d12008543fd94aede"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
