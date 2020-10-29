SUMMARY = "NPM: ccount"
DESCRIPTION = "Count characters"
HOMEPAGE = "https://github.com/wooorm/ccount#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ccount/-/ccount-1.1.0.tgz"
SRC_URI[md5sum] = "d86f9847e0f0e2ffe45179b85c67b07d"
SRC_URI[sha256sum] = "cfc060a8532d681a4354d2688f8b9494031bbedf43b5417689622fc4db5a84d8"

NPM_PKGNAME = "ccount"

inherit npmhelper
inherit native
