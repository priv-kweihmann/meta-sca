SUMMARY = "NPM: is-date-object"
DESCRIPTION = "Is this value a JS Date object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-date-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-date-object/-/is-date-object-1.0.4.tgz"
SRC_URI[md5sum] = "4c6edd6e223d6acad2e62c58230ab111"
SRC_URI[sha256sum] = "0515d7495fe512299f2df2829852c73616bc4c615c8cf995fabf791cd29553af"

NPM_PKGNAME = "is-date-object"

inherit npmhelper
inherit native
