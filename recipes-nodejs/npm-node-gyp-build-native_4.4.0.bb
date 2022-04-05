SUMMARY = "NPM: node-gyp-build"
DESCRIPTION = "Build tool and bindings loader for node-gyp that supports prebuilds"
HOMEPAGE = "https://github.com/prebuild/node-gyp-build"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb7eae1c2fbb280c72665db9a1efc896"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-gyp-build/-/node-gyp-build-4.4.0.tgz"
SRC_URI[md5sum] = "7b1b56b5d6fafb9a9be468c78f67aa2b"
SRC_URI[sha256sum] = "98db74374e9d85801f7cb90fc2f41839e660368bb281b50f6e079c3c33ede462"

NPM_PKGNAME = "node-gyp-build"

inherit npmhelper
inherit native
