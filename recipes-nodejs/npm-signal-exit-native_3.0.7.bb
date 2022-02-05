SUMMARY = "NPM: signal-exit"
DESCRIPTION = "when you want to fire an event no matter how a process exits."
HOMEPAGE = "https://github.com/tapjs/signal-exit"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/signal-exit/-/signal-exit-3.0.7.tgz"
SRC_URI[md5sum] = "05cf0ff414a9fc6e30abb6d20780c762"
SRC_URI[sha256sum] = "439623fa6aab91600615ec757eaa137fcab40d3b35dda38df7444c15678f20a8"

NPM_PKGNAME = "signal-exit"

inherit npmhelper
inherit native
