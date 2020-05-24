SUMMARY = "NPM: @types/parse5"
DESCRIPTION = "TypeScript definitions for parse5"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/parse5/-/parse5-5.0.3.tgz"
SRC_URI[md5sum] = "92aeb9fd126e84429ac5ca7e398180b3"
SRC_URI[sha256sum] = "095b6c054ec4199d5a2ef6af0afc3ea62f9fb5725095cc24a225797dd80d08b2"

NPM_PKGNAME = "@types/parse5"

inherit npmhelper
inherit native

S = "${WORKDIR}/parse5"
