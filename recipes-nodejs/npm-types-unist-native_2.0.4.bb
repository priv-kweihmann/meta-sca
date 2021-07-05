SUMMARY = "NPM: @types/unist"
DESCRIPTION = "TypeScript definitions for Unist"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/unist"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/unist/-/unist-2.0.4.tgz"
SRC_URI[md5sum] = "1cc97e46528190486b981f4619a377ab"
SRC_URI[sha256sum] = "e4974fb2cbf02e19955d3ae01a43b8a3754c7f07607ac52f4a6bdaa201af5122"

NPM_PKGNAME = "@types/unist"

inherit npmhelper
inherit native

S = "${WORKDIR}/unist"
