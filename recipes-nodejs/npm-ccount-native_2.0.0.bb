SUMMARY = "NPM: ccount"
DESCRIPTION = "Count characters"
HOMEPAGE = "https://github.com/wooorm/ccount#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ccount/-/ccount-2.0.0.tgz"
SRC_URI[md5sum] = "7e791a989fe67d971fa0a86df511c5c9"
SRC_URI[sha256sum] = "98b0439eba3097de07b4cf8acf2d75dfdcff2a0c39e66edc36722623aff3cf5e"

NPM_PKGNAME = "ccount"

inherit npmhelper
inherit native
