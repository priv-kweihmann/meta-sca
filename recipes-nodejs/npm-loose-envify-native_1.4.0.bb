SUMMARY = "NPM: loose-envify"
DESCRIPTION = "Fast (and loose) selective `process.env` replacer using js-tokens instead of an AST"
HOMEPAGE = "https://github.com/zertosh/loose-envify"

DEPENDS = "npm-js-tokens-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=32e26a5793a4ffbace6131bc51567cb8"

SRC_URI = "https://registry.npmjs.org/loose-envify/-/loose-envify-1.4.0.tgz"
SRC_URI[md5sum] = "5e78d5f6b1ad3ecce9605936059d087e"
SRC_URI[sha256sum] = "1218830a93538a4f730d530138e945ea6a65b45e099ee7a9ea538a05141babdc"

NPM_PKGNAME = "loose-envify"

inherit npmhelper
inherit native
