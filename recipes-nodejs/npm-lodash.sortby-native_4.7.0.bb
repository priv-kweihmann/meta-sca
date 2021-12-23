SUMMARY = "NPM: lodash.sortby"
DESCRIPTION = "The lodash method `_.sortBy` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.sortby/-/lodash.sortby-4.7.0.tgz"
SRC_URI[md5sum] = "aaf31ab9743a2e12d8a5d749444745e7"
SRC_URI[sha256sum] = "329cd6fe5d14a3744352a5ced7eb8bbbd4ecc2de27b2d665e6419e80cb13554a"

NPM_PKGNAME = "lodash.sortby"

inherit npmhelper
inherit native
