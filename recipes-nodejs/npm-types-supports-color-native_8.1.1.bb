SUMMARY = "NPM: @types/supports-color"
DESCRIPTION = "TypeScript definitions for supports-color"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/supports-color"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/supports-color/-/supports-color-8.1.1.tgz"
SRC_URI[md5sum] = "2fd366231e1dc66933ac39e31d0aacfc"
SRC_URI[sha256sum] = "632c351d7715af3dc6796a73026b43057368b087266c7d011ef3c22f9a9f287e"

NPM_PKGNAME = "@types/supports-color"

inherit npmhelper
inherit native

S = "${WORKDIR}/supports-color"
