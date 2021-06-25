SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.152.tgz"
SRC_URI[md5sum] = "a9a693b86e2d886e9239c959179edd74"
SRC_URI[sha256sum] = "12b0f276debcea18c1908fa54023db078ec4b6254f2e34b1ac9e7984a987001c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
