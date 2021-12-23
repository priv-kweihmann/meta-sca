SUMMARY = "NPM: fs.realpath"
DESCRIPTION = "Use node's fs.realpath, but fall back to the JS implementation if the native one fails"
HOMEPAGE = "https://github.com/isaacs/fs.realpath#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=062470525c8e380f8567f665ef554d11"

SRC_URI = "https://registry.npmjs.org/fs.realpath/-/fs.realpath-1.0.0.tgz"
SRC_URI[md5sum] = "9f790d7180667e1d8d1110f2cf321b62"
SRC_URI[sha256sum] = "9e80cb8713125aa53df81a29626f7b81f26a9be1cd41840b3ccdcae4d52e8f9c"

S = "${WORKDIR}/package"

NPM_PKGNAME = "fs.realpath"

inherit npmhelper
inherit native
