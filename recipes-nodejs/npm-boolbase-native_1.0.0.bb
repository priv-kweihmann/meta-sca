SUMMARY = "NPM: boolbase"
DESCRIPTION = "two functions: One that returns true, one that returns false"
HOMEPAGE = "https://github.com/fb55/boolbase"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/ISC;md5=f3b90e78ea0cffb20bf5cca7947a896d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/boolbase/-/boolbase-1.0.0.tgz"
SRC_URI[md5sum] = "f66beade83498aabc93598befa673670"
SRC_URI[sha256sum] = "69628ff8092c5ff940ea4a0f29da98d520615bae138755c9e059033606c6caa8"

NPM_PKGNAME = "boolbase"

inherit npmhelper
inherit native
