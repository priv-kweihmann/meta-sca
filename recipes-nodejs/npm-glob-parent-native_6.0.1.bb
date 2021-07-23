SUMMARY = "NPM: glob-parent"
DESCRIPTION = "Extract the non-magic parent path from a glob string."
HOMEPAGE = "https://github.com/gulpjs/glob-parent#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=741e38024be3bd65f6d836f460f4445f"

DEPENDS = "npm-is-glob-native"

SRC_URI = "https://registry.npmjs.org/glob-parent/-/glob-parent-6.0.1.tgz"
SRC_URI[md5sum] = "dc1352fa220b9455dc8cb734fe61db85"
SRC_URI[sha256sum] = "95c82f29bb7683a58c0119f322711d689856e49c57e1011dd8673b1ffca4f889"

NPM_PKGNAME = "glob-parent"

inherit npmhelper
inherit native
