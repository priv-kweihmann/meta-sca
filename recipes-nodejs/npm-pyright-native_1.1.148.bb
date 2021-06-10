SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.148.tgz"
SRC_URI[md5sum] = "4c0fcd16941a30bdfa46f848e4a15e19"
SRC_URI[sha256sum] = "364e6396e4ecb35dda5c72dc183e8f9e423092704e86f7871d24af125935cac9"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
