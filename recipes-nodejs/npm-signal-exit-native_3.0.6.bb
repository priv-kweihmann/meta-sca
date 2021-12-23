SUMMARY = "NPM: signal-exit"
DESCRIPTION = "when you want to fire an event no matter how a process exits."
HOMEPAGE = "https://github.com/tapjs/signal-exit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/signal-exit/-/signal-exit-3.0.6.tgz"
SRC_URI[md5sum] = "10a98b2033fa7c424931dd5b9897d2b5"
SRC_URI[sha256sum] = "4fbaa334d1510834567ddb2cf40d09cdc0af0bf18380b48d7f7275fc3b29cd08"

NPM_PKGNAME = "signal-exit"

inherit npmhelper
inherit native
