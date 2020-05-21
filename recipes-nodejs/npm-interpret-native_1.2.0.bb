SUMMARY = "NPM: interpret"
DESCRIPTION = "A dictionary of file extensions and associated module loaders."
HOMEPAGE = "https://github.com/gulpjs/interpret#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48fa72a2fa812dd4ebc86cf02c4b3b77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/interpret/-/interpret-1.2.0.tgz"
SRC_URI[md5sum] = "c15d71e22a56d3b4536579b5d6811967"
SRC_URI[sha256sum] = "6df1f91560274e48c1210ce5e4dd260b26be4c37b6346e5b451a7b17c9101617"

NPM_PKGNAME = "interpret"

inherit npmhelper
inherit native
