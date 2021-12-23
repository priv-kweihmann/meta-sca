SUMMARY = "NPM: unbox-primitive"
DESCRIPTION = "Unbox a boxed JS primitive value."
HOMEPAGE = "https://github.com/ljharb/unbox-primitive#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-function-bind-native \
           npm-has-bigints-native \
           npm-has-symbols-native \
           npm-which-boxed-primitive-native"

SRC_URI = "https://registry.npmjs.org/unbox-primitive/-/unbox-primitive-1.0.1.tgz"
SRC_URI[md5sum] = "23d12db3c5ca7db2738571b3e610d09d"
SRC_URI[sha256sum] = "dccea4f58520131a5e103a44a7f45e734a0161d7ef7490ba93008afe707eed3e"

NPM_PKGNAME = "unbox-primitive"

inherit npmhelper
inherit native
