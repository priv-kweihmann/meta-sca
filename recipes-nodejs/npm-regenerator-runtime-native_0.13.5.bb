SUMMARY = "NPM: regenerator-runtime"
DESCRIPTION = "Runtime for Regenerator-compiled generator and async functions."


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57a79768a3b1e4d0f3a3787048a96356"

SRC_URI = "https://registry.npmjs.org/regenerator-runtime/-/regenerator-runtime-0.13.5.tgz"
SRC_URI[md5sum] = "cb89b882d5fecaf1d3f21decccf62006"
SRC_URI[sha256sum] = "4004caf19419db34b95c41af1fa23b5009d7468fc0e3417fd34edb214a0d24c4"

S = "${WORKDIR}/package"

NPM_PKGNAME = "regenerator-runtime"

inherit npmhelper
inherit native
