SUMMARY = "NPM: interpret"
DESCRIPTION = "A dictionary of file extensions and associated module loaders."
HOMEPAGE = "https://github.com/gulpjs/interpret#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48fa72a2fa812dd4ebc86cf02c4b3b77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/interpret/-/interpret-2.2.0.tgz"
SRC_URI[md5sum] = "ad7f42c59a20bfc9750184a601407cdf"
SRC_URI[sha256sum] = "db3e39d25c395b3865ce786619acc6b932a01d79873c410e7a803915211ecae9"

NPM_PKGNAME = "interpret"

inherit npmhelper
inherit native
