SUMMARY = "NPM: @types/parse5"
DESCRIPTION = "TypeScript definitions for parse5"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/parse5"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/parse5/-/parse5-6.0.2.tgz"
SRC_URI[md5sum] = "e94ff9fbfe60ed648a93558a6055d2d1"
SRC_URI[sha256sum] = "0089b680b36d16694e8ffb5d939081c164b7617da395b0707c36511bd8cde929"

NPM_PKGNAME = "@types/parse5"

inherit npmhelper
inherit native

S = "${WORKDIR}/parse5"
