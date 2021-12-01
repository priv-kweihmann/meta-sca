SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.191.tgz"
SRC_URI[md5sum] = "4849a755669a8cf1f104144f2b2b35b1"
SRC_URI[sha256sum] = "452e8fb0bd6e2e29a86fdf1791791c25b526b0772d01fdcf67ffadfc98ed482d"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
