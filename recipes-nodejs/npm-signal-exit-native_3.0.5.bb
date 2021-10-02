SUMMARY = "NPM: signal-exit"
DESCRIPTION = "when you want to fire an event no matter how a process exits."
HOMEPAGE = "https://github.com/tapjs/signal-exit"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/signal-exit/-/signal-exit-3.0.5.tgz"
SRC_URI[md5sum] = "2d4906842fbc0d6008361f3c1ca30bda"
SRC_URI[sha256sum] = "2f390bb7e5ee8eee2820d9a8b5824e7eea24e527d627ce57e9051cbf719d8d15"

NPM_PKGNAME = "signal-exit"

inherit npmhelper
inherit native
