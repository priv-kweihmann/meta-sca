SUMMARY = "NPM: @types/http-cache-semantics"
DESCRIPTION = "TypeScript definitions for http-cache-semantics"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/http-cache-semantics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/http-cache-semantics/-/http-cache-semantics-4.0.1.tgz"
SRC_URI[md5sum] = "4869ddcbdc4b6d528697919e3307889f"
SRC_URI[sha256sum] = "f55d4821223197e75ad2e79767198800be4d96ad6b3b321c112a4ddf5ff1617f"

NPM_PKGNAME = "@types/http-cache-semantics"

inherit npmhelper
inherit native

S = "${WORKDIR}/http-cache-semantics"
