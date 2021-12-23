SUMMARY = "NPM: esprima"
DESCRIPTION = "ECMAScript parsing infrastructure for multipurpose analysis"
HOMEPAGE = "http://esprima.org"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=e3c825c932a984958bafbac21e21f984"

SRC_URI = "https://registry.npmjs.org/esprima/-/esprima-4.0.1.tgz"
SRC_URI[md5sum] = "c9d44a818c324d707a81b08dd36cd079"
SRC_URI[sha256sum] = "d8a1910e9cbecc95b4c5df75376c46a7a9261859c294ef91505c1442e093cc74"

NPM_PKGNAME = "esprima"

inherit npmhelper
inherit native
