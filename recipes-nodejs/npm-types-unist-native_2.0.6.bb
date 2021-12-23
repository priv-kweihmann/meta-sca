SUMMARY = "NPM: @types/unist"
DESCRIPTION = "TypeScript definitions for Unist"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/unist"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/unist/-/unist-2.0.6.tgz"
SRC_URI[md5sum] = "8e798ecd452abc0ac782b9b1ca05ae07"
SRC_URI[sha256sum] = "a9bb101790c53102f32be4b541f6c229bda6af44d4752c78375c4c765d3120c0"

NPM_PKGNAME = "@types/unist"

inherit npmhelper
inherit native

S = "${WORKDIR}/unist"
