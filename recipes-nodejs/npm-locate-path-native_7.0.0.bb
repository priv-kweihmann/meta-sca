SUMMARY = "NPM: locate-path"
DESCRIPTION = "Get the first path that exists on disk of multiple paths"
HOMEPAGE = "https://github.com/sindresorhus/locate-path#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-p-locate-native"

SRC_URI = "https://registry.npmjs.org/locate-path/-/locate-path-7.0.0.tgz"
SRC_URI[md5sum] = "a98ef602f656f2bd3357edf5de069def"
SRC_URI[sha256sum] = "cad53f9b37a6d900802682c4950c94cb3a85272bc78d0a1b59e4121ba76cbe20"

NPM_PKGNAME = "locate-path"

inherit npmhelper
inherit native
