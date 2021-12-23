SUMMARY = "NPM: @types/hast"
DESCRIPTION = "TypeScript definitions for Hast"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/hast"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/hast/-/hast-2.3.4.tgz"
SRC_URI[md5sum] = "ac91146d9866433232b4f34b1fac517f"
SRC_URI[sha256sum] = "75e1aeda55a1a4802680b399e28ee913f1fe66478872dc68f53ad6ef801154f0"

NPM_PKGNAME = "@types/hast"

inherit npmhelper
inherit native

S = "${WORKDIR}/hast"
