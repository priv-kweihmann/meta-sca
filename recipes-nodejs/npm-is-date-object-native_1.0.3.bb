SUMMARY = "NPM: is-date-object"
DESCRIPTION = "Is this value a JS Date object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-date-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-date-object/-/is-date-object-1.0.3.tgz"
SRC_URI[md5sum] = "b50af481e0223cbc5d88c2e3da2b776b"
SRC_URI[sha256sum] = "8c949a7cea3e75e75e1e4900676d5e42fad01ec5f226d6303bec65a83383b601"

NPM_PKGNAME = "is-date-object"

inherit npmhelper
inherit native
