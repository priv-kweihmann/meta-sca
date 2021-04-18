SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/inspect-js/object-inspect"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.10.2.tgz"
SRC_URI[md5sum] = "ca0c0cd3d1c7cb68a62b7517dc370766"
SRC_URI[sha256sum] = "f0d90e9d22f3434c985eb6f45470f2226f7aa0377fd34a7c98d747fd180e5cef"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
