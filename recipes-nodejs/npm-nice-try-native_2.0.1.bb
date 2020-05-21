SUMMARY = "NPM: nice-try"
DESCRIPTION = "Tries to execute a function and discards any error that occurs"
HOMEPAGE = "https://github.com/electerious/nice-try"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23e09bd5f925127de4457125cbd1beca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nice-try/-/nice-try-2.0.1.tgz"
SRC_URI[md5sum] = "e9cea5249c7b1d394aae8d0d3825ef19"
SRC_URI[sha256sum] = "20a65ceb66ba145c1d9fd0f9b2f08301ba209af65c73af3870cb0ee7c5f80ebb"

NPM_PKGNAME = "nice-try"

inherit npmhelper
inherit native
