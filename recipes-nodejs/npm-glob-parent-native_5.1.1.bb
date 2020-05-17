SUMMARY = "NPM: glob-parent"
DESCRIPTION = "Extract the non-magic parent path from a glob string."
HOMEPAGE = "https://github.com/gulpjs/glob-parent#readme"

DEPENDS = "npm-is-glob-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3d42bb676c62db87cbf7b04d98da83e"

SRC_URI = "https://registry.npmjs.org/glob-parent/-/glob-parent-5.1.1.tgz"
SRC_URI[md5sum] = "836aefd7f75a3e08cc5ac4bc86873576"
SRC_URI[sha256sum] = "9d1d98d2838b2d959879780d8f8fdf9429b6cba6de537687bf03c5718d69f091"

NPM_PKGNAME = "glob-parent"

inherit npmhelper
inherit native
