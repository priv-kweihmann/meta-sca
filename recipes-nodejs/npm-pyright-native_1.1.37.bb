SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.37.tgz"
SRC_URI[md5sum] = "27cf3553be40f48813262d5780c149dd"
SRC_URI[sha256sum] = "f44cb6a4aa6696efae092aad7d7ddaa7b07b6a5d2aec57108bfd0f3ecfdc4024"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
