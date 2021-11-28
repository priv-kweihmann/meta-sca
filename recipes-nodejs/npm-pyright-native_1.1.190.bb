SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.190.tgz"
SRC_URI[md5sum] = "00afd37ecdfb6dfda481582f537d92fb"
SRC_URI[sha256sum] = "13abb14e1358531199f5067278a3c7f2322ce5af3b4f473077be2c641a83a1ed"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
