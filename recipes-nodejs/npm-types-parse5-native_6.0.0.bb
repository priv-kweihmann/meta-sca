SUMMARY = "NPM: @types/parse5"
DESCRIPTION = "TypeScript definitions for parse5"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/parse5/-/parse5-6.0.0.tgz"
SRC_URI[md5sum] = "4de79695a44dac1a6fae8bc47d1e48f6"
SRC_URI[sha256sum] = "2ff485476f5ad56ed43276d36a37400b51f6d7e8931368594c3962a2f0d2bc17"

NPM_PKGNAME = "@types/parse5"

inherit npmhelper
inherit native

S = "${WORKDIR}/parse5"
