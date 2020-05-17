SUMMARY = "NPM: is-hidden"
DESCRIPTION = "Check if `filename` is hidden (starts with a dot)"
HOMEPAGE = "https://github.com/wooorm/is-hidden#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

SRC_URI = "https://registry.npmjs.org/is-hidden/-/is-hidden-1.1.3.tgz"
SRC_URI[md5sum] = "bb0b658a75f389bf903aadc8c7d9993d"
SRC_URI[sha256sum] = "5774721a4a70bbded85c232468b3cdc691e3395a068d123966e4374f2259e542"

NPM_PKGNAME = "is-hidden"

inherit npmhelper
inherit native
