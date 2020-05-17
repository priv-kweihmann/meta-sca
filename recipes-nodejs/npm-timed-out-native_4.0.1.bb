SUMMARY = "NPM: timed-out"
DESCRIPTION = "Emit `ETIMEDOUT` or `ESOCKETTIMEDOUT` when ClientRequest is hanged"
HOMEPAGE = "https://github.com/floatdrop/timed-out#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=2a8369b875113ae53aa6c5bb39a58d3c"

SRC_URI = "https://registry.npmjs.org/timed-out/-/timed-out-4.0.1.tgz"
SRC_URI[md5sum] = "7af2bbbcd9d2d23b98f5af46a18828ab"
SRC_URI[sha256sum] = "c916f36973f186d81b0a73bd49dad31ed8eaab0d81ad6be4a473ee6067dd9841"

NPM_PKGNAME = "timed-out"

inherit npmhelper
inherit native
