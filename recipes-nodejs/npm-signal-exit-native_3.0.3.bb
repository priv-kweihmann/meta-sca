SUMMARY = "NPM: signal-exit"
DESCRIPTION = "when you want to fire an event no matter how a process exits."
HOMEPAGE = "https://github.com/tapjs/signal-exit"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde"

SRC_URI = "https://registry.npmjs.org/signal-exit/-/signal-exit-3.0.3.tgz"
SRC_URI[md5sum] = "ae863f6e95a6a6050bc0e70c9ddb0688"
SRC_URI[sha256sum] = "15efc9bad612c82f7bea7037c0ae575d015452ae383df94424d489b0f67101c7"

S = "${WORKDIR}/package"

NPM_PKGNAME = "signal-exit"

inherit npmhelper
inherit native
