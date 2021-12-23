SUMMARY = "NPM: glob-parent"
DESCRIPTION = "Extract the non-magic parent path from a glob string."
HOMEPAGE = "https://github.com/gulpjs/glob-parent#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=741e38024be3bd65f6d836f460f4445f"

DEPENDS = "npm-is-glob-native"

SRC_URI = "https://registry.npmjs.org/glob-parent/-/glob-parent-6.0.2.tgz"
SRC_URI[md5sum] = "aeda0bbc70a86d88a91a6f8f2167df37"
SRC_URI[sha256sum] = "345bb942f3be1fe234cab09ddc1df2c443cb2e84aaf5743c1862cf2b4e8d5066"

NPM_PKGNAME = "glob-parent"

inherit npmhelper
inherit native
