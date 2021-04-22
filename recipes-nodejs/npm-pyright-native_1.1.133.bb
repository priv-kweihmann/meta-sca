SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.133.tgz"
SRC_URI[md5sum] = "f8682956c80984b70fcefa6c099165e9"
SRC_URI[sha256sum] = "6e68b69f53fe0e95a55500c2cc72189286b3f57a3a255f4bf40b73522d26dfe6"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
