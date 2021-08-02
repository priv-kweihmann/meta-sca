SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.159.tgz"
SRC_URI[md5sum] = "6d4b45a8ab453f62182ea0c874a194c3"
SRC_URI[sha256sum] = "24f251edff8e72dc782315a301cf444e07a97749366bcac145a17b75e2b1e750"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
