SUMMARY = "NPM: @types/mdast"
DESCRIPTION = "TypeScript definitions for Mdast"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/mdast/-/mdast-3.0.3.tgz"
SRC_URI[md5sum] = "46edfdb3b886de7b9cd289ad16a3e8f0"
SRC_URI[sha256sum] = "850485c0f97302103e9bc2b31941fe6d430e2ed1db91660e2fd733b3a94c921d"

NPM_PKGNAME = "@types/mdast"

inherit npmhelper
inherit native

S = "${WORKDIR}/mdast"
