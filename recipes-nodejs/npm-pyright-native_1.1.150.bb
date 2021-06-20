SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.150.tgz"
SRC_URI[md5sum] = "830e789ccfdb7a3d993e5118677f2ec4"
SRC_URI[sha256sum] = "2818e51be195d76d2e9cf16b0468d6bef56601fb326ca0e5733323634280bb04"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
