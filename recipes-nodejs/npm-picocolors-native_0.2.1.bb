SUMMARY = "NPM: picocolors"
DESCRIPTION = "The tiniest and the fastest coloring library ever"
HOMEPAGE = "https://github.com/alexeyraspopov/picocolors#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8aabd5d21f92335888d962fb6ca980f8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/picocolors/-/picocolors-0.2.1.tgz"
SRC_URI[md5sum] = "a11c3b015b444fb0716dd7912919ded4"
SRC_URI[sha256sum] = "232c7407b336b4ec986d8b361a2628775754f99c498ebad1549afe7ca09b360d"

NPM_PKGNAME = "picocolors"

inherit npmhelper
inherit native
