SUMMARY = "NPM: run-parallel"
DESCRIPTION = "Run an array of functions in parallel"
HOMEPAGE = "https://github.com/feross/run-parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/run-parallel/-/run-parallel-1.1.10.tgz"
SRC_URI[md5sum] = "b6edfe222d3c809926b0682513a6785c"
SRC_URI[sha256sum] = "fc5fa61c5323c20c6368464252cfbc3ebf77ae05a4f5a8f296298edaabf72395"

NPM_PKGNAME = "run-parallel"

inherit npmhelper
inherit native
