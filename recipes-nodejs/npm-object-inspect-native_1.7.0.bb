SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/substack/object-inspect"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.7.0.tgz"
SRC_URI[md5sum] = "92037a0566716744eb38391e3698596e"
SRC_URI[sha256sum] = "d4fd262b65a01ed931b95492e1b7e862921e1d2fb28b9f098ba88a9a2420b763"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
