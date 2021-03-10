SUMMARY = "NPM: glob-parent"
DESCRIPTION = "Extract the non-magic parent path from a glob string."
HOMEPAGE = "https://github.com/gulpjs/glob-parent#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3d42bb676c62db87cbf7b04d98da83e"

DEPENDS = "npm-is-glob-native"

SRC_URI = "https://registry.npmjs.org/glob-parent/-/glob-parent-5.1.2.tgz"
SRC_URI[md5sum] = "b10ba1a21ff8ef737fe83ca5f33684a0"
SRC_URI[sha256sum] = "9616afebd18b93592a79d48cce6a841604593ae90563f0ec5554a07b6952d6d5"

NPM_PKGNAME = "glob-parent"

inherit npmhelper
inherit native
