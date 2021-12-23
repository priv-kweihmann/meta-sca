SUMMARY = "NPM: isexe"
DESCRIPTION = "Minimal module to check if a file is executable."
HOMEPAGE = "https://github.com/isaacs/isexe#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/isexe/-/isexe-2.0.0.tgz"
SRC_URI[md5sum] = "02bf57881fa200bcd6501e4ded2b1b3a"
SRC_URI[sha256sum] = "47cfe872e088e28c53b736fef305324b57cc1cfc9f72a9b0f769f92731cb8359"

NPM_PKGNAME = "isexe"

inherit npmhelper
inherit native
