SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (116 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.3.3.tgz"
SRC_URI[md5sum] = "0cb35194bbc4c248bc9b448554527137"
SRC_URI[sha256sum] = "fae514caed4d3e297511e2004be1ad53a8d7fdd688b6546a89d8351c88a433fd"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
