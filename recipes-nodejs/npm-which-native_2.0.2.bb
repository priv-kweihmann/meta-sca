SUMMARY = "NPM: which"
DESCRIPTION = "Like which(1) unix command. Find the first instance of an executable in the PATH."
HOMEPAGE = "https://github.com/isaacs/node-which#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-isexe-native"

SRC_URI = "https://registry.npmjs.org/which/-/which-2.0.2.tgz"
SRC_URI[md5sum] = "9556a736013ff5223cc9731d9f32b55f"
SRC_URI[sha256sum] = "a13adf5fddeb769655edce551e81fbb11904b9c9be76d95e41da8c4c499d4edc"

NPM_PKGNAME = "which"

inherit npmhelper
inherit native
