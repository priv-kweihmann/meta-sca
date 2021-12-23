SUMMARY = "NPM: minimist-options"
DESCRIPTION = "Pretty options for minimist"
HOMEPAGE = "https://github.com/vadimdemedes/minimist-options#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=15b6437d981b9d2425ae4255a58865c1"

DEPENDS = "npm-arrify-native \
           npm-is-plain-obj-native \
           npm-kind-of-native"

SRC_URI = "https://registry.npmjs.org/minimist-options/-/minimist-options-4.1.0.tgz"
SRC_URI[md5sum] = "eb94b116909b767a7e99c6175862dd7d"
SRC_URI[sha256sum] = "07132114eebec519ea7509cf25f8d2d314ac9b9a40a44a34a93947da3dad6b32"

NPM_PKGNAME = "minimist-options"

inherit npmhelper
inherit native
