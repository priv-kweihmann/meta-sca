SUMMARY = "NPM: dequal"
DESCRIPTION = "A tiny (304B to 489B) utility for check for deep equality"
HOMEPAGE = "https://github.com/lukeed/dequal#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dequal/-/dequal-2.0.2.tgz"
SRC_URI[md5sum] = "f7f716eeba29a39fcaa201f01d168d6e"
SRC_URI[sha256sum] = "96ad28d40497d138accfd860a92f7302614099f3ca42373b5e01eae0239306e1"

NPM_PKGNAME = "dequal"

inherit npmhelper
inherit native
