SUMMARY = "NPM: kind-of"
DESCRIPTION = "Get the native type of a value."
HOMEPAGE = "https://github.com/jonschlinkert/kind-of"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

SRC_URI = "https://registry.npmjs.org/kind-of/-/kind-of-6.0.3.tgz"
SRC_URI[md5sum] = "b2b65b012fbbdda2f5f9c9ab2a9b874c"
SRC_URI[sha256sum] = "6c24443b5b6ca52d3dce399c1e2c27c4591c7529765513eeaa0c265b0c0e63da"

NPM_PKGNAME = "kind-of"

inherit npmhelper
inherit native
