SUMMARY = "NPM: shellsubstitute"
DESCRIPTION = "Like shell substitution but for your JS."
HOMEPAGE = "https://github.com/featurist/shellsubstitute"

LICENSE = "ISC"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/ISC;md5=f3b90e78ea0cffb20bf5cca7947a896d"

SRC_URI = "https://registry.npmjs.org/shellsubstitute/-/shellsubstitute-1.2.0.tgz"
SRC_URI[md5sum] = "2c3d86f011b643c078fa67f01c0bce45"
SRC_URI[sha256sum] = "61a0bbcea79efc14f23c04b67087a05ade91a58025fd50d091d3dea5c392632c"

NPM_PKGNAME = "shellsubstitute"

inherit npmhelper
inherit native
