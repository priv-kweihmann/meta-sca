SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.198.tgz"
SRC_URI[md5sum] = "1e02250b28cd9a6653454aa28f994ba4"
SRC_URI[sha256sum] = "3ca39d340e138409929fc5cd6dceee1aa6f0094b2f576bb9e34e96f4437b30e5"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
