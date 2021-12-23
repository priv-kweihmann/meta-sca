SUMMARY = "NPM: @types/minimist"
DESCRIPTION = "TypeScript definitions for minimist"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/minimist"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/minimist/-/minimist-1.2.2.tgz"
SRC_URI[md5sum] = "4ccbdff48a458fa5d816ab1a74016280"
SRC_URI[sha256sum] = "08953181b25b8cfe9b682745d0ee0086f366befe62a74628ae56168bc7a1ef11"

NPM_PKGNAME = "@types/minimist"

inherit npmhelper
inherit native

S = "${WORKDIR}/minimist"
