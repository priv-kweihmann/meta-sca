SUMMARY = "NPM: estraverse"
DESCRIPTION = "ECMAScript JS AST traversal functions"
HOMEPAGE = "https://github.com/estools/estraverse"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=e74cede38e957fe3e525b0e53a510bcf"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/estraverse/-/estraverse-5.2.0.tgz"
SRC_URI[md5sum] = "d77fc6a5c30fb0661c219d8a93a60dc6"
SRC_URI[sha256sum] = "9b8607646676c6f3cc06cdb04af32198a7f5e3b271502def087c4561627de001"

NPM_PKGNAME = "estraverse"

inherit npmhelper
inherit native
