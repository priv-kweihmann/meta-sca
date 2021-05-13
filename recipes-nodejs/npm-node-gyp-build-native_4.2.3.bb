SUMMARY = "NPM: node-gyp-build"
DESCRIPTION = "Build tool and bindings loader for node-gyp that supports prebuilds"
HOMEPAGE = "https://github.com/prebuild/node-gyp-build"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb7eae1c2fbb280c72665db9a1efc896"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-gyp-build/-/node-gyp-build-4.2.3.tgz"
SRC_URI[md5sum] = "91b1967dfac852d20d1082336e4da5af"
SRC_URI[sha256sum] = "297e3be93a52937836e4e65d9e8a3fa3dc40085f133737acb0b21220cd56d920"

NPM_PKGNAME = "node-gyp-build"

inherit npmhelper
inherit native
