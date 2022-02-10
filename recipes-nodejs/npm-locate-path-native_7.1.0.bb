SUMMARY = "NPM: locate-path"
DESCRIPTION = "Get the first path that exists on disk of multiple paths"
HOMEPAGE = "https://github.com/sindresorhus/locate-path#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-p-locate-native"

SRC_URI = "https://registry.npmjs.org/locate-path/-/locate-path-7.1.0.tgz"
SRC_URI[md5sum] = "56bd3745128f19fa93592f4136277387"
SRC_URI[sha256sum] = "e16cf69b326b283e134439549ca89ed38358cee9a918514713a2ef01d194b5dc"

NPM_PKGNAME = "locate-path"

inherit npmhelper
inherit native
