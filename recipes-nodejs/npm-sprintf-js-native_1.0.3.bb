SUMMARY = "NPM: sprintf-js"
DESCRIPTION = "JavaScript sprintf implementation"
HOMEPAGE = "https://github.com/alexei/sprintf.js#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab40451de4e35c90f1b663b4fbd314a9"

SRC_URI = "https://registry.npmjs.org/sprintf-js/-/sprintf-js-1.0.3.tgz"
SRC_URI[md5sum] = "8e6b31a052754055683e4a35a317feab"
SRC_URI[sha256sum] = "3afb26bcc328dc90f516515acf2783ad35b08dbfe9e0ada18264c3c4ddaa1a83"

NPM_PKGNAME = "sprintf-js"

inherit npmhelper
inherit native
