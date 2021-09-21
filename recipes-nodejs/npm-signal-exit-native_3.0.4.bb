SUMMARY = "NPM: signal-exit"
DESCRIPTION = "when you want to fire an event no matter how a process exits."
HOMEPAGE = "https://github.com/tapjs/signal-exit"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/signal-exit/-/signal-exit-3.0.4.tgz"
SRC_URI[md5sum] = "d15a7ba9c816de39794daf81b60f3d43"
SRC_URI[sha256sum] = "04e452c4f1b1bdc1e893809c7159f1d8697958c63ab31b708557ac37c150cf13"

NPM_PKGNAME = "signal-exit"

inherit npmhelper
inherit native
