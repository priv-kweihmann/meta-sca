SUMMARY = "NPM: merge2"
DESCRIPTION = "Merge multiple streams into one stream in sequence or parallel."
HOMEPAGE = "https://github.com/teambition/merge2"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8aa1e0b760adbfc8e07a9a6eb24a60e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/merge2/-/merge2-1.4.1.tgz"
SRC_URI[md5sum] = "c12134c7445659565a4c87de0f84639e"
SRC_URI[sha256sum] = "b8381291c9b3c859c5b58e75da8bdde64b424344054893c774c68c3c443d7881"

NPM_PKGNAME = "merge2"

inherit npmhelper
inherit native
