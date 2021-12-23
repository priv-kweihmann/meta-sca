SUMMARY = "NPM: core-util-is"
DESCRIPTION = "The `util.is*` functions introduced in Node v0.12."
HOMEPAGE = "https://github.com/isaacs/core-util-is#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-util-is/-/core-util-is-1.0.3.tgz"
SRC_URI[md5sum] = "b1d6a20c5b4105190dd24baaa65b43b7"
SRC_URI[sha256sum] = "4430fdc71f2cf3b5e297113b9a692da2d6cff96cf84da00f0ecef5e5a6e74d0c"

NPM_PKGNAME = "core-util-is"

inherit npmhelper
inherit native
