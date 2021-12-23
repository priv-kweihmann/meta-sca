SUMMARY = "NPM: is-proto-prop"
DESCRIPTION = "Does a JS type's prototype have a property"
HOMEPAGE = "https://github.com/dustinspecker/is-proto-prop#readme"

DEPENDS = "npm-lowercase-keys-native npm-proto-props-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=512b547cdbdb32ef8bcbd275eb09a8bd"

SRC_URI = "https://registry.npmjs.org/is-proto-prop/-/is-proto-prop-2.0.0.tgz"
SRC_URI[md5sum] = "7d61f9f0725dd5018a51dff3efe3dfc2"
SRC_URI[sha256sum] = "98b996b6a99423b5b1c569b730d551f8a5fd230983f28eabb2b16a4829f2c3e9"

NPM_PKGNAME = "is-proto-prop"

inherit npmhelper
inherit native
