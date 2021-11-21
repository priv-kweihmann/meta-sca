SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/inspect-js/object-inspect"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.11.0.tgz"
SRC_URI[md5sum] = "a3897a1ab99eb1707a2c882cebaedc1e"
SRC_URI[sha256sum] = "7519afe856edb34e331a25f2063e119f425fb2c1d6d8e882164b759a315c8603"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
