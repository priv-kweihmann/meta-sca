SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.144.tgz"
SRC_URI[md5sum] = "1a977d9c91b38000e507146e5004cc08"
SRC_URI[sha256sum] = "563d58c8732f27cbbf54f739c679039d8bd92d446eb7fb71df511309e0d4049c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
