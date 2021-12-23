SUMMARY = "NPM: safe-buffer"
DESCRIPTION = "Safer Node.js Buffer API"
HOMEPAGE = "https://github.com/feross/safe-buffer"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761"

SRC_URI = "https://registry.npmjs.org/safe-buffer/-/safe-buffer-5.2.1.tgz"
SRC_URI[md5sum] = "ea7cf66fcf04485e195b1bd3a3551fc9"
SRC_URI[sha256sum] = "5d181804516c4a693a384272a7bd0e42d17e0d4b301ccfbe408669ccafdcb3e8"

S = "${WORKDIR}/package"

NPM_PKGNAME = "safe-buffer"

inherit npmhelper
inherit native
