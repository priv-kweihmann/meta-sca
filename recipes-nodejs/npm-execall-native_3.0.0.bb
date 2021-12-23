SUMMARY = "NPM: execall"
DESCRIPTION = "Find multiple RegExp matches in a string"
HOMEPAGE = "https://github.com/sindresorhus/execall#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-clone-regexp-native"

SRC_URI = "https://registry.npmjs.org/execall/-/execall-3.0.0.tgz"
SRC_URI[md5sum] = "29017b2d14f5957bd49747b88946b6e8"
SRC_URI[sha256sum] = "a2bec432ea0bce8ecf66f0f694958455113494dcafd574573042f1fd8f58c6f6"

NPM_PKGNAME = "execall"

inherit npmhelper
inherit native
