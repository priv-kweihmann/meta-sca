SUMMARY = "NPM: try-resolve"
DESCRIPTION = "Try and resolve a filename"
HOMEPAGE = "https://github.com/sebmck/try-resolve#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://registry.npmjs.org/try-resolve/-/try-resolve-1.0.1.tgz"
SRC_URI[md5sum] = "8a47c6dbe8ad2d6c5ced800bb3ec758c"
SRC_URI[sha256sum] = "82ffb4b8de1de9f3749daf048f8bea3bf9a72b0a2cf7e0c0f80508bd273e8a0a"

NPM_PKGNAME = "try-resolve"

inherit npmhelper
inherit native
