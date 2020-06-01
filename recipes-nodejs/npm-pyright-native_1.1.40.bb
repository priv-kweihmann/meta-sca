SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.40.tgz"
SRC_URI[md5sum] = "18f58cd2d12ebd74b8b1a62ab6cb43ba"
SRC_URI[sha256sum] = "6b27907e571de28fb4c15309b395eda60632feec66f58d58bb2144df096ceab9"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
