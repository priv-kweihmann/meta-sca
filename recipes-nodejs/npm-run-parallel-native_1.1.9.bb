SUMMARY = "NPM: run-parallel"
DESCRIPTION = "Run an array of functions in parallel"
HOMEPAGE = "https://github.com/feross/run-parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

SRC_URI = "https://registry.npmjs.org/run-parallel/-/run-parallel-1.1.9.tgz"
SRC_URI[md5sum] = "891e46bdb54ac736514d95d8840c8a37"
SRC_URI[sha256sum] = "3e0d5d5f0c8177d6bf682a000ce60f72ac22dcc3e5288474ce7368532d934aa6"

NPM_PKGNAME = "run-parallel"

inherit npmhelper
inherit native
