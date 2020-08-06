SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.60.tgz"
SRC_URI[md5sum] = "50c2899b7f1bb1c34c3fda01c56322c8"
SRC_URI[sha256sum] = "8ca5dfb100cd1625b35cbc685daf443543adc9346a8806f21818fa3f080602cc"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
