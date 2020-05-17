SUMMARY = "NPM: core-util-is"
DESCRIPTION = "The `util.is*` functions introduced in Node v0.12."
HOMEPAGE = "https://github.com/isaacs/core-util-is#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff"

SRC_URI = "https://registry.npmjs.org/core-util-is/-/core-util-is-1.0.2.tgz"
SRC_URI[md5sum] = "36dbf1e4e5f3cbec553c074cbd5939fd"
SRC_URI[sha256sum] = "a4a44dab6579ede3e06ade58d26f8fd642eae09153fd59c608fcb7951a499398"

S = "${WORKDIR}/package"

NPM_PKGNAME = "core-util-is"

inherit npmhelper
inherit native
