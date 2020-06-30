SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.47.tgz"
SRC_URI[md5sum] = "57986ed22da1365712fe6902fbcf67e4"
SRC_URI[sha256sum] = "1386e9b29e4a56be3d01945e8d84678ea551bd9759e551de31fa1b03f9f31268"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
