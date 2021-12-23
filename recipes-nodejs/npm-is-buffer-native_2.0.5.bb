SUMMARY = "NPM: is-buffer"
DESCRIPTION = "Determine if an object is a Buffer"
HOMEPAGE = "https://github.com/feross/is-buffer#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-buffer/-/is-buffer-2.0.5.tgz"
SRC_URI[md5sum] = "a4d5bcabc0ac0d6d5cdc5155218e6af0"
SRC_URI[sha256sum] = "2cde04866539c2397671a21d79773d4b95e3a7ae6573ee106c1cd437950fc05e"

NPM_PKGNAME = "is-buffer"

inherit npmhelper
inherit native
