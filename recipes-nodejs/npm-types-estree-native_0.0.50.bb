SUMMARY = "NPM: @types/estree"
DESCRIPTION = "TypeScript definitions for ESTree AST specification"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/estree"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/estree/-/estree-0.0.50.tgz"
SRC_URI[md5sum] = "53babdc56298a4b04ef817efd53017e2"
SRC_URI[sha256sum] = "64898659f4e7c9c668f685233c099c692f7a692b61f5ee35d9af4a81d734d9f7"

NPM_PKGNAME = "@types/estree"

inherit npmhelper
inherit native

S = "${WORKDIR}/estree"
