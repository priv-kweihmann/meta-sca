SUMMARY = "NPM: @types/unist"
DESCRIPTION = "TypeScript definitions for Unist"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/unist"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/unist/-/unist-2.0.5.tgz"
SRC_URI[md5sum] = "94805d1bc685bd862bef74abc262101b"
SRC_URI[sha256sum] = "f1859f60b56ab8fa2e01d63dad26022bc76b5c92632f6a664684a9409ecb3f06"

NPM_PKGNAME = "@types/unist"

inherit npmhelper
inherit native

S = "${WORKDIR}/unist"
