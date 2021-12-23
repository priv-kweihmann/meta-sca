SUMMARY = "NPM: wrappy"
DESCRIPTION = "Callback wrapping utility"
HOMEPAGE = "https://github.com/npm/wrappy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/wrappy/-/wrappy-1.0.2.tgz"
SRC_URI[md5sum] = "567b1699cfae49cb20f598571a6c90c7"
SRC_URI[sha256sum] = "aff3730d91b7b1e143822956d14608f563163cf11b9d0ae602df1fe1e430fdfb"

S = "${WORKDIR}/package"

NPM_PKGNAME = "wrappy"

inherit npmhelper
inherit native
