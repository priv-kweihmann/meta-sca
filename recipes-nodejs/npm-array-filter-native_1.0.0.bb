SUMMARY = "NPM: array-filter"
DESCRIPTION = "Array#filter for older browsers."
HOMEPAGE = "https://github.com/juliangruber/array-filter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=49;md5=0d3b013fed6c1109884819205a9b3104"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/array-filter/-/array-filter-1.0.0.tgz"
SRC_URI[md5sum] = "85ea893c21f85990b5da84c42ba3871f"
SRC_URI[sha256sum] = "7bb0a2048b248ac1a35a73f98a3b025691cb77a4951ab99bf4b0cc7929ce49c7"

NPM_PKGNAME = "array-filter"

inherit npmhelper
inherit native
