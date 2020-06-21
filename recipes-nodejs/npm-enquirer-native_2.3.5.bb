SUMMARY = "NPM: enquirer"
DESCRIPTION = "Stylish, intuitive and user-friendly prompt system. Fast and lightweight enough for small projects, powerful and extensible enough for the most advanced use cases."
HOMEPAGE = "https://github.com/enquirer/enquirer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62927f9e287cbc1dbddd9c8f208b7cdb"

DEPENDS = "npm-ansi-colors-native"

SRC_URI = "https://registry.npmjs.org/enquirer/-/enquirer-2.3.5.tgz"
SRC_URI[md5sum] = "ac129fa6c47ea1cc60936dd8093655c9"
SRC_URI[sha256sum] = "886ebb596e94724964f028fd1b5b353b8d2158c1c9ac1481dd26b69afd1f8d16"

NPM_PKGNAME = "enquirer"

inherit npmhelper
inherit native
