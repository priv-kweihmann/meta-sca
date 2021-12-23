SUMMARY = "NPM: estraverse"
DESCRIPTION = "ECMAScript JS AST traversal functions"
HOMEPAGE = "https://github.com/estools/estraverse"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=e74cede38e957fe3e525b0e53a510bcf"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/estraverse/-/estraverse-5.3.0.tgz"
SRC_URI[md5sum] = "ac5d5752d7928d448689899477f994b0"
SRC_URI[sha256sum] = "3e8d45da5b8085a4a8d51368ffead5b551a502c286978962a05d5c8e0d72fda6"

NPM_PKGNAME = "estraverse"

inherit npmhelper
inherit native
