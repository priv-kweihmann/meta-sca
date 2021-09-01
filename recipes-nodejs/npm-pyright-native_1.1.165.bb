SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.165.tgz"
SRC_URI[md5sum] = "0269b3c3b4b71ea1cdd8f026e7c43239"
SRC_URI[sha256sum] = "042484e6267bbf3d3e56099985d70320fae9805b44109067356474291eb586bc"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
