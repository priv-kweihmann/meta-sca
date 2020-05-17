SUMMARY = "NPM: bail"
DESCRIPTION = "Throw a given error"
HOMEPAGE = "https://github.com/wooorm/bail#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/bail/-/bail-1.0.5.tgz"
SRC_URI[md5sum] = "ca6df04219434065a340f256d683ee88"
SRC_URI[sha256sum] = "711501aaf102028e3d2095d3136f85b3804b2e8d0116ff6fb2c48956eac2a0c9"

NPM_PKGNAME = "bail"

inherit npmhelper
inherit native
