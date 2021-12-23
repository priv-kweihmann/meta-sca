SUMMARY = "NPM: @types/parse5"
DESCRIPTION = "TypeScript definitions for parse5"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/parse5"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/parse5/-/parse5-6.0.3.tgz"
SRC_URI[md5sum] = "1b79ae5c71465ede4eaf17333389cb3a"
SRC_URI[sha256sum] = "1a92400cfd6c35213951cf956a67198a5a7c896dc99caf3a015cb198fcfa2167"

NPM_PKGNAME = "@types/parse5"

inherit npmhelper
inherit native

S = "${WORKDIR}/parse5"
