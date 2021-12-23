SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/inspect-js/object-inspect"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.12.0.tgz"
SRC_URI[md5sum] = "3b663a84af220988fe04b4a283676fb0"
SRC_URI[sha256sum] = "c172809067d5c1e1a9d02dbef2abbe8e602676c3b78dbe7effd3274dee7d7646"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
