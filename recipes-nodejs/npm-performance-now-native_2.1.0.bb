SUMMARY = "NPM: performance-now"
DESCRIPTION = "Implements performance.now (based on process.hrtime)."
HOMEPAGE = "https://github.com/braveg1rl/performance-now"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c"

SRC_URI = "https://registry.npmjs.org/performance-now/-/performance-now-2.1.0.tgz"
SRC_URI[md5sum] = "a52671116e28a40276d1ea5d4c9e7247"
SRC_URI[sha256sum] = "068f99ddeff11741bd1ebbbe3ee4c6f782731bd9ae0a2d598536cce74e289045"

S = "${WORKDIR}/package"

NPM_PKGNAME = "performance-now"

inherit npmhelper
inherit native
